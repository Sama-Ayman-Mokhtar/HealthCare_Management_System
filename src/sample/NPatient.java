package sample;

public class NPatient extends Patient {
    //static variable for generating id's automatically
    static int noOfNPatients = 200;


    NPatient( String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis){

        super(String.valueOf(noOfNPatients ++), name , address, phoneNo, gender, paymentMethod,symptoms,diagnosis);

    }
}