package mahiti.org.healthcare.models;

public class VillageModel {

    private String villageName;
    private int villageCount;
    private int peopleCount;
    private int lungCount;
    private int blackLungCount;
    private int syringCount;
    private int handCount;
    private String cardColor;

    public VillageModel(String s, int i, int i1, int i2, int i3, int i4, int i5,String cardColor) {
        this.villageName=s;
        this.villageCount=i;
        this.peopleCount=i1;
        this.lungCount=i2;
        this.blackLungCount=i3;
        this.syringCount=i4;
        this.handCount=i5;
        this.cardColor=cardColor;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public int getVillageCount() {
        return villageCount;
    }

    public void setVillageCount(int villageCount) {
        this.villageCount = villageCount;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public int getLungCount() {
        return lungCount;
    }

    public void setLungCount(int lungCount) {
        this.lungCount = lungCount;
    }

    public int getBlackLungCount() {
        return blackLungCount;
    }

    public void setBlackLungCount(int blackLungCount) {
        this.blackLungCount = blackLungCount;
    }

    public int getSyringCount() {
        return syringCount;
    }

    public void setSyringCount(int syringCount) {
        this.syringCount = syringCount;
    }

    public int getHandCount() {
        return handCount;
    }

    public void setHandCount(int handCount) {
        this.handCount = handCount;
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }
}
