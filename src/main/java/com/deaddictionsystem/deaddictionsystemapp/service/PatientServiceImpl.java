package com.deaddictionsystem.deaddictionsystemapp.service;

import com.deaddictionsystem.deaddictionsystemapp.exception.PatientNotFoundException;
import com.deaddictionsystem.deaddictionsystemapp.model.Patient;
import com.deaddictionsystem.deaddictionsystemapp.repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements IPatientService{

    private IPatientRepository patientRepository;

    @Autowired
    public void setPatientRepository(IPatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void patchPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void deletePatient(int patientId) {
        patientRepository.deleteById(patientId);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(int patientId) throws PatientNotFoundException {
        return patientRepository.findById(patientId).orElseThrow(()->{
           throw new PatientNotFoundException() ;
        });
    }

    @Override
    public List<Patient> getPatientsByFollowUpDate(String nextFollowup) {
        return patientRepository.findPatientByNextFollowup(nextFollowup);
    }

    @Override
    public List<Patient> getPatientsByMail(String mail) {
//        return patientRepository.findPatientByNextFollowup(mail);

        List<Patient> patients = patientRepository.findPatientByMail(mail);
        if(patients==null)
            throw new PatientNotFoundException("Not found Patient with this mail");
        return patients;

    }
}
