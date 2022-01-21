package android.java;

public class HelloWorld {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("KO");
//        int a = 12;
//        System.out.println(a);
//        double b = 12.234234;
//        System.out.println(b);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            System.out.println("Hello World!!!");
//        }
//        int j = 0;
//        for (; j < 10; j++) {
//            System.out.println(j);
//        }
        int a = 2;
        int b = 2;
        if (a < b) {
            System.out.printf("a<b,a=%s,b=%s", a, b);
        } else if (a == b) {
            System.out.println("A == B");
        } else {
            System.out.println("OK BOOM!!!");
        }
        int i = 1;
        switch (i) {
            case 0:
                System.out.printf("i is %s", i);
                break;
            case 1:
                System.out.printf("i is %s", i);
                break;
            default:
                System.out.printf("i is not ok : %s", i);
                break;
        }
        int[] array;
        array = new int[]{1, 2, 3, 4, 5};
        for (int j = 0; j < array.length + 1; j++) {
            System.out.println(j);
        }
        System.out.println(array[0]);
    }

}
