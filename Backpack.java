package com.company;

public class Backpack {

    public static void main(String[] args) {

        int[] costs = {5,6,9};  //стоимость
        int[] weights = {1,10,7}; //вес
        System.out.println(backpack(weights,costs,10));

    }



    public static int backpack(int weights[], int costs[], int needed) {
        int wn = weights.length; //3
        int matr[][] = new int[needed + 1][wn + 1];
        for (int j = 1; j <= wn; j++) {
            for (int w = 1; w <= needed; w++) {
                if (weights[j-1] <= w) {
                    matr[w][j] = Math.max(matr[w][j - 1], matr[w - weights[j - 1]][j - 1] + costs[j-1]);
                } else {
                    matr[w][j] = matr[w][j - 1];
                }
            }
        }
        return matr[needed][wn];
    }

}
