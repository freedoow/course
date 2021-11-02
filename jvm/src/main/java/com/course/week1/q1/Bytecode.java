package com.course.week1.q1;

/**
 * @author whb
 * @Description:
 * @Date 2021-11-02
 */
public class Bytecode {
    public static void main(String[] args) {
        int a  =1;
        int b = 2;
        int c = a + b;
        int d = a * b;
        int e = a / b;
        for (int i = 0; i < 13; i++) {
            System.out.println(i);;
        }
    }
    /**

     Compiled from "Bytecode.java"
     public class com.course.week1.course.Bytecode {
     public com.course.week1.course.Bytecode();
     Code:
     0: aload_0
     1: invokespecial #1                  // Method java/lang/Object."<init>":()V
     4: return

     public static void main(java.lang.String[]);
     Code:
     0: iconst_1  # 将常量1压入栈中
     1: istore_1  # 将1从操作数栈存储到局部变量表
     2: iconst_2  # 将常量2压入栈中
     3: istore_2  # 将2从操作数栈存储到局部变量表
     4: iload_1   # 加载局部变量第1个变量压入操作数栈
     5: iload_2   # 加载局部变量第2个变量压入操作数栈
     6: iadd      # 相加
     7: istore_3  # 将3从操作数栈存储到局部变量表
     8: iload_1   # 加载局部变量第1个变量压入操作数栈
     9: iload_2   # 加载局部变量第2个变量压入操作数栈
     10: imul     # 相乘
     11: istore        4 # 将结果从操作数栈存储到局部变量表 4这个位置
     13: iload_1   # 加载局部变量第1个变量压入操作数栈
     14: iload_2   # 加载局部变量第2个变量压入操作数栈
     15: idiv      # 相除
     16: istore        5 # 将结果从操作数栈存储到局部变量表 5这个位置
     18: iconst_0   # 将常量0压入栈中
     19: istore        6   # 将6这个位置的值 从操作数栈存储到局部变量表
     21: iload         6   # 加载局部变量6这个位置的变量压入操作数栈
     23: bipush        13  # 将常量13压入操作数栈顶
     25: if_icmpge     42  # 比较是否满足 到42return
     28: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     31: iload         6     # 将6这个位置的值 从操作数栈存储到局部变量表
     33: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
     36: iinc          6, 1  # 将6这个位置的值 +1 从操作数栈存储到局部变量表
     39: goto          21   # 返回到21行
     42: return
     }



     */
}
