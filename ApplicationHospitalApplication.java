package ch.net.app_hospi;

import ch.net.app_hospi.entities.patient;
import ch.net.app_hospi.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ApplicationHospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationHospitalApplication.class, args);
    }
    @Bean
    public CommandLineRunner start(PatientRepository patientRepository){
        return args -> {
            patient p1 =new patient();
            p1.setNom("chakir");
            p1.setPrenom("yassin");
            p1.setScore(100);
            p1.setMalade(false);
            p1.setDateNaissance(new Date());

            patient p2 =new patient(null,"mona","saad",new Date(),12000,false);

            patient p3 =patient.builder()
                    .nom("latia")
                    .prenom("latifa")
                    .dateNaissance(new Date())
                    .build();

            patientRepository.save(p1);
            patientRepository.save(p2);
            patientRepository.save(p3);

            List<patient> patients = patientRepository.findAll();
            patients.forEach(patient ->{
                System.out.println(patient.toString());


            });


        };
    }
}

