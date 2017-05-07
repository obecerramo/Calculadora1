package com.example.oscarbecerra.calculadora1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText oper1,oper2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recuperamos los objetos controles
        oper1=(EditText)findViewById(R.id.edtNum1);
        oper2=(EditText)findViewById(R.id.edtNum2);
    }
    public void sumar(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int sum=n1+n2;
        mostrar(sum);
    }
    public void restar(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int sum=n1-n2;
        mostrar(sum);
    }
    public void multiplicar(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int sum=n1*n2;
        mostrar(sum);
    }
    public void dividir(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int sum=n1/n2;
        mostrar(sum);
    }
    private void mostrar(int res){
//mostramos resultado en un Toast
        Toast.makeText(this, "Resultado operación: " + res, Toast.LENGTH_LONG).show();



    }
}
