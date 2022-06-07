package com.example.litfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public
class FoodActivityDetails extends AppCompatActivity{

    TextView textView;


    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_food_details );

        textView = findViewById ( R.id.txt );
        String dstory = getIntent ( ).getStringExtra ( "story" );
        textView.setText ( dstory );
    }


    public
    void goback ( View view ) {

        Intent intent= new Intent ( FoodActivityDetails.this,foodActivity.class );
        startActivity ( intent );
        finish();

    }

    @Override
    public void onBackPressed(){


}
}