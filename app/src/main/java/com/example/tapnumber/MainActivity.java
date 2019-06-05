package com.example.tapnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] hairetu;//配列
    String mondai;
    int seikai;//今の桁数を覚えておく変数
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);
        start();

    }

    //start()メソッドの作成
    public void start(){

        //配列の準備
        hairetu = new int[4];
        Random rand = new Random();
        hairetu[0] = rand.nextInt(4) + 1; //それぞれに１を足すのは、スタートが０からだから
        hairetu[1] = rand.nextInt(4) + 1;
        hairetu[2] = rand.nextInt(4) + 1;
        hairetu[3] = rand.nextInt(4) + 1;

        //mondaiに表示されるのは、hairetu0～3を足し合わせたもので、String型
        mondai = Integer.toString(hairetu[0])
                +Integer.toString(hairetu[1])
                +Integer.toString(hairetu[2])
                +Integer.toString(hairetu[3]);

        text.setText(mondai);
        seikai = 0;

    }

    public void number1(View v){

        //もし配列の先頭が１だったら、一文字取り除く　
        if(hairetu[seikai]==1){
            mondai = mondai.substring(1);
            text.setText(mondai);
            seikai = seikai + 1;

            if(seikai == 4){
                start();
            }
        }else{
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }

    }

    public void number2(View v){

        if(hairetu[seikai]==2){
            mondai = mondai.substring(1);
            text.setText(mondai);
            seikai = seikai + 1;

            if(seikai == 4){
                start();
            }
        }else{
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }



    }

    public void number3(View v){

        if(hairetu[seikai]==3){
            mondai = mondai.substring(1);
            text.setText(mondai);
            seikai = seikai + 1;

            if(seikai == 4){
                start();
            }
        }else{
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }

    }

    public void number4(View v){

        if(hairetu[seikai]==4){
            mondai = mondai.substring(1);
            text.setText(mondai);
            seikai = seikai + 1;

            if(seikai == 4){
                start();
            }
        }else{
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }

    }



}
