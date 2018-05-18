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

        signup2 = (Button) findViewById(R.id.signup2);
        signup2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            openLogin();
          }
          });
    }

    public void openLogin() {
        Intent il = new Intent(this, Login.class);
        startActivity(il);
    };


}
