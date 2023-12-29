public class SteamGame {
    public String nama;
    public double harga;

    public SteamGame(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("Game: " + nama);
        System.out.println("Harga: RP " + harga);
    }

    public double getPrice() {
        return 0;
    }
}