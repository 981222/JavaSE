package com.huang.javase.io;

import java.io.*;

/*
 * 使用FileInputStream + FileOutputStream + File完成文件目录的拷贝。
 * 拷贝的过程应该是一边读一遍写。
 * 使用以上的字节流拷贝文件的时候，文件类型随意，万能的。什么文件都能拷贝。
*/
public class CopyAll {
    public static void main(String[] args) {
        //源目录
        File srcFile = new File("D:\\360驱动大师目录");
        //目标目录
        File destFile = new File("D:\\huang\\java");
        //调用方法
        copyDir(srcFile,destFile);
    }

    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()){
            //是文件就copy
            copyFile(srcFile,destFile);
            return;
        }
        File[] files = srcFile.listFiles();
        for (File file : files){
            if(file.isDirectory()) {
                String srcDir = file.getAbsolutePath();
                String destDir = destFile.getAbsolutePath() + "\\" + srcDir.substring(3);
                File newDestDir = new File(destDir);
                if (!newDestDir.exists()) {
                    newDestDir.mkdirs();
                }
            }
            copyDir(file, destFile);
        }
    }

    public static void copyFile(File srcFile,File destFile){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(srcFile);
            String path = destFile.getAbsolutePath() + "\\" + srcFile.getAbsolutePath().substring(3);
            fos = new FileOutputStream(path);

            byte[] bytes = new byte[1024 * 1024];
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){
                fos.write(bytes,0,readCount);
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
