package com.huang.javase.exception;

// finally面试题
public class XXXExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(m());
    }

    /**
     * java 语法规则（有些规则是不能被破坏的）：
     *    方法体中的代码，必须遵循自上而下的循序依次逐行执行（亘古不变！）
     *    return 语句一旦执行，整个方法必须结束（亘古不变！）
     * @return i;
     */
    public static int m(){
        int i = 100;
        try {
            // 这行代码 在 i = 100 下面，所以最终结果必须是返回100；
            return i; //100
        } finally {
            i++;
        }
    }
}
