package ch.net.app_hospi.repository;

import ch.net.app_hospi.entities.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<patient, Long> {
}
