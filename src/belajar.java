import java.util.Scanner;

public class belajar {
    public static void main(String[] args) {
        String nama, jurusan;
        String kelas, hobi;
        int umur;
        Double ipk;

        Scanner input = new Scanner(System.in);

        System.out.println("::......DATA MAHASISWA.......::");

        System.out.print("Nama Mahasiswa :");
        nama = input.nextLine();

        System.out.print("Jurusan :");
        jurusan = input.nextLine();

        System.out.print("Kelas :");
        kelas = input.nextLine();

        System.out.print("Hobi :");
        hobi = input.nextLine();

        System.out.print("Umur :");
        umur = input.nextInt();

        System.out.print("IPK :");
        ipk = input.nextDouble();

        System.out.println("...................................................................");
        System.out.println("Nama Mahasiswa " + nama);
        System.out.println("Jurusan " + jurusan);
        System.out.println("Kelas " + kelas);
        System.out.println("Hobi " + hobi);
        System.out.println("Umur " + umur);
        System.out.println("IPK " + ipk);
    }
}
