package com.example.yazlab4;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    EditText edittext;
    TextView textview,harfler;
    Button button3,button5,button2,button43,button7,button33,button35,button29,button30,button28,button6;
    Boolean kontrol=false,kontrol1=false,kontrol2=false;
    String str,str2;
    final int random=new Random().nextInt(2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button2= (Button) findViewById(R.id.button2);
        button5= (Button) findViewById(R.id.button5);
        button7= (Button) findViewById(R.id.button7);
        button6= (Button) findViewById(R.id.button6);
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

            harfler.setText("C  S  E  T  İ  A  K");



        }




    }
    @Override
    public void onClick(View v) {
        textview=(TextView) findViewById(R.id.textView);
        edittext=(EditText)findViewById(R.id.editText);
        str=edittext.getText().toString();

        if (str2.equalsIgnoreCase("sifir")){



            if (str.equalsIgnoreCase("komi")){
                button29.setText("K");
                button43.setText("O");
                button30.setText("M");
                button5.setText("I");
                kontrol=true;
            }
            if (str.equalsIgnoreCase("oruc")){
                button43.setText("O");
                button28.setText("R");
                button33.setText("U");
                button6.setText("C");
                kontrol1=true;

            }
            if (str.equalsIgnoreCase("cati")){

                button6.setText("C");
                button35.setText("A");
                button2.setText("T");
                button7.setText("I");
                kontrol2=true;
            }


            textview.setText(str);
            if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true)){
                textview.setText("BASARDINIZ!");
                Intent i=new Intent(Main3Activity.this,Main4Activity.class);
               startActivity(i);
                //burada diğer bölümlere geç
            }



        }else if (str2.equalsIgnoreCase("bir")){


            if (str.equalsIgnoreCase("test")){
                button29.setText("T");
                button43.setText("E");
                button30.setText("S");
                button5.setText("T");
                kontrol=true;
            }
            if (str.equalsIgnoreCase("eski")){
                button43.setText("E");
                button28.setText("S");
                button33.setText("K");
                button6.setText("I");
                kontrol1=true;

            }
            if (str.equalsIgnoreCase("icat")){

                button6.setText("I");
                button35.setText("C");
                button2.setText("A");
                button7.setText("T");
                kontrol2=true;
            }

            textview.setText(str);
            if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true) ){
                textview.setText("BASARDINIZ!");
               Intent i=new Intent(Main3Activity.this,Main4Activity.class);
               startActivity(i);
                //burada diğer bölümlere geç
            }


        }




    }

}
