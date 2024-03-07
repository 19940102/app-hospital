package ch.net.app_hospi.web;

import ch.net.app_hospi.entities.patient;
import ch.net.app_hospi.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model){
        List<patient> patients =patientRepository.findAll();
        model.addAttribute ("listPatient;s", patients);
        return  "patients";
    }


}


