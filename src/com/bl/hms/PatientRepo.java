package com.bl.hms;

import java.util.*;

public class PatientRepo {
    public static PatientRepo instance;
    List <Patient>patientList = new ArrayList();
    UserInterface userInterface = UserInterface.getInstance();

    public static PatientRepo getInstance(){
        if( instance == null ){
            instance = new PatientRepo();
        }
        return instance;
    }
    void addPatient() {
        Patient patient = userInterface.addPatient();
        patientList.add(patient);
    }

    List getPatientList() {
        return  patientList;
    }

    public boolean isPatientAvailable(String doctorId){
        for (int i = 0; i < patientList.size(); i++ ){
            if( patientList.get(i).patientId.equals(doctorId)){
                return true;
            }
        }
        return false;
    }

    public Patient getPatient(String id) {
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).patientId.equals(id)) {
                return patientList.get(i);
            }
        }
        return null;
    }

    public void remove(Patient patientRemove) {
        patientList.remove(patientRemove);
    }
}

