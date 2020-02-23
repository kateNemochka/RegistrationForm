package model;

import java.util.ArrayList;
import java.util.Date;

public class Note {
    // NAME
    private String firstName;
    private String secondName;
    private String lastName;
    private String surnameAndInitials;
    private String nickname;

    // CONTACTS
    private String homePhone;
    private String mobilePhone1;
    private String mobilePhone2;

    // ADDRESS
    private String postalCode;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String fullAddress;

    // NOTE INFO
    private String comment;
    private ArrayList<Group> groups;

    // MODIFICATION DATES
    private Date creationDate;
    private Date modificationDate;


    public Note(String firstName, String secondName, String lastName, String nickname,
                String homePhone, String mobilePhone1, String mobilePhone2,
                String postalCode, String city, String street, String houseNumber, String apartmentNumber,
                String fullAddress, String comment) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.homePhone = homePhone;
        this.mobilePhone1 = mobilePhone1;
        this.mobilePhone2 = mobilePhone2;
        this.postalCode = postalCode;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.fullAddress = fullAddress;
        this.comment = comment;

        surnameAndInitials = lastName + " " + firstName + "." + (secondName==null ? "" : secondName + ".");
        groups = new ArrayList<Group>();
        groups.add(Group.ALL);

        creationDate = new Date();
        modificationDate = new Date();

    }

    public void addGroup(Group group) {
        groups.add(group);
    }



}