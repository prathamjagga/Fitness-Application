package com.example.litfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public
class SecondActivity2 extends AppCompatActivity {

    int[]newArray;

    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_second2 );

        Toolbar toolbar=findViewById ( R.id.toolbar );
        setSupportActionBar ( toolbar );

        newArray=new int[]{

                R.id.Plank,R.id.bench,R.id.basic_crunches,R.id.bicycle,R.id.boat_pose,R.id.bridge,R.id.heel_touch,R.id.leg_crunches,R.id.leg_raise,R.id.legup_crunch,R.id.Plank_leg,R.id.v_ups,R.id.sit_up,R.id.twists
        };


    }

    @Override
    public
    boolean onCreateOptionsMenu ( Menu menu ) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ( ).inflate ( R.menu.menu_main , menu );
        return true;
    }

    @Override
    public
    boolean onOptionsItemSelected ( MenuItem item ) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId ( );

        //noinspection SimplifiableIfStatement
        if (id == R.id.id_privacy) {
            return true;
        }

        if (id == R.id.id_term) {
            return true;
        }

        if (id == R.id.id_rate) {
            return true;
        }

        if (id == R.id.more) {
            return true;
        }

        if (id == R.id.share) {
            return true;
        }

        return super.onOptionsItemSelected ( item );

    }


    public
    void Imagebuttonclicked ( View view ) {

    for (int i=0;i<newArray.length;i++){

        if(view.getId ()==newArray[i]){
            int value=i+1;

            Log.i ( "FIRST",String.valueOf ( value ));
            Intent intent=new Intent ( SecondActivity2.this,thirdActivity3.class );
           intent.putExtra ( "value",String.valueOf ( value ) );
            startActivity ( intent );
        }

    }

}
}