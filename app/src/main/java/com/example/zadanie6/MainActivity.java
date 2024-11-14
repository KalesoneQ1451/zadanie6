package com.example.zadanie6;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText mail;
    private EditText haslo;
    private EditText reHaslo;
    private Button przycisk;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        mail = findViewById(R.id.email);
        haslo = findViewById(R.id.haslo);
        reHaslo = findViewById(R.id.powtorz);
        przycisk = findViewById(R.id.przycisk);
        text = findViewById(R.id.tekst);

        przycisk.setOnClickListener(view -> {
            validation();
        });


    }
    public void validation(){
        if (!mail.getText().toString().contains("@")){
            text.setText("Niepoprawny adres e-mail");
        } else if (!haslo.getText().toString().equals(reHaslo.getText().toString())) {
            text.setText("Hasła się różnią");
        } else {
            text.setText("Witaj " + mail.getText());
        }

    }
}