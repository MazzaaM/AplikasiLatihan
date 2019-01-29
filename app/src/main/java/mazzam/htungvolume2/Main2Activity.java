package mazzam.htungvolume2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvhasil = findViewById(R.id.tvhasil);


        Bundle variable = getIntent().getExtras();
        if (variable != null) {
            Double hasil = variable.getDouble("Total");
            tvhasil.setText(String.valueOf(hasil));
        }

    }
}
