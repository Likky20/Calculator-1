package com.example.likhith.calculator1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int a,b,c,i=0,ans=0;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDEL,btnPLUS,btnMIN,btnMUL,btnDIV,btnCLEAR,btnEQLS;
    TextView MTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnPLUS=(Button)findViewById(R.id.btnPLUS);
        btnMIN=(Button)findViewById(R.id.btnMIN);
        btnMUL=(Button)findViewById(R.id.btnMUL);
        btnDEL=(Button)findViewById(R.id.btnDEL);
        btnCLEAR=(Button)findViewById(R.id.btnCLEAR);
        btnDIV=(Button)findViewById(R.id.btnDIV);
        btnEQLS=(Button)findViewById(R.id.btnEQLS);
        btnPLUS.setBackgroundColor(Color.CYAN);
        btnMIN.setBackgroundColor(Color.CYAN);
        btnDEL.setBackgroundColor(Color.CYAN);
        btnMUL.setBackgroundColor(Color.CYAN);
        btnDIV.setBackgroundColor(Color.CYAN);
        btnCLEAR.setBackgroundColor(Color.CYAN);
        btnEQLS.setBackgroundColor(Color.MAGENTA);




    }

    public void One(View view) {
        i++;
        if(i==1)
        {
            a=1;
            MTV.setText(String.valueOf(a));
        }
        if(i==2)
        {
            b=1;
            MTV.setText(String.valueOf(b));
        }

    }

    public void Two(View view) {
        i++;
        if(i==1)
        {
            a=2;
            MTV.setText(String.valueOf(a));
        }
        if(i==2)
        {
            b=2;
            MTV.setText(String.valueOf(b));
        }
    }

    public void Three(View view) {
        i++;
        if(i==1)
        {
            a=3;
            MTV.setText(String.valueOf(a));
        }
        if(i==2)
        {
            b=3;
            MTV.setText(String.valueOf(b));
        }
    }

    public void DEL(View view) {
        c=0;
        MTV.setText("DEL");
    }

    public void FOUR(View view) {
        i++;
        if(i==1)
        {
            a=4;
            MTV.setText(String.valueOf(a));
        }
        if(i==2)
        {
            b=4;
            MTV.setText(String.valueOf(b));
        }
    }

    public void FIVE(View view) {
        i++;
        if(i==1)
        {
            a=5;
            MTV.setText(String.valueOf(a));
        }
        if(i==2)
        {
            b=5;
            MTV.setText(String.valueOf(b));
        }
    }

    public void SIX(View view) {
        i++;
        if(i==1)
        {
            a=6;
            MTV.setText(String.valueOf(a));
        }
        if(i==2)
        {
            b=6;
            MTV.setText(String.valueOf(b));
        }
    }

    public void PLUS(View view) {
        c=4;
        MTV.setText("+");
    }

    public void SEVEN(View view) {
        i++;
        if(i==1)
        {
            a=7;
            MTV.setText(String.valueOf(a));
        }
        if(i==2)
        {
            b=7;
            MTV.setText(String.valueOf(b));
        }
    }

    public void EIGHT(View view) {
        i++;
        if(i==1)
        {
            a=8;
            MTV.setText(String.valueOf(a));
        }
        if(i==2)
        {
            b=8;
            MTV.setText(String.valueOf(b));
        }
    }

    public void NINE(View view) {
        i++;
        if(i==1)
        {
            a=9;
            MTV.setText(String.valueOf(a));
        }
        if(i==2)
        {
            b=9;
            MTV.setText(String.valueOf(b));
        }
    }

    public void MIN(View view) {
        c=3;
        MTV.setText("-");
    }

    public void MUL(View view) {
        c=2;
        MTV.setText("x");
    }

    public void ZERO(View view) {
        i++;
        if(i==1)
        {
            a=0;
            MTV.setText(String.valueOf(a));
        }
        if(i==2)
        {
            b=0;
            MTV.setText(String.valueOf(b));
        }
    }

    public void DIV(View view) {
        c=1;
        MTV.setText("/");
    }

    public void CLEAR(View view) {
        a=0;
        b=0;
        c=100;
        i=0;
        MTV.setText("DEL");
    }

    public void EQLS(View view) {
        if(c==1)
        {
            ans=a/b;
        }
        if(c==2)
        {
            ans=a*b;
        }if(c==3)
        {
            ans=a-b;
        }if(c==4)
        {
            ans=a+b;
        }
        if(c==0)
        {
            i--;
        }


        MTV.setText("ans");
    }
}
