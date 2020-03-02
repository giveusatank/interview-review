package com.interview.redis.transaction;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

import java.util.List;

public class RedisTransaction {

    private String name = m1();

    public static void main(String[] args) throws InterruptedException {

        Jedis jedis = new Jedis("172.30.0.21", 6379);
        jedis.auth("rjsz2019");
        jedis.select(6);

        jedis.set("mySalary_1", "10000");

       /* Thread t1 = new Thread(() -> {
            try {
                setDoubleSalary("mySalary_1", jedis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });*/


        jedis.close();
    }

    public static void setDoubleSalary(String salary, Jedis jedis) throws InterruptedException {

        while (true) {
            Double doubleSal = Double.parseDouble(jedis.get(salary)) * 2;
            jedis.watch(salary);
            Transaction multi = jedis.multi();

            multi.set(salary, String.valueOf(doubleSal));
            Thread.sleep(5000);
            List<Object> exec = multi.exec();
            if (exec != null) {
                break;
            }

        }

    }

    public String m1(){
        return "";
    }
}
