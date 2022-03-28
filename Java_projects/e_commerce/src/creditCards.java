//I created a credit cards class
public class creditCards {
    
    private int creditCardNumber;
    private user creditCardUSer;
    private int securityCode;
    private String expirationDate; 

    public creditCards(int creditCardNumber, user creditCardUSer, int securityCode, String expirationDate) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardUSer = creditCardUSer;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public user getCreditCardUSer() {
        return creditCardUSer;
    }

    public void setCreditCardUSer(user creditCardUSer) {
        this.creditCardUSer = creditCardUSer;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
}
