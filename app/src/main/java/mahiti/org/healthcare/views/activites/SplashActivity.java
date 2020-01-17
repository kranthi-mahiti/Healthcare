package mahiti.org.healthcare.views.activites;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import mahiti.org.healthcare.R;
import mahiti.org.healthcare.app.HealthCareConstants;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        nextActivity();
    }

    public void nextActivity() {
        if (HealthCareConstants.SESSION_MANAGER.isFirstTimeLaunch()) {
            Intent i = new Intent(SplashActivity.this, LoginActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        } else {
            Intent i = new Intent(SplashActivity.this, HomeScreenActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }
    }

}
