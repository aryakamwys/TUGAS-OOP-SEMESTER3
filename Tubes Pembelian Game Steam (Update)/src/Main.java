import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ListGame listGame = new ListGame();

        listGame.addGame(new SteamGame("farcry", 100000));
        listGame.addGame(new Ekslusifgame("payday", 156000, "Bundle pack"));
        listGame.addGame(new SteamGame("stardew", 203000));
        listGame.addGame(new SteamGame("brawhalla", 501000));
        listGame.addGame(new SteamGame("skycity", 180000));
        listGame.addGame(new SteamGame("fifa", 200000));
        listGame.addGame(new Ekslusifgame("coc", 150000, "Exclusive pass"));

        listGame.displayGames();

        ArrayList<SteamGame> pilihGames = new ArrayList<>();
        String inputuser;

        while (true) {
            System.out.println();
            System.out.print("Masukkan Game ke keranjang (ketik 'oke' untuk lanjut atau cancel untuk batal): ");
            inputuser = scanner.nextLine();

            if (inputuser.equals("oke")) {
                break;
            }

            else if (inputuser.equals("cancel")) {
                System.out.println("dadah");
                scanner.close();
                System.exit(0);
            }

            boolean gameSteam = false;

            for (SteamGame game : listGame.games) {
                if (game.nama.equals(inputuser)) {
                    pilihGames.add(game);
                    gameSteam = true;
                    break;
                }
            }

            if (!gameSteam) {
                System.out.println("Game tidak ada");
            }
        }

        System.out.println("\nGame yang dipilih:");

        for (SteamGame game : pilihGames) {
            game.displayInfo();
            System.out.println();
        }

        double totalharga = listGame.hitungtotal(pilihGames);
        System.out.println("Total Harga: RP " + totalharga);

        System.out.println();
        System.out.println("======== Pembayaran CreditCard ========");
        System.out.print("Masukkan Nomer Kartu: ");
        long nomorkartu = Long.parseLong(scanner.nextLine());
        System.out.print("Masukkan CVV: ");
        int cvv = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan ExpDate (MM/YYYY): ");
        String expdate = scanner.nextLine();

        CreditCardPayment creditCard = new CreditCardPayment(nomorkartu, cvv, expdate);
        boolean paymentSuccess = creditCard.processPayment(totalharga);

        if (paymentSuccess) {
            System.out.println("Payment berhasil. Selamat bermain ");

            System.out.println();
            Receipt receipt = new Receipt("receipt.txt");
            receipt.generateReceipt(pilihGames, totalharga);

            System.out.println();
            long nomorKartu = creditCard.getNomorkartu();
            int cvV = creditCard.getCvv();
            String expDate = creditCard.getExpdate();

            System.out.println("Nomor Kartu: " + nomorKartu);
            System.out.println("CVV: " + cvV);
            System.out.println("Tanggal Kadaluarsa: " + expDate);
            System.out.println();
        } else {
            System.out.println("Payment gagal. Coba lagi.");
        }

        scanner.close();
    }
}
