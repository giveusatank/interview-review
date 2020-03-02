package aa.bb.cc;

import java.util.ArrayList;
import java.util.List;

/**
 * Java的泛型是在编译时提供一种类型检查机制，避免了类型转换带来的类型安全风险。
 *
 * Java中支持上界、不可变
 *
 * 所有涉及到泛型字母的时候都可以使用上界来约束，也可以是确定的泛型，比如  T 或者 T extends Number
 *
 * 泛型的编译期擦除机制：如果指定了泛型上界编译之后的类型就是上界的类型，否则就是Object
 *
 * （1）泛型类
 *
 * class A <E> {
 *
 * }
 *
 * class B <T extends Number>{
 *
 * }
 *
 * （1）泛型类
 * 泛型类的泛型类型什么时候确定？
 *
 * 【1】继承父类的时候，子类确定父类的泛型类型  class Dog extends Animail<String,Integer>{}
 *
 * 《注》在继承的时候对于父类的泛型字母，有两种处理方式，一种就是确定父类泛型类型，另一种就是继承父类的泛型类型，
 *  但是泛型字母必须要一一对应！ class Cat<E,T> extends Animal<E,T>{}
 *
 * 【2】创建类的实例的时候。
 *
 *  new Animal<String,Double>();
 *
 *
 * 泛型接口和泛型类大同小异！
 *
 *
 * （2）泛型方法：
 * 必须在返回值类型前加<T> 或者 <E extends Number>
 *
 * 在调用泛型方法时：对象.<A>method1();
 *
 *
 * （3）泛型的通配符：
 *
 *  ? : List<A>是任意类型都是List<?>的子类型
 *
 *  ? extends A : List<B> B是任意<=A类型的类型，都是List<? extends A>的子类型
 *
 *  ? super A : List<C> C是任意>=A类型的类型，都是List<? super A>的子类型
 *
 *  【注】A是B的子类，那么A<X> X为任意类型，A<X>都是B类型的子类
 *
 *  【注】Java中是不可变，即A是B的子类，List<A> 与 List<B>无关
 *
 *
 *  Java中泛型为什么没有数组？
 *
 *
 *
 */
public class JavaGeneric {
    public static void main(String[] args) {

        MyLinkedHashMap myLinkedHashMap = new MyLinkedHashMap();

        myLinkedHashMap.method1();
    }
}
