package gouZaoFangFa;

import genericStudy.Generic;


public class Demo01Student {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu1 = new Student("刘思坦" , 15);
        System.out.println(stu1.getName() + stu1.getAge());

        System.out.println("------------------------");
        //泛型类Generic<T>演示
        Generic<String> stringObject = new Generic<>();
        stringObject.setT("刘曦冉");
        System.out.println(stringObject.getT());

        Generic<Integer> integerGeneric = new Generic<>();
        integerGeneric.setT(100);
        System.out.println(integerGeneric.getT());

        Generic<Boolean> booleanGeneric = new Generic<>();
        booleanGeneric.setT(true);
        System.out.println(booleanGeneric.getT());
    }
}