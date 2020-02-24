package model;

import model.entity.Group;
import model.entity.Note;
import model.entity.Notebook;

public class Model {
    public Group groups;
    private Notebook notebook;
    private Note note;

    // NAME
    private String firstName;
    private String secondName;
    private String lastName;
    private String nickname;

    // CONTACTS
    private String email;
    private String skype;
    private String homePhone;
    private String mobilePhone1;
    private String mobilePhone2;

    // ADDRESS
    private String postalCode;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;

    // м. Київ, вул. Володимирська, 60, 01033
    // 60 Volodymyrska street, Kyiv, 01033
    private String fullName;
    private String fullAddress;

    // NOTE INFO
    private String comment;



    public Model() {
        notebook = new Notebook();
    }


    // setters for controller

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public void setMobilePhone1(String mobilePhone1) {
        this.mobilePhone1 = mobilePhone1;
    }

    public void setMobilePhone2(String mobilePhone2) {
        this.mobilePhone2 = mobilePhone2;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public String formFullName() {
        return fullName = lastName + " " + firstName.substring(0,1) + "."
                    + (secondName == null ? "" : (secondName.substring(0,1) + "."));
    }

    public String formFullAddress() {
        return fullAddress = city + ", " + street + ", " + houseNumber + ", "
                            + ((apartmentNumber == null) ? "" : (apartmentNumber + ", "))
                            + postalCode;
    }

    public void addToContactsGroup() {
        note.addGroup(groups);
    }


    public void createNote() {
        note = new Note(firstName, secondName, lastName, nickname,
                email, skype, homePhone, mobilePhone1, mobilePhone2,
                postalCode, city, street, houseNumber, apartmentNumber,
                fullAddress, comment);
    }

    public void addNewNoteToNotebook() {
        notebook.addNewNote(note);
    }

}
