package com.edukasi.game;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton ib;      //play
    ImageButton imgO;    //option
    ImageButton imgH;    //help
    ImageButton imgA;    //about
    ImageButton imgE;    //Exit
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //>>Button Play
        ib = (ImageButton) findViewById(R.id.imgBtnPlay);

        // membuat listener ketika object di klik

        View.OnClickListener listener = new View.OnClickListener(){
            @Override

            public void onClick(View arg0){
                //TODO...
                Intent i =new Intent(getApplicationContext(),Level.class);
                startActivity(i);

                Toast.makeText(MainActivity.this,
                        "Mulai Mainkan Permainan",
                Toast.LENGTH_SHORT).show();
            }

        };
    //<<Button Play

    //>>Button Option
        imgO=(ImageButton)findViewById(R.id.imgBtnOption);
        imgO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO...
                Intent i =new Intent(getApplicationContext(),Options.class);
                startActivity(i);

                Toast.makeText(MainActivity.this,
                        "Sesuaikan Suara Musik dan Sound",
                Toast.LENGTH_SHORT).show();
            }
        });
    //<<Button Option

    //>>Button Help
        imgH=(ImageButton)findViewById(R.id.imgBtnHelp);
        imgH.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //TODO...
                Intent i =new Intent(getApplicationContext(),Help.class);
                startActivity(i);

                Toast.makeText(MainActivity.this,
                        "Pecahkan Masalahmu",
                Toast.LENGTH_SHORT).show();
            }
        });
    //<<Button Help

    //>>Button About
        imgA=(ImageButton)findViewById(R.id.imgBtnAbout);
        imgA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //TODO...
                Intent i =new Intent(getApplicationContext(),About.class);
                startActivity(i);

                Toast.makeText(MainActivity.this,
                        "Tentang Aplikasi Ini",
                Toast.LENGTH_SHORT).show();
            }
        });
    //<<Button About

    //>>Button Exit
        imgE=(ImageButton)findViewById(R.id.imgBtnExit);
        imgE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //TODO...
                moveTaskToBack(true);
            }
        });
    //<<Button Exit



        //menerapkan listener pada object ib
        ib.setOnClickListener(listener);


    }

}
