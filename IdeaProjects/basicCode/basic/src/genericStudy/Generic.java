package genericStudy;

public class Generic<T> {
    private T t;

    public Generic() {
    }

    public Generic(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
