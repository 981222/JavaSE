package com.huang.javase.Enum;

/**
 * 总结：
 *      1.枚举是一种引用数据类型
 *      2.枚举类型怎么定义：
 *          enum 枚举类型名{
 *              枚举值1，枚举值2
 *          }
 *      3.结果只有2种时，建议使用布尔类型。
 *      结果超过2种一上，而且还可以一枚枚枚举出来的，建议使用枚举类型。
 *          E.g
 *              颜色，四季，星期等等，都是可以使用枚举来返回。
 */
public class EnumTest02 {
    public static void main(String[] args) {
        System.out.println(divide(2,6));
    }

    public static Result divide(int a, int b) {
        try{
            int c = a / b;
            return Result.SUCCESS;
        } catch (Exception e){
            return Result.FAIL;
        }
    }
}

enum Result{
    SUCCESS, FAIL
}
