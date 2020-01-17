package mahiti.org.healthcare.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context context;

    // shared pref mode
    private int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "HealthCare";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    private static final String PATIENT_NAME = "patientname";
    private static final String PATIENT_AGE = "patientage";
    private static final String PATIENT_GENDER = "patientgender";
    private static final String HOUSE_NO = "houseno";

    /**
     * @param context
     */
    public SessionManager(Context context) {
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
        editor.apply();
    }

    /**
     * @param isFirstTime
     */
    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    /**
     * @return
     */
    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public void setHouseNo(String houseNo ) {
        editor.putString(HOUSE_NO,  houseNo);
        editor.commit();
    }

    public String getHouseNo() {
        return pref.getString(HOUSE_NO, "");
    }
    public void setPatientName(String name) {
        editor.putString(PATIENT_NAME, name);
        editor.commit();
    }

    public String getPatientName() {
        return pref.getString(PATIENT_NAME, "");
    }

    public void setPatientAge(String patientAge) {
        editor.putString(PATIENT_AGE, patientAge);
        editor.commit();
    }

    public String getPatientAge() {
        return pref.getString(PATIENT_AGE, "");
    }

    public void setPatientGender(String patientGender) {
        editor.putString(PATIENT_GENDER, patientGender);
        editor.commit();
    }

    public String getPatientGender() {
        return pref.getString(PATIENT_GENDER, "");
    }
}
