package sg.edu.rp.c346.id20019652.activity3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        //Step 2
        textView = findViewById(R.id.textViewAdd);
        textView = findViewById(R.id.textViewSub);
        textView = findViewById(R.id.textViewMul);
        textView = findViewById(R.id.textViewDiv);

        Intent intentReceived = getIntent();

        int num1 = intentReceived.getIntExtra("Number 1", 0);
        int num2 = intentReceived.getIntExtra("Number 2", 0);
        textView.setText("Addition: " + (num1 + num2));
        textView.setText("Addition: " + (num1 + num2));
        

    }
}