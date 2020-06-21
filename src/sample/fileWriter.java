package sample;

import java.io.File;
import java.io.PrintWriter;

public class fileWriter {
    static PrintWriter write ;
    static void openFile(){
       try{
            File file = new File("Data");

            write = new PrintWriter(file);

        }
        catch (Exception e){
            System.out.println("File not Found! {while writing}");

        }

    }

    static void writeFile(){
        for (Doctor d : HC.arrDoctor) {
            write.print("Doctor ");
            write.print(d.getId()+" ");
            write.print( d.getName()+" ");
            write.print(d.getPhoneNo()+" ");
            write.print(d.getAddress()+" ");
            write.print(d.getSpeciality()+" ");
            int sz = d.appointment.size();
            for (int i = 0; i < sz ; i++) {
                 write.print(d.appointment.get(i)+" ");
            }
            write.println("/");
        }
        for (NPatient n : HC.arrNormal) {
            write.print("NPatient ");
            write.print(n.getId()+" ");
            write.print(n.getName()+" ");
            write.print(n.getPhoneNo()+" ");
            write.print(n.getAddress()+" ");
            write.print(n.getGender()+" ");
            write.print(n.getPaymentMethod()+" ");
            write.print(n.getSymptoms()+" ");
            write.println(n.getDiagnosis());
        }
        for (EPatient e : HC.arrEmergency) {
            write.print("EPatient ");
            write.print(e.getId()+" ");
            write.print(e.getName()+" ");
            write.print(e.getPhoneNo()+" ");
            write.print(e.getAddress()+" ");
            write.print(e.getGender()+" ");
            write.print(e.getPaymentMethod()+" ");
            write.print(e.getSymptoms()+" ");
            write.print(e.getDiagnosis()+" ");
            write.println(e.getRoomNo());

        }
    }
    static void closeFile(){
        write.close();
    }
}
