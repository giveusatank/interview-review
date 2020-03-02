package aa.bb.cc;

import java.util.*;

public class TestCompare {

    public static void main(String[] args) {

        User qinzhen123 = new User("qinzhen123", 222.222);
        User qinzhen1 = new User("qinzhen1", 222.222);
        User qinzhen12 = new User("qinzhen12", 222.222);
        User qinzhen1234 = new User("qinzhen1234", 222.222);
        User qinzhen12456 = new User("qinzhen12456", 222.222);

        System.out.println(qinzhen123.compareTo(qinzhen1234));
        System.out.println(qinzhen12456.compareTo(qinzhen123));

        Map hashMap = new LinkedHashMap<String,String>();
        hashMap.put("b","666");
        hashMap.put("a","123");
        hashMap.put("c","888");

        Set<Map.Entry<String,String>> set = hashMap.entrySet();
        for(Map.Entry<String,String> en :set){
            System.out.println(en.getKey() +"\t" + en.getValue());
        }


        TreeMap<User, String> treeMap = new TreeMap<User, String>(new MyComparator());


        treeMap.put(qinzhen123,"qinzhen123");
        treeMap.put(qinzhen1,"qinzhen1");
        treeMap.put(qinzhen12,"qinzhen12");
        treeMap.put(qinzhen1234,"qinzhen1234");
        treeMap.put(qinzhen12,"qinzhen12");
        treeMap.put(qinzhen12456,"qinzhen12456");

        Set<Map.Entry<User, String>> entries = treeMap.entrySet();
        for(Map.Entry<User, String> en : entries){
            System.out.println(en.getKey() +"\t" + en.getValue());
        }

        //AA<String, Integer, Long, Double> aa = new AA<String, Integer, Long, Double>();

        ArrayList<Integer> integers = new ArrayList<Integer>();
        LinkedList<Integer> integers1 = new LinkedList<Integer>();

        List<? extends Number> list1 = new ArrayList<Integer>();

        //AA<String> stringAA = new AA<String>();
        //stringAA.<String>m1(123 );
        new DD<Integer>().m1(23);

        List list1_ = new ArrayList<String>();
        List list2_ = new ArrayList<Double>();

        User.<Double>m1(new ArrayList<Double>());
    }
}

class MyComparator implements Comparator<User> {

    public int compare(User o1, User o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}