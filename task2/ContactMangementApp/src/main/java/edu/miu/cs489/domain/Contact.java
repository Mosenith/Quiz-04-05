package edu.miu.cs489.domain;

import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<Phone> phoneList;
    private List<Email> emailList;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public Contact(String firstName, String lastName, String company, String jobTitle, List<Phone> phoneList, List<Email> emailList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneList = phoneList;
        this.emailList = emailList;
    }

    public Contact() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public List<Email> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<Email> emailList) {
        this.emailList = emailList;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phones=" + phoneList +
                ", emails=" + emailList +
                '}';
    }

    public String toJsonString() {
        // get string of phones
        StringBuilder phonesString = new StringBuilder();
        phonesString.append("[");
        if(phoneList != null) {
            for (Phone phone : phoneList) {
                phonesString.append(phone.toJsonString());
            }
        }
        phonesString.append("]");


        StringBuilder emailsString = new StringBuilder();
        emailsString.append("[");
        if(emailList != null) {
            for (Email email : emailList) {
                emailsString.append(email.toJsonString());
            }
        }
        emailsString.append("]");

        return String.format("\t{\"firstName\":%s, \"lastName\":%s, \"company\":%s, " +
                        "\"jobTitle\":%s, \"phones\":%s, \"emails\":%s}",
                firstName, lastName, company, jobTitle, phonesString, emailsString);
    }
}
