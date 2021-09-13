package com.example.login;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if(result.getResultCode() == Activity.RESULT_OK){
                        Intent intent = result.getData();
                        Bundle bundle =  intent.getExtras ();
                        //MOSTAR LOS DATOS INGREADOS
                        Usuario user = (Usuario) bundle.getSerializable("Registrar");
                        String datos = user.getNombre().toString() + "\n" + user.getEmail().toString() + "\n" + user.getTelefono().toString() + "\n" + user.getPassword().toString();
                        Toast.makeText(MainActivity.this, datos, Toast.LENGTH_LONG).show();
                    }
                }
            }
    );
    public void btnRegistrar_clic(View v){

        mStartForResult.launch(new Intent(this,
                activityRegistro.class));

    }
}