package mahiti.org.healthcare.models;

public class DiseasesModel {

    String diseaseName;
    int image;

    public DiseasesModel(String s, int imageview) {
        this.diseaseName=s;
        this.image= imageview;
    }


    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
