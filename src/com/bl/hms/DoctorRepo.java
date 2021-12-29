package com.bl.hms;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepo {
    public static DoctorRepo instance;
    private List<Doctor> doctorList = new ArrayList();

    DoctorRepo() {
    }

    public static DoctorRepo getInstance() {
        if (instance == null) {
            instance = new DoctorRepo();
        }
        return instance;
    }

    void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }

    List getDoctorList() {
        return doctorList;
    }

    public boolean isDoctorAvailable(String id) {//10
        for (int i = 0; i < doctorList.size(); i++) {
            if (doctorList.get(i).id.equals(id)) {
                return true;
            }
        }
        return false;
    }

    public Doctor getDoctor(String id) {
        for (int i = 0; i < doctorList.size(); i++) {
            if (doctorList.get(i).id.equals(id)) {
                return doctorList.get(i);
            }
        }
        return null;
    }

    public void remove(Doctor doctor) {
        doctorList.remove(doctor);
    }
}

