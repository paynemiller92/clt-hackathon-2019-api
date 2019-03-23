package model;

import java.util.List;

public class Clinic {
    private String name;
    private String streetAddress;
    private String zipCode;
    private String state;
    private String city;
    private String phoneNumber;
    private String faxNumber;
    private String url;
    private Boolean isAppointmentOnly;
    private Boolean isSpanishSpeaking;
    private List<String> services;
    private Double fee;
    private Double latitude;
    private Double longitude;
    private String imageUrl;

    private Clinic(String name,
                   String streetAddress,
                   String zipCode,
                   String state,
                   String city,
                   String phoneNumber,
                   String faxNumber,
                   String url,
                   Boolean isAppointmentOnly,
                   List<String> services,
                   Double fee,
                   Boolean isSpanishSpeaking,
                   Double latitude,
                   Double longitude,
                   String imageUrl) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.state = state;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.url = url;
        this.isAppointmentOnly = isAppointmentOnly;
        this.services = services;
        this.fee = fee;
        this.isSpanishSpeaking = isSpanishSpeaking;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getUrl() {
        return url;
    }

    public Boolean getIsAppointmentOnly() {
        return isAppointmentOnly;
    }

    public List<String> getServices() {
        return services;
    }

    public Double getFee() {
        return fee;
    }

    public Boolean getIsSpanishSpeaking() {
        return isSpanishSpeaking;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public static class Builder {
        private String name;
        private String streetAddress;
        private String zipCode;
        private String state;
        private String city;
        private String phoneNumber;
        private String faxNumber;
        private String url;
        private Boolean isAppointmentOnly;
        private List<String> services;
        private Double fee;
        private Boolean isSpanishSpeaking;
        private Double latitude;
        private Double longitude;
        private String imageUrl;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setFaxNumber(String faxNumber) {
            this.faxNumber = faxNumber;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setIsAppointmentOnly(Boolean isAppointmentOnly) {
            this.isAppointmentOnly = isAppointmentOnly;
            return this;
        }

        public Builder setServices(List<String> services) {
            this.services = services;
            return this;
        }

        public Builder setFee(Double fee) {
            this.fee = fee;
            return this;
        }

        public Builder setIsSpanishSpeaking(Boolean spanishSpeaking) {
                isSpanishSpeaking = spanishSpeaking;
                return this;
        }

        public Builder setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Clinic build() {
            return new Clinic(name,
                    streetAddress,
                    zipCode,
                    state,
                    city,
                    phoneNumber,
                    faxNumber,
                    url,
                    isAppointmentOnly,
                    services,
                    fee,
                    isSpanishSpeaking,
                    latitude,
                    longitude,
                    imageUrl);
        }
    }
}
