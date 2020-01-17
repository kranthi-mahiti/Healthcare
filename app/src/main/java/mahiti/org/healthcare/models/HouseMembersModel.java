package mahiti.org.healthcare.models;

public class HouseMembersModel {

    private String name;
    private String gender;
    private String age;

    public HouseMembersModel(String sanjay, String s, String male) {
        this.name=sanjay;
        this.gender=male;
        this.age=s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
