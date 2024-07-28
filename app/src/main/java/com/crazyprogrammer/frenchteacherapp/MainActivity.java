package com.crazyprogrammer.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    Button button , button2, button3 , button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

       button.setOnClickListener(this);
       button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View view) {

        // find the button by id and play the correct sound
        int clickedBtnId = view.getId();
        if (clickedBtnId == R.id.button){
            playSounds(R.raw.black);
        } else if (clickedBtnId == R.id.button2) {
            playSounds(R.raw.green);
        } else if (clickedBtnId == R.id.button3) {
            playSounds(R.raw.red);
        }else if (clickedBtnId == R.id.button4) {
            playSounds(R.raw.purple);
        }else if (clickedBtnId == R.id.button5) {
            playSounds(R.raw.yellow);
        }

    }

    public  void playSounds(int Id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                R.raw.black
        );
        mediaPlayer.start();
    }
}