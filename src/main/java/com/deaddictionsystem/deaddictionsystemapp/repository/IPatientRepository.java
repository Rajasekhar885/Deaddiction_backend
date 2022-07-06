package com.deaddictionsystem.deaddictionsystemapp.repository;

import com.deaddictionsystem.deaddictionsystemapp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IPatientRepository extends JpaRepository<Patient,Integer> {

    @Query("from Patient p where p.gender=?1")
    List<Patient> findPatientByGender(String gender);

    @Query("from Patient p where p.contactNumber LIKE %?1%")
    List<Patient> findPatientByContactNumber(String contactNumber);

    @Query("from Patient p where p.medication LIKE %?1%")
    List<Patient> findPatientByMedication(String medication);

    @Query("from Patient p where p.checkIn = ?1")
    List<Patient> findPatientByCheckIn(LocalDateTime checkIn);

    @Query("from Patient p where p.nextFollowup = ?1")
    List<Patient> findPatientByNextFollowup(LocalDateTime nextFollowup);

}
