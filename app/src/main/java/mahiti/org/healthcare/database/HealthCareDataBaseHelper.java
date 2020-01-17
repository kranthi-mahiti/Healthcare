package mahiti.org.healthcare.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static mahiti.org.healthcare.app.HealthCareConstants.DATABASE_NAME;
import static mahiti.org.healthcare.app.HealthCareConstants.DATABASE_VERSION;

public class HealthCareDataBaseHelper extends SQLiteOpenHelper {
    /**
     * @param context
     */
    public HealthCareDataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
