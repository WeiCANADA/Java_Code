package file;

import java.io.File;
import java.io.IOException;

/*
判断方法:
*   1. public boolean isDirectory()
      Tests whether the file denoted by this abstract pathname is a directory.
    2.public boolean isFile()
    * Tests whether the file denoted by this abstract pathname is a normal file.
    3.public boolean exists()
      Tests whether the file or directory denoted by this abstract pathname exists.
获取方法:
    4.public String getAbsolutePath()
    Returns the absolute pathname string of this abstract pathname.
    5.public String getPath()
    converts this abstract pathname into a pathname string.
    6.public String getName()
    Returns the name of the file or directory denoted by this abstract pathname.

    7.public String[] list()
    Returns an array of strings naming the files and directories in the directory denoted by this abstract pathname.
    8.public File[] listFiles()
    Returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname.


* */
public class MethodsDemo02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\Java\\IdeaProjects\\IO-Code\\src\\FileStudy\\fileTest");
        System.out.println(f1.isDirectory());//false
        System.out.println(f1.isFile());//true
        System.out.println(f1.exists());//true

        System.out.println(f1.getName());//fileTest
        System.out.println(f1.getAbsolutePath());//D:\Java\IdeaProjects\IO-Code\src\FileStudy\fileTest
        System.out.println(f1.getPath());//D:\Java\IdeaProjects\IO-Code\src\FileStudy\fileTest


        File f2 = new File("D:\\Java");

        //public String[] list()
        String[] listArray = f2.list();
        for(String str : listArray){
            System.out.println(str);
        }
        System.out.println("-----------------");

        //8.public File[] listFiles()
        File[] filesArray = f2.listFiles();
        for(File file : filesArray){
            //System.out.println(file.getClass());//同public String[] list()方法
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }




    }
}
