package Jintai;
/*
静态代码块:
public class 类名称{
    static{
    //静态代码的内容
    }
}
特点：当第一次用到本类时，静态代码块唯一的执行一次。
静态内容总是优先于非静态，所以非静态代码块比构造方法先执行
* */
public class Demo04TStatic {
    public static void main(String[] args) {
        Person one =new Person();
        Person two =new Person();


    }
}
