package sg.edu.rp.c346.id20019652.activity3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edNum1;
    EditText edNum2;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNum1 = findViewById(R.id.editTextNumber);
        edNum2 = findViewById(R.id.editTextNumber2);
        btnCalc = findViewById(R.id.buttonCalc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(edNum1.getText().toString());
                int num2 = Integer.parseInt(edNum2.getText().toString());

                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                intent.putExtra("Number 1", num1);
                intent.putExtra("Number 2", num2);
                startActivity(intent);

                /*if(num1 < num2){
                    int subtract = num2 - num1;
                    double divide = num2 / num1;
                }
                else{
                    int subtract = num1 - num2;
                    double divide = num1 / num2;
                }
                int sum = num1 + num2;
                int multiply = num1 * num2;*/
            }
        });
    }
}