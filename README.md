# MedLink Low-Cost Clinics API

This is a fully native, Java-based, RESTful API that provides all of the **publicly facing** MedLink data (taken from their public websites) and serves it up to clients in a RESTful format. 

## Sample Payload
```
[
  {
    "name": "Bethesda Health Center",
    "streetAddress": "133 Steton Dr.",
    "zipCode": "28262",
    "state": "NC",
    "city": "Charlotte",
    "phoneNumber": "+17045965606",
    "faxNumber": "7045967570",
    "url": "https://ncafcc.org/property/bethesda-health-center/",
    "isAppointmentOnly": true,
    "isSpanishSpeaking": true,
    "services": [
      "Primary Medical Care",
      "Mental Health Services",
      "Chronic Disease Management",
      "Lab Services",
      "Ultrasound and EKG"
    ],
    "fee": 10.0,
    "latitude": 35.28825,
    "longitude": -80.76159,
    "imageUrl": "http://geo1.ggpht.com/cbk?panoid=00IiePLuscbPJi1izz7DjA&output=thumbnail&cb_client=unknown_client.imagery_viewer.gps&thumb=2&w=203&h=100&yaw=255.0327&pitch=0&thumbfov=100"
  },
  {
    "name": "Charlotte Community Health Clinic",
    "streetAddress": "8401 Medical Plaza Dr. Suite 300",
    "zipCode": "28262",
    "state": "NC",
    "city": "Charlotte",
    "phoneNumber": "+17048960471",
    "faxNumber": null,
    "url": "http://www.charlottecommunityhealthclinic.org/",
    "isAppointmentOnly": true,
    "isSpanishSpeaking": true,
    "services": [
      "Primary Medical Care",
      "Dental",
      "Behavior Health",
      "Pediatric Care",
      "HIV PrEP",
      "Health Insurance Marketplace",
      "Chronic Disease Management",
      "Acute Episodic Disease Management"
    ],
    "fee": 10.0,
    "latitude": 35.31911,
    "longitude": -80.77673,
    "imageUrl": "https://scontent.fphl2-1.fna.fbcdn.net/v/t31.0-8/10287046_317841215036405_4562738583748576751_o.jpg?_nc_cat=100&_nc_ht=scontent.fphl2-1.fna&oh=7c51cd2eed9b6a6b59a09ce25766bfdb&oe=5D1B1601"
  },
  {
    "name": "Ada Jenkins Center",
    "streetAddress": "212 Gamble Street",
    "zipCode": "28036",
    "state": "NC",
    "city": "Davidson",
    "phoneNumber": "+17048960471",
    "faxNumber": null,
    "url": "http://www.adajenkins.org/",
    "isAppointmentOnly": false,
    "isSpanishSpeaking": true,
    "services": [
      "Primary Medical Care",
      "Dental",
      "Community Health Nursing"
    ],
    "fee": 10.0,
    "latitude": 35.49893,
    "longitude": -80.85376,
    "imageUrl": "https://www.freedentalcare.us/gallery/2672_531059_10150617653346436_1939239266_n.jpg"
  },
  {
    "name": "Lake Norman Community Health Clinic",
    "streetAddress": "14230 Hunters Road",
    "zipCode": "28078",
    "state": "NC",
    "city": "Huntersville",
    "phoneNumber": "+17043166611",
    "faxNumber": "7043166612",
    "url": "http://lnchc.org",
    "isAppointmentOnly": true,
    "isSpanishSpeaking": true,
    "services": [
      "Primary Medical Care",
      "Lab Services",
      "Chronic Disease Management",
      "Acute Episodic Disease Management",
      "Community Health Nursing"
    ],
    "fee": 15.0,
    "latitude": 35.41873,
    "longitude": -80.85557,
    "imageUrl": "http://lnchc.org/wp-content/uploads/2017/04/clinic-exterior.jpg"
  },
  {
    "name": "Matthews Free Medical Clinic",
    "streetAddress": "196 S. Trade St.",
    "zipCode": "28105",
    "state": "NC",
    "city": "Matthews",
    "phoneNumber": "+17048418882",
    "faxNumber": null,
    "url": "http://matthewsfmc.org",
    "isAppointmentOnly": true,
    "isSpanishSpeaking": false,
    "services": [
      "Primary Medical Care",
      "Chronic Disease Management",
      "Acute Episodic Disease Management"
    ],
    "fee": 0.0,
    "latitude": 35.11451,
    "longitude": -80.72417,
    "imageUrl": "https://chambermaster.blob.core.windows.net/images/customers/500/members/423/photos/GALLERY_MAIN/196_Trade_St_pic.jpg'"
  },
  {
    "name": "Shelter Health Services, Inc.",
    "streetAddress": "534 Spratt St. Charlotte,",
    "zipCode": "28206",
    "state": "NC",
    "city": "Charlotte",
    "phoneNumber": "+17043340000",
    "faxNumber": null,
    "url": "http://www.shelterhealthservices.com/home/shelterhealth-home.php",
    "isAppointmentOnly": false,
    "isSpanishSpeaking": false,
    "services": [
      "Primary Medical Care",
      "STD Testing"
    ],
    "fee": 0.0,
    "latitude": 35.23984,
    "longitude": -80.83705,
    "imageUrl": "http://www.shelterhealthservices.com/images/logo.png"
  }
]
```

## Dependencies

- Maven 3
- Java 8
- Servlet 3.0

## Build Instructions
Once you have Maven installed run the following command: `mvn clean install package`. This will produce an `api.war` file fully ready to deploy to a Servlet of your choice!
