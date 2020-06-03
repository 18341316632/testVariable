public class HelloWorld {
/*
    变量的定义是： 用来命名一个数据的标识符
    int 代表数据类型
    year 代表标识符
    =   代表赋值符
    1949 代表数字类型值
    ； 表示此行结束
 */

    public static void main(String[] args) {
        int year = 1949;

/*
    8种基本数据类型
    整型   byte short int long
    字符型 char
    浮点型 float double
    布尔型 boolean

    String类型不是基本数据类型，但是被广泛使用。
    String是 Immutable 的，一旦被创建，不能被改变
*/
        //给数据类型赋予超出其范围的值，会出现编译错误
        byte  b = 1;
        short s = 200;
        int   i = 300;
        long  l = 400;
        //char 中只能存放一个字符，超出了就会出现编译错误
        char c = '中';
        //默认小数类型为 double，所以定义float类型时要加 f 注释
        float f = 1100f;
        double d = 100;
        //boolean类型表示真假 true or false，但是不能用 0 or 1 赋值
        boolean b1 = true;
        boolean b2 = false;

        String string = "Hello World";
    }
}
