package com.example.cutmbbq;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.hbb20.CountryCodePicker;

public class Delivery_ChefLoginphone extends AppCompatActivity {

    EditText num;
    Button sendotp,signinemail;
    TextView signup;
    CountryCodePicker cpp;
    FirebaseAuth Fauth;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_chef_loginphone);

        num = (EditText)findViewById(R.id.Dphonenumber);
        sendotp = (Button)findViewById(R.id.Sendotp);
        cpp=(CountryCodePicker)findViewById(R.id.countrycode);
        signinemail=(Button)findViewById(R.id.DbtnEmail);
        signup = (TextView)findViewById(R.id.Signupif);

        Fauth = FirebaseAuth.getInstance();

        sendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number=num.getText().toString().trim();
                String Phonenum = cpp.getSelectedCountryCodeWithPlus()+number;
                Intent b = new Intent(Delivery_ChefLoginphone.this,Delivery_sendotp.class);

                b.putExtra("Phonenum",Phonenum);
                startActivity(b);
                finish();

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Delivery_ChefLoginphone.this,Delivery_ChefRegistration.class));
                finish();
            }
        });
        signinemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Delivery_ChefLoginphone.this,Delivery_ChefLogin.class));
                finish();
            }
     });


}
}
