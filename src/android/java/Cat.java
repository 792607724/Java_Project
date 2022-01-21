package android.java;

public class Cat {

    public String name;
    public String color;
    public int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void heihei() {
        System.out.println("OK");
        System.out.println("hei hei!!!");
        System.out.printf("My name is %s, and i like %s color, now i'm %s years old\n", this.name, this.color, this.age);
    }

    public static void main(String[] args) {
        haha(123);
        Cat c = new Cat("Bruce", "Yellow with Gray", 2);
        c.heihei();
        haha(12, 13);
    }

    public static void haha(int a) {
        System.out.println("ha ha!!!" + a);

    }

    public static void haha(int a, int b) {
        System.out.println("haha!!!" + a + b);
    }


}
