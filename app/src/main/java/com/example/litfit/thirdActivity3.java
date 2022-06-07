package com.example.litfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public
class thirdActivity3 extends AppCompatActivity {



    String buttonvalue;
    android.widget.Button startBtn ;
    private CountDownTimer countDownTimer;
    TextView mtextview;
    private boolean MTimerunning;
    private long MTimeLeftinmills;




    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_third3 );

        Intent intent = getIntent ( );
        buttonvalue = intent.getStringExtra ( "value" );

        int intvalue = Integer.valueOf ( buttonvalue );

        switch (intvalue) {

            case 1:
                setContentView ( R.layout.activity_boatpose1 );
                break;

            case 2:
                setContentView ( R.layout.activity_basiccrunches2 );
                break;

            case 3:
                setContentView ( R.layout.activity_bench3 );
                break;

            case 4:
                setContentView ( R.layout.activity_bicycle4 );
                break;

            case 5:
                setContentView ( R.layout.activity_legraise5 );
                break;

            case 6:
                setContentView ( R.layout.activity_heeltouch6 );
                break;

            case 7:
                setContentView ( R.layout.activity_legupcrunch7 );
                break;

            case 8:
                setContentView ( R.layout.activity_situp8 );
                break;

            case 9:
                setContentView ( R.layout.activity_vups9 );
                break;

            case 10:
                setContentView ( R.layout.activity_plank10 );
                break;

            case 11:
                setContentView ( R.layout.activity_plankleg11 );
                break;

            case 12:
                setContentView ( R.layout.activity_twist12 );
                break;

            case 13:
                setContentView ( R.layout.activity_bridge13 );
                break;

            case 14:
                setContentView ( R.layout.activity_verticalcrunch14 );
                break;
        }
        startBtn = findViewById ( R.id.startbutton );
        mtextview = findViewById ( R.id.time );


        startBtn.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View view ) {
                if (MTimerunning) {

                    stoptimer();

                } else {

                    startTimer();

                }
            }
        } );

    }
    private void stoptimer()
    {

        countDownTimer.cancel ();
        MTimerunning=false;
        startBtn.setText ( "START" );

    }

    private void startTimer()
    {
        final CharSequence value1=mtextview.getText ();
        String num1 =value1.toString();
        String num2=num1.substring(0,2);
        String num3=num1.substring ( 3,5 );

        final int number=Integer.valueOf ( num2 )*60+Integer.valueOf ( num3 );
        MTimeLeftinmills=number*1000;

        countDownTimer= new CountDownTimer(MTimeLeftinmills,1000) {
            @Override
            public
            void onTick ( long millisUntilFinished ) {

                MTimeLeftinmills = millisUntilFinished;
                updateTimer ( );
            }

            @Override
            public
            void onFinish () {
                int newvalue = Integer.valueOf ( buttonvalue ) + 1;
                if (newvalue <= 7) {
                    Intent intent=new Intent (thirdActivity3.this,thirdActivity3.class );
                    intent.addFlags (Intent.FLAG_ACTIVITY_CLEAR_TASK) ;
                    intent.putExtra ( "value",String.valueOf (newvalue) );
                    startActivity ( intent );



                }
                else{

                    newvalue=1;
                    Intent intent=new Intent ( thirdActivity3.this,thirdActivity3.class );
                    intent.addFlags ( Intent.FLAG_ACTIVITY_CLEAR_TASK );
                    intent.putExtra ( "value",String.valueOf ( newvalue ) );
                    startActivity ( intent );
                }

            }

        }.start();
        startBtn.setText ( "Pause" );
        MTimerunning=true;
    }

    private void updateTimer()
    {

        int minutes=(int)MTimeLeftinmills/60000;
        int seconds=(int)MTimeLeftinmills%60000/1000;


        String timeLeftText="";
        if(minutes<10)
            timeLeftText="0";
        timeLeftText=timeLeftText+minutes+"i";
        if( seconds<10)
            timeLeftText+="0";
        timeLeftText+=seconds;
        mtextview.setText ( timeLeftText );


    }
    @Override
    public void onBackPressed(){
        super.onBackPressed ();
    }
}