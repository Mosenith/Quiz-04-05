package edu.miu.cs489.domain;

public class Email {
    private String email;
    private String label;

    public Email(String email, String label) {
        this.email = email;
        this.label = label;
    }

    public Email() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return String.format("Email{email=%s, label=%s", email, label);
    }

    public String toJsonString() {
        return String.format("{\"email\":%s,\"label\":%s}", email, label);
    }
}
