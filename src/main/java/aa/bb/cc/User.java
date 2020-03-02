package aa.bb.cc;

import java.util.List;

public class User implements Comparable<User>{

    private String name;
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public User(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(User o) {
        return this.name.length() - o.name.length();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static <T extends Number> void  m1(List<? extends T> list2){

    }


}
