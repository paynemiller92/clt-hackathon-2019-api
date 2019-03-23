package controller;

import manager.ClinicManager;
import model.Clinic;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/clinic")
public class ClinicController {

    private ClinicManager manager;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getAll() {
        List<Clinic> clinics = manager.getAll();
        return new ResponseEntity(clinics, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity create() {
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity update(Object object) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity delete() {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    public ClinicManager getManager() {
        return manager;
    }

    public void setManager(ClinicManager manager) {
        this.manager = manager;
    }
}
