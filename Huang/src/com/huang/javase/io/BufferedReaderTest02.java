package com.huang.javase.io;

import java.io.*;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws IOException {
        //节点流
        FileInputStream in = new FileInputStream("test");

        //节点流和包装流是相对的
        //通过转换流转化(InputStreamReader 将字节流转化为字符流)
        // in 是节点流。reader是包装流。
        InputStreamReader reader = new InputStreamReader(in);

        // 这个构造方法只能传入一个字符流。不能传入字节流。
        //reader是节点流。br 是包装流。
        BufferedReader br = new BufferedReader(reader);

        //关闭最外层。
        br.close();
        //合并
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new InputStreamReader(new FileInputStream("test")));
//            String s = null;
//            while ((s = br.readLine()) != null){
//                System.out.println(s);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            //关闭最外层。
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


    }
}
