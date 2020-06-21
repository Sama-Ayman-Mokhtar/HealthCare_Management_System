package sample;

// This class performs most of the logic behind the program
import java.util.ArrayList;
import java.util.Iterator;
public class HC {
        static ArrayList<Doctor> arrDoctor = new ArrayList<>();
        static ArrayList<EPatient> arrEmergency = new ArrayList<>();
        static ArrayList<NPatient> arrNormal = new ArrayList<>();


        static void addDoctor( String name,String phoneNo, String address,Speciality speciality, ArrayList<String> appointment){
                arrDoctor.add(new Doctor( name, phoneNo, address, speciality,appointment));
        }

        static void addDoctor( String name,String phoneNo, String address,Speciality speciality){
                arrDoctor.add(new Doctor( name, phoneNo, address, speciality));
        }
        static void addNPatient( String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis ){
                arrNormal.add(new NPatient( name, phoneNo, address, gender, paymentMethod, symptoms, diagnosis));
        }
        static void addEPatient( String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis, String roomNo ){
                arrEmergency.add(new EPatient( name, phoneNo, address, gender, paymentMethod, symptoms, diagnosis, roomNo));
        }
        static void editDoctor(String id, String name,String phoneNo, String address,Speciality speciality){
                //Note that ID can never change it's the means to recognize the object
                for (Doctor d : arrDoctor) {
                        if( id.compareTo(d.getId()) == 0){
                                d.setName(name);
                                d.setPhoneNo(phoneNo);
                                d.setAddress( address);
                                d.setSpeciality(speciality);
                                break;
                        }
                }

        }
        static void addAppointment(String id , String appointment){
                for (Doctor d : arrDoctor) {
                        if( id.compareTo(d.getId()) == 0){
                                d.appointment.add(appointment);
                                break;
                        }
                }
        }
        static void editNPatient(String id, String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis ){
               //Note that ID can never change it's the means to recognize the object
                for (NPatient n : arrNormal) {
                        if( id.compareTo(n.getId()) == 0){
                                n.setName(name);
                                n.setPhoneNo(phoneNo);
                                n.setAddress(address);
                                n.setGender(gender);
                                n.setPaymentMethod(paymentMethod);
                                n.setSymptoms(symptoms);
                                n.setDiagnosis(diagnosis);
                                break;
                        }
                }

        }
        static void editEPatient(String id, String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis,String roomNo ){
               //Note that ID can never change it's the means to recognize the object
                for (EPatient e : arrEmergency) {
                        if( id.compareTo(e.getId()) == 0){
                                e.setName(name);
                                e.setPhoneNo(phoneNo);
                                e.setAddress(address);
                                e.setGender(gender);
                                e.setPaymentMethod(paymentMethod);
                                e.setSymptoms(symptoms);
                                e.setDiagnosis(diagnosis);
                                e.setRoomNo(roomNo);
                                break;
                        }
                }

        }
        static void displayDoctor(){
                if(arrDoctor.size() != 0){
                        for (Doctor d :arrDoctor) {
                        System.out.println("------------------------------Doctor ----------------------------");
                        System.out.println("My id: " + d.getId());
                        System.out.println("My name: " + d.getName());
                        System.out.println("My phoneNo: " + d.getPhoneNo());
                        System.out.println("My address: " + d.getAddress());
                        System.out.println("My speciality: " + d.getSpeciality());
                        int sz = d.appointment.size();
                                for (int i = 0; i < sz ; i++) {
                                        System.out.println("Appointment " + (i + 1) + " : " + d.appointment.get(i));
                                }
                }
                }
                else{
                        System.out.println("Doctors' Array is Empty!");
                }

        }
        static void displayNPatient(){
                if(arrNormal.size() != 0){
                        for (NPatient n :arrNormal) {
                        System.out.println("--------------------------Normal Patient ----------------------------");
                        System.out.println("My id: " + n.getId());
                        System.out.println("My name: " + n.getName());
                        System.out.println("My phoneNo: " + n.getPhoneNo());
                        System.out.println("My address: " + n.getAddress());
                        System.out.println("My gender: " + n.getGender());
                        System.out.println("My payment method: " + n.getPaymentMethod());
                        System.out.println("My symptoms: "+ n.getSymptoms());
                        System.out.println("My diagnosis: "+ n.getDiagnosis());
                }
                }
                else{
                        System.out.println("Normal Patients' Array is Empty!");
                }

        }
        static void displayEPatient(){
                if(arrEmergency.size() != 0){
                        for (EPatient e :arrEmergency) {
                        System.out.println("--------------------------Emergency Patient ----------------------------");
                        System.out.println("My id: " + e.getId());
                        System.out.println("My name: " + e.getName());
                        System.out.println("My phoneNo: " + e.getPhoneNo());
                        System.out.println("My address: " + e.getAddress());
                        System.out.println("My gender: " + e.getGender());
                        System.out.println("My payment method: " + e.getPaymentMethod());
                        System.out.println("My symptoms: "+ e.getSymptoms());
                        System.out.println("My diagnosis: "+ e.getDiagnosis());
                        System.out.println("My room number: " + e.getRoomNo());
                }
                }
                else{
                        System.out.println("Normal Patients' Array is Empty!");
                }

        }

        static ArrayList<Doctor> getArrSDoctor(Speciality speciality){
                ArrayList<Doctor> arrSDoc = new ArrayList<>();
                for (Doctor d : arrDoctor) {
                        if( d.getSpeciality() == speciality){
                                arrSDoc.add(d);
                        }
                }
                return arrSDoc;
        }
        //test this method
        static Doctor getDoctor(String id){
                Doctor doc = null;
                for (Doctor d : arrDoctor) {
                        if( d.getId() == id){
                                doc = d;
                        }
                }
              return doc;
        }
         static Doctor getBY_NameDoctor(String name){
                Doctor doc = null;
                for (Doctor d : arrDoctor) {
                        if( name.equals(d.getName())){
                                doc = d;
                        }
                }
              return doc;
        }
         static Patient getPatient(String id){
                Patient p = null;
                for (NPatient n : arrNormal) {
                        if( n.getId() == id){
                                p = n;
                        }
                }
                for (EPatient e : arrEmergency) {
                        if( e.getId() == id){
                                p = e;
                        }
                }
              return p;
        }

        static void displayDoctor( ArrayList<Doctor> arrSDoc ){
                if(arrSDoc.size() != 0){
                        for (Doctor d :arrSDoc) {
                        System.out.println("------------------------------Doctor ----------------------------");
                        System.out.println("My id: " + d.getId());
                        System.out.println("My name: " + d.getName());
                        System.out.println("My phoneNo: " + d.getPhoneNo());
                        System.out.println("My address: " + d.getAddress());
                        System.out.println("My speciality: " + d.getSpeciality());
                        int sz = d.appointment.size();
                                for (int i = 0; i < sz ; i++) {
                                        System.out.println("Appointment " + (i + 1) + " : " + d.appointment.get(i));
                                }
                }
                }
                else{
                        System.out.println("Doctors' Array is Empty!");
                }

        }

        /* static public void deleteDoctor(String id){
            Iterator<Doctor> itr = arrDoctor.iterator();
                while(itr.hasNext()){
                    Doctor d = itr.next();
                      if(d.getId().equals(id)) {
                              itr.remove();
                              break;
                      }   }
         }*/
        static public void deleteDoctor(String id){
             for (Doctor d : arrDoctor) {
                        if( d.getId() == id){
                                arrDoctor.remove(d);
                                break;
                        }
                }
        }
        static public void deleteNPatient(String id){
            Iterator<NPatient> itr = arrNormal.iterator();
                while(itr.hasNext()){
                    NPatient n = itr.next();
                      if(n.getId().equals(id)){
                      itr.remove();
                      break;
                 }
         }
         }

        static public void deleteEPatient(String id){
            Iterator<EPatient> itr = arrEmergency.iterator();
                while(itr.hasNext()){
                    EPatient e = itr.next();
                      if(e.getId().equals(id)){
                      itr.remove();
                      break;
                 }
         }
         }
}