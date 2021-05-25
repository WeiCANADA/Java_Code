package staticStudy;
/*
* static 可以修饰成员变量也可以修饰成员方法,都属于类.
* 一旦使用static 修饰成员方法,那么这个方法就称为了静态方法.静态方法不属于对象,而属于类,
* 调用方式:
* 推荐: 所属类名.静态方法名;
* 如果没有static 关键字, 那么必须首先创建对象,然后通过对象才能使用.
* */


public class Student {


    private String name;
    private int age;
    private int studentNo;
    static String room;

    public static void setIdCounter(int idCounter) {
        Student.idCounter = idCounter;
    }

    private static int idCounter = 0 ;

    public static int getIdCounter() {
        return idCounter;
    }

    public Student() {
        this.studentNo = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.studentNo = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }
}
