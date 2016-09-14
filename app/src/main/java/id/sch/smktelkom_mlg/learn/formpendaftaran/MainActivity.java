package id.sch.smktelkom_mlg.learn.formpendaftaran;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNL;
    TextView HasilNL, HasilJK, HasilAM, HasilJP;
    Button buttonOK;
    RadioButton rgJKL, rgJKP;
    RadioGroup rgJK;
    CheckBox cbjazz, cbpop, cbklasik, cbrock;
    Spinner spJP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNL = (EditText) findViewById(R.id.editTextNL);

        HasilNL = (TextView) findViewById(R.id.hasil);
        HasilJK = (TextView) findViewById(R.id.hasilJK);
        HasilAM = (TextView) findViewById(R.id.hasilAM);
        HasilJP = (TextView) findViewById(R.id.hasilJP);

        rgJKL = (RadioButton) findViewById(R.id.radioButtonL);
        rgJKP = (RadioButton) findViewById(R.id.radioButtonP);

        rgJK = (RadioGroup) findViewById(R.id.JK);

        cbjazz = (CheckBox) findViewById(R.id.checkBoxJ);
        cbpop = (CheckBox) findViewById(R.id.checkBoxP);
        cbklasik = (CheckBox) findViewById(R.id.checkBoxK);
        cbrock = (CheckBox) findViewById(R.id.checkBoxR);

        spJP = (Spinner) findViewById(R.id.spinnerJP);

        buttonOK = (Button) findViewById(R.id.buttonOK);


        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                doProcess();
                doClick();

            }
        });
    }


    private void doProcess() {
        if (isValid()) {
            String nama = etNL.getText().toString();
            HasilNL.setText("Nama :\n" + nama);
        }
    }


    private boolean isValid() {
        boolean valid = true;

        /*nama*/
        String nama = etNL.getText().toString();

        if (nama.isEmpty()) {
            etNL.setError("Nama Belum Di Isi !!!");
            valid = false;
        } else {
            etNL.setError(null);
        }

        return valid;
    }

    private void doClick() {
        String Jumhasil = null;


        if (rgJKL.isChecked()) {
            Jumhasil = rgJKL.getText().toString();
        } else if (rgJKP.isChecked()) {
            Jumhasil = rgJKP.getText().toString();
        }

        if (Jumhasil == null) {
            HasilJK.setText("Belum memilih Jenis Kelamin");
        } else {
            HasilJK.setText("Jenis Kelamin :\n" + Jumhasil);
        }


        String hasilMod = "Aliran Musik Yang Anda Ikuti :\n";
        int startlen = hasilMod.length();
        if (cbjazz.isChecked()) hasilMod += cbjazz.getText() + "\n";
        if (cbpop.isChecked()) hasilMod += cbpop.getText() + "\n";
        if (cbklasik.isChecked()) hasilMod += cbklasik.getText() + "\n";
        if (cbrock.isChecked()) hasilMod += cbrock.getText() + "\n";

        if (hasilMod.length() == startlen) hasilMod += "Tidak ada pada Pilihan";
        HasilAM.setText(hasilMod);

        HasilJP.setText("Jenjang Pendidikan :\n" + spJP.getSelectedItem());
    }

}
