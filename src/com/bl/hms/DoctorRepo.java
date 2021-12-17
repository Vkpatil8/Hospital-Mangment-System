package com.bl.hms;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepo {

    private List <Doctor>doctorList = new ArrayList();

    void addMethod(Doctor dt)
    {
        doctorList.add(dt);
    }

    List getDoctorList()
    {
        return doctorList;
    }

    public boolean isDoctorAvailable(String id) {
        for (int i = 0; i <= doctorList.size(); i++) {
            if (doctorList.get(i).id.equals(id)) {
                return true;
            }
        }
        return false;
    }
}

