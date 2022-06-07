package com.example.litfit;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.litfit.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toolbar;

public
class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    Button button1,button2;

    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );

        binding = ActivityMainBinding.inflate ( getLayoutInflater ( ) );
        setContentView ( binding.getRoot ( ) );

        setSupportActionBar ( binding.toolbar );

        NavController navController = Navigation.findNavController ( this , R.id.nav_host_fragment_content_main );
        appBarConfiguration = new AppBarConfiguration.Builder ( navController.getGraph ( ) ).build ( );
        NavigationUI.setupActionBarWithNavController ( this , navController , appBarConfiguration );

        binding.fab.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View view ) {
                Snackbar.make ( view , "Replace with your own action" , Snackbar.LENGTH_LONG )
                        .setAction ( "Action" , null ).show ( );
            }
        } );

        androidx.appcompat.widget.Toolbar toolbar=findViewById ( R.id.toolbar );
        setSupportActionBar ( toolbar );


        button1 = findViewById ( R.id.startexercise );
        button2 = findViewById ( R.id.startexercise2 );


        button1.setOnClickListener ( new View.OnClickListener ( ) {

            @Override
            public
            void onClick ( View view ) {

                Intent intent = new Intent ( MainActivity.this , SecondActivity2.class );
                startActivity ( intent );
            }
        } );


        button2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , secondActivity3.class );
                startActivity ( intent );

            }

        } );
    }


    private
    void setSupportActionBar ( Toolbar toolbar ) {
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

    @Override
    public
    boolean onSupportNavigateUp () {
        NavController navController = Navigation.findNavController ( this , R.id.nav_host_fragment_content_main );
        return NavigationUI.navigateUp ( navController , appBarConfiguration )
                || super.onSupportNavigateUp ( );
    }
    public
    void yogaexercises ( View view ) {

        Intent intent=new Intent (MainActivity.this,SecondActivity2.class );
        startActivity ( intent );

    }

    public
    void hardcoreworkout ( View view ) {

        Intent intent=new Intent (MainActivity.this,secondActivity3.class );
        startActivity ( intent );

    }

    public
    void food ( View view ) {
        Intent intent=new Intent (MainActivity.this,foodActivity.class );
        startActivity ( intent );

    }
}