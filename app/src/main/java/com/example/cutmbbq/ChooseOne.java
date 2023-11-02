package com.example.cutmbbq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseOne extends AppCompatActivity {

    Button Chef,Customer,DeliveryPerson;
    Intent intent;
    String type;
    ConstraintLayout bigimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);

        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.bg2),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img2),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img3),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img4),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img5),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img6),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img7),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img8),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img9),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img10),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img11),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img12),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img12),3000);

        animationDrawable.setOneShot(false);
        animationDrawable.setEnterFadeDuration(850);
        animationDrawable.setExitFadeDuration(1600);

        bigimage = findViewById(R.id.back3);
        bigimage.setBackgroundDrawable(animationDrawable);
        animationDrawable.start();

        intent = getIntent();
        type = intent.getStringExtra("Home").toString().trim();

        Chef = (Button)findViewById(R.id.chef);
        DeliveryPerson = (Button)findViewById(R.id.delivery);
        Customer = (Button)findViewById(R.id.customer);

        Chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type.equals("Email")){
                    Intent loginemail = new Intent(ChooseOne.this,Cheflogin.class);
                    startActivity(loginemail);
                    finish();
                }
                if(type.equals("Phone")){
                    Intent loginphone = new Intent(ChooseOne.this,ChefLoginphone.class);
                    startActivity(loginphone);
                    finish();
                }
                if(type.equals("Signup")){
                    Intent Register = new Intent(ChooseOne.this,ChefRegistration.class);
                    startActivity(Register);

                }
            }
        });
        Customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (type.equals("Email")) {
                    Intent loginemailcust = new Intent(ChooseOne.this, Login.class);
                    startActivity(loginemailcust);
                    finish();
                }
                if (type.equals("Phone")) {
                    Intent loginphonecust = new Intent(ChooseOne.this, Loginphone.class);
                    startActivity(loginphonecust);
                    finish();
                }
                if (type.equals("Signup")) {
                    Intent Registercust = new Intent(ChooseOne.this, Registration.class);
                    startActivity(Registercust);
                }
            }
        });

        DeliveryPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (type.equals("Email")) {
                    Intent loginemail = new Intent(ChooseOne.this,Delivery_ChefLogin.class);
                    startActivity(loginemail);
                    finish();
                }
                if (type.equals("Phone")) {
                    Intent loginphone = new Intent(ChooseOne.this,Delivery_ChefLoginphone.class);
                    startActivity(loginphone);
                    finish();
                }
                if (type.equals("Signup")) {
                    Intent Registerdelivery = new Intent(ChooseOne.this,Delivery_ChefRegistration.class);
                    startActivity(Registerdelivery);
                }
            }
        });
    }
}