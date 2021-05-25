package lambdaIntrodction;

/*lambda 表达式
* 以下是lambda表达式的重要特征:

可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
*
* 使用 Lambda 表达式需要注意以下两点：
Lambda 表达式主要用来定义行内执行的方法类型接口，例如，一个简单方法接口。在上面例子中，我们使用各种类型的Lambda表达式来定义MathOperation接口的方法。然后我们定义了sayMessage的执行。
Lambda 表达式免去了使用匿名方法的麻烦，并且给予Java简单但是强大的函数化的编程能力。
 */
public class MathOperationTest {
    public static void main(String[] args) {
        //c传统的匿名内部类调用

        /*
        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };
        int sum = mathOperation.operation(10, 5);
        */

        //lambda 表达式
        //可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
        MathOperation addition = Integer::sum;//::引用类方法
        //MathOperation addition = (a, b) -> a + b;
        //int sum1 = addition.operation(10, 1);


        //有大括号
        MathOperation subtraction = (a, b) -> {
            return a - b;
        };//多行语句的时候要用大括号
        //int sum2 = addition.operation(10, 1);

        //类型申明
        MathOperation multiplication = (int a, int b) -> a * b;

        System.out.println("10 + 11 = " + addition.operate(10, 11, addition));
        System.out.println("10 - 11 = " + subtraction.operate(10, 11, subtraction));
        System.out.println("10 * 11 = " + multiplication.operate(10, 11, multiplication));
    }
}
