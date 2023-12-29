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

        ArrayList<SteamGame> selectedGames = new ArrayList<>();
        String userInput;

        while (true) {
            System.out.println();
            System.out.print("Masukkan Game ke keranjang (ketik 'oke' untuk lanjut atau cancel untuk batal): ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("oke")) {
                break;
            }

            else if (userInput.equalsIgnoreCase("cancel")) {
                System.out.println("dadah");
                scanner.close();
                System.exit(0);
            }

            boolean gameSteam = false;

            for (SteamGame game : listGame.games) {
                if (game.nama.equalsIgnoreCase(userInput)) {
                    selectedGames.add(game);
                    gameSteam = true;
                    break;
                }
            }

            if (!gameSteam) {
                System.out.println("Game tidak ada");
            }
        }

        System.out.println("\nGame yang dipilih:");
        for (SteamGame game : selectedGames) {
            game.displayInfo();
            System.out.println();
        }

        double totalharga = listGame.hitungtotal(selectedGames);
        System.out.println("Total Harga: RP " + totalharga);

        System.out.println();
        System.out.println("======== Pembayaran CreditCard ========");
        CreditCardPayment creditCard = getCreditCardInformation(scanner);
        boolean paymentSuccess = creditCard.processPayment(totalharga);

        if (paymentSuccess) {
            System.out.println("Payment berhasil. selamat bermain ");

            Receipt receipt = new Receipt("receipt.txt");
            receipt.generateReceipt(selectedGames, totalharga);
        } else {
            System.out.println("Payment gagal. coba lagi.");
        }

        scanner.close();
    }

    private static CreditCardPayment getCreditCardInformation(Scanner scanner) {
        System.out.print("Masukkan Nomer Kartu: ");
        long cardNumber = Long.parseLong(scanner.nextLine());
        System.out.print("Masukan CVV: ");
        int cvv = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan ExpDate (MM/YYYY): ");
        String expiryDate = scanner.nextLine();

        return new CreditCardPayment(cardNumber, cvv, expiryDate);
    }
}