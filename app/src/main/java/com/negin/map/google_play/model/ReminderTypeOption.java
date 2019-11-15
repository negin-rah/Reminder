package com.negin.map.google_play.model;

/**
 * Created by morteza on 11/15/19.
 */

public enum ReminderTypeOption {

    Celebration(1, "Celebration"),
    University(2, "University"),
    Priority(3, "Priority"),
    Work(4, "Work"),
    Personal(5, "Personal"),
    Shopping(6, "Shopping");

    private final int id;
    private final String name;

    ReminderTypeOption(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public static ReminderTypeOption getById(int id){
        for(ReminderTypeOption t : ReminderTypeOption.values()){
            if (t.id == id){
                return t;
            }
        }

        return Personal;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
