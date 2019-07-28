package sample.ar.arvind.typewriter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import lib.ar.arvind.typewriter.TypeWriterTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TypeWriterTextView typeWriterTextView = findViewById(R.id.text_view);
        typeWriterTextView.typeText("Type Writer Animation", 100);
    }
}
