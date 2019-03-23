package dao;

import factory.ClinicFactory;
import model.Clinic;

import java.util.ArrayList;
import java.util.List;

public class ClinicDao {

    public List<Clinic> getAll() {
        return ClinicFactory.createClinics();
    }

    public boolean create() {
        return true;
    }

    public Object update(Object object) {
        return object;
    }

    public boolean delete(Object object) {
        return true;
    }
}
