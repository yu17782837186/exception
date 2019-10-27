package cn.com.exception;

public class TestException {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = b/a;
        System.out.println(c);//会出现ArithmeticException

        String str = null;
        System.out.println(str.charAt(1));//会出现空指针异常

        Animal aa = new Dog();
        Tiger bb = (Tiger) aa;//会出现CCE异常

        int[] array = new int[3];
        System.out.println(array[4]); //会出现ArrayIndexOutOfBoundEcxeption
    }
}
class Animal {
    public static void eat() {
        System.out.println("吃东西");
    }
}
class Dog extends Animal {
    public static void eat2() {
        System.out.println("吃骨头！！");
    }
}
class Tiger extends Animal {
    public static void eat2() {
        System.out.println("吃肉肉！！");
    }
}
