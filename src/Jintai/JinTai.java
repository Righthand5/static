package Jintai;
//注意：根据类的名称访问静态成员变量的时候，全程和对象就没有关系，只和类有关系。
//一旦使用static修饰成员方法，那么这就成为静态方法。静态方法不属于对象，而属于类的。
//如果没有static关机字，那么必须首先创建对象，然后通过对象才能调用它
//静态通过类的名称进行调用myClass.methodStatic
//静态变量：类名称.静态变量，静态方法：类的名称.静态的方法。
//成员方法可以访问静态内容，成员变量，
//静态方法可以访问静态变量
//静态内容不可以访问非静态变量？为什么，因为在内存中是先有静态的内容，后有非静态的内容。“先人并不知道后人”
//静态方法中是不可用this的，因为this代表当前对象，通过谁调用的方法，谁就是当前对象。
public class JinTai {
    public static void main(String[] args) {
        Myclass obj=new Myclass();
        //然乎才可以使用没有static关键字的内容
        obj.method();
        //对于非静态方法来说，可以通过对象名进行调用，也可以直接通过类名来调用
        obj.methodStatic();//正确不推荐写法
        Myclass.methodStatic();//推荐写法
        myMethod();//完全等效
        JinTai.myMethod();//完全等效
    }

    public  static void myMethod(){
        System.out.println("My way");
    }

}
