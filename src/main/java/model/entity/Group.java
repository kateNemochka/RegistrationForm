package model.entity;

public enum Group {
    FAMILY("group.family"),
    WORK("group.work"),
    EMERGENCY("group.emergency");

    Group(String name) {
        contactsGroupName = name;
    }

    String contactsGroupName;
}
