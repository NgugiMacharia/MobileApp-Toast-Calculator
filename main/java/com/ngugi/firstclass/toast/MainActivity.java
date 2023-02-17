package com.ngugi.firstclass.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    //Declaration of views
    Button toast, n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, c, sq, del, plus, min, mul, div, eq, dot, perc;
    TextView tv;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Initialization/Instantiation of views
        toast = findViewById(R.id.Toast_b);
        tv = findViewById(R.id.Text_tv);
        n0 = findViewById(R.id.no0);
        n1 = findViewById(R.id.no1);
        n2 = findViewById(R.id.no2);
        n3 = findViewById(R.id.no3);
        n4 = findViewById(R.id.no4);
        n5 = findViewById(R.id.no5);
        n6 = findViewById(R.id.no6);
        n7 = findViewById(R.id.no7);
        n8 = findViewById(R.id.no8);
        n9 = findViewById(R.id.no9);
        c = findViewById(R.id.c);
        sq = findViewById(R.id.square);
        del = findViewById(R.id.del);
        plus = findViewById(R.id.plus);
        min = findViewById(R.id.minus);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);
        eq = findViewById(R.id.equals);
        dot = findViewById(R.id.dot);
        perc = findViewById(R.id.percent);

    // Set onClick Listeners

        toast.setOnClickListener(this::message);
        n0.setOnClickListener(this::n0);
        n1.setOnClickListener(this::n1);
        n2.setOnClickListener(this::n2);
        n3.setOnClickListener(this::n3);
        n4.setOnClickListener(this::n4);
        n5.setOnClickListener(this::n5);
        n6.setOnClickListener(this::n6);
        n7.setOnClickListener(this::n7);
        n8.setOnClickListener(this::n8);
        n9.setOnClickListener(this::n9);
        c.setOnClickListener(this::cancel);
        sq.setOnClickListener(this::sq);
        del.setOnClickListener(this::del);
        plus.setOnClickListener(this::add);
        min.setOnClickListener(this::min);
        mul.setOnClickListener(this::multi);
        div.setOnClickListener(this::div);
        eq.setOnClickListener(this::equals);
        dot.setOnClickListener(this::point);
        perc.setOnClickListener(this::percentile);

    }

    BigInteger signValue;
    boolean dvd = false, mltpl = false, mns = false, addtn = false, pnt = false;
    double arith;

    public void message(View view) {
        Toast.makeText(MainActivity.this, "You Toasted Me!", Toast.LENGTH_SHORT).show();
        String currentValue = tv.getText().toString();
        int value = Integer.parseInt(currentValue);
        signValue = BigInteger.valueOf(value);
        tv.setText(String.valueOf(value));
    }

    /*
    public void increment(View view) {
        String currentValue = tv.getText().toString();
        int value = Integer.parseInt(currentValue);
        value++;
       tv.setText(String.valueOf(value));
    }*/

    public void cancel(View view) {
        String currentValue = tv.getText().toString();
        int value = Integer.parseInt(currentValue);
        value = value/10;
        tv.setText(String.valueOf(value));
    }

    public void sq(View view) {
        String currentValue = tv.getText().toString();
        int value = Integer.parseInt(currentValue);
        value = value^2;
        tv.setText(String.valueOf(value));
    }

    public void del(View view) {
        String currentValue = tv.getText().toString();
        int value = Integer.parseInt(currentValue);
        value = value/10;
        tv.setText(String.valueOf(value));
    }

    public void div(View view) {
        dvd = true;
    }

    public void n7(View view) {
        String initVal = tv.getText().toString();
        int Val = Integer.parseInt(initVal);

        if (addtn) {

            tv.setText(String.valueOf(7));
            addtn = false;
        }

        else if (mns){
            tv.setText(String.valueOf(7));
            mns = false;
        }

        else if (mltpl){
            tv.setText(String.valueOf(7));
            mltpl = false;
        }

        else if (dvd){
            tv.setText(String.valueOf(7));
            dvd = false;
        }

        else {
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 7;
            tv.setText(String.valueOf(value));
        }
    }

    public void n8(View view) {
        String initVal = tv.getText().toString();
        double Val = Integer.parseInt(initVal);

        if (addtn) {
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 8;
            tv.setText(String.valueOf(value));
            arith = Val + value;
        }

        else if (mns){
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 8;
            tv.setText(String.valueOf(value));
            arith = Val - value;
        }

        else if (mltpl){
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 8;
            tv.setText(String.valueOf(value));
            arith = Val * value;
        }

        else if (dvd){
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 8;
            tv.setText(String.valueOf(value));
            dvd = false;
            arith = Val / value;
        }

        else {
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 8;
            tv.setText(String.valueOf(value));
        }
    }

    public void n9(View view) {
        String initVal = tv.getText().toString();
        int Val = Integer.parseInt(initVal);

        if (addtn) {

            tv.setText(String.valueOf(9));
            addtn = false;
        }

        else if (mns){
            tv.setText(String.valueOf(9));
            mns = false;
        }

        else if (mltpl){
            tv.setText(String.valueOf(9));
            mltpl = false;
        }

        else if (dvd){
            tv.setText(String.valueOf(9));
            dvd = false;
        }

        else {
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 9;
            tv.setText(String.valueOf(value));
        }
    }

    public void multi(View view) {
        mltpl = true;
    }

    public void n4(View view) {
        String initVal = tv.getText().toString();
        int Val = Integer.parseInt(initVal);

        if (addtn) {

            tv.setText(String.valueOf(4));
            addtn = false;
        }

        else if (mns){
            tv.setText(String.valueOf(4));
            mns = false;
        }

        else if (mltpl){
            tv.setText(String.valueOf(4));
            mltpl = false;
        }

        else if (dvd){
            tv.setText(String.valueOf(4));
            dvd = false;
        }

        else {
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 4;
            tv.setText(String.valueOf(value));
        }
    }

    public void n5(View view) {
        String initVal = tv.getText().toString();
        int Val = Integer.parseInt(initVal);

        if (addtn) {

            tv.setText(String.valueOf(5));
            addtn = false;
        }

        else if (mns){
            tv.setText(String.valueOf(5));
            mns = false;
        }

        else if (mltpl){
            tv.setText(String.valueOf(5));
            mltpl = false;
        }

        else if (dvd){
            tv.setText(String.valueOf(5));
            dvd = false;
        }

        else {
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 5;
            tv.setText(String.valueOf(value));
        }
    }

    public void n6(View view) {
        String initVal = tv.getText().toString();
        int Val = Integer.parseInt(initVal);

        if (addtn) {

            tv.setText(String.valueOf(6));
            addtn = false;
        }

        else if (mns){
            tv.setText(String.valueOf(6));
            mns = false;
        }

        else if (mltpl){
            tv.setText(String.valueOf(6));
            mltpl = false;
        }

        else if (dvd){
            tv.setText(String.valueOf(6));
            dvd = false;
        }

        else {
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 6;
            tv.setText(String.valueOf(value));
        }
    }

    public void min(View view) {
        if (mns)
            addtn = true;
        else
            mns = true;
    }

    public void n1(View view) {
        String initVal = tv.getText().toString();
        int Val = Integer.parseInt(initVal);

        if (addtn) {

            tv.setText(String.valueOf(1));
            addtn = false;
        } else if (mns) {
            tv.setText(String.valueOf(1));
            mns = false;
        } else if (mltpl) {
            tv.setText(String.valueOf(1));
            mltpl = false;
        } else if (dvd) {
            tv.setText(String.valueOf(1));
            dvd = false;
        } else {
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 1;
            tv.setText(String.valueOf(value));
        }
    }

    public void n2(View view) {
        String initVal = tv.getText().toString();
        int Val = Integer.parseInt(initVal);

        if (addtn) {
            tv.setText(String.valueOf(2));
            addtn = false;
        }

        else if (mns){
            tv.setText(String.valueOf(2));
            mns = false;
        }

        else if (mltpl){
            tv.setText(String.valueOf(2));
            mltpl = false;
        }

        else if (dvd){
            tv.setText(String.valueOf(2));
            dvd = false;
        }

        else {
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 2;
            tv.setText(String.valueOf(value));
        }
    }

    public void n3(View view) {
        String initVal = tv.getText().toString();
        int Val = Integer.parseInt(initVal);

        if (addtn) {

            tv.setText(String.valueOf(3));
            addtn = false;
        }

        else if (mns){
            tv.setText(String.valueOf(3));
            mns = false;
        }

        else if (mltpl){
            tv.setText(String.valueOf(3));
            mltpl = false;
        }

        else if (dvd){
            tv.setText(String.valueOf(3));
            dvd = false;
        }

        else {
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10 + 3;
            tv.setText(String.valueOf(value));
        }
    }

    public void add(View view) {
        addtn = true;
    }

    public void point(View view) {
        pnt = true;
    }

    public void n0(View view) {
        String initVal = tv.getText().toString();
        int Val = Integer.parseInt(initVal);

        if (addtn) {

            tv.setText(String.valueOf(0));
            addtn = false;
        }

        else if (mns){
            tv.setText(String.valueOf(0));
            mns = false;
        }

        else if (mltpl){
            tv.setText(String.valueOf(0));
            mltpl = false;
        }

        else if (dvd){
            tv.setText(String.valueOf(0));
            dvd = false;
        }

        else {
            String currentValue = tv.getText().toString();
            int value = Integer.parseInt(currentValue);
            value = value * 10;
            tv.setText(String.valueOf(value));
        }

    }

    public void percentile(View view) {
        String currentValue = tv.getText().toString();
        int value = Integer.parseInt(currentValue);
        value = value/100;
        tv.setText(String.valueOf(value));
    }

    public void equals(View view) {
        String currentValue = tv.getText().toString();
        int value = Integer.parseInt(currentValue);
        tv.setText(String.valueOf(arith));
    }
}