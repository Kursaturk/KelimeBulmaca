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

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {
    EditText edittext;
    TextView textview,harfler;
    Button button3,button5,button2,button43,button7,button33,button35,button29,button30,button28,button6,button8,button9,button10;
    Boolean kontrol=false,kontrol1=false,kontrol2=false;
    String str,str2;
    final int random=new Random().nextInt(2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        button2= (Button) findViewById(R.id.button2);
        button8= (Button) findViewById(R.id.button8);
        button9= (Button) findViewById(R.id.button9);
        button10= (Button) findViewById(R.id.button10);
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

            harfler.setText("D  O  L  K  A  R  P  İ  T");



        }




    }
    @Override
    public void onClick(View v) {
        textview=(TextView) findViewById(R.id.textView);
        edittext=(EditText)findViewById(R.id.editText);
        str=edittext.getText().toString();

        if (str2.equalsIgnoreCase("sifir")){



            if (str.equalsIgnoreCase("asker")){
                button29.setText("A");
                button43.setText("S");
                button30.setText("K");
                button5.setText("E");
                button8.setText("R");
                kontrol=true;
            }
            if (str.equalsIgnoreCase("akrep")){
                button29.setText("A");
                button28.setText("K");
                button33.setText("R");
                button6.setText("E");
                button35.setText("P");
                kontrol1=true;

            }
            if (str.equalsIgnoreCase("pasta")){

                button35.setText("P");
                button2.setText("A");
                button7.setText("S");
                button9.setText("T");
                button10.setText("A");
                kontrol2=true;
            }


            textview.setText(str);
            if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true)){
                textview.setText("BASARDINIZ!");
               Intent i=new Intent(Main5Activity.this,Main6Activity.class);
               startActivity(i);
                //burada diğer bölümlere geç
            }



        }else if (str2.equalsIgnoreCase("bir")){



            if (str.equalsIgnoreCase("radyo")){
                button29.setText("R");
                button43.setText("A");
                button30.setText("D");
                button5.setText("Y");
                button8.setText("O");
                kontrol=true;
            }
            if (str.equalsIgnoreCase("rakip")){
                button29.setText("R");
                button28.setText("A");
                button33.setText("K");
                button6.setText("İ");
                button35.setText("K");
                kontrol1=true;

            }
            if (str.equalsIgnoreCase("pilot")){

                button35.setText("P");
                button2.setText("İ");
                button7.setText("L");
                button9.setText("O");
                button10.setText("T");
                kontrol2=true;
            }

            textview.setText(str);
            if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true) ){
                textview.setText("BASARDINIZ!");
               Intent i=new Intent(Main5Activity.this,Main6Activity.class);
             startActivity(i);
                //burada diğer bölümlere geç
            }


        }




    }

}
