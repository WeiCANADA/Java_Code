package studentManagerSystem;
/*
*
* */
import java.util.ArrayList;
import java.util.Scanner;

public class SMS {
    public static void main(String[] args) {
        //创建集合对象用于存储学生数据
        ArrayList<Student> array = new ArrayList<>();
        //主界面显示
        /*
        * 1.用输出语句完成主界面的编写
        * 2.用Scanner 实现键盘录入数据
        * 3.用switch语句完成操作选择
        * 4.用循环语句再次返回主界面
        * */
        while(true){
        System.out.println("----欢迎来到学生管理系统----");
        System.out.println("1. 添加学生");
        System.out.println("2. 查看全部学生");
        System.out.println("3. 修改学生");
        System.out.println("4. 删除学生");
        System.out.println("5. 退出系统");
        System.out.println("请输入序号进行选择:");

        //选择进入1
            //键盘输入选择
        Scanner choose = new Scanner(System.in);
        int choosedNum = choose.nextInt();
        switch (choosedNum) {
            case 1:
                //System.out.println("添加学生:");
                addStudent(array);
                break;
            case 2:
               // System.out.println("查看全部学生");
                findAllStudents(array);
                break;
            case 3:
                //System.out.println("修改学生");
                updateStudent(array);
                break;
            case 4:
                //System.out.println("删除学生");
                deleteStudent(array);
                break;
            case 5:
                System.out.println("你已经成功退出系统");
                System.exit(0);
            default:
                System.out.println("输入错误请重新输入");
        }


        }


    }

    //methods
    //定义一个方法添加学生
    public static void addStudent(ArrayList<Student> array){
        //键盘以此输入学生信息/姓名/年龄/学号/地址
        /*
        * 用键盘录入选择添加学生
        * 定义一个方法,用于添加学生
        *   提示信息
        *   键盘录入学生对象所需要的信息
        *   创建对象,把键盘录入的数据赋值给学生对象成员变量.
        *   将学生对象添加到集合中
        *   给出添加成功的提示
        * */
        //用键盘录入选择添加学生
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        // 提示信息
        System.out.println("请输入学生姓名");
        //创建对象,把键盘录入的数据赋值给学生对象成员变量.
        s.setName(sc.nextLine());
        System.out.println("请输入学生学号");
        s.setId(sc.nextLine());
        System.out.println("请输入学生年龄");
        s.setAge(sc.nextLine());
        System.out.println("请输入学生地址");
        s.setAddress(sc.nextLine());
        //将学生对象加入集合
        array.add(s);
        System.out.println("学生信息输入成功");

   }
    public static void findAllStudents(ArrayList<Student> array){
        /*
        * 1 用键盘录入选择查看所有学生信息
        * 2.定一个方法,用于插卡学生信息
        *       显示表头信息
        *       将结合中数据去除按照对应格式显示学生信息,年龄显示补充"岁".
        * */
        //检查集合是否为空,为空则提示返回重新输入
        int size = array.size();
        if(size == 0){
            System.out.println("无任何学生信息,请先输入学生信息后查看");
            return;
        }
            //显示表头信息
        System.out.println("姓名\t学号\t年龄\t地址");

        for (int i = 0; i < size; i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "\t" + s.getId()+ "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }
    public static void deleteStudent(ArrayList<Student> array){
        /*
         *  1 用键盘录入选择查看所有学生信息
         * 2.定一个方法,用于删除学生信息
         *  显示提示信息
         *  键盘录入要删除的学生学号
         *  遍历结合将对应的学生对象从集合中删除
         * */
        System.out.println("请输入要删除的学生学号:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        //如果集合为空,返回提示信息
        int size = array.size();
        if(size == 0){
            System.out.println("目前无任何学生信息");
            return;
        }
        //删除学生
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if(id.equals(s.getId())){
                array.remove(i);
                System.out.println("删除成功");
            }else {
                System.out.println("输入的学号有误,请重新输入");
            }
        }

    }
    public static void updateStudent(ArrayList<Student> array){
        System.out.println("请输入要修改学生的学号:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if(id.equals(s.getId())){
                System.out.println("请输入学生姓名");
                //创建对象,把键盘录入的数据赋值给学生对象成员变量.
                s.setName(sc.nextLine());
                System.out.println("请输入学生学号");
                s.setId(sc.nextLine());
                System.out.println("请输入学生年龄");
                s.setAge(sc.nextLine());
                System.out.println("请输入学生地址");
                s.setAddress(sc.nextLine());
                System.out.println("修改成功");
                return;
            }else {
                System.out.println("输入的学号有误,请重新输入");
            }
        }


    }
}
