package studentManagerSystem;/*
��Ŀ��ʾ
��ӭ����ѧ������ϵͳ
1.���ѧ��
2.ɾ��ѧ��
3.�޸�ѧ��
4.�鿴ѧ��
5.�˳�ϵͳ
��������Ž���ѡ��:

*/
//ѧ����
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
