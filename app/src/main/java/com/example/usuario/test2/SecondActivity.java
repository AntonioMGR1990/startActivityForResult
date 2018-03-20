package com.example.usuario.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    private Intent returnIntent = new Intent();
    private Button btnaceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnaceptar = findViewById(R.id.Aceptar);
        btnaceptar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        returnIntent.putExtra("result",RESULT_OK);
        returnIntent.putExtra("texto","mensaje de vuelta");
        setResult(MainActivity.RESULT_OK,returnIntent);
        finish();
    }
    public void Cancelar(View view){
        Toast.makeText(this,"no has aceptado",Toast.LENGTH_SHORT).show();
        returnIntent.putExtra("texto","");
        setResult(MainActivity.RESULT_CANCELED,returnIntent);
        finish();
    }
}
