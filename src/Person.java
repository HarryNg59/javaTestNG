import java.time.Year;

public class Person {
    private int personID;
    private String fullName;
    private int yOB;
    private String placeOfBirth;
    private String gender;
    private String email;
    private String phoneNumber;
    private String nationality;

    public Person() {
    }

    public Person(int personID, String fullName, int yOB, String placeOfBirth, String gender, String email,
            String phoneNumber, String nationality) {
        this.personID = personID;
        this.fullName = fullName;
        this.yOB = yOB;
        this.placeOfBirth = placeOfBirth;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
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

    public boolean isAdult(){
        if(Year.now().getValue() - yOB > 17) return true;
        return false;
    }

    public int getAge() {
        return (Year.now().getValue() - yOB);
    }

    public void displayInfo() {
        System.out.println("ID: " + personID);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + yOB + " (Tuổi: " + getAge() + ")");
        System.out.println("Nơi sinh: " + placeOfBirth);
        System.out.println("Giới tính: " + gender);
    }

    public boolean isValidEmail() {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public boolean isVietnamPhone() {
        return phoneNumber != null && phoneNumber.matches("^\\+84[0-9]{9}$");
    }

    public boolean isVietnamese() {
        return "Vietnam".equalsIgnoreCase(nationality);
    }
}
