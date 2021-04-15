package com.mkk.pattens.facade;

public class DoorSecurityPolicy {

    private int id;
    private int personelId;
    private boolean isAuthorized;

    public DoorSecurityPolicy(int id, int personelId, boolean isAuthorized) {
        this.id = id;
        this.personelId = personelId;
        this.isAuthorized = isAuthorized;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonelId() {
        return personelId;
    }

    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    public void save() {
        System.out.println("The door " + this.id + " access is " + (this.isAuthorized?"granted":"not granted")+ " to " +this.personelId);
    }
}
