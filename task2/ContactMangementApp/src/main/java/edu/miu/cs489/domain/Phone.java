package edu.miu.cs489.domain;

public class Phone {
    private String phoneNumber;
    private String label;

    public Phone(String phoneNumber, String label) {
        this.phoneNumber = phoneNumber;
        this.label = label;
    }

    public Phone() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Phone{phoneNumber=%s, label=%s", label);
    }

    public String toJsonString() {
        return String.format("\"phoneNumber\":%s,\"label\":%s", phoneNumber, label);
    }
}
