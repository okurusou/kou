package six;

public class Ex6_9 {

}


class MyClass {
    // �ν��Ͻ� ����
    int instanceVariable = 10;
    
    // static ����
    static int staticVariable = 20;

    // static �޼���
    public static void staticMethod() {
        // ���� �� ���� ����
        //instanceVariable = 30; // �ν��Ͻ� ������ ���� �Ұ���
        //nonStaticMethod(); // �ν��Ͻ� �޼��忡 ���� �Ұ���

        // static ������ static �޼��忡 ���� ����
        staticVariable = 40;
        anotherStaticMethod();
    }

    public void nonStaticMethod() {
        // �ν��Ͻ� �޼��� �������� ��� ����� ���� ����
        instanceVariable = 50;
        staticVariable = 60;
        staticMethod();
        anotherStaticMethod();
    }

    public static void anotherStaticMethod() {
        // static �޼��� �������� ��� static ����� ���� ����
        staticVariable = 70;
    }
}
