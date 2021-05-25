package streamAPI.practices;

import java.util.List;
import java.util.stream.Stream;

/*
 * 综合案列
 *
 * */
public class Demo01 {
    public static void main(String[] args) {
        //first team
        List<String> list = List.of("迪丽热巴", "宋远桥", "苏星河", "老子", "庄子", "孙子", "洪七公");
        List<String> list1 = List.of("古力娜扎", "张无忌", "张三丰", "赵丽颖", "张二狗", "张天爱", "张三");

        //1.第一个队伍只要名字为3个字的成员姓名;
        //2.第一个队伍筛选之后只要前三个人;
        Stream<String> s1 = list.stream().filter(name -> name.length() == 3)
                .limit(3);
        //3.第二个队伍筛选姓张的成员姓名;
        //4.第二个队伍筛选之后不要前2个人;
        Stream<String> s2 = list1.stream().filter(name -> name.startsWith("张"))
                .skip(2);
        //5.将两个队伍合并为一个队伍
        Stream<String> s3 = Stream.concat(s1, s2);
        //6.根据姓名创建Person对象
        //7.打印整个队伍的Person对象信息
        s3.map(Person::new).forEach(System.out::println);
    }


}
