package mahiti.org.healthcare.models;

public class PatientDetailsModel {

    String patientDetail;
    int image;

    public PatientDetailsModel(String s, int imageint) {
        this.patientDetail=s;
        this.image= imageint;
    }

    public String getPatientDetail() {
        return patientDetail;
    }

    public void setPatientDetail(String patientDetail) {
        this.patientDetail = patientDetail;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
