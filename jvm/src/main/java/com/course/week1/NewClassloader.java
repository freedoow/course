package com.course.week1;

import java.io.FileInputStream;
import java.lang.reflect.Method;

/**
 * @author whb
 * @Description:
 * @Date 2021-09-21
 */
public class NewClassloader extends ClassLoader {
    //文件路径
    private String path = "./week1/Hello.xlass";

    @Override
    protected Class<?> findClass(String name) {
        // 读取
        byte[] bytes = readFile(path);
        //解码
        bytes = decode(bytes);
        return defineClass(name, bytes, 0, bytes.length);
    }

    public byte[] readFile(String path) {

        byte[] buffer = null;
        try {
            FileInputStream input = new FileInputStream(path);
            buffer = new byte[input.available()];
            input.read(buffer);
            input.close(); //  可 finally处理

        } catch (Exception e) {
            e.printStackTrace();
        }


        return buffer;
    }

    public byte[] decode(byte[] oldBytes) {
        int length = oldBytes.length;
        byte[] newBytes = new byte[length];
        for (int i = 0; i < length; i++) {
            newBytes[i] = (byte) (255 - oldBytes[i]);
        }
        return newBytes;
    }


    public static void main(String[] args) {
        try {
            NewClassloader newClassloader = new NewClassloader();
            Class<?> clazz = newClassloader.loadClass("Hello");
//            for (Method m : clazz.getDeclaredMethods()) {
//                System.out.println(clazz.getSimpleName() + "." + m.getName());
//            }
            Object instance = clazz.getDeclaredConstructor().newInstance();
            Method method = clazz.getMethod("hello");
            method.invoke(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
