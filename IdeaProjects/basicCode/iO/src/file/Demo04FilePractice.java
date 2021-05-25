package file;

import java.io.File;
import java.io.FilenameFilter;

/*
* ????: ???E:\\Java ????????????jpg????????,??????.
* ???1: ???E:\\Java?????File f
*       ????????????????files ??directors ????. ???public File[] listFiles()
*       ????????????.???for
*       ????????file. ??? public boolean isFile()
*       ????????.jpg. public boolean endsWith(String suffix)
*       ???.
*˼·2: ʹ��public String[] listFiles(FilenameFilter filter)����.
*   ??? FilenameFilter??accept(File dir, String name)??????????????????????????????????????

 * */
public class Demo04FilePractice {
    public static void main(String[] args) {
        //???E:\\Java?????File f
        File f = new File("D:\\Java");

       // ????????????????files ??directors ????. ???public File[] listFiles()
        File[] fileArray = f.listFiles();

        //????????????.???for
        if (fileArray != null) {
            for (File file : fileArray) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    if (fileName.endsWith(".jpg")) {
                        System.out.println(fileName);
                    }
                }
            }
        }else{
            System.out.println("??��????��");
        }

        //ʹ��public String[] list?(FilenameFilter filter)����
        String[] stringFilesArray = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
               /* File file = new File(dir, name);
                return file.isFile() && name.endsWith("jpg");*/
                return new File(dir, name).isFile() && name.endsWith(".jpg");
            }
        });
        if (stringFilesArray != null) {
            for(String str : stringFilesArray){
                System.out.println(str);
            }
        }
    }
}
       //Դ�����
/*public String[] list(FilenameFilter filter) {*/
/*        String names[] = list();*/
/*        if ((names == null) || (filter == null)) {*/
/*            return names;*/
/*        }*/
/*        List<String> v = new ArrayList<>();*/
/*        for (int i = 0 ; i < names.length ; i++) {*/
/*            if (filter.accept(this, names[i])) {*/
/*                v.add(names[i]);*/
/*            }*/
/*        }*/
/*        return v.toArray(new String[v.size()]);*/
/*
    }*/
