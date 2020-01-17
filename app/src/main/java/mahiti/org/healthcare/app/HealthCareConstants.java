package mahiti.org.healthcare.app;

import mahiti.org.healthcare.utils.SessionManager;

public class HealthCareConstants {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "HealthcareDb";
    public static final SessionManager SESSION_MANAGER=new SessionManager(HealthCareApplication.getContext());
}
