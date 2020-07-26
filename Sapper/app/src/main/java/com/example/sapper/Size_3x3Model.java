package com.example.sapper;

public class Size_3x3Model {

    private static int[][] matrixOfMine3x3 = new int[3][3];

    public static int[][] createMatrixOfMine3x3() {

        matrixOfMine3x3 = PlayingFieldHandler.getMineMatrix(3);

        return  matrixOfMine3x3;

    }

    public static int getValueMatrixOfMine3x3 (int i, int j) {
        return matrixOfMine3x3[i][j];
    }

}
