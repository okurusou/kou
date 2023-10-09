package six;

public class Ex6_9 {

}


class MyClass {
    // 인스턴스 변수
    int instanceVariable = 10;
    
    // static 변수
    static int staticVariable = 20;

    // static 메서드
    public static void staticMethod() {
        // 다음 두 줄은 오류
        //instanceVariable = 30; // 인스턴스 변수에 접근 불가능
        //nonStaticMethod(); // 인스턴스 메서드에 접근 불가능

        // static 변수와 static 메서드에 접근 가능
        staticVariable = 40;
        anotherStaticMethod();
    }

    public void nonStaticMethod() {
        // 인스턴스 메서드 내에서는 모든 멤버에 접근 가능
        instanceVariable = 50;
        staticVariable = 60;
        staticMethod();
        anotherStaticMethod();
    }

    public static void anotherStaticMethod() {
        // static 메서드 내에서는 모든 static 멤버에 접근 가능
        staticVariable = 70;
    }
}
