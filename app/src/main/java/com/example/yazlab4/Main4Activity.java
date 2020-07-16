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

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
    EditText edittext;
    TextView textview,harfler;
    Button button3,button5,button2,button43,button7,button33,button35,button29,button30,button28,button6,button8,button9;
    Boolean kontrol=false,kontrol1=false,kontrol2=false,kontrol3=false;
    String str,str2;
    final int random=new Random().nextInt(2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button2= (Button) findViewById(R.id.button2);
        button5= (Button) findViewById(R.id.button5);
        button7= (Button) findViewById(R.id.button7);
        button9= (Button) findViewById(R.id.button9);
        button8= (Button) findViewById(R.id.button8);
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

            harfler.setText("T  A  K  E  İ  R  O  P  N  U");



        }




    }
    @Override
    public void onClick(View v) {
        textview=(TextView) findViewById(R.id.textView);
        edittext=(EditText)findViewById(R.id.editText);
        str=edittext.getText().toString();

        if (str2.equalsIgnoreCase("sifir")){



            if (str.equalsIgnoreCase("elma")){
                button29.setText("E");
                button43.setText("L");
                button30.setText("M");
                button5.setText("A");
                kontrol=true;
            }
            if (str.equalsIgnoreCase("leke")){
                button43.setText("L");
                button28.setText("E");
                button33.setText("K");
                button6.setText("E");
                kontrol1=true;

            }
            if (str.equalsIgnoreCase("kase")){

                button33.setText("K");
                button35.setText("A");
                button2.setText("S");
                button7.setText("E");
                kontrol2=true;
            }
            if (str.equalsIgnoreCase("arsa")){

                button5.setText("A");
                button8.setText("R");
                button2.setText("S");
                button9.setText("A");
                kontrol3=true;
            }



            textview.setText(str);
            if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true)  && kontrol3.equals(true)){
                textview.setText("2.SEVİYEYİ TAMAMLADINIZ!");
                Intent i=new Intent(Main4Activity.this,Main5Activity.class);
                 startActivity(i);
                //burada diğer bölümlere geç
            }



        }else if (str2.equalsIgnoreCase("bir")){

            if (str.equalsIgnoreCase("inek")){
                button29.setText("İ");
                button43.setText("N");
                button30.setText("E");
                button5.setText("K");
                kontrol=true;
            }
            if (str.equalsIgnoreCase("nato")){
                button43.setText("N");
                button28.setText("A");
                button33.setText("T");
                button6.setText("O");
                kontrol1=true;

            }
            if (str.equalsIgnoreCase("turp")){

                button33.setText("T");
                button35.setText("U");
                button2.setText("R");
                button7.setText("P");
                kontrol2=true;
            }
            if (str.equalsIgnoreCase("kare")){

                button5.setText("K");
                button8.setText("A");
                button2.setText("R");
                button9.setText("E");
                kontrol3=true;
            }



            textview.setText(str);
            if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true)&& kontrol3.equals(true) ){
                textview.setText("2.SEVİYEYİ TAMAMLADINIZ!");
                 Intent i=new Intent(Main4Activity.this,Main5Activity.class);
                 startActivity(i);
                //burada diğer bölümlere geç
            }


        }




    }

}
