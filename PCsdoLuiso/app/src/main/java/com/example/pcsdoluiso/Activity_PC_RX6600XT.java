package com.example.pcsdoluiso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_PC_RX6600XT extends AppCompatActivity {

    public TextView mensagem;
    private Button verDet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc_rx6600_xt);

        verDet = (Button) findViewById(R.id.btnVerDetRX);
        mensagem = (TextView) findViewById(R.id.txtSaudacao);
        Bundle bundle = getIntent().getExtras();
        String email = bundle.getString("email");
        mensagem.setText("Olá " + email);

        verDet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnVerDet();
            }
        });
    }

    public void btnVerDet(){
        page1();
    }

    public void page1(){
        Bundle bundle = new Bundle();
        Intent in = new Intent(this, Activity_VerDetRTX.class);
        in.putExtras(bundle);
        startActivity(in);
    }
}