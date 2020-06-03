public class HelloWorldOne {

/*
    创建一个Hero对象会用到new关键字，但是给一个基本类型变量赋值却不是用new.
    因为基本类型是Java语言里的一种内置的特殊数据类型，并不是某个类的对象。
    给基本类型的变量赋值的方式叫做 字面值
*/
public static void main(String[] args) {
    HelloWorldOne helloWorldOne = new HelloWorldOne();
    int i = 20;

    long val = 26L; //以L结尾的字面值表示long型
    int decVal = 26; //默认就是int型 0~9
    int hexVal = 0x1a; //16进制 0~9 A~F
    int oxVal = 032; //8进制 0~7
    int binVal = 0b11010; //2进制 0~1
    System.out.println(oxVal);

    float f1 = 123.4F;// 以F结尾的字面值表示float类型
    double d1 = 123.4;// 默认就是double类型
    double d2 = 1.234e2;// 科学计数法表示double 1.234 X 10^2

/*
    字符的字面值放在单引号中
    字符串的字面值放在双引号中
    需要注意的是，\表示转义，比如需要表示制表符，回车换行，双引号等就需要用 \t \r \n \" 的方式进行
 */
    String name = "盖伦";
    char a= 'c';

    //以下是转义字符
    char tab = '\t'; //制表符
    char carriageReturn = '\r'; //回车
    char newLine = '\n'; //换行
    char doubleQuote = '\"'; //双引号
    char singleQuote = '\''; //单引号
    char backslash = '\\'; //反斜杠

 /*
    不同类型之间的数据可以互相转换，但是要满足一定的规则
    转换规则:
    精度高的数据类型就像容量大的杯子，可以放更大的数据
    精度低的数据类型就像容量小的杯子，只能放更小的数据
    小杯子往大杯子里倒东西，大杯子怎么都放得下(小到大自动转)
    大杯子往小杯子里倒东西，有的时候放的下，有的时候就会有溢出（大到小强制转）
    需要注意的一点是
    虽然short和char都是16位的，长度是一样的,但是彼此之间，依然需要进行强制转换
  */
    char c = 'A';
    short s = 80;

    //虽然short和char都是16位的，长度是一样的
    //但是彼此之间，依然需要进行强制转换
    c = (char) s;
    //直接进行转换，会出现编译错误
//  s = c;

    //低精度向高精度转换
    long l = 50;
    int i1 = 50;
    //int比较小，要放进比较大的long,随便怎么样，都放的进去
    l = i1;

    //高精度向低精度转换
    byte b = 5;
    int i2 = 10;
    int i3 = 300;

    b = (byte) i2;
    //因为i2的值是在byte范围之内，所以即便进行强制转换
    //最后得到的值，也是10
    System.out.println(b);

    //因为i3的值是在byte范围之外，所以就会按照byte的长度进行截取
    //i3的值是300，其对应的二进制数是 100101100
    //按照byte的长度8位进行截取后，其值为 00101100 即44
    b =(byte) i3;
    System.out.println(b);
    //查看一个整数对应的二进制的方法：
    System.out.println(Integer.toBinaryString(i3));

    short s1 = 1;
    short s2 = 2;
    System.out.println(s1+s2);
}
}
