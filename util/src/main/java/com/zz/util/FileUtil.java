package com.zz.util;

import java.io.*;

import static sun.java2d.cmm.ColorTransform.In;

/**
 * 对文件处理
 */
public class FileUtil {

    public String readFileToString(String path){
        String content="";
        File file=new File(path);
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
           InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            String line;
           while ((line=bufferedReader.readLine())!=null){
               content+=line;
           }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

}
