package functionInterface;

public class demo1 {
    public static void main(String[] args) {
        test((a, b) -> System.out.println(a + b));
    }

    static void test(Operation operation) {
        operation.getSum(1, 2);
    }

    //create a Interface
    interface Operation {
        void getSum(int a, int b);
    }
}

