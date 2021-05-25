package file;
/*
 * * 需求：递归删除带内容的目录demo
 *
 *
 *
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的所有文件或者文件夹的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:判断该File对象是否是文件夹
 * 			是：回到B
 * 			否：就删除
 * */

import java.io.File;

public class Demo09DiGui04 {
    public static void main(String[] args) {
        File srcFile = new File("D:\\demo");
        System.out.println(srcFile.getAbsolutePath());
        System.out.println(srcFile.exists());
        deleteAllFile(srcFile);


    }

    public static void deleteAllFile(File srcFile) {

        File[] filesArray = srcFile.listFiles();
        if (filesArray != null) {
            for (File file : filesArray) {
                if(file.isDirectory()){
                    deleteAllFile(file);
                }else {
                    System.out.println(file.getName() + "\t" + file.delete());
                }
            }
            System.out.println(srcFile.getName() + "\t" + srcFile.delete());
        }
    }
}
