import java.util.*;
public class Siakad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "CItra Dewi", "Sistem Informasi Bisnis"),
            //tambah siswa
            new Mahasiswa("22004", "Nanda", "Sistem Informasi Bisnis"),
            new Mahasiswa("22005", "Pica", "Sistem Informasi Bisnis")
        };

        MataKuliah[] mk = new MataKuliah[100];
            mk[0] = new MataKuliah("IF101", "Algoritma", 3, "Dr. Yudi");
            mk[1] = new MataKuliah("IF102", "Struktur Data", 3, "Bu Rani");
            mk[2] = new MataKuliah("SI101", "Sistem Informasi", 3, "Pak Budi");
        int jumlahMK = 3;


        Penilaian[] nilai = {
            new Penilaian(mhs[0], mk[0], 80, 85, 90),
            new Penilaian(mhs[0], mk[1], 60, 75, 70),
            new Penilaian(mhs[1], mk[0], 75, 70, 80),
            new Penilaian(mhs[2], mk[1], 85, 90, 95),
            new Penilaian(mhs[2], mk[2], 80, 90, 65),
            new Penilaian(mhs[3], mk[1], 85, 90, 95),
            new Penilaian(mhs[4], mk[2], 85, 92, 100),
        };

        int pilih;

        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir (DSC)");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("6. Urutkan Mahasiswa Berdasarkan Nilai Akhir (ASC)");
            System.out.println("7. Input Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    for (Mahasiswa dataMHS : mhs) {
                        dataMHS.tampilMahasiswa();
                    }
                    break;
                case 2:
                    for (int i = 0; i < jumlahMK; i++) {
                        mk[i].tampilMataKuliah();
                    }
                    break;
                case 3:
                    for (Penilaian penilaian : nilai) {
                        penilaian.tampilNilai();
                    }
                    break;
                case 4:
                    System.out.println("Pengurutan Bubble Sort");
                    Penilaian.bubbleSort(nilai);
                    for (Penilaian penilaian : nilai) {
                        penilaian.tampilNilai();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String cari = input.nextLine();
                    Mahasiswa.sequentialSearching(mhs, cari);
                    break;
                case 6:
                    System.out.println("Pengurutan Insertion Sort");
                    Penilaian.insertionSort(nilai);
                    System.out.println("Nilai Mahasiswa Setelah Diurutkan:");
                    for (Penilaian penilaian : nilai) {
                        penilaian.tampilNilai();
                    }
                    break;
                case 7:
                    mk[jumlahMK] = MataKuliah.tambahMataKuliah(input);
                    jumlahMK++;
                    break;
            }
        } while (pilih != 0);
        input.close();
    }
}
