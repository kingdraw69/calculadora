package com.Ivan_Tarazona_Rios.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botsumar,botrest,botdivi,botmul,but1,but2,but3,but4,but5,but6,but7,but8,but9,but0,butborrar,butresultado;
    private EditText Num1,Num2;
    private TextView tvrta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        botsumar = findViewById(R.id.botsum);
        botrest = findViewById(R.id.botres);
        botdivi = findViewById(R.id.botdiv);
        botmul = findViewById(R.id.botpor);
        but0 = findViewById(R.id.bot0);
        but1 = findViewById(R.id.bot1);
        but2 = findViewById(R.id.bot2);
        but3 = findViewById(R.id.bot3);
        but4 = findViewById(R.id.bot4);
        but5 = findViewById(R.id.bot5);
        but6 = findViewById(R.id.bot6);
        but7 = findViewById(R.id.bot7);
        but8 = findViewById(R.id.bot8);
        but9 = findViewById(R.id.bot9);
        butresultado = findViewById(R.id.botresultado);
        butborrar = findViewById(R.id.botkil);


        Num1 = findViewById(R.id.num1);
        Num2 = findViewById(R.id.num2);
        tvrta = findViewById(R.id.rta);

    }
    public void click1( View view){

    }

    public void clickSumar( View view){

        String num1String = Num1.getText().toString();
        Double num1 = Double.parseDouble(num1String);

        String num2String = Num2.getText().toString();
        Double num2 = Double.parseDouble(num2String);

        Double rta = num1 + num2;

        tvrta.setText(rta.toString());



        Toast.makeText(this, "Sumando", Toast.LENGTH_SHORT).show();
    }
    public void clickRestar( View view){

        String num1String = Num1.getText().toString();
        Double num1 = Double.parseDouble(num1String);

        String num2String = Num2.getText().toString();
        Double num2 = Double.parseDouble(num2String);

        Double rta = num1 - num2;

        tvrta.setText(rta.toString());



        Toast.makeText(this, "Restando", Toast.LENGTH_SHORT).show();
    }
    public void clickDivideir( View view){

        String num1String = Num1.getText().toString();
        Double num1 = Double.parseDouble(num1String);

        String num2String = Num2.getText().toString();
        Double num2 = Double.parseDouble(num2String);

        Double rta = num1 / num2;

        tvrta.setText(rta.toString());



        Toast.makeText(this, "Dividiendo", Toast.LENGTH_SHORT).show();
    }
    public void clickMultiplicar( View view){

        String num1String = Num1.getText().toString();
        Double num1 = Double.parseDouble(num1String);

        String num2String = Num2.getText().toString();
        Double num2 = Double.parseDouble(num2String);

        Double rta = num1 * num2;

        tvrta.setText(rta.toString());



        Toast.makeText(this, "Multiplicando", Toast.LENGTH_SHORT).show();
    }


}
