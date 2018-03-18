package se62120.fpt.edu.vn.iattendance.models;

import java.io.Serializable;

/**
 * Created by MrDat on 17/03/2018.
 */

public class StudentGroup implements Serializable{
    private String id;
    private String name;

    public StudentGroup(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
