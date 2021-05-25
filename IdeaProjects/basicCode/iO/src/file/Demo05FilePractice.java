package file;

import java.io.File;
import java.io.FilenameFilter;

/*
* 需求:将D:\\KuGou 文件夹下的.ape格式的文件的名称和人名交换位置.
* 思路:
*   1.封装该目录
*   2.判断是否为.ape格式public File[] listFiles(FilenameFilter filter)并获取文件对象数组File[]
*   3.遍历数组修改名称
*   4.重命名public boolean renameTo​(File dest)
*
* */
public class Demo05FilePractice {
    public static void main(String[] args) {
        //1.封装该目录
        File file1 = new File("D:\\KuGou");
        //2.判断是否为.ape格式public File[] listFiles(FilenameFilter filter)并获取文件对象数组File[]
        File[] filesArray = file1.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".ape");
            }
        });

        //遍历数组修改名称
        if (filesArray != null) {
            for (File file : filesArray) {
                String fileName = file.getName();
                int index1 = fileName.indexOf("-");
                int index2 = fileName.indexOf(".");
                String songName = fileName.substring(index1 + 1,index2);
                String songerName = fileName.substring(0,index1);
                String newName = songName + "-" + songerName + ".ape";
                File newFile = new File(file1, newName);
                file.renameTo(newFile);

            }
        }
    }

}
