package ru.jpetstoretest.model;

public class Client {

    private final String userID;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
    private final String addressFirst;
    private final String addressSecond;
    private final String city;
    private final String state;
    private final String zip;
    private final String country;
    private final LanguageType languageType;
    private final FavouriteType favouriteType;

    public Client(String userID, String password, String firstName, String lastName, String email,
                  String phoneNumber, String addressFirst, String addressSecond, String city, String state, String zip,
                  String country, LanguageType languageType, FavouriteType favouriteType) {

        this.userID = userID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.addressFirst = addressFirst;
        this.addressSecond = addressSecond;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.languageType = languageType;
        this.favouriteType = favouriteType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddressFirst() {
        return addressFirst;
    }

    public String getAddressSecond() {
        return addressSecond;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

    public FavouriteType getFavouriteType() {
        return favouriteType;
    }

    public static final class Builder {

        private String userID;
        private String password;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String addressFirst;
        private String addressSecond;
        private String city;
        private String state;
        private String zip;
        private String country;
        private LanguageType languageType;
        private FavouriteType favouriteType;

        private Builder() {
        }

        public Builder withUserID(String userID) {
            this.userID = userID;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withFirstname(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withAddressFirst(String addressFirst) {
            this.addressFirst = addressFirst;
            return this;
        }

        public Builder withAddressSecond(String addressSecond) {
            this.addressSecond = addressSecond;
            return this;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder withState(String state) {
            this.state = state;
            return this;
        }

        public Builder witZip(String zip) {
            this.zip = zip;
            return this;
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder withLanguageType(LanguageType languageType) {
            this.languageType = languageType;
            return this;
        }

        public Builder withFavouriteType(FavouriteType favouriteType) {
            this.favouriteType = favouriteType;
            return this;
        }

        public Client build() {
            return new Client(userID, password, firstName, lastName, email,
                    phoneNumber, addressFirst, addressSecond, city, state,
                    zip, country, languageType, favouriteType);
        }
    }
}
