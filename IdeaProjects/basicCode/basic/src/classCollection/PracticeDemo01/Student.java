package classCollection.PracticeDemo01;

public class Student implements Comparable<Student>{
    private String name;
    private double chinese;
    private  double math;

    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(student.chinese, chinese) != 0) return false;
        if (Double.compare(student.math, math) != 0) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(chinese);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(math);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Student s) {
        double total = s.chinese + s.math;
        double thisTotal =this.chinese + this.math;
       double d =total - thisTotal;
       int i = (int) Math.round(d);
       i = i==0?this.name.compareTo(s.name) : i;
        return i;
    }

    public Student() {
    }

    public int getSum(){
        int sum = (int) Math.round(this.chinese + this.math);
        return sum;
    }

}
