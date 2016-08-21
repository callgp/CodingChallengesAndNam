public class Tester {
    public static void main(String[] args) {
        E e1 = new F();
        float f1 = e1.foo();
        System.out.println(f1);

        E e2 = new E();
        System.out.println(e2.foo());
    }
}