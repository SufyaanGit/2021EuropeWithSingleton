import java.util.ArrayList;

public class BTWCheck {

    private static BTWCheck singleton;

    private class Country {

        private String name;
        private String countryCode;

        public Country (String name, String countryCode) {
            this.name = name;
            this.countryCode = countryCode;
        }

        public String getCountryCode () {
            return countryCode;
        }
    }

    private String name;
    private ArrayList<Country> countries;

    private BTWCheck(String name) {
        this.name = name;
        countries = new ArrayList<>();
        countries.add(new Country("Duitsland", "GE"));
        countries.add(new Country("Frankrijk", "FR"));
        countries.add(new Country("België", "BE"));
    }

    public static BTWCheck getInstance(){
        if (singleton == null){
            singleton = new BTWCheck("Europa");
        }

        return singleton;
    }

    public String getName() {
        return name;
    }

    private Country getCountry(String countryCode) {

        for (Country country : countries) {

            if (country.getCountryCode().equals(countryCode)) {
                return country;
            }
        }

        return null;
    }

    public boolean isReverseChargeApplicable(String countryCode) {
        if (this.getCountry(countryCode) != null) {
            return true;
        }

        return false;
    }
}