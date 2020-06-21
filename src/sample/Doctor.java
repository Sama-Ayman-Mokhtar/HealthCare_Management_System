package sample;

import java.util.ArrayList;

public class Doctor extends Person {
   //static variable for generating id's automatically

    static int noOfDoctors = 1000;
    private Speciality speciality;
    ArrayList<String> appointment ;

    Doctor( String name,String phoneNo, String address,Speciality speciality, ArrayList<String> appointment ){
        super(String.valueOf(noOfDoctors ++),name, address, phoneNo );

        this.speciality = speciality;
        this.appointment = appointment;

    }
    //Recently Added
    Doctor( String name,String phoneNo, String address,Speciality speciality){
        super(String.valueOf(noOfDoctors ++),name, address, phoneNo );

        this.speciality = speciality;
        this.appointment = new ArrayList<>();

    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}