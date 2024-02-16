package com.Ivan_Tarazona_Rios.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botsumar,botrest,botdivi,botmul;
        EditText Num1,Num2;
        TextView rtar;


        botsumar = findViewById(R.id.botsum);
        botrest = findViewById(R.id.botres);
        botdivi = findViewById(R.id.botdiv);
        botmul = findViewById(R.id.botpor);

        Num1 = findViewById(R.id.num1);
        Num2 = findViewById(R.id.num2);
        rtar = findViewById(R.id.rta);

    }

    public void clickSumar( View view){
        Toast.makeText(this, "Sumando", Toast.LENGTH_SHORT).show();
    }


}
