import java.util.Scanner;

public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;
    String namaDosen;

    public MataKuliah(String kodeMK, String namaMK, int sks, String namaDosen){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.namaDosen = namaDosen;
    }

    void tampilMataKuliah(){
        System.out.println("Kode MK: " + kodeMK + " | Nama: " + namaMK + " SKS: " + sks + " | Nama Dosen: " + namaDosen);
    }
    public static MataKuliah tambahMataKuliah(Scanner input) {
        System.out.print("Masukkan Kode MK: ");
        String kode = input.nextLine();
        System.out.print("Masukkan Nama Mata Kuliah: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jumlah SKS: ");
        int sks = input.nextInt();
        input.nextLine(); // bersihkan newline
        System.out.print("Masukkan Nama Dosen: ");
        String dosen = input.nextLine();

        return new MataKuliah(kode, nama, sks, dosen);
    }
}
