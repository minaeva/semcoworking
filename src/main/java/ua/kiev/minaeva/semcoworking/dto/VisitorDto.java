package ua.kiev.minaeva.semcoworking.dto;

import java.util.Objects;

public class VisitorDto {

    private String name;
    private String surname;
    private boolean isSubscribed;
    private int prepaidId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }

    public int getPrepaidId() {
        return prepaidId;
    }

    public void setPrepaidId(int prepaidId) {
        this.prepaidId = prepaidId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisitorDto that = (VisitorDto) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
