import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Receipt {
    private String fileName;

    public Receipt(String fileName) {
        this.fileName = fileName;
    }

    public void generateReceipt(ArrayList<SteamGame> selectedGames, double totalharga) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("==============================");
            writer.println(" Receipt pembelian Steam Game ");
            writer.println("==============================");

            for (SteamGame game : selectedGames) {
                writer.println("Game: " + game.nama);
                writer.println("harga: RP" + game.harga);
                writer.println();
            }
            writer.println("------------------------------");
            writer.println("Total Amount: RP" + totalharga);
            writer.println("==============================");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Receipt pembayaran dicetak. Cek file: " + fileName);
    }
}