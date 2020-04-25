package com.example.sapper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnActivitySize3x3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivitySize3x3 = (Button) findViewById(R.id.btnActivitySize3x3);
        btnActivitySize3x3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActivitySize3x3:
                Intent toSize_3x3 = new Intent(this, Size_3x3.class);
                startActivity(toSize_3x3);
                Size_3x3Presenter.createMatrixOfMine();
                break;
            default:
                break;
        }
    }
}
