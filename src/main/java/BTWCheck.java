import java.util.ArrayList;

public class BTWCheck {

    private String name;
    private ArrayList<Country> countries;

    public BTWCheck(String name) {
        this.name = name;
        countries = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public Country getCountry(String countryCode) {

        for (Country country : countries) {

            if (country.getCountryCode().equals(countryCode)) {
                return country;
            }
        }

        return null;
    }

    public boolean isReverseChargeApplicable(String countryCode) {

        if (this.getName().equals("Europe")) {

            if (this.getCountry(countryCode) != null) {
                return true;
            }
        }

        return false;
    }
}