public class Ekslusifgame extends SteamGame {
    protected String fiturtambahan;

    public Ekslusifgame(String nama, double harga, String fiturtambahan) {
        super(nama, harga);
        this.fiturtambahan = fiturtambahan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Additional Feature: " + fiturtambahan);
    }
}
