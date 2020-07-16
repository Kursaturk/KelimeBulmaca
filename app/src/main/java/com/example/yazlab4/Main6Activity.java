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

public class Main6Activity extends AppCompatActivity implements View.OnClickListener {
    EditText edittext;
    TextView textview,harfler;
    Button button3,button5,button2,button43,button7,button33,button35,button29,button30,button28,button6,button8,button9,button10,button11,button12,button13;
    Boolean kontrol=false,kontrol1=false,kontrol2=false,kontrol3=false;
    String str,str2;
    final int random=new Random().nextInt(2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        button2= (Button) findViewById(R.id.button2);
        button8= (Button) findViewById(R.id.button8);
        button9= (Button) findViewById(R.id.button9);
        button10= (Button) findViewById(R.id.button10);
        button11= (Button) findViewById(R.id.button11);
        button12= (Button) findViewById(R.id.button12);
        button13= (Button) findViewById(R.id.button13);
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

            harfler.setText("E  U  H  R  L  T  O  N  L  A  İ");


        }




    }
    @Override
    public void onClick(View v) {
        textview=(TextView) findViewById(R.id.textView);
        edittext=(EditText)findViewById(R.id.editText);
        str=edittext.getText().toString();

        if (str2.equalsIgnoreCase("sifir")){



            if (str.equalsIgnoreCase("bakir")){
                button29.setText("B");
                button43.setText("A");
                button30.setText("K");
                button5.setText("İ");
                button8.setText("R");
                kontrol=true;
            }
            if (str.equalsIgnoreCase("bilet")){
                button29.setText("B");
                button28.setText("İ");
                button33.setText("L");
                button6.setText("E");
                button35.setText("T");
                kontrol1=true;

            }
            if (str.equalsIgnoreCase("lokum")){

                button33.setText("L");
                button2.setText("O");
                button7.setText("K");
                button9.setText("U");
                button10.setText("M");
                kontrol2=true;
            }
            if (str.equalsIgnoreCase("rampa")){

                button8.setText("R");
                button11.setText("A");
                button10.setText("M");
                button12.setText("P");
                button13.setText("A");
                kontrol3=true;
            }

            textview.setText(str);
            if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true)&& kontrol3.equals(true)){
                textview.setText("OYUNU BİTİRDİNİZ!");

            }



        }else if (str2.equalsIgnoreCase("bir")){


            if (str.equalsIgnoreCase("nohut")){
                button29.setText("N");
                button43.setText("O");
                button30.setText("H");
                button5.setText("U");
                button8.setText("T");
                kontrol=true;
            }
            if (str.equalsIgnoreCase("noter")){
                button29.setText("N");
                button28.setText("O");
                button33.setText("T");
                button6.setText("E");
                button35.setText("R");
                kontrol1=true;

            }
            if (str.equalsIgnoreCase("tarih")){

                button33.setText("T");
                button2.setText("A");
                button7.setText("R");
                button9.setText("İ");
                button10.setText("H");
                kontrol2=true;
            }
            if (str.equalsIgnoreCase("tahil")){

                button8.setText("T");
                button11.setText("A");
                button10.setText("H");
                button12.setText("I");
                button13.setText("L");
                kontrol3=true;
            }


            textview.setText(str);
            if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true)&& kontrol3.equals(true) ){
                textview.setText("OYUNU BİTİRDİNİZ!");

            }


        }




    }

}
