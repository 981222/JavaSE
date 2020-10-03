package com.huang.javase.Array;

public class Array01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        Animal[] animals = {a1, a2};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
            animals[i].move();
        }

        int[] src = {1,22,3,5,77,333,5,1,4,6,7,8,9};

        int[] dest = new int[20];

//        System.arraycopy(src,2,dest,5,5);
        System.arraycopy(src, 0, dest, 5, src.length);

        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

    }
}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}
