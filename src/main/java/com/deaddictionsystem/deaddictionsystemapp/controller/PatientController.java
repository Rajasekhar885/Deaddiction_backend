package com.deaddictionsystem.deaddictionsystemapp.controller;

import com.deaddictionsystem.deaddictionsystemapp.model.Patient;
import com.deaddictionsystem.deaddictionsystemapp.model.User;
import com.deaddictionsystem.deaddictionsystemapp.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/patient-api")
public class PatientController {

    private IPatientService patientService;

    @Autowired
    public void setPatientService(IPatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/patient")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc", "adding new patient");
        Patient npatient = patientService.addPatient(patient);
        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(npatient);
    }

    @PutMapping("/update/patient")
    public ResponseEntity<Void> updatePatient(@RequestBody Patient patient) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc", "updating patient info");
        patientService.updatePatient(patient);
        return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).build();
    }

    @PatchMapping("/patch/patient")
    public ResponseEntity<Void> patchPatient(@RequestBody Patient patient) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc", "patch patient info");
        patientService.patchPatient(patient);
        return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).build();
    }

    @GetMapping("/patients")
    public ResponseEntity<List<Patient>>getAllPatients(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc", "Getting all Patients");
        List<Patient> patients = patientService.getAllPatients();
        ResponseEntity<List<Patient>> patientResponse = new ResponseEntity(patients, headers, HttpStatus.OK);
        return patientResponse;
    }

    @GetMapping("/patient/id/{patientId}")
    ResponseEntity<Patient> getPatientById(@PathVariable("patientId") int patientId) {
        HttpHeaders headers = new HttpHeaders();
        Patient patient = patientService.getPatientById(patientId);
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(patient);
    }

    @GetMapping("/patients/followup/{nextFollowup}")
    public ResponseEntity<List<Patient>>getPatientsByFollowupDate(@PathVariable("nextFollowup") String nextFollowup){
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc", "Getting Patients by followup date");
        List<Patient> patients = patientService.getPatientsByFollowUpDate(nextFollowup);
        ResponseEntity<List<Patient>> patientResponse = new ResponseEntity(patients, headers, HttpStatus.OK);
        return patientResponse;
    }

    @GetMapping("/patients/mail/{mail}")
    public ResponseEntity<List<Patient>>getPatientsByMail(@PathVariable("mail") String mail){
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc", "Getting Patients by mail");
        List<Patient> patients = patientService.getPatientsByMail(mail);
        ResponseEntity<List<Patient>> patientResponse = new ResponseEntity(patients, headers, HttpStatus.OK);
        return patientResponse;
    }
}
