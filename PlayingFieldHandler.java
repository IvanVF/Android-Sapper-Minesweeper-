package com.example.sapper;

public class PlayingFieldHandler {

    public static int[][] getMineMatrix( int matrixSize ) {

        int[][] mineMatrix = new int[matrixSize][matrixSize];

        mineMatrix = mineGenerator(matrixSize);
        mineMatrix = mineMatrixHandler(mineMatrix);

        return mineMatrix;

    }



    private static int[][] mineGenerator( int matrixSize ) {

        int[][] mineMatrix = new int[matrixSize][matrixSize];

        for ( int i = 0; i < matrixSize; i++ ) {
            for (int j = 0; j < matrixSize; j++) {
                mineMatrix[i][j] = 0;
            }
        }

        for ( int mineCount = 0; mineCount < matrixSize; mineCount++ ) {

            int i = ( int ) ( Math.random() * matrixSize );
            int j = ( int ) ( Math.random() * matrixSize );

            if ( mineMatrix[i][j] != 9 ) { mineMatrix[i][j] = 9; }
            else { mineCount--; }

        }

        return mineMatrix;

    }



    private static int[][] mineMatrixHandler(int[][] mineMatrix) {


        int[][] mineMatrixWithHelp = new int[mineMatrix.length][mineMatrix.length];
        int[][] extendedMineMatrixWithHelp = new int[mineMatrix.length + 2][mineMatrix.length + 2];

        for ( int i = 1; i < extendedMineMatrixWithHelp.length - 1; i++ ) {

            for ( int j = 1; j < extendedMineMatrixWithHelp.length - 1; j++ ) {

                extendedMineMatrixWithHelp[i][j] = mineMatrix[i-1][j-1];

            }

        }

        for ( int i = 1; i < extendedMineMatrixWithHelp.length - 1; i++ ) {

            for ( int j = 1; j < extendedMineMatrixWithHelp.length - 1; j++ ) {

                if ( extendedMineMatrixWithHelp[i][j] != 9 )  {

                    int mineCount = 0;

                    for ( int innerI = i - 1; innerI < i + 2; innerI++ ) {
                        for ( int innerJ = j - 1; innerJ < j + 2; innerJ++ ) {
                            if (extendedMineMatrixWithHelp[innerI][innerJ] == 9) mineCount++;
                        }
                    }

                    extendedMineMatrixWithHelp[i][j] = mineCount;

                }

            }

        }

        for ( int i = 0; i < mineMatrixWithHelp.length; i++ ) {

            for( int j = 0; j < mineMatrixWithHelp.length; j++ ) {

                mineMatrixWithHelp[i][j] = extendedMineMatrixWithHelp[i+1][j+1];

            }

        }

        return mineMatrixWithHelp;

    }

}
