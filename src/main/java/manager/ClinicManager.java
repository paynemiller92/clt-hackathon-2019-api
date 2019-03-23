package manager;

import dao.ClinicDao;
import model.Clinic;

import java.util.List;

public class ClinicManager {

    private ClinicDao dao;

    public List<Clinic> getAll() {
        return dao.getAll();
    }

    public boolean create(Object object) {
        return dao.create();
    }

    public Object update(Object object) {
        return dao.update(object);
    }

    public boolean delete(Object object) {
        return dao.delete(object);
    }

    public ClinicDao getDao() {
        return dao;
    }

    public void setDao(ClinicDao dao) {
        this.dao = dao;
    }
}
