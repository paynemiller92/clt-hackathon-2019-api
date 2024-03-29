package factory;

import model.Clinic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClinicFactory {

    private static final String PRIMARY_MEDICAL_CARE = "Primary Medical Care";
    private static final String DENTAL = "Dental";
    private static final String BEHAVIORAL_HEALTH = "Behavior Health";
    private static final String PEDIATRIC_CARE = "Pediatric Care";
    private static final String HIV_PREP = "HIV PrEP";
    private static final String HEALTH_INSURANCE_MARKETPLACE = "Health Insurance Marketplace";
    private static final String MENTAL_HEALTH_SERVICES = "Mental Health Services";
    private static final String CHRONIC_DISEASE_MANAGEMENT = "Chronic Disease Management";
    private static final String ACUTE_EPISODIC_DISEASE_MANAGEMENT = "Acute Episodic Disease Management";
    private static final String LAB_SERVICES = "Lab Services";
    private static final String ULTRASOUND_AND_EKG = "Ultrasound and EKG";
    private static final String STD_TESTING = "STD Testing";
    private static final String COMMUNITY_HEALTH_NURSING = "Community Health Nursing";

    public static List<Clinic> createClinics() {
        List<Clinic> clinics = new ArrayList<>();
        clinics.add(createBethesdaClinic());
        clinics.add(createCharlotteCommunityHealthClinic());
        clinics.add(createAdaJenkinsCenter());
        clinics.add(createLakeNormanCommunityHealthClinic());
        clinics.add(createMatthewsFreeMedicalClinic());
        clinics.add(createShelterHealthServices());
        return clinics;
    }

    private static Clinic createBethesdaClinic() {
        return new Clinic.Builder()
                .setName("Bethesda Health Center")
                .setCity("Charlotte")
                .setStreetAddress("133 Steton Dr.")
                .setZipCode("28262")
                .setPhoneNumber("+17045965606")
                .setFaxNumber("7045967570")
                .setIsAppointmentOnly(true)
                .setState("NC")
                .setUrl("https://ncafcc.org/property/bethesda-health-center/")
                .setImageUrl("http://geo1.ggpht.com/cbk?panoid=00IiePLuscbPJi1izz7DjA&output=thumbnail&cb_client=unknown_client.imagery_viewer.gps&thumb=2&w=203&h=100&yaw=255.0327&pitch=0&thumbfov=100")
                .setFee(10.0)
                .setServices(Arrays.asList(PRIMARY_MEDICAL_CARE, MENTAL_HEALTH_SERVICES, CHRONIC_DISEASE_MANAGEMENT, LAB_SERVICES, ULTRASOUND_AND_EKG))
                .setIsSpanishSpeaking(true)
                .setLatitude(35.288250)
                .setLongitude(-80.761590)
                .build();
    }

    private static Clinic createCharlotteCommunityHealthClinic() {
        return new Clinic.Builder()
                .setName("Charlotte Community Health Clinic")
                .setCity("Charlotte")
                .setStreetAddress("8401 Medical Plaza Dr. Suite 300")
                .setZipCode("28262")
                .setPhoneNumber("+17048960471")
                .setFaxNumber(null)
                .setIsAppointmentOnly(true)
                .setState("NC")
                .setUrl("http://www.charlottecommunityhealthclinic.org/")
                .setImageUrl("https://scontent.fphl2-1.fna.fbcdn.net/v/t31.0-8/10287046_317841215036405_4562738583748576751_o.jpg?_nc_cat=100&_nc_ht=scontent.fphl2-1.fna&oh=7c51cd2eed9b6a6b59a09ce25766bfdb&oe=5D1B1601")
                .setFee(10.0)
                .setServices(Arrays.asList(PRIMARY_MEDICAL_CARE, DENTAL, BEHAVIORAL_HEALTH, PEDIATRIC_CARE, HIV_PREP, HEALTH_INSURANCE_MARKETPLACE, CHRONIC_DISEASE_MANAGEMENT, ACUTE_EPISODIC_DISEASE_MANAGEMENT))
                .setIsSpanishSpeaking(true)
                .setLatitude(35.319110)
                .setLongitude(-80.776730)
                .build();
    }

    private static Clinic createAdaJenkinsCenter() {
        return new Clinic.Builder()
                .setName("Ada Jenkins Center")
                .setCity("Davidson")
                .setStreetAddress("212 Gamble Street")
                .setZipCode("28036")
                .setPhoneNumber("+17048960471")
                .setFaxNumber(null)
                .setIsAppointmentOnly(false)
                .setState("NC")
                .setUrl("http://www.adajenkins.org/")
                .setImageUrl("https://www.freedentalcare.us/gallery/2672_531059_10150617653346436_1939239266_n.jpg")
                .setFee(10.0)
                .setServices(Arrays.asList(PRIMARY_MEDICAL_CARE, DENTAL, COMMUNITY_HEALTH_NURSING))
                .setIsSpanishSpeaking(true)
                .setLatitude(35.498930)
                .setLongitude(-80.853760)
                .build();
    }

    private static Clinic createLakeNormanCommunityHealthClinic() {
        return new Clinic.Builder()
                .setName("Lake Norman Community Health Clinic")
                .setCity("Huntersville")
                .setStreetAddress("14230 Hunters Road")
                .setZipCode("28078")
                .setPhoneNumber("+17043166611")
                .setFaxNumber("7043166612")
                .setIsAppointmentOnly(true)
                .setState("NC")
                .setUrl("http://lnchc.org")
                .setImageUrl("http://lnchc.org/wp-content/uploads/2017/04/clinic-exterior.jpg")
                .setFee(15.0)
                .setServices(Arrays.asList(PRIMARY_MEDICAL_CARE, LAB_SERVICES, CHRONIC_DISEASE_MANAGEMENT, ACUTE_EPISODIC_DISEASE_MANAGEMENT, COMMUNITY_HEALTH_NURSING))
                .setIsSpanishSpeaking(true)
                .setLatitude(35.418730)
                .setLongitude(-80.855570)
                .build();
    }

    private static Clinic createMatthewsFreeMedicalClinic() {
        return new Clinic.Builder()
                .setName("Matthews Free Medical Clinic")
                .setCity("Matthews")
                .setStreetAddress("196 S. Trade St.")
                .setZipCode("28105")
                .setPhoneNumber("+17048418882")
                .setFaxNumber(null)
                .setIsAppointmentOnly(true)
                .setState("NC")
                .setUrl("http://matthewsfmc.org")
                .setImageUrl("https://chambermaster.blob.core.windows.net/images/customers/500/members/423/photos/GALLERY_MAIN/196_Trade_St_pic.jpg'")
                .setFee(0.0)
                .setServices(Arrays.asList(PRIMARY_MEDICAL_CARE, CHRONIC_DISEASE_MANAGEMENT, ACUTE_EPISODIC_DISEASE_MANAGEMENT))
                .setIsSpanishSpeaking(false)
                .setLatitude(35.114510)
                .setLongitude(-80.724170)
                .build();
    }

    private static Clinic createShelterHealthServices() {
        return new Clinic.Builder()
                .setName("Shelter Health Services, Inc.")
                .setCity("Charlotte")
                .setStreetAddress("534 Spratt St. Charlotte,")
                .setZipCode("28206")
                .setPhoneNumber("+17043340000")
                .setFaxNumber(null)
                .setIsAppointmentOnly(false)
                .setState("NC")
                .setUrl("http://www.shelterhealthservices.com/home/shelterhealth-home.php")
                .setImageUrl("http://www.shelterhealthservices.com/images/logo.png")
                .setFee(0.0)
                .setServices(Arrays.asList(PRIMARY_MEDICAL_CARE, STD_TESTING))
                .setIsSpanishSpeaking(false)
                .setLatitude(35.239840)
                .setLongitude(-80.837050)
                .build();
    }
}
