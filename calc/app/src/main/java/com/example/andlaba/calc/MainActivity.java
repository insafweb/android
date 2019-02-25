package com.example.andlaba.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnesc,btnAdd,btnSub,btnMul,btnDiv,btneql,btndel,btndot,btnclr,btnsqr;
    EditText et;
    float val1,val2;
    boolean add,sub,mul,div,sqr;
    double v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=(Button) findViewById(R.id.button0);
        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button) findViewById(R.id.button3);
        btn4=(Button) findViewById(R.id.button4);
        btn5=(Button) findViewById(R.id.button5);
        btn6=(Button) findViewById(R.id.button6);
        btn7=(Button) findViewById(R.id.button7);
        btn8=(Button) findViewById(R.id.button8);
        btn9=(Button) findViewById(R.id.button9);
        btnAdd=(Button) findViewById(R.id.buttonadd);
        btnSub=(Button) findViewById(R.id.buttonsub);
        btnMul=(Button) findViewById(R.id.buttonmul);
        btnDiv=(Button) findViewById(R.id.buttondiv);
        btneql=(Button) findViewById(R.id.buttonequal);
        btndot=(Button) findViewById(R.id.buttondot);
        btnclr=(Button) findViewById(R.id.buttonclear);
        btnesc=(Button) findViewById(R.id.button15);
        btnsqr=(Button) findViewById(R.id.button16);
        btndel=(Button) findViewById(R.id.button14);
        et=(EditText) findViewById(R.id.editText);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+".");
            }
        });
        btnsqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"");
                double v1=val1;
                sqr=true;
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {et.setText("");}
                else
                    val1=Float.parseFloat(et.getText()+"");
                add=true;
                et.setText(null);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {et.setText("");}
                else
                val1=Float.parseFloat(et.getText()+"");
                sub=true;
                et.setText(null);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {et.setText("");}
                else
                val1=Float.parseFloat(et.getText()+"");
                mul=true;
                et.setText(null);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                {et.setText("");}
                else
                val1=Float.parseFloat(et.getText()+"");
                div=true;
                et.setText(null);
            }
        });
        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2=Float.parseFloat(et.getText()+"");
                if(add==true)
                {
                    et.setText(val1+val2+"");
                    add=false;
                }
                if(sub==true)
                {
                    et.setText(val1-val2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    et.setText(val1*val2+"");
                    mul=false;
                }
                if(div==true)
                {
                    et.setText(val1/val2+"");
                    div=false;
                }
                if(sqr==true)
                {
                    et.setText((int) Math.sqrt(Double.parseDouble(v1+"")));
                    sqr=false;
                }
            }
        });
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText("");
            }
        });
        btnesc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                et.setText("");
            }
        });
        btndel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                et.setText("");
            }
        });
    }
}
