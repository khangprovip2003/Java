public class IntPhoneNumber extends PhoneNumber {
    private String countryCode;

    public IntPhoneNumber(String countryCode) {
        this.countryCode = countryCode;
    }

    public IntPhoneNumber(int area, String number, String countryCode) {
        super(area, number);
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "IntPhoneNumber{" + "countryCode='" + countryCode + '\'' + ", area=" + area + ", number='" + number + '\'' + '}';
    }

}
