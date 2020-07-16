package com.example.yazlab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edittext;
    TextView textview,harfler;
    Button button3,button,button2,button43,button45,button33,button35,button29,button30,button28;
    Boolean kontrol=false,kontrol1=false,kontrol2=false;
    String str,str2;
    int sayac=0;

    final int random=new Random().nextInt(2);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2= (Button) findViewById(R.id.button2);
        button43= (Button) findViewById(R.id.button43);
        button33= (Button) findViewById(R.id.button33);
        button35= (Button) findViewById(R.id.button35);
        button29= (Button) findViewById(R.id.button29);
        button30= (Button) findViewById(R.id.button30);
        button28= (Button) findViewById(R.id.button28);

         button3= (Button) findViewById(R.id.button3);
         button3.setOnClickListener(this);
        textview=(TextView) findViewById(R.id.textView);
        harfler=(TextView) findViewById(R.id.harfler2);
        if (random==0){
            str2="sifir";

        }else if (random==1){

            str2="bir";

            harfler.setText("İ  S  T  A  D");



        }







    }

    @Override

    public void onClick(View v) {

        edittext=(EditText)findViewById(R.id.editText);
        str=edittext.getText().toString();



                if (str2.equalsIgnoreCase("sifir")){



                    if (str.equalsIgnoreCase("top")){
                        button29.setText("T");
                        button43.setText("O");
                        button30.setText("P");
                        kontrol=true;
                    }
                    if (str.equalsIgnoreCase("oda")){
                        button43.setText("O");
                        button28.setText("D");
                        button33.setText("A");
                        kontrol1=true;

                    }
                    if (str.equalsIgnoreCase("ask")){

                        button33.setText("A");
                        button35.setText("S");
                        button2.setText("K");
                        kontrol2=true;
                    }

                    textview.setText(str);
                    if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true)){
                        textview.setText("BASARDINIZ");
                        Intent i=new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(i);

                    }



                }else if (str2.equalsIgnoreCase("bir")){




                    if (str.equalsIgnoreCase("tas")){
                        button29.setText("T");
                        button43.setText("A");
                        button30.setText("S");
                        kontrol=true;
                    }
                    if (str.equalsIgnoreCase("ada")){
                        button43.setText("A");
                        button28.setText("D");
                        button33.setText("A");
                        kontrol1=true;

                    }
                    if (str.equalsIgnoreCase("asi")){

                        button33.setText("A");
                        button35.setText("S");
                        button2.setText("İ");
                        kontrol2=true;
                    }

                    textview.setText(str);
                    if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true)){
                        textview.setText("BASARDINIZ");
                        Intent i=new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(i);

                    }


                }







    }


}