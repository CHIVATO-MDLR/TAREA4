package com.utic.actividad6_4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
    }
    public void autenticar(View v) {
        String clave = et2.getText().toString();
        if (clave.length() == 0) {
            Toast notificacion = Toast.makeText(this, "La clave no puede quedar vacía", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}