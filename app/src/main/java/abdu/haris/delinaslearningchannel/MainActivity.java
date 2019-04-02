package abdu.haris.delinaslearningchannel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

   public void convertMethod(View view){

        EditText dollar = (EditText) findViewById(R.id.dollarNum);
        Double rupees = Double.parseDouble(dollar.getText().toString());
        Double display = rupees*69.06;
        Toast.makeText(MainActivity.this,String.format("%.2f",display),Toast.LENGTH_SHORT).show();
                

    }
}
