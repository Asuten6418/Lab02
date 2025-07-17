package com.example.myapplication;

import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    int numMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        numMessage = 10;
        Log.i("numMessage =", "" + numMessage);

        numMessage++;
        numMessage = numMessage + 1;
        Log.i("numMessage = ", "" + numMessage);

        boolean isFriend = true;
        Log.i("isFriend = ", "" + isFriend);

        String Contact = "Asuten";
        String message = "This is my app";

        Toast.makeText(this, "message form" + Contact, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "message form" + message, Toast.LENGTH_SHORT).show();

        String command = "go  east";
        command = "go  east";
        switch (command) {
            case "go east":
                Log.i("Player :", "Move to the east");
                break;
            case "go to west":
                Log.i("Player:", "move to the west");
                break;
            default:
                Log.i("message:", "sorry I don't speak Elfish");
                break;

        }
        Log.i("message:", "In countUP method");
        int x = 0;
        while (true) {
            x++;
            Log.i("x=", "" + x);
            if (x == 3) {
                break;
            }
        }
        String mess = joinThese("Method", "are", "cool");
        Log.i("message=", mess);
        float area = getareaCircle(5f);
        Log.i("area=", ""+area);
    }
    String joinThese(String a,String b , String c){
        return a+b+c;
    }
    float getareaCircle(float redius){
        return 3.14f*redius*redius;
    }
}
