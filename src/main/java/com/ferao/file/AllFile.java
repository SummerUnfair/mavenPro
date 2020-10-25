package com.ferao.file;

import java.io.File;

/**
 * function:
 *      获取文件夹下所有子文件及文件夹内含有.java尾缀的文件名
 */
public class AllFile {

    public static void main (String[] args)
    {
        File file = new File("D:\\spring");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        File[] files = file.listFiles();
        for (File o : files){
            if (o.isDirectory()){
                getAllFile(o);
            }else{
                if (o.toString().toLowerCase().endsWith(".java")){
                    System.out.println(o);
                }
            }
        }
    }
}
