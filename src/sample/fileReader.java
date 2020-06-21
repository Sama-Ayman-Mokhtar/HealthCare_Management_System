package sample;
//This Class Does All of The Necessary Work Of Reading a Text File
// and Initiating Objects to Be Used by The Program Later
//Using File Reader ALong With File Writer
// Helps Us to Not Loose the Data After Closing The Program
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class fileReader {
    static Scanner scan;

    static void openFile(){
        try{
            File file = new File("Data");
            scan = new Scanner(file);

        }
        catch (Exception e){
            System.out.println("File not Found!");

        }

    }
    static void readFile(){
        while(scan.hasNext()){
            switch (scan.next()){
                case "Doctor":
                    String id = scan.next(); String name = scan.next(); String phoneNO = scan.next();
                    String address = scan.next(); Speciality speciality = Speciality.valueOf(scan.next());
                     ArrayList<String> arrAppointment = new ArrayList<>();
                    while(true){
                      String x = scan.next();
                      if(x.compareTo("/") == 0){
                          break;
                      }
                      else{
                          arrAppointment.add(x);
                      }
                    }
                    HC.addDoctor(name,phoneNO,address,speciality, arrAppointment );
                    break;
                case "EPatient":
                    scan.next();
                     HC.addEPatient(scan.next(),scan.next(),scan.next(),scan.next(),scan.next(), scan.next(),scan.next(),scan.next());
                    break;
                case "NPatient":
                    scan.next();
                     HC.addNPatient(scan.next(),scan.next(),scan.next(),scan.next(),scan.next(), scan.next(),scan.next());
                    break;
                    default:
                        System.out.println("none");

            }
            if(scan.hasNext())
                scan.nextLine();
        }

    }
    static void closeFile(){
        scan.close();
    }
}