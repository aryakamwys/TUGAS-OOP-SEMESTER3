class CreditCardPayment {
    public long nomorkartu;
    public int cvv;
    public String expdate;

    public CreditCardPayment(long nomorkartu, int cvv, String expdate) {
        this.nomorkartu = nomorkartu;
        this.cvv = cvv;
        this.expdate = expdate;
    }

    public long getNomorkartu() {
        return nomorkartu;
    }

    public void setNomorkartu(long nomorkartu) {
        this.nomorkartu = nomorkartu;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public boolean processPayment(double amount) {
        return true;
    }

}
