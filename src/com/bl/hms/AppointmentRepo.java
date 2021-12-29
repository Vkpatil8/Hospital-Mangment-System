package com.bl.hms;

import java.util.ArrayList;
import java.util.List;

public class AppointmentRepo {
    private static AppointmentRepo instance;
    List<Appointment>appointmentList = new ArrayList();
    UserInterface userInterface = UserInterface.getInstance();

    AppointmentRepo(){
    }

    public static AppointmentRepo getInstance(){
        if ( instance == null){
            instance = new AppointmentRepo();
        }
        return instance;
    }

    void addAppointment() {
        Appointment appointment = userInterface.addAppointment();
        appointmentList.add(appointment);
    }

    List getAppointmentList() {
        return appointmentList;
    }

    public Appointment getAppointment(String id) {

        for (int i = 0; i < appointmentList.size(); i++) {
            if(appointmentList.get(i).appointmentId.equals(id)){
                return appointmentList.get(i);
            }
        }
        return null;
    }

    public void remove(Appointment appointment) {
        appointmentList.remove(appointment);
    }
}

