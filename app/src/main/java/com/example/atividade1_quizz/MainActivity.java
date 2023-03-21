package com.example.atividade1_quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    RadioGroup groupPagode;
    CheckBox check;

    RadioButton gruopSoweto;
    RadioButton gruopTurma;
    RadioButton gruopContrariar;
    RadioButton gruopExalta;
    RadioButton RacaNegra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        groupPagode = (RadioGroup) findViewById(R.id.groupPagode);
    }

    public void floatButtonClick(View view) {

        RadioButton radioSelecionado = (RadioButton)  findViewById(groupPagode.getCheckedRadioButtonId());
        if (radioSelecionado.getText().toString().equals("Exaltasamba"))
            Toast.makeText(this, "Resposta Correta", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "Resposta Incorreta", Toast.LENGTH_SHORT).show();

    }
}

