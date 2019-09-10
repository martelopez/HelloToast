package com.martelopez.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variable de seguimiento del recuento
    private int mCount = 0;

    //Variable para el controlador de clic
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencia del id ShowCount
        mShowCount = (TextView) findViewById(R.id.showCount);
    }

    public void showToast(View view) {
        // Muestra un mensaje emergente
        // Utiliza el metodo makeText
        // Contiene el contexto de la aplicación, contenido y la duración
        Toast toast = Toast.makeText(this,R.string.toastMessage,Toast.LENGTH_SHORT);

        //Muestra el mensaje
        toast.show();
    }

    public void countUp(View view) {
        // Variable para el recuento
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));


    }
}
