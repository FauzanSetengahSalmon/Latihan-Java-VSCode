package latihan;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        String nama, jurusan;
        String umur, kelas;
        Double ipk;

        Scanner input = new Scanner(System.in);

        System.out.println(":::....Pendataan Data Mahasiwa Semester 2....:::");

        System.out.print("Nama Mahasiwa :");
        nama = input.nextLine();

        System.out.print("Jurusan :");
        jurusan = input.nextLine();

        System.out.print("Umur :");
        umur = input.nextLine();

        System.out.print("Kelas :");
        kelas = input.nextLine();

        System.out.print("IPK :");
        ipk = input.nextDouble();

        System.out.println("...............................................................................");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
