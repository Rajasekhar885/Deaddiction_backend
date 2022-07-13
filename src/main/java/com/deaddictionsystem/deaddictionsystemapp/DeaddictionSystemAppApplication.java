package com.deaddictionsystem.deaddictionsystemapp;

import com.deaddictionsystem.deaddictionsystemapp.model.*;
import com.deaddictionsystem.deaddictionsystemapp.service.IPatientService;
import com.deaddictionsystem.deaddictionsystemapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DeaddictionSystemAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DeaddictionSystemAppApplication.class, args);
	}

	@Autowired
	private IUserService userService;

	@Autowired
	private IPatientService patientService;

	@Override
	public void run(String... args) throws Exception {

		User user= new User("Ajay Kumar", Role.DOCTOR,"Ajayk","AjayK@gmail.com","password");

//		userService.addUser(user);

//		System.out.println(userService.getUserByEmail("VijayK@gmail.com"));

//		Medication	medication1 = new Medication(("Paracetmol"));
//		Set<Medication> medication =new HashSet<>(Arrays.asList(medication1));
//
//		Patient patient = new Patient("Francis","DAD000001",32,Gender.MALE,"Francis007@gmail.com","9998887776", Addictiontype.GAMBLING);
//
//		patientService.addPatient(patient);
//
//
		Patient patient1;
//

//		patient1= patientService.getPatientsByFollowUpDate("");
//
		System.out.println("asdf");

//		System.out.println(patientService.getPatientsByFollowUpDate("2022-07-25"));

//		patient1.setAge(20);
//		patientService.updatePatient(patient1);
//		System.out.println(patient1);
	}
}
