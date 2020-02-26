package Jintai;

import java.sql.SQLOutput;

public class Person {
    static {
        System.out.println("静态的代码块的执行！");
    }
    public Person(){
        System.out.println("构造方法的执行!");
    }
}
