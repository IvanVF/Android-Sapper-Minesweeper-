package com.example.sapper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Size_3x3 extends AppCompatActivity implements View.OnClickListener {

    private Size_3x3Presenter presenterSize_3x3 = new  Size_3x3Presenter ( this );

    Button btnToActMain;
    ImageView imageView_1_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_3x3);

        initListenerImageView_1_1();
        initListenerImageView_1_2();
        initListenerImageView_1_3();
        initListenerImageView_2_1();
        initListenerImageView_2_2();
        initListenerImageView_2_3();
        initListenerImageView_3_1();
        initListenerImageView_3_2();
        initListenerImageView_3_3();

        btnToActMain = ( Button ) findViewById(R.id.btnToActMain);
        btnToActMain.setOnClickListener(this);


    }

   @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnToActMain:
                finish();
                Intent toMainActivity = new Intent(getApplicationContext(), MainActivity.class);
                toMainActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(toMainActivity);
                break;
            default:
                break;
        }
    }



    private void initListenerImageView_1_1() {
        final ImageView imageView_1_1 = findViewById( R.id.imageView_1_1 );
        imageView_1_1.setOnClickListener( new View.OnClickListener()
        {
        @Override
        public void onClick( View v ) { presenterSize_3x3.onImageView_1_1Clicked(); }
        } );
    }



    public void updateImageView_1_1( final int mineOrNumber ) {
        final ImageView imageView_1_1 = findViewById( R.id.imageView_1_1 );

        if ( mineOrNumber == 9 ) imageView_1_1.setImageDrawable(getResources().getDrawable( R.drawable.button_mine ));
        else if ( mineOrNumber == 8 ) { imageView_1_1.setImageDrawable(getResources().getDrawable( R.drawable.image_8)); }
        else if ( mineOrNumber == 7 ) { imageView_1_1.setImageDrawable(getResources().getDrawable( R.drawable.image_7)); }
        else if ( mineOrNumber == 6 ) { imageView_1_1.setImageDrawable(getResources().getDrawable( R.drawable.image_6)); }
        else if ( mineOrNumber == 5 ) { imageView_1_1.setImageDrawable(getResources().getDrawable( R.drawable.image_5)); }
        else if ( mineOrNumber == 4 ) { imageView_1_1.setImageDrawable(getResources().getDrawable( R.drawable.image_4)); }
        else if ( mineOrNumber == 3 ) { imageView_1_1.setImageDrawable(getResources().getDrawable( R.drawable.image_3)); }
        else if ( mineOrNumber == 2 ) { imageView_1_1.setImageDrawable(getResources().getDrawable( R.drawable.image_2)); }
        else if ( mineOrNumber == 1 ) { imageView_1_1.setImageDrawable(getResources().getDrawable( R.drawable.image_1)); }
        else imageView_1_1.setImageDrawable(getResources().getDrawable( R.drawable.image_empty));

    }



    private void initListenerImageView_1_2() {
        final ImageView imageView_1_2 = findViewById( R.id.imageView_1_2 );
        imageView_1_2.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v ) { presenterSize_3x3.onImageView_1_2Clicked(); }
        } );
    }

    public void updateImageView_1_2(final int mineOrNumber) {
        final ImageView imageView_1_2 = findViewById( R.id.imageView_1_2 );

        if  ( mineOrNumber == 9 ) { imageView_1_2.setImageDrawable( getResources().getDrawable( R.drawable.button_mine ) ); }
        else if ( mineOrNumber == 8 ) { imageView_1_2.setImageDrawable( getResources().getDrawable( R.drawable.image_8 ) ); }
        else if ( mineOrNumber == 7 ) { imageView_1_2.setImageDrawable( getResources().getDrawable( R.drawable.image_7 ) ); }
        else if ( mineOrNumber == 6 ) { imageView_1_2.setImageDrawable( getResources().getDrawable( R.drawable.image_6 ) ); }
        else if ( mineOrNumber == 5 ) { imageView_1_2.setImageDrawable( getResources().getDrawable( R.drawable.image_5 ) ); }
        else if ( mineOrNumber == 4 ) { imageView_1_2.setImageDrawable( getResources().getDrawable( R.drawable.image_4 ) ); }
        else if ( mineOrNumber == 3 ) { imageView_1_2.setImageDrawable( getResources().getDrawable( R.drawable.image_3 ) ); }
        else if ( mineOrNumber == 2 ) { imageView_1_2.setImageDrawable( getResources().getDrawable( R.drawable.image_2 ) ); }
        else if ( mineOrNumber == 1 ) { imageView_1_2.setImageDrawable( getResources().getDrawable( R.drawable.image_1 ) ); }
        else { imageView_1_2.setImageDrawable( getResources().getDrawable( R.drawable.image_empty ) ); }

    }



    private void initListenerImageView_1_3() {
        final ImageView imageView_1_3 = findViewById( R.id.imageView_1_3 );
        imageView_1_3.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v ) { presenterSize_3x3.onImageView_1_3Clicked(); }
        });
    }

    public void updateImageView_1_3( final int mineOrNumber ) {
        final ImageView imageView_1_3 = findViewById( R.id.imageView_1_3 );

        if ( mineOrNumber == 9 ) { imageView_1_3.setImageDrawable(getResources().getDrawable( R.drawable.button_mine )); }
        else if ( mineOrNumber == 8 ) { imageView_1_3.setImageDrawable(getResources().getDrawable( R.drawable.image_8)); }
        else if ( mineOrNumber == 7 ) { imageView_1_3.setImageDrawable(getResources().getDrawable( R.drawable.image_7)); }
        else if ( mineOrNumber == 6 ) { imageView_1_3.setImageDrawable(getResources().getDrawable( R.drawable.image_6)); }
        else if ( mineOrNumber == 5 ) { imageView_1_3.setImageDrawable(getResources().getDrawable( R.drawable.image_5)); }
        else if ( mineOrNumber == 4 ) { imageView_1_3.setImageDrawable(getResources().getDrawable( R.drawable.image_4)); }
        else if ( mineOrNumber == 3 ) { imageView_1_3.setImageDrawable(getResources().getDrawable( R.drawable.image_3)); }
        else if ( mineOrNumber == 2 ) { imageView_1_3.setImageDrawable(getResources().getDrawable( R.drawable.image_2)); }
        else if ( mineOrNumber == 1 ) { imageView_1_3.setImageDrawable(getResources().getDrawable( R.drawable.image_1)); }
        else { imageView_1_3.setImageDrawable(getResources().getDrawable( R.drawable.image_empty)); }

    }



    private void initListenerImageView_2_1() {
        final ImageView imageView_2_1 = findViewById( R.id.imageView_2_1 );
        imageView_2_1.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v ) { presenterSize_3x3.onImageView_2_1Clicked(); }
        });
    }

    public void updateImageView_2_1( final int mineOrNumber ) {
        final ImageView imageView_2_1 = findViewById( R.id.imageView_2_1 );

        if ( mineOrNumber == 9 ) { imageView_2_1.setImageDrawable( getResources().getDrawable( R.drawable.button_mine ) ); }
        else if ( mineOrNumber == 8 ) { imageView_2_1.setImageDrawable( getResources().getDrawable( R.drawable.image_8 ) ); }
        else if ( mineOrNumber == 7 ) { imageView_2_1.setImageDrawable( getResources().getDrawable( R.drawable.image_7 ) ); }
        else if ( mineOrNumber == 6 ) { imageView_2_1.setImageDrawable( getResources().getDrawable( R.drawable.image_6 ) ); }
        else if ( mineOrNumber == 5 ) { imageView_2_1.setImageDrawable( getResources().getDrawable( R.drawable.image_5 ) ); }
        else if ( mineOrNumber == 4 ) { imageView_2_1.setImageDrawable( getResources().getDrawable( R.drawable.image_4 ) ); }
        else if ( mineOrNumber == 3 ) { imageView_2_1.setImageDrawable( getResources().getDrawable( R.drawable.image_3 ) ); }
        else if ( mineOrNumber == 2 ) { imageView_2_1.setImageDrawable( getResources().getDrawable( R.drawable.image_2 ) ); }
        else if ( mineOrNumber == 1 ) { imageView_2_1.setImageDrawable( getResources().getDrawable( R.drawable.image_1 ) ); }
        else { imageView_2_1.setImageDrawable(getResources().getDrawable( R.drawable.image_empty)); }

    }



    private void initListenerImageView_2_2() {
        final ImageView imageView_2_2 = findViewById( R.id.imageView_2_2 );
        imageView_2_2.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v ) { presenterSize_3x3.onImageView_2_2Clicked(); }
        });
    }

    public void updateImageView_2_2 ( final int mineOrNumber ) {
        final ImageView imageView_2_2 = findViewById( R.id.imageView_2_2 );

        if ( mineOrNumber == 9 ) { imageView_2_2.setImageDrawable( getResources().getDrawable( R.drawable.button_mine ) ); }
        else if ( mineOrNumber == 8 ) { imageView_2_2.setImageDrawable( getResources().getDrawable( R.drawable.image_8 ) ); }
        else if ( mineOrNumber == 7 ) { imageView_2_2.setImageDrawable( getResources().getDrawable( R.drawable.image_7 ) ); }
        else if ( mineOrNumber == 6 ) { imageView_2_2.setImageDrawable( getResources().getDrawable( R.drawable.image_6 ) ); }
        else if ( mineOrNumber == 5 ) { imageView_2_2.setImageDrawable( getResources().getDrawable( R.drawable.image_5 ) ); }
        else if ( mineOrNumber == 4 ) { imageView_2_2.setImageDrawable( getResources().getDrawable( R.drawable.image_4 ) ); }
        else if ( mineOrNumber == 3 ) { imageView_2_2.setImageDrawable( getResources().getDrawable( R.drawable.image_3 ) ); }
        else if ( mineOrNumber == 2 ) { imageView_2_2.setImageDrawable( getResources().getDrawable( R.drawable.image_2 ) ); }
        else if ( mineOrNumber == 1 ) { imageView_2_2.setImageDrawable( getResources().getDrawable( R.drawable.image_1 ) ); }
        else { imageView_2_2.setImageDrawable(getResources().getDrawable( R.drawable.image_empty)); }

    }



    private void initListenerImageView_2_3() {
        final ImageView imageView_2_3 = findViewById( R.id.imageView_2_3 );
        imageView_2_3.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v ) { presenterSize_3x3.onImageView_2_3Clicked(); }
        });
    }

    public void updateImageView_2_3 ( final int mineOrNumber ) {
        final ImageView imageView_2_3 = findViewById( R.id.imageView_2_3 );

        if ( mineOrNumber == 9 ) { imageView_2_3.setImageDrawable( getResources().getDrawable( R.drawable.button_mine ) ); }
        else if ( mineOrNumber == 8 ) { imageView_2_3.setImageDrawable( getResources().getDrawable( R.drawable.image_8 ) ); }
        else if ( mineOrNumber == 7 ) { imageView_2_3.setImageDrawable( getResources().getDrawable( R.drawable.image_7 ) ); }
        else if ( mineOrNumber == 6 ) { imageView_2_3.setImageDrawable( getResources().getDrawable( R.drawable.image_6 ) ); }
        else if ( mineOrNumber == 5 ) { imageView_2_3.setImageDrawable( getResources().getDrawable( R.drawable.image_5 ) ); }
        else if ( mineOrNumber == 4 ) { imageView_2_3.setImageDrawable( getResources().getDrawable( R.drawable.image_4 ) ); }
        else if ( mineOrNumber == 3 ) { imageView_2_3.setImageDrawable( getResources().getDrawable( R.drawable.image_3 ) ); }
        else if ( mineOrNumber == 2 ) { imageView_2_3.setImageDrawable( getResources().getDrawable( R.drawable.image_2 ) ); }
        else if ( mineOrNumber == 1 ) { imageView_2_3.setImageDrawable( getResources().getDrawable( R.drawable.image_1 ) ); }
        else { imageView_2_3.setImageDrawable(getResources().getDrawable( R.drawable.image_empty)); }

    }



    private void initListenerImageView_3_1() {
        final ImageView imageView_3_1 = findViewById( R.id.imageView_3_1 );
        imageView_3_1.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v ) { presenterSize_3x3.onImageView_3_1Clicked(); }
        });
    }

    public void updateImageView_3_1 ( final int mineOrNumber ) {
        final ImageView imageView_3_1 = findViewById( R.id.imageView_3_1 );

        if ( mineOrNumber == 9 ) { imageView_3_1.setImageDrawable( getResources().getDrawable( R.drawable.button_mine ) ); }
        else if ( mineOrNumber == 8 ) { imageView_3_1.setImageDrawable( getResources().getDrawable( R.drawable.image_8 ) ); }
        else if ( mineOrNumber == 7 ) { imageView_3_1.setImageDrawable( getResources().getDrawable( R.drawable.image_7 ) ); }
        else if ( mineOrNumber == 6 ) { imageView_3_1.setImageDrawable( getResources().getDrawable( R.drawable.image_6 ) ); }
        else if ( mineOrNumber == 5 ) { imageView_3_1.setImageDrawable( getResources().getDrawable( R.drawable.image_5 ) ); }
        else if ( mineOrNumber == 4 ) { imageView_3_1.setImageDrawable( getResources().getDrawable( R.drawable.image_4 ) ); }
        else if ( mineOrNumber == 3 ) { imageView_3_1.setImageDrawable( getResources().getDrawable( R.drawable.image_3 ) ); }
        else if ( mineOrNumber == 2 ) { imageView_3_1.setImageDrawable( getResources().getDrawable( R.drawable.image_2 ) ); }
        else if ( mineOrNumber == 1 ) { imageView_3_1.setImageDrawable( getResources().getDrawable( R.drawable.image_1 ) ); }
        else { imageView_3_1.setImageDrawable(getResources().getDrawable( R.drawable.image_empty)); }

    }



    private void initListenerImageView_3_2() {
        final ImageView imageView_3_2 = findViewById( R.id.imageView_3_2 );
        imageView_3_2.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v ) { presenterSize_3x3.onImageView_3_2Clicked(); }
        });
    }

    public void updateImageView_3_2 ( final int mineOrNumber ) {
        final ImageView imageView_3_2 = findViewById( R.id.imageView_3_2 );

        if ( mineOrNumber == 9 ) { imageView_3_2.setImageDrawable( getResources().getDrawable( R.drawable.button_mine ) ); }
        else if ( mineOrNumber == 8 ) { imageView_3_2.setImageDrawable( getResources().getDrawable( R.drawable.image_8 ) ); }
        else if ( mineOrNumber == 7 ) { imageView_3_2.setImageDrawable( getResources().getDrawable( R.drawable.image_7 ) ); }
        else if ( mineOrNumber == 6 ) { imageView_3_2.setImageDrawable( getResources().getDrawable( R.drawable.image_6 ) ); }
        else if ( mineOrNumber == 5 ) { imageView_3_2.setImageDrawable( getResources().getDrawable( R.drawable.image_5 ) ); }
        else if ( mineOrNumber == 4 ) { imageView_3_2.setImageDrawable( getResources().getDrawable( R.drawable.image_4 ) ); }
        else if ( mineOrNumber == 3 ) { imageView_3_2.setImageDrawable( getResources().getDrawable( R.drawable.image_3 ) ); }
        else if ( mineOrNumber == 2 ) { imageView_3_2.setImageDrawable( getResources().getDrawable( R.drawable.image_2 ) ); }
        else if ( mineOrNumber == 1 ) { imageView_3_2.setImageDrawable( getResources().getDrawable( R.drawable.image_1 ) ); }
        else { imageView_3_2.setImageDrawable(getResources().getDrawable( R.drawable.image_empty)); }

    }



    private void initListenerImageView_3_3() {
        final ImageView imageView_3_3 = findViewById( R.id.imageView_3_3 );
        imageView_3_3.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v ) { presenterSize_3x3.onImageView_3_3Clicked(); }
        });
    }

    public void updateImageView_3_3 ( final int mineOrNumber ) {
        final ImageView imageView_3_3 = findViewById( R.id.imageView_3_3 );

        if ( mineOrNumber == 9 ) { imageView_3_3.setImageDrawable( getResources().getDrawable( R.drawable.button_mine ) ); }
        else if ( mineOrNumber == 8 ) { imageView_3_3.setImageDrawable( getResources().getDrawable( R.drawable.image_8 ) ); }
        else if ( mineOrNumber == 7 ) { imageView_3_3.setImageDrawable( getResources().getDrawable( R.drawable.image_7 ) ); }
        else if ( mineOrNumber == 6 ) { imageView_3_3.setImageDrawable( getResources().getDrawable( R.drawable.image_6 ) ); }
        else if ( mineOrNumber == 5 ) { imageView_3_3.setImageDrawable( getResources().getDrawable( R.drawable.image_5 ) ); }
        else if ( mineOrNumber == 4 ) { imageView_3_3.setImageDrawable( getResources().getDrawable( R.drawable.image_4 ) ); }
        else if ( mineOrNumber == 3 ) { imageView_3_3.setImageDrawable( getResources().getDrawable( R.drawable.image_3 ) ); }
        else if ( mineOrNumber == 2 ) { imageView_3_3.setImageDrawable( getResources().getDrawable( R.drawable.image_2 ) ); }
        else if ( mineOrNumber == 1 ) { imageView_3_3.setImageDrawable( getResources().getDrawable( R.drawable.image_1 ) ); }
        else { imageView_3_3.setImageDrawable(getResources().getDrawable( R.drawable.image_empty)); }

    }

}
