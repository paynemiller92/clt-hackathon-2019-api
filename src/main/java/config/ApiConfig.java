package config;

import controller.ClinicController;
import dao.ClinicDao;
import manager.ClinicManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class ApiConfig {
    @Bean
    public ClinicDao clinicDao() {
        return new ClinicDao();
    }

    @Bean
    public ClinicManager clinicManager() {
        ClinicManager manager = new ClinicManager();
        manager.setDao(clinicDao());
        return manager;
    }

    @Bean
    public ClinicController clinicController() {
        ClinicController clinicController = new ClinicController();
        clinicController.setManager(clinicManager());
        return clinicController;
    }
}
