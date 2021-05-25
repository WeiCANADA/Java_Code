package IOStreamStudy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息(学号,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
 *
 * 分析：
 * 		A:创建学生类
 * 		B:创建集合对象
 * 			TreeSet<Student>
 * 		C:键盘录入学生信息存储到集合
 * 		D:遍历集合，把数据写到文本文件
 */
public class Demo18_P_Students {
    public static void main(String[] args) throws IOException {
        TreeSet<Demo18_P_StudentClass> stuTreeSet = new TreeSet
                <Demo18_P_StudentClass>(new Comparator<Demo18_P_StudentClass>() {
            @Override
            public int compare(Demo18_P_StudentClass s1, Demo18_P_StudentClass s2) {
                float i = s1.sumSores() - s2.sumSores();
                float i1 = i == 0? s1.chineseS - s2.chineseS : i;
                float i2 = i1 == 0? s1.englishS - s2.englishS : i1;
                float i3 = i2 == 0? s1.mathS - s2.mathS : i1;
                float i4 = i3 == 0? s1.getName().compareTo(s2.getName()) : i3;
                return (int) i4;
            }
        });

        for (int i = 0; i < 5; i++) {
            Demo18_P_StudentClass s = new Demo18_P_StudentClass();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生学号:");
            s.setName(sc.nextLine());
            System.out.println("请输入ChineseScore:");
            s.setChineseS(sc.nextFloat());
            System.out.println("请输入EnglishScore:");
            s.setEnglishS(sc.nextFloat());
            System.out.println("请输入ChineseScore:");
            s.setMathS(sc.nextFloat());

            stuTreeSet.add(s);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
        bw.write("学生信息如下:");
        bw.newLine();
        bw.flush();
        bw.write("Name,Chinese,English,Math");
        bw.newLine();
        bw.flush();
        for (Demo18_P_StudentClass s : stuTreeSet){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(',').append(s.getChineseS()).append(',')
                    .append(s.getEnglishS()).append(',').append(s.getMathS());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
        System.out.println("学生信息存储完毕");

    }
}
