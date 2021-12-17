package com.bl.hms;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public int ShowMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hospital Management System");
        System.out.println("1.Add Doctor \n2.Update Doctor \n3.Delete Doctor" +
                "\n4.Print All Doctor \n5.Add Patient \n6.Update Patient \n" +
                "7.Delete Patient \n8.Print All Patient9.Add Appointment\n " +
                "10.Update Appointment\n 11.Delete Appointment\n " +
                "12.Print All Appointment \n13.Exit");

        System.out.println("Select Your Option :");
        return scanner.nextInt();
    }

    public void printAllDoctor(List doctorList) {
        for (int i = 0; i < doctorList.size(); i++) {
            System.out.println(doctorList.get(i));
        }
    }

    public void printAllPatient(List patientList) {
        for (int i = 0; i < patientList.size(); i++) {
            System.out.println(patientList.get(i));
        }
    }
    public void printAllAppointment(List appointmentList) {
        for (int i = 0; i < appointmentList.size(); i++) {
            System.out.println(appointmentList.get(i));
        }
    }
}

