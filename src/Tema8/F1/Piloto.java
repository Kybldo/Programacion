package Tema8.F1;

public class Piloto {

    private int driverId;
    private String code;
    private String forename;
    private String surname;
    private String dateOfBirth;
    private String nationality;
    private String url;

    public Piloto(int driverId, String code, String forename, String surname, String dateOfBirth, String nationality, String url) {

        this.driverId = driverId;
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.url = url;

    }

    public Piloto() {

        this.driverId = 0;
        this.code = "AAA";
        this.forename = "John";
        this.surname = "Doe";
        this.dateOfBirth = "0000-00-00";
        this.nationality = "None";
        this.url = "None";

    }

    @Override
    public String toString() {

        return driverId + " " + code + " " + forename + " " + surname + " " + dateOfBirth + " " + nationality + " " + url;

    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
