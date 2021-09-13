package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activityRegistro extends AppCompatActivity {
    Button btnGuardad, btnCancel;
    EditText txtNombre, txtTel, txtEmail, txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnGuardad = findViewById(R.id.btnGuardar);
        btnCancel = findViewById(R.id.btnCancelar);
        txtNombre = findViewById(R.id.txtNombre);
        txtEmail = findViewById(R.id.txtEmail);
        txtTel = findViewById(R.id.txtTel);
        txtPass = findViewById(R.id.txtPass);


    }

    public void btnGuardar_clic(View v){
        Usuario user = new Usuario(txtNombre.getText().toString(), txtTel.getText().toString(),
                txtEmail.getText().toString(), txtPass.getText().toString());

        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable("Registrar", user);

        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
        finish();
    }
}