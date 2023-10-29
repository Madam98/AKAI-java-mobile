package com.example.rekrutacja;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rekrutacja.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick();
            }
        });

        binding.clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onYourButtonClick();
            }
        });
    }

    /*1.TODO Pierwszym z zadań jest implementacja metody, w taki sposób, aby
          kliknięcie przycisku powodowało otwarcie activity SecondActivity, gdy
          wpisanym przez użytkownika tekstem jest 'AKAI'.
          Kolejne zadanie znajdziesz w pliku activity_main.xml.

          Podpowiedź poczytaj o Intent.
   */
    private void onButtonClick() {
        String userInput = binding.editText.getText().toString();
        if (userInput.equals("AKAI")) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }

    /*2.b TODO Druga część tego zadania polega na implementacji metody, która zmienia
            wszyskie literzy we wpisanym przez użytkownika tekscie na wielkie i
            wstawienie przerobionego tekstu do textView. Nie zapomnij dodać do metody
            OnCreate() OnClickListenera słuchającego na kliknięcia wstawionego przez Ciebie
            przycisku.
            Kolejne zadanie czeka na Ciebie w pliku SecondActivity
     */
    private void onYourButtonClick() {
        String userInput = binding.editText.getText().toString();
        String capitalizedText = userInput.toUpperCase();
        binding.textView.setText(capitalizedText);
    }
}
