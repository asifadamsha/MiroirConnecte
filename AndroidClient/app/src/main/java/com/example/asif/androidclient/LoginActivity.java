package com.example.asif.androidclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button buttonLogIn, buttonInscription;
    private EditText editTextNom, editTextMdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonLogIn = (Button)findViewById(R.id.buttonLogin);
        buttonInscription = (Button)findViewById(R.id.buttonInscription);

        editTextNom = (EditText)findViewById(R.id.editTextNom);
        editTextMdp = (EditText)findViewById(R.id.editTextMDP);

        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nom = editTextNom.getText().toString();
                String mdp = editTextMdp.getText().toString();

                userAuthentification(nom,mdp);
            }
        });

        buttonInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

    }

    private void userAuthentification(String nom, String mdp){

    }
}
