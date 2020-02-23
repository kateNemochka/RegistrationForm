package model;

public enum Group {
    FAMILY("group.family"),
    WORK("group.work"),
    EMERGENCY("group.emergency"),
    ALL("group.all");

    Group(String name) {
        contactsGroupName = name;
    }

    String contactsGroupName;
}
