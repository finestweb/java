package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println(stepen(2,10));
    }

    public static int stepen(int n, int m){
        if (m==1)
            return n;
        return n*stepen(n,m-1);
    }

}
