package file;
/*
* 需求:遍历D:\\Java文件夹下及其所有子文件夹中的.java 文件.
* 思路:
* 1.分装路径
* 2.遍历文件对象
* 3.判断是否为文件
*   是:判断是否为java文件
*         是:输出
*  判断是否为director
*   是:reture2
*
* */

import java.io.File;

public class Demo08DiGui03 {
    public static void main(String[] args) {
        File srcFile = new File("D:\\Java");
       getAllFilepath(srcFile);
    }
    public static void getAllFilepath(File srcFile){
        File[] filesArray = srcFile.listFiles();
        if(filesArray != null){
            for(File file : filesArray){
                if(file.isFile()){
                    String name = file.getName();
                    if(name.endsWith(".java")){
                        System.out.println(file.getAbsolutePath());
                    }
                }else if (file.isDirectory()){
                    getAllFilepath(file);
                }
            }
        }
    }
}
