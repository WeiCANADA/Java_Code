package IOStreamStudy;

import java.io.*;

/*
 * 需求：复制单极文件夹内的txt文件
 *
 * 数据源：D:\folderA
 * 目的地：D:\folderA-copy
 *
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的所有文本的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:把该File进行复制
 */
public class Demo16_Practice6_CopyFolder {
    public static void main(String[] args) throws IOException {
        //封装源文件夹和目标文件夹
        File srcFolder = new File("D:\\folderA");
        File destFolder = new File("D:\\folderA-copy");
        //如果文件夹不存在创建
        if(!destFolder.exists()){
            destFolder.mkdir();
        }

        File[] files = srcFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                    return new File(dir, name).isFile() && name.endsWith(".txt");
                }
        });

        //遍历获取文件并copy
        assert files != null;
        for(File file : files){
            System.out.println(file);
            String name = file.getName();
            File newFile = new File(destFolder, name);

            copy(file,newFile);
        }
    }

    private static void copy(File file, File newFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));

        String line = null;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
