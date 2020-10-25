package com;/*
 * @author Ferao
 * @date
 * @discription
 */

public class exeTest {
    public static void main(String[] args) {
        openWinExe();
        openExe();
    }
    //用 Java 调用windows系统的exe文件，比如notepad，calc之类
    public static void openWinExe() {
        Runtime rn = Runtime.getRuntime();
        Process p = null;
        try {
            String command = "notepad";
            p = rn.exec(command);
        } catch (Exception e) {
            System.out.println("Error win exec!");
        }
    }
    //调用其他的可执行文件，例如：自己制作的exe，或是 下载 安装的软件.
    public static void openExe() {
        Runtime rn = Runtime.getRuntime();
        Process p = null;
        try {
            p = rn.exec("\"D:/QQ2010.exe\"");
        } catch (Exception e) {
            System.out.println("Error exec!");
        }
    }
}
