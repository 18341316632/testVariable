public class HelloWorldApril {//对应类的块
    /*
    表达式是由变量、操作符以及方法调用所构成的结构
    以 ; 为结尾的一段代码都是一个表达式
    ; 也是一个表达式

    从 { 开始 到对应的 } 结束，即一个块
     */
    public void method(int j){
        System.out.println(j);
    }
    public static void main(String[] args) {//主方法的块
        int i = 5;
        System.out.println("表达式");
        //一个空 ; 也是一个表达式
        ;
        ;
        ;

        HelloWorldApril helloWorldApril = new HelloWorldApril();
        helloWorldApril.method(1);

        System.out.println("块");

    }
}
