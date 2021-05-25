package studentManagerSystem;/*
项目演示
欢迎来到学生管理系统
1.添加学生
2.删除学生
3.修改学生
4.查看学生
5.退出系统
请输入序号进行选择:

*/
//学生类
public class Student {
    private String name;
    private String id;
    private String age;
    private  String address;

    public Student() {
    }

    public Student(String name, String id, String age, String address) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
