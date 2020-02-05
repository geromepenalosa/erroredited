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
    Button button = findViewById(R.id.button);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String txtfromspinner;

        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(AdapterView<?> parent, ) {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        txtfromspinner = spinner.getSelectedItem().toString;
                    }
                }
        );
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        txtFromTxtbox = String.valueOf(txtbox.getText());

                        number = Integer.parseInt(String.valueOf(numbox.getText()));

                        Intent i  = new Intent(MainActivity.this, SecondActivity.class);

                        i.putExtra("TXT",txtFromspinner);

                        startActivity(i);

                    }
                }
        );
    }

}
