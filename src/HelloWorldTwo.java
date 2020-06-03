public class HelloWorldTwo {
/*
    变量命名只能使用 字母 数字 $ 下划线 _
    变量第一个字符 只能使用 字母 $ _   不能使用数字
    在命名的时候，尽量使用完整的单词进行命名，比如name,moveSpeed，而不是使用缩写 n,m

    什么是关键字
    比如int, short, class 这些单词已经被java 赋予了特殊的含义，这些就是关键字。不能直接用来作为变量名
    比如class
    int class = 5;
    class 是关键字
    但是可以包含数字
    比如
    int class5 = 5;

    关键字表
    异常处理                 字面值常量          基本数据类型    分支关键字     循环关键字       方法、变量和类修饰符
        try                    false               byte         if              do              private
        catch                  true                short        else            while           public
        finally                null                int          switch          for             protected
        throw                方法相关               long        case            break           final
        throws                  return             float        default         continue        static
    对象相关                     void               double                                       abstract
        new                  包相关                 chart                                        synchronized
        extends                 package             boolean                                      transient
        implements              import                                                           volatile
        class                                                                                    strictfp
        instanceof
        this
        super

     变量处于不同的位置，有不同的名称，分别是 字段，属性，参数，局部变量
     不同名称的变量，其作用域是不一样的
*/

/*
   当一个变量被声明在类下面 HelloWorldTwo
   变量就叫做字段 或者属性、成员变量、Field
   比如变量i,就是一个属性。
   那么从这个变量声明的位置开始，整个类都可以访问得到
   所以其作用域就是从其声明的位置开始的整个类
*/
    int i = 1;
    int j = i;  //其他的属性可以访问i   //类里面也不能访问参数i
    public void method1() {
        System.out.println(i); //方法1里可以访问i
    }

    public void method2() {
        System.out.println(i); //方法2里可以访问i
    }

/*
    如果一个变量，是声明在一个方法上的，就叫做参数
    参数的作用域即为该方法内的所有代码
    其他方法不能访问该参数
    类里面也不能访问该参数
 */
    public void method3(int i){ //参数i的作用域即方法method3
        System.out.println(i);
    }
    public void method4(){
        System.out.println(i); //method4 不能访问参数i
    }

/*
    声明在方法内的变量，叫做局部变量
    其作用域在声明开始的位置，到其所处于的块结束位置
 */
    public void method5(){
        int i  = 5;  //其作用范围是从声明开始，到其所处于的块结束位置
        System.out.println(i);
        {            //子块
            System.out.println(i); //可以访问i
            int j = 6;
            System.out.println(j); //可以访问j
        }
        System.out.println(j); //不能访问j,因为其作用域到块尾就结束了
    }




    public static void main(String[] args) {

        HelloWorldTwo helloWorldTwo = new HelloWorldTwo();
        helloWorldTwo.method5();

        int a = 5;
        int a_12 = 5;
        int $a43 = 5;
        int a434 = 5;

        //第一个是数字，是不行的
//        int 34a= 5;

        //使用完整单词命名，易于理解
        String name;
        float hp;
        float armor;
        int moveSpeed;




}
}

