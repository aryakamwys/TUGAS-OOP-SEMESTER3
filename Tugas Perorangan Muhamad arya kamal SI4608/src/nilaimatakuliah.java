import java.util.Scanner;


public class nilaimatakuliah {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Nim: ");
        String nim = input.nextLine();

        
        System.out.print("Nilai Tubes: ");
        double nilaiTubes = input.nextDouble();
        System.out.print("Nilai Quiz: ");
        double nilaiQuiz = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        Rumus rumus = new Rumus();
        Double Totalnilai = rumus.Totalnilai(nilaiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);

        System.out.println("Nama  : " + nama);
        System.out.println("Nim   : " + nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek:"+ Totalnilai);
                
        input.close();
    }
}
