package com.deaddictionsystem.deaddictionsystemapp.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Setter
@Getter
@ToString
public class Patient {
    @Id
    @GeneratedValue(generator = "patient_seq",strategy = GenerationType.AUTO )
    @SequenceGenerator(name="patient_seq",sequenceName = "patient_seq",initialValue = 100,allocationSize = 1)
    @Column(name = "userid")
    private Integer patientId;

    private String patientName;

    private String uniqueId;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String mail;

    private String contactNumber;

    @Enumerated(EnumType.STRING)
    private AddictionType addictionType;

    private LocalDateTime checkIn;

    private LocalDateTime checkOut;

    private LocalDateTime nextFollowup;

    private String medication;

    private String sessionDescription;

    private String followupInfo;

    public Patient() {
    }

    public Patient(String patientName, String uniqueId, Integer age, Gender gender, String mail, String contactNumber, AddictionType addictionType) {
        this.patientName = patientName;
        this.uniqueId = uniqueId;
        this.age = age;
        this.gender = gender;
        this.mail = mail;
        this.contactNumber = contactNumber;
        this.addictionType = addictionType;
    }

    public Patient(String patientName,String uniqueId, Integer age, Gender gender, String mail, String contactNumber, AddictionType addictionType, LocalDateTime checkIn, LocalDateTime checkOut, LocalDateTime nextFollowup, String sessionDescription, String followupInfo) {
        this.patientName = patientName;
        this.uniqueId = uniqueId;
        this.age = age;
        this.gender = gender;
        this.mail = mail;
        this.contactNumber = contactNumber;
        this.addictionType = addictionType;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.nextFollowup = nextFollowup;
        this.sessionDescription = sessionDescription;
        this.followupInfo = followupInfo;
    }
}
