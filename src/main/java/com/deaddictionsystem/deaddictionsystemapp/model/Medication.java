//package com.deaddictionsystem.deaddictionsystemapp.model;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//import javax.persistence.*;
//
//@Getter
//@Setter
//@Entity
//@NoArgsConstructor
//@ToString
//public class Medication {
//    @Id
//    @GeneratedValue(generator = "medication_seq", strategy = GenerationType.AUTO)
//    @SequenceGenerator(name = "medication_seq", sequenceName = "medication_seq", initialValue = 1, allocationSize = 1)
//    @Column(name = "medicineId")
//    private Integer medicineId;
//
//
//    private String medicineName;
//
//
//    public Medication( String medicineName) {
//        this.medicineName = medicineName;
//    }
//
//}