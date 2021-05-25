package IOStreamStudy;

import java.io.*;

/*
 * 需求：复制指定目录下的指定文件，并修改后缀名。
 * 指定的文件是：.java文件。
 * 指定的后缀名是：.jad
 * 指定的目录是：jad
 *
 * 数据源：e:\\java\\A.java
 * 目的地：e:\\jad\\A.jad
 *
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的java文件的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:把该File进行复制
 * 		E:在目的地目录下改名
 */
public class Demo17_Practice7_copyFolder {
    public static void main(String[] args) throws IOException {
        //创建源文件e:\\java并封装
        File srcDir = new File("e:\\java");
//        if(!srcDir.exists()){
//            srcDir.mkdir();
//        }
//
//        File srcFile = new File("e:\\java\\A.java");
//        if(!srcFile.exists()){
//            srcFile.createNewFile();
//        }

        //封装目标文件
        File destDir = new File("e:\\jad");
        if(!destDir.exists()){
            destDir.mkdir();

            //获取源文件夹下的java文件集合
            File[] files = srcDir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return new File(dir, name).isFile() && name.endsWith(".java");
                }
            });

            assert files != null;
            for(File file : files){
                String name = file.getName();
                File newFile = new File(destDir, name);
                copy(file, newFile);
            }

           //改名
            File[] destFiles = destDir.listFiles();
            assert destFiles != null;
            for(File file : destFiles) {
                String name = file.getName();
                String newName = name.replace(".java", ".jad");
                File newFile = new File(destDir, newName);
                file.renameTo(newFile);
            }

        }
    }
    private static void copy(File file, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}
