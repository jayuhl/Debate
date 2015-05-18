package me.mark.debate;

/**
 * Created by volkovma on 5/13/15.
 */
public class Student {
    private String name;
    private String school_ID;

    public Student(String name, String school_ID) {
        this.name = name;
        this.school_ID = school_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool_ID() {
        return school_ID;
    }

    public void setSchool_ID(String school_ID) {
        this.school_ID = school_ID;
    }
}
