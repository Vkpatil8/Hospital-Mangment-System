package com.bl.hms;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        int exit = 13;
        int option;
        UserInterface userInterface = new UserInterface();
        Application application = new Application();
        do{
            option = userInterface.ShowMainMenu();
            application.handleUserSelection(option);
        }while (option != exit);
    }

    void handleUserSelection(int option) {
        AppointmentRepo appointmentRepo = AppointmentRepo.getInstance();
        UserInterface userInterface = UserInterface.getInstance();
        DoctorRepo doctorRepo = DoctorRepo.getInstance();
        PatientRepo patientRepo = PatientRepo.getInstance();
        Scanner scanner = new Scanner(System.in);
        switch (option)
        {
            case 1:
                Doctor doctor = userInterface.addDoctor();
                doctorRepo.addDoctor(doctor);
                break;
            case 2:
                System.out.println("Enter Doctor Id ");
                String formUser = scanner.nextLine();
                Doctor updateDoctor = doctorRepo.getDoctor(formUser);
                if(updateDoctor != null){
                    userInterface.updateDoctorDetails(updateDoctor);
                } else {
                    System.out.println("Doctor is not available");
                }
                break;
            case 3:
                System.out.println("Enter Doctor Id ");
                String doctorId = scanner.nextLine();
                Doctor doctorRemove = doctorRepo.getDoctor(doctorId);
                doctorRepo.remove(doctorRemove);
                break;
            case 4:
                List doctorList = doctorRepo.getDoctorList();
                userInterface.printAllDoctor(doctorList);
                break;
            case 5:
                patientRepo.addPatient();
                break;
            case 6:
                System.out.println("Enter patient id");
                String patientID = scanner.next();
                Patient updatePatient = patientRepo.getPatient(patientID);
                if (updatePatient != null ){
                    userInterface.updatePatientDetails(updatePatient);
                } else {
                    System.out.println("Enter correct id");
                }
                break;
            case 7:
                System.out.println("Enter patient Id ");
                String patientId = scanner.nextLine();
                Patient patientRemove = patientRepo.getPatient(patientId);
                patientRepo.remove(patientRemove);
                break;
            case 8:
                List lstPatient = patientRepo.getPatientList();
                userInterface.printAllPatient(lstPatient);
                break;
            case 9:
                appointmentRepo.addAppointment();
                break;
            case 10:
                System.out.println("Enter appointment id");
                String appointmentId = scanner.next();
                Appointment updateAppointment = appointmentRepo.getAppointment(appointmentId);
                if (updateAppointment != null ){
                    userInterface.updateAppointmentDetails(updateAppointment);
                } else {
                    System.out.println("Enter correct id");
                }
            case 11:
                System.out.println("Enter Appointment Id");
                String appointmentID = scanner.next();
                Appointment appointment = appointmentRepo.getAppointment(appointmentID);
                appointmentRepo.remove(appointment);
                break;
            case 12:
                List listAppointment = appointmentRepo.getAppointmentList();
                userInterface.printAllAppointment(listAppointment);
                break;
            case 13:
                break;
            default:
                System.out.println("Wrong Option..!");
                break;
        }
    }
}

