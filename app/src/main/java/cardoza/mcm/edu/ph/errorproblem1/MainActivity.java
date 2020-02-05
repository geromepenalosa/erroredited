package cardoza.mcm.edu.ph.errorproblem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;



public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final String txtfromspinner [] = new String[1];

        spinner = findViewById(R.id.planets_spinner);
        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public  void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        txtfromspinner[0] = spinner.getSelectedItem().toString();

                    }

                    public void onNothingSelected(AdapterView<?> parent){

                    }

                }
        );
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i  = new Intent(MainActivity.this, SecondActivity.class);

                        i.putExtra("TXT",txtfromspinner[0]);

                        startActivity(i);

                    }
                }
        );
    }

}
