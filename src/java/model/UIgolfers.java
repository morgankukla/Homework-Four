
package model;


public class UIGolfers {
    private int golferID;
    private String golferName;
    private int age;
    private int handicap;
    private String clubBrand;
    
    
     public UIGolfers() {
        this.golferID = 0;
        this.golferName = "";
        this.age = 0;
        this.handicap = 0;
        this.clubBrand = "";
    }
    

    public UIGolfers(int golferID, String golferName, int age, int handicap, String clubBrand) {
        this.golferID = golferID;
        this.golferName = golferName;
        this.age = age;
        this.handicap = handicap;
        this.clubBrand = clubBrand;
    }

    public int getGolferID() {
        return golferID;
    }

    public void setGolferID(int golferID) {
        this.golferID = golferID;
    }

    public String getGolferName() {
        return golferName;
    }

    public void setGolferName(String golferName) {
        this.golferName = golferName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHandicap() {
        return handicap;
    }

    public void setHandicap(int handicap) {
        this.handicap = handicap;
    }

    public String getClubBrand() {
        return clubBrand;
    }

    public void setClubBrand(String clubBrand) {
        this.clubBrand = clubBrand;
    }

    @Override
    public String toString() {
        return "UIGolfers{" + "golferID=" + golferID + ", golferName=" + golferName + ", age=" + age + ", handicap=" + handicap + ", clubBrand=" + clubBrand + '}';
    }
    
}
