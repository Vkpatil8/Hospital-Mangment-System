package com.bl.hms;

import java.util.ArrayList;
import java.util.List;

public class PatientRepo {

    List <Patient>patientList = new ArrayList();

    void addPatient(Patient p)
    {
        patientList.add(p);
    }

    List getPatientList()
    {
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
}

