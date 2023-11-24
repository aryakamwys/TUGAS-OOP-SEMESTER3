import java.util.Scanner;

import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    public static void main(String[] args){new RobotApp();}
    
     /*
     * Perintah Soal:
     * Anggap 'o' adalah sebuah robot yang berada didalam area permainan.
     * Buat robot dapat bergerak ke kiri/kanan/atas/bawah sesuai jumlah langkah yang diinstruksikan.
     * Format instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah} dan 'x' untuk keluar aplikasi *case sensitive
     * Robot tidak boleh keluar dari area permainan dan buat pesan kesalahannya.
     * Buat pesan kesalahan jika pengguna tidak menulis instruksi dengan benar.
     * Lanjut pada perintah soal dibawah.
     */


    private Layout layout;
    private Robot robot;
    private Scanner scanner;
    public RobotApp() {
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot('o', new Position(0,0));
        this.scanner = new Scanner(System.in);
        String instruction = "";
        System.out.println("-------- Permainan Dimulai --------");
        do{
            draw();
            instruction = waitInstruction();
            executeInstruction(instruction);
        }while(!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }
    
    private void executeInstruction(String instruction) {
        if (instruction.length() < 2) {
            System.out.println("Input tidak valid. Masukkan banyaknya langkah!");
            return;
        }

        char moveDirection = instruction.charAt(0);
        int steps;
        try {
            steps = Integer.parseInt(instruction.substring(1));
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Masukkan nomor step yang benar!");
            return;
        }

        Position newPosition = new Position(robot.getPosition().getX(), robot.getPosition().getY());

        if(moveDirection == 'w'){
            newPosition.setX(newPosition.getX() - steps);
            System.out.println(newPosition.getX() + " " + steps);
        }
        else if(moveDirection == 's'){
            newPosition.setX(newPosition.getX() + steps);
            System.out.println(newPosition.getX() + " " + steps);
        }
        else if(moveDirection == 'a'){
            newPosition.setY(newPosition.getY() - steps);
            System.out.println(newPosition.getY() + " " + steps);
        }
        else if(moveDirection == 'd'){
            newPosition.setY(newPosition.getY() + steps);
            System.out.println(newPosition.getY() + " " + steps);
        }
        else{
            System.out.println("Arah tidak valid. Gunakan 'w', 's', 'a', or 'd'.");
            return;
        }


        if(isValidPosition(newPosition)) {
            robot.setPosition(newPosition);
        } else {
            System.out.println("robot tidak bisa keluar arena");
        }
    }

    private boolean isValidPosition(Position pos) {
        return pos.getX() >= 0 && pos.getX() < layout.getMaxX() && pos.getY() >= 0 && pos.getY() < layout.getMaxY();
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

private void draw() {
    System.out.println("------ Posisi Terbaru ------");
    
    int i = 0;
    while (i < layout.getMaxX()) {
        int j = 0;
        while (j < layout.getMaxY()) {
            if (i == robot.getPosition().getX() && j == robot.getPosition().getY()) {
                System.out.print(robot.getIcon());
            } else {
                System.out.print(layout.getArea()[i][j]);
            }
            j++;
        }
        System.out.println();
        i++;
        }
    }
}
  /*
        Gambar layout:
        Contoh:
        - Posisi robot di 1,1
        - Area permainan luasnya 10,10
        sehingga gambar layout akan menjadi:

            o*********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********

            - konfigurasi (icon robot, posisi robot, luas area dan icon area permainan yang tidak ditempati robot) silahkan gunakan prinsip OOP
            - icon cukup menggunakan karakter yang ada di keyboard.
         */

