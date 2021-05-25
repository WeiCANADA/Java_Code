package lambdaIntrodction;

public interface MathOperation {
    int operation(int a, int b);

    public default int operate(int a, int b, MathOperation mathoperation) {
        return mathoperation.operation(a, b);
    }
}
