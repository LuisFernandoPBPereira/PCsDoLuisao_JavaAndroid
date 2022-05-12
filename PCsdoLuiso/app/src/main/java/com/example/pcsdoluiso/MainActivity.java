package com.example.pcsdoluiso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String email = "luis@gmail.com";
    public TextView mensagem;
    private Button btnComprarRTX3090, btnComprarRX6600XT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnComprarRTX3090 = (Button) findViewById(R.id.btnComprarRTX3090);
        btnComprarRX6600XT = (Button) findViewById(R.id.btnComprarRX6600XT);
        mensagem = (TextView) findViewById(R.id.txtEmailHome);
        mensagem.setText("Account: " + email);

        btnComprarRTX3090.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnComprarRTX3090();
            }
        });

        btnComprarRX6600XT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnComprarRX6600XT();
            }
        });


    }

    public void btnComprarRTX3090(){
        page1();
    }

    public void btnComprarRX6600XT(){
        page2();
    }

    public void page1(){
        Bundle bundle = new Bundle();
        bundle.putString("email", email);
        Intent in = new Intent(this, Activity_PC_RTX3090.class);
        in.putExtras(bundle);
        startActivity(in);
    }

    public void page2(){
        Bundle bundle = new Bundle();
        bundle.putString("email", email);
        Intent in = new Intent(this, Activity_PC_RX6600XT.class);
        in.putExtras(bundle);
        startActivity(in);
    }




}