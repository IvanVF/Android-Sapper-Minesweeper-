package com.example.sapper;

public class Size_3x3Presenter {

    private Size_3x3 activity;

    public static void createMatrixOfMine() {
        Size_3x3Model.createMatrixOfMine3x3();
    }
    
    Size_3x3Presenter( final Size_3x3 newActivity ) { activity = newActivity; }

    public void onImageView_1_1Clicked() { activity.updateImageView_1_1( Size_3x3Model.getValueMatrixOfMine3x3(0, 0 ) ); }

    public void onImageView_1_2Clicked() { activity.updateImageView_1_2( Size_3x3Model.getValueMatrixOfMine3x3(0, 1 ) ); }

    public void onImageView_1_3Clicked() { activity.updateImageView_1_3( Size_3x3Model.getValueMatrixOfMine3x3(0, 2 ) ); }

    public void onImageView_2_1Clicked() { activity.updateImageView_2_1( Size_3x3Model.getValueMatrixOfMine3x3(1, 0 ) ); }

    public void onImageView_2_2Clicked() { activity.updateImageView_2_2( Size_3x3Model.getValueMatrixOfMine3x3(1, 1 ) ); }

    public void onImageView_2_3Clicked() { activity.updateImageView_2_3( Size_3x3Model.getValueMatrixOfMine3x3(1, 2 ) ); }

    public void onImageView_3_1Clicked() { activity.updateImageView_3_1( Size_3x3Model.getValueMatrixOfMine3x3(2, 0 ) ); }

    public void onImageView_3_2Clicked() { activity.updateImageView_3_2( Size_3x3Model.getValueMatrixOfMine3x3(2, 1 ) ); }

    public void onImageView_3_3Clicked() { activity.updateImageView_3_3( Size_3x3Model.getValueMatrixOfMine3x3(2, 2 ) ); }

}
