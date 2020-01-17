package mahiti.org.healthcare.app;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import mahiti.org.healthcare.database.HealthCareDataBaseHelper;

public class HealthCareApplication extends Application {
    private static HealthCareApplication instance;

    /**
     *
     */
    public HealthCareApplication() {
        instance = this;
    }

    /**
     * @return
     */
    public static synchronized HealthCareApplication getInstance() {
        return instance;
    }

    /**
     * @return
     */
    public static Context getContext() {
        return instance;
    }


    /**
     * oncreate()
     */
    @Override
    public void onCreate() {
        super.onCreate();
        HealthCareDataBaseHelper mDbHelper = new HealthCareDataBaseHelper(this);
        SQLiteDatabase localdb = mDbHelper.getWritableDatabase();
        mDbHelper.onCreate(localdb);
    }
}
