import java.util.ArrayList;

class ListGame {
    ArrayList<SteamGame> games;

    public ListGame() {
        this.games = new ArrayList<>();
    }

    public void addGame(SteamGame game) {
        games.add(game);
    }

    public void displayGames() {
        System.out.println("=============== Steam Game ===============");
        for (SteamGame game : games) {
            game.displayInfo();
            System.out.println("----------------------------------");
        }
        System.out.println("==========================================");
    }

    public double hitungtotal(ArrayList<SteamGame> selectedGames) {
        double total = 0;
        for (SteamGame game : selectedGames) {
            total += game.harga;
        }
        return total;
    }
}