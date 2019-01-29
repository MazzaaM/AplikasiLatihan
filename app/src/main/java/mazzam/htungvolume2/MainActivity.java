package mazzam.htungvolume2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtPanjang, edtlebar, edttinggi;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPanjang  = findViewById(R.id.edtpanjang);
        edtlebar  = findViewById(R.id.edtlebar);
        edttinggi  = findViewById(R.id.edttinggi);
        btnHitung = findViewById(R.id.btnhitung);

        btnHitung.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnhitung){
            String Panjang = edtPanjang.getText().toString();
            String Lebar = edtlebar.getText().toString();
            String Tinggi = edttinggi.getText().toString();

            Boolean isEmpty = false;
            if (TextUtils.isEmpty(Panjang)) {
                isEmpty = true;
                edtPanjang.setError("Diisi ya....");
            }

            if (TextUtils.isEmpty(Lebar)) {
                isEmpty = true;
                edtlebar.setError("Diisi donk..");
            }

            if (TextUtils.isEmpty(Tinggi)) {
                isEmpty = true;
                edttinggi.setError("Diisi Woyy..!");
            }

            if (!isEmpty) {
                Double panjang = Double.parseDouble(Panjang);
                Double lebar = Double.parseDouble(Lebar);
                Double tinggi = Double.parseDouble(Tinggi);

                Double hasil = panjang * lebar * tinggi;

                Intent I = new Intent(MainActivity.this, Main2Activity.class);
                I.putExtra("Total", hasil);
                startActivity(I);

            }
        }
    }
}
