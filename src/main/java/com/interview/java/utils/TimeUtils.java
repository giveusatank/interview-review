package com.interview.java.utils;

import com.interview.scala.part16.C;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Java的时间相关的Api：
 *
 * （1）SimpleDateFormat：时间格式化
 *
 * （2）Calendar：日历类
 */
public class TimeUtils {

    public static void main(String[] args) throws ParseException {

        //【获取当前时刻的Date对象】
        Date date1 = new Date();

        //获取某个毫秒级时间戳下的Date对象
        //方式1
        Date date2 = new Date(1582122415000L);
        //方式2
        Date date3 = new Date();
        date3.setTime(1582122415000L);

        //【获取Date对象的毫秒级时间戳】
        long mTs = date1.getTime();
        System.out.println(mTs);
        System.out.println(date2.getTime());
        System.out.println(date3.getTime());

        //【将毫秒级时间戳转为秒级时间戳】
        long sTs = mTs / 1000;

        //【SimpleDateFormat】
        //format：将一个毫秒级时间戳格式化为指定的字符时间格式
        //parse：将一个时间字符串解析为一个Date对象
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");

        //可以传入一个毫秒级时间戳 或者 Date对象
        String format1 = sf.format(1582122415000L);
        String format2 = sf.format(date1);

        System.out.println(format1);
        System.out.println(format2);

        //parse：返回一个Date对象，如果传入格式的粒度大于毫秒级，则按照0处理
        System.out.println(sf.parse("20190909").getTime() / 1000);

        //【Calendar】
        //获取Calendar对象
        Calendar calendar = Calendar.getInstance();

        //给日历类设置时间
        calendar.setTime(new Date());


        //查看当前是当前月的第几天
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //当前年的第几天
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //当前周的第几天
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        //返回日历类对应的Date对象
        System.out.println(sf.format(calendar.getTime().getTime()));

        calendar.add(Calendar.DATE,+1);
        System.out.println(sf.format(calendar.getTime().getTime()));

        calendar.add(Calendar.DAY_OF_YEAR,+1);
        System.out.println(sf.format(calendar.getTime().getTime()));

        calendar.add(Calendar.MONDAY,+2);
        System.out.println(sf.format(calendar.getTime().getTime()));

        calendar.add(Calendar.YEAR,+1);
        System.out.println(sf.format(calendar.getTime().getTime()));

        System.out.println(calendar.getTime().getTime());

        //System.out.println(sf.format(calendar.getTime().getTime()));

       // ArrayList<?>[] ss = new ArrayList<?>[11];
       // ArrayList list = new ArrayList<Integer>();

        //ss[0] = list;

       // ss[0].get(0);

        List integers = new ArrayList<Integer>();
        List s222ss = new ArrayList<String>();

        System.out.println(integers.getClass().getName());
        System.out.println(s222ss.getClass().getName());
    }
}
