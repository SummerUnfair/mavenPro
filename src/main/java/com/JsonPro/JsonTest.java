package com.JsonPro;/*
 * @author Ferao
 * @date
 * @discription
 */

import com.Pojo.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import sun.management.snmp.jvmmib.EnumJvmMemPoolType;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JsonTest {
    public static void main(String[] args) {

        //文件大小
        long len= FileUtils.sizeOf(new File("D:\\SpringbootTesk\\mavenPro\\src\\main\\java\\com\\Pojo\\People.java"));
        System.out.println(len);
        //目录大小
        len=FileUtils.sizeOf(new File("D:\\SpringbootTesk\\mavenPro\\src\\main\\java\\com\\Pojo"));
        System.out.println(len);
        //列出子孙级
        Collection<File> files = FileUtils.listFiles(new File("D:\\SpringbootTesk\\mavenPro\\src\\main\\java\\com\\Pojo"),
                EmptyFileFilter.NOT_EMPTY,
                DirectoryFileFilter.INSTANCE);
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

    }
}
