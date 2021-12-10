package com.example.finalexamcountryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Images extends AppCompatActivity {
    ImageView ivFull;
    TextView tv_title,tv_price;

    EditText et_visitor;
    int price = 0;
    int totalPrice = 0;
    int visitor = 0;
    Button btn_evaluate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        getSupportActionBar().setTitle("Final Exam : "+Countries.title);
        ivFull = findViewById(R.id.ivFull);
        tv_title=findViewById(R.id.tv_title);
        tv_price = findViewById(R.id.tv_price);
        et_visitor = findViewById(R.id.et_visitor);
        btn_evaluate = findViewById(R.id.btn_evaluate);

        price = Countries.price;
        tv_price.setText("$" + String.valueOf(price));

        btn_evaluate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_visitor.getText().toString().length() != 0)
                    visitor = Integer.parseInt(et_visitor.getText().toString());

                if(visitor == 0){
                    totalPrice=price;
                }else if(visitor < 16){
                    totalPrice = price*visitor;
                }else if(visitor > 15){
                    totalPrice = (int) ((price*visitor) - ((price*visitor)*0.05));
                }
                tv_price.setText("$"+String.valueOf(totalPrice));
            }
        });


        if(Countries.title.equalsIgnoreCase("Niagara falls")){
            ivFull.setImageResource(R.drawable.niagara);}
        if(Countries.title.equalsIgnoreCase("CN Tower")){
            ivFull.setImageResource( R.drawable.cn);}
        if(Countries.title.equalsIgnoreCase("The Butchart Gardens")){
            ivFull.setImageResource(R.drawable.butchart);}
        if(Countries.title.equalsIgnoreCase("Notre-Dame Basilica")){
            ivFull.setImageResource( R.drawable.notre);}
        if(Countries.title.equalsIgnoreCase("The Statue of Liberty")){
            ivFull.setImageResource(R.drawable.liberty);}
        if(Countries.title.equalsIgnoreCase("The White House")){
            ivFull.setImageResource(R.drawable.whitehouse);}
        if(Countries.title.equalsIgnoreCase("Times Square")){
            ivFull.setImageResource(R.drawable.times);}
        if(Countries.title.equalsIgnoreCase("Big Ben")){
            ivFull.setImageResource( R.drawable.bigben);}
        if(Countries.title.equalsIgnoreCase("Westminster Abbey")){
            ivFull.setImageResource( R.drawable.abbey);}
        if(Countries.title.equalsIgnoreCase("Hyde Park")){
            ivFull.setImageResource( R.drawable.park);}

        tv_title.setText(Countries.title);
    }
}