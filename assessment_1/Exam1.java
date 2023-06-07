package assessment_1;

public class Exam1 {
    public static void main(String[] args) {

        // 문제 1
        int num1 = 15;
        int num2 = 4;
        System.out.printf("num1을 num2로 나눈 몫은 %f입니다.\n", ((double) num1 / num2)); // num1을 num2로 나눈 몫은 3.750000입니다.

        // 문제 2
        int a1 = 10;
        int a2 = 10;
        System.out.printf("a2는 a1과 같은 값 %d입니다.\n", 10); // a2는 a1과 같은 값 10입니다.

        // 문제 3
        for (int num = 1; num < 6; num++) {
            System.out.println(num); // 출력 : 1 2 3 4 5
        }

        // 문제 4
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1 + ", " + str2); // hello, world

        // 문제 5
        float[] arr = new float[10];
        System.out.println(arr.length); // 10

        // 문제 6
        Dog dog1 = new Dog(5, "Max");
        System.out.printf("%d살 강아지 %s\n", dog1.age, dog1.name); // 5살 강아지 Max

        // 문제 7
        Dog.classinfo();

        // 문제 8
        dog1.bark();// Max가 멍멍하고 짖습니다.
    }
}

class Dog {
    public int age;
    public String name;

    // 문제 9
    Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // 문제 10
    static void classinfo() {
        System.out.println("이름과 나이를 이용해 Dog를 만드는 Dog class 입니다.");
    }

    void bark() {
        System.out.printf("%s가 멍멍하고 짖습니다.\n", this.name);
    }
}