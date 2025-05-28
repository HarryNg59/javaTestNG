

public class Person {
    private int personID;
    private String fullName;
    private int yOB;
    private String placeOfBirth;
    private String gender;

    public Person() {
    }

    public Person(int personID, String fullName, int yOB, String placeOfBirth, String gender) {
        this.personID = personID;
        this.fullName = fullName;
        this.yOB = yOB;
        this.placeOfBirth = placeOfBirth;
        this.gender = gender;
    }

    public int getPersonID() {
        return personID;
    }
    public void setPersonID(int personID) {
        this.personID = personID;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getyOB() {
        return yOB;
    }
    public void setyOB(int yOB) {
        this.yOB = yOB;
    }
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    
}
