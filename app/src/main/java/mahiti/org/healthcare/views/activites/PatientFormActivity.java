package mahiti.org.healthcare.views.activites;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.app.HealthCareConstants;

public class PatientFormActivity extends AppCompatActivity {
    Button btn_continue;
    TextView t1, t2, t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_form);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btn_continue = findViewById(R.id.continue_btn);
        setTitle(HealthCareConstants.SESSION_MANAGER.getHouseNo());
        t1 = findViewById(R.id.patient_name);
        t2 = findViewById(R.id.patient_birthday);
        t3 = findViewById(R.id.patient_gender);
        t1.setText(HealthCareConstants.SESSION_MANAGER.getPatientName());
        t2.setText(HealthCareConstants.SESSION_MANAGER.getPatientAge());
        t3.setText(HealthCareConstants.SESSION_MANAGER.getPatientGender());
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PatientFormActivity.this, PatientFormActivity2.class);
                startActivity(i);
            }
        });


    }

}
