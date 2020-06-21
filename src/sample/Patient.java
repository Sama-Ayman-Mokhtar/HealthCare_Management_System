package sample;

public abstract class Patient extends Person {
    private String gender;
    private String paymentMethod;
    private String symptoms;
    private String diagnosis;


    public Patient(String id, String name, String address, String phoneNo, String gender, String paymentMethod, String symptoms, String diagnosis) {
        super(id, name, address, phoneNo);
        this.gender = gender;
        this.paymentMethod = paymentMethod;
        this.symptoms = symptoms;
        this.diagnosis = diagnosis;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }



}