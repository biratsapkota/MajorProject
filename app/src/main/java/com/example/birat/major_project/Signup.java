package com.example.birat.major_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    public Button signup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //signup2 = (Button) findViewById(R.id.signup2);
        //signup2.setOnClickListener(new View.OnClickListener() {
        // @Override
        // public void onClick(View v) {
        //    openLogin();
        //  }
        //  });
    }

    //public void openLogin(){
    // Intent il = new Intent(this,Login.class);
    //startActivity(il);
      //};

    public void onSignupclick(View v){
        if(v.getId() == R.id.signup2){
            EditText name = (EditText) findViewById(R.id.signupname);
            EditText email = (EditText) findViewById(R.id.signupemail);
            EditText phone = (EditText) findViewById(R.id.signupphone);
            EditText pass1 = (EditText) findViewById(R.id.signuppass);
            EditText pass2 = (EditText) findViewById(R.id.signuppass2);


            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String phonestr = phone.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if (!pass1str.equals(pass2str)){
                Toast pass = Toast.makeText(Signup.this,"Passwords didnt match!",Toast.LENGTH_SHORT);
                pass.show();
            }
        }
    }
}
