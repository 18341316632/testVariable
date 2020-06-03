public class Test {
    int i = 1;
    public void method1(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.method1(5);
    }
}
