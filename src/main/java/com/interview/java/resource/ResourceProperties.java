package com.interview.java.resource;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.scala.part15.B;

import java.io.*;
import java.util.*;

/**
 * 读取资源文件
 * <p>
 * src/main/java
 * /resource
 * <p>
 * src/test/java
 * /resource
 * <p>
 * <p>
 * target/classes
 */
public class ResourceProperties {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = ResourceProperties.class.getClassLoader();
        InputStream is1 = classLoader.getResourceAsStream("test.properties");
        InputStream is2 = classLoader.getResourceAsStream("test.json");
        InputStream is3 = classLoader.getResourceAsStream("testArr.json");
        Properties properties = new Properties();
        properties.load(is1);

        System.out.println(properties.getProperty("name"));
        properties.setProperty("address", "America");
        System.out.println(properties.getProperty("address"));

        //Jackson
        ObjectMapper om = new ObjectMapper();

        LinkedHashMap lh1 = om.readValue(is2, LinkedHashMap.class);
        System.out.println(lh1.get("name"));

        LinkedList<LinkedHashMap> linkedList = om.readValue(is3, LinkedList.class);
        for (LinkedHashMap lh : linkedList) {
            lh.getOrDefault("name", "Nothing");
        }

        User user = new User();
        user.setName("fengyu");
        System.out.println(om.writeValueAsString(user));

        InputStream is2_ = classLoader.getResourceAsStream("test.json");
        InputStream is3_ = classLoader.getResourceAsStream("testArr.json");
        byte[] buffer = new byte[1024];
        int len = -1;
        StringBuffer sb = new StringBuffer();
        while ((len = is2_.read(buffer)) != -1) {
            String s = new String(buffer, 0, len);
            sb.append(s);
        }
        String json1 = sb.toString();
        //fastJson
        JSONObject jsonObject = JSON.parseObject(json1);
        User user1 = JSON.parseObject(json1, User.class);
        System.out.println(jsonObject.get("name"));
        System.out.println(user.getName());


        byte[] buffer2 = new byte[1024];
        int len2 = -1;
        StringBuffer sb2 = new StringBuffer();
        while ((len2 = is3_.read(buffer2)) != -1) {
            String s = new String(buffer2, 0, len2);
            sb2.append(s);
        }
        String json2 = sb2.toString();

        JSONArray objects = JSON.parseArray(json2);
        Iterator<Object> iter = objects.iterator();
        while (iter.hasNext()) {
            JSONObject next = (JSONObject) iter.next();
            System.out.println(next.getOrDefault("name", "Nothing"));
        }

        List<User> users = JSON.parseArray(json2, User.class);

        User user2 = new User();
        user2.setName("qqq");
        user2.setAddress("tttt");

        User user3 = new User();
        user3.setName("aaaa");
        user3.setAddress("uuuu");

        ArrayList<User> users_ = new ArrayList<>();
        users_.add(user2);
        users_.add(user3);

        System.out.println(JSON.toJSONString(user2));
        System.out.println(JSON.toJSONString(users_));

        BaseStream baseStream = null;
        /*try (FileInputStream fis = new FileInputStream("F:\\data\\123.txt");
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            baseStream = new BaseStream(fis, bis);
            System.out.println(1 / 0);
        } catch (RuntimeException ex) {
            System.out.println("6666");
            ex.printStackTrace();
        }*/

        try{
            FileReader fr = new FileReader("F:\\data\\123.txt");
            BufferedReader br = new BufferedReader(fr);
            baseStream = new BaseStream(fr, br);
           // System.out.println(1 / 0);
        }catch (RuntimeException ex) {
            System.out.println("6666");
            ex.printStackTrace();
        }

       BaseStream.fileInputStream.read();

        System.out.println(100 / 2);

        FileInputStream fileInputStream = new FileInputStream("F:\\data\\123.txt");
        byte read = (byte) fileInputStream.read();


        FileInputStream fis = new FileInputStream("F:\\data\\123.txt");

        /*byte[] buffer3 = new byte[6];
        StringBuilder sb22 = new StringBuilder();
        int len4 = -1;
        while ((len4 = fis.read(buffer3)) != -1) {
            String s = new String(buffer3,0,len4);
            System.out.println(s);
            sb22.append(s);
        }

        System.out.println(sb22.toString());*/
        char[] cbuffer = new char[3];
        int len4 = -1;
        FileReader fr = new FileReader("F:\\data\\123.txt");
        while ((len4 = fr.read(cbuffer))!=-1){
            String s = new String(cbuffer);
            System.out.println(s);
        }

        String str = "我叫秦臻，我喝冰岛茶";
        byte[] gbks = str.getBytes("GBK");

        String s = new String(gbks, "GBK");
        System.out.println(s);


    }

}
