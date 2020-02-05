package cardoza.mcm.edu.ph.errorproblem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView txtFromTxtbox;
    Button button = findViewById(R.id.button);
    String txtfromspinner;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public  void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        txtfromspinner = spinner.getSelectedItem().toString();
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

                        i.putExtra("TXT",txtfromspinner);

                        startActivity(i);

                    }
                }
        );
    }

}
