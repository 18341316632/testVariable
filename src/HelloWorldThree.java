public class HelloWorldThree {
/*
    final 修饰一个变量，有很多种说法，比如不能改变等等
    准确的描述是;当一个变量被final修饰的时候，该变量只有一次赋值的机会
    final 除了修饰变量，还可以修饰类，修饰方法


*/

    public void method1(){
        final int i = 1;
//        i = 10; 因为 i 被final修饰，并且只有一次赋值机会，即 i = 1
    }

    public void method2(){
        final int i;
        i = 10; //声明时未被赋值，有一次赋值机会 i = 10
//        i = 11; i 已经被赋值为 10，不能在被修改
    }

    public void method3(final int j){
//            j = 1;
//  修饰基本类型（非引用类型）。这时参数的值在方法体内是不能被修改的，即不能被重新赋值。否则编译就通不过
    }
}
