package mahiti.org.healthcare.views.activites;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.common.SignInButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.app.HealthCareConstants;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SignInButton signInButton = findViewById(R.id.google_button);
        signInButton.setSize(SignInButton.SIZE_STANDARD);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LoginActivity.this,HomeScreenActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                HealthCareConstants.SESSION_MANAGER.setFirstTimeLaunch(false);
                startActivity(i);
            }
        });
    }

}
