package com.example.yazlab4;

import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    EditText edittext;
    TextView textview,harfler;
    Button button3,button,button2,button43,button4,button33,button35,button29,button30,button28;
    Boolean kontrol=false,kontrol1=false,kontrol2=false,kontrol3=false;
    String str,str2;

    final int random=new Random().nextInt(2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button2= (Button) findViewById(R.id.button2);
        button= (Button) findViewById(R.id.button);
        button4= (Button) findViewById(R.id.button4);
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

            harfler.setText("İ  S  P  C  A ");



        }



    }

    @Override
    public void onClick(View v) {
        textview=(TextView) findViewById(R.id.textView);
        edittext=(EditText)findViewById(R.id.editText);
        str=edittext.getText().toString();

        if (str2.equalsIgnoreCase("sifir")){



            if (str.equalsIgnoreCase("cam")){
                button29.setText("C");
                button43.setText("A");
                button30.setText("M");
                kontrol=true;
            }
            if (str.equalsIgnoreCase("mum")){
                button30.setText("M");
                button28.setText("U");
                button33.setText("M");
                kontrol1=true;

            }
            if (str.equalsIgnoreCase("muz")){

                button33.setText("M");
                button35.setText("U");
                button2.setText("Z");
                kontrol2=true;
            }
            if (str.equalsIgnoreCase("zil")){

                button2.setText("Z");
                button.setText("İ");
                button4.setText("L");
                kontrol3=true;
            }

            textview.setText(str);
            if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true) && kontrol3.equals(true)){
                textview.setText("1.SEVİYEYİ TAMAMLADINIZ!");
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
                //burada diğer bölümlere geç
            }



        }else if (str2.equalsIgnoreCase("bir")){


            if (str.equalsIgnoreCase("sap")){
                button29.setText("S");
                button43.setText("A");
                button30.setText("P");
                kontrol=true;
            }
            if (str.equalsIgnoreCase("pas")){
                button30.setText("P");
                button28.setText("A");
                button33.setText("S");
                kontrol1=true;

            }
            if (str.equalsIgnoreCase("sis")){

                button33.setText("S");
                button35.setText("İ");
                button2.setText("S");
                kontrol2=true;
            }
            if (str.equalsIgnoreCase("sac")){

                button2.setText("S");
                button.setText("A");
                button4.setText("C");
                kontrol3=true;
            }

            textview.setText(str);
            if (kontrol.equals(true) && kontrol1.equals(true) && kontrol2.equals(true) && kontrol3.equals(true)){
                textview.setText("1.SEVİYEYİ TAMAMLADINIZ!");
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
                //burada diğer bölümlere geç
            }


        }




    }

}
