package com.codewithadolfo;

public class max_and_min {
    public static void main(String[] args) {

        //System.out.println(maxNum(500,10,800));
        //System.out.println(minNum(50, 3, 0));

    }
    public static int maxNum(int a, int b, int c){

        int max=a;

        if(b>max){
            max = b;
        }
        if(c>max){
            max =c;
        }
        return max;
    }
    public static int minNum(int a, int b, int c){
        int min = a;
        if(min<b){
            b = min;
        }
        if(c<min){
            min =c;
        }return c;
    }
}
