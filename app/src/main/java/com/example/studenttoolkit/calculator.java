package com.example.studenttoolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculator extends AppCompatActivity {


    private boolean isOppressed = false;

    private  double num1 = 0;

    private  int num2index = 0;

    private  char curOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculator);


        final TextView tvCal1 = findViewById(R.id.tvCal1);

        final Button n0 = findViewById(R.id.n0);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button decdot = findViewById(R.id.decdot);
        final Button equals = findViewById(R.id.equals);
        final Button div = findViewById(R.id.div);
        final Button mul = findViewById(R.id.mul);
        final Button sub = findViewById(R.id.sub);
        final Button add = findViewById(R.id.adt);

        final View.OnClickListener calcListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final int id = view.getId();

                switch(id){

                    case R.id.n0:
                        tvCal1.append("0");
                        break;

                    case R.id.n1:
                        tvCal1.append("1");
                        break;

                    case R.id.n2:
                        tvCal1.append("2");
                        break;

                    case R.id.n3:
                        tvCal1.append("3");
                        break;

                    case R.id.n4:
                        tvCal1.append("4");
                        break;

                    case R.id.n5:
                        tvCal1.append("5");
                        break;

                    case R.id.n6:
                        tvCal1.append("6");
                        break;

                    case R.id.n7:
                        tvCal1.append("7");
                        break;

                    case R.id.n8:
                        tvCal1.append("8");
                        break;

                    case R.id.n9:
                        tvCal1.append("9");
                        break;

                    case R.id.decdot:
                        tvCal1.append(".");
                        break;

                    case R.id.equals:

                        if(isOppressed)
                        {
                            if(curOp=='+')
                            {
                                String curcontent = tvCal1.getText().toString();
                                double num2 = Double.parseDouble(curcontent.substring(num2index,curcontent.length()));
                                num2 += num1;
                                tvCal1.setText(String.valueOf(num2));
                            }
                            else if (curOp=='-')
                            {
                                String curcontent = tvCal1.getText().toString();
                                double num2 = Double.parseDouble(curcontent.substring(num2index,curcontent.length()));
                                num2 = num1-num2;
                                tvCal1.setText(String.valueOf(num2));
                            }
                            else if (curOp=='/')
                            {
                                String curcontent = tvCal1.getText().toString();
                                double num2 = Double.parseDouble(curcontent.substring(num2index,curcontent.length()));
                                num2 = num1/num2;
                                tvCal1.setText(String.valueOf(num2));
                            }
                            else
                            {
                                String curcontent = tvCal1.getText().toString();
                                double num2 = Double.parseDouble(curcontent.substring(num2index,curcontent.length()));
                                num2 = num1*num2;
                                tvCal1.setText(String.valueOf(num2));
                            }
                        }
                        break;

                    case R.id.div:
                        String curcontent = tvCal1.getText().toString();
                        num2index = curcontent.length()+1;
                        num1 = Double.parseDouble(curcontent);
                        tvCal1.append("/");
                        isOppressed = true;
                        curOp = '/';
                        break;

                    case R.id.mul:
                        curcontent = tvCal1.getText().toString();
                        num2index = curcontent.length()+1;
                        num1 = Double.parseDouble(curcontent);
                        tvCal1.append("*");
                        isOppressed = true;
                        curOp = '*';
                        break;

                    case R.id.sub:
                        curcontent = tvCal1.getText().toString();
                        num2index = curcontent.length()+1;
                        num1 = Double.parseDouble(curcontent);
                        tvCal1.append("-");
                        isOppressed = true;
                        curOp = '-';
                        break;

                    case R.id.adt:
                        curcontent = tvCal1.getText().toString();
                        num2index = curcontent.length()+1;
                        num1 = Double.parseDouble(curcontent);
                        tvCal1.append("+");
                        isOppressed = true;
                        curOp = '+';

                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + id);
                }

            }
        };

        n0.setOnClickListener(calcListener);
        n1.setOnClickListener(calcListener);
        n2.setOnClickListener(calcListener);
        n3.setOnClickListener(calcListener);
        n4.setOnClickListener(calcListener);
        n5.setOnClickListener(calcListener);
        n6.setOnClickListener(calcListener);
        n7.setOnClickListener(calcListener);
        n8.setOnClickListener(calcListener);
        n9.setOnClickListener(calcListener);
        decdot.setOnClickListener(calcListener);
        equals.setOnClickListener(calcListener);
        div.setOnClickListener(calcListener);
        mul.setOnClickListener(calcListener);
        sub.setOnClickListener(calcListener);
        add.setOnClickListener(calcListener);

        final Button del = findViewById(R.id.del);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String curelements = tvCal1.getText().toString().trim();
                int length = curelements.length();

                if(length>0)
                {
                    curelements = curelements.substring(0, length-1);
                    tvCal1.setText(curelements);

                }
            }
        });

        final Button clr = findViewById(R.id.clr);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvCal1.setText("");
            }
        });


    }
}
