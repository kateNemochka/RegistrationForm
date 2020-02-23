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
    private Date additionDate;
    private Date modificationDate;


    private enum Group {FAMILY, WORK, EMERGENCY, ALL}

    public Note(String firstName, String secondName, String lastName, String nickname,
                String homePhone, String mobilePhone1, String mobilePhone2,
                String postalCode, String city, String street, String houseNumber, String apartmentNumber,
                String comment) {

    }


}