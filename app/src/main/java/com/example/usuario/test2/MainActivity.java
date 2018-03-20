package com.example.usuario.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText texto;
    private Button btnenviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnenviar = findViewById(R.id.Enviar);
        btnenviar.setOnClickListener(this);
        texto = findViewById(R.id.Info);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivityForResult(intent, 1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == SecondActivity.RESULT_OK){
                String result=data.getStringExtra("texto");
                texto.setText(result);
            }
            if (resultCode == SecondActivity.RESULT_CANCELED) {
                String result=data.getStringExtra("texto");
                texto.setText(result);
            }
        }
    }
}
