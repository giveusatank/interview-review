package com.interview.java.utils;

import scala.actors.threadpool.Arrays;

import java.util.*;

public class ArrayUtils {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("qz");
        list1.add("gn");
        list1.add("fy");
        list1.add("zfz");
        list1.add("qh");
        list1.add("zyh");

        Object[] objects = list1.toArray();
        /*String[] sss = new String[1];
        sss[0] = "123";
        String[] objects1 = (String[])Arrays.<String>copyOf(sss, 1, String[].class);*/

        for(int i=0;i<objects.length;i++){
            System.out.println(objects[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        //HashSet<String> strings = new HashSet<String>();
        LinkedHashSet<String> strings = new LinkedHashSet<String>();
        strings.add("123");
        strings.add("666");
        strings.add("777");
        strings.add("888");
        strings.add("444");
        strings.add("222");
        Object[] objects1 = strings.toArray();

        /*Object[] objects1 = strings.toArray();
        String[] reSt = new String[strings.size()];

        String[] strings1 = strings.toArray(reSt);

        for(int i=0;i<objects1.length;i++){
            System.out.println(objects1[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i=0;i<strings1.length;i++){
            System.out.println(strings1[i]);
        }*/
        for(String ele:strings){
            System.out.println(ele);
        }

        for(String ele : list1){
            System.out.println(ele);
        }

        User user1 = new User("qz1");
        User user2 = new User("qz11");
        User user3 = new User("qz111");
        User user4 = new User("qz11111");
        User user5 = new User("qz111111");
        User user6 = new User("qz1111111");

        ArrayList<User> userList = new ArrayList<User>();
        userList.add(user2);
        userList.add(user4);
        userList.add(user6);
        userList.add(user1);
        userList.add(user3);
        userList.add(user5);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        for(User user : userList){
            System.out.println(user);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        Collections.sort(userList, new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });

        for(User user : userList){
            System.out.println(user);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        Collections.reverse(userList);
        for(User user : userList){
            System.out.println(user);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        HashMap<String, String> maps = new HashMap<String, String>();

        Object[] objs = new Object[3];
        objs[0] = user5;
        objs[1] = user2;
        objs[2] = user3;
        List list =Arrays.asList(objs);
        for(Object u : list){
            System.out.println(u);
        }




        //遍历List
        List<String> myList = new ArrayList<String>();
        for(String ele:myList){
            System.out.println(ele);
        }

        //遍历Set
        Set<Integer> mySet = new HashSet<Integer>();
        for(Integer ele:mySet){
            System.out.println(ele);
        }

        //遍历Map
        HashMap<String,Double> myMap = new HashMap<String, Double>();
        myMap.put("qiznhen",99.9);
        myMap.put("fengyu",89.9);
        myMap.put("qinhao",19.9);
        myMap.put("qinhong",9.9);

        //遍历所有的value
        Collection<Double> values = myMap.values();
        for (Double ele : values){
            System.out.println(ele);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        //遍历所有的Key
        Set<String> keySets = myMap.keySet();
        for(String ele:keySets){
            System.out.println(ele
            );
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        //遍历所有的Entry
        Set<Map.Entry<String, Double>> entries = myMap.entrySet();
        for(Map.Entry<String, Double> ele : entries){
            System.out.println(ele);
        }
    }
}
