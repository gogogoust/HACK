package com.example.admin.hackust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.gms.common.SignInButton;


public class MainActivity extends AppCompatActivity {
private Button joinButton;
    private SignInButton signInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        joinButton = (Button) findViewById(R.id.joinButtonlayout);
// Set the dimensions of the sign-in button.
        SignInButton signInButton = (SignInButton) findViewById(R.id.sign_in_button);
        signInButton.setSize(SignInButton.SIZE_STANDARD);
    }
    @Override
    protected void onStart(){

    }
    protected void JoinChat(Button joinButton){
     if ()
    }








}

