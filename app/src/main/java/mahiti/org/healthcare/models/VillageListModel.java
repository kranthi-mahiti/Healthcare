package mahiti.org.healthcare.models;

public class VillageListModel {


    private String numberOfpeoples;
    private String name;

    public VillageListModel(String s, String i) {
        this.numberOfpeoples=i;
        this.name=s;
    }

    public String getNumberOfpeoples() {
        return numberOfpeoples;
    }

    public void setNumberOfpeoples(String numberOfpeoples) {
        this.numberOfpeoples = numberOfpeoples;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
