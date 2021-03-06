package com.deaddictionsystem.deaddictionsystemapp.service;

import com.deaddictionsystem.deaddictionsystemapp.model.Patient;
import com.deaddictionsystem.deaddictionsystemapp.model.User;

import java.util.List;

public interface IPatientService {

    Patient addPatient(Patient patient);

    void updatePatient(Patient patient);

    void patchPatient(Patient patient);

    void deletePatient(int patientId);

    List<Patient> getAllPatients();

    Patient getPatientById(int patientId);

    List<Patient>getPatientsByFollowUpDate(String nextFollowup);
    List<Patient>getPatientsByMail(String mail);

}
