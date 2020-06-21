package sample;

public class EPatient extends Patient {
    private String roomNo;

   //static variable for generating id's automatically
    static int noOfEPatients = 550;

    EPatient( String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis, String roomNo ){

        super(String.valueOf(noOfEPatients ++), name , address, phoneNo, gender, paymentMethod,symptoms,diagnosis);

        this.roomNo = roomNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
}