import java.util.*;
public class Siakad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "CItra Dewi", "Sistem Informasi Bisnis")
        };

        MataKuliah[] mk = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3)
        };

        Penilaian[] nilai = {
            new Penilaian(mhs[0], mk[0], 80, 85, 90),
            new Penilaian(mhs[0], mk[1], 60, 75, 70),
            new Penilaian(mhs[1], mk[0], 75, 70, 80),
            new Penilaian(mhs[2], mk[1], 85, 90, 95),
            new Penilaian(mhs[2], mk[2], 80, 90, 65)
        };

        int pilih;

        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
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
                    for (MataKuliah dataMK : mk) {
                        dataMK.tampilMataKuliah();
                    }
                    break;
                case 3:
                    for (Penilaian penilaian : nilai) {
                        penilaian.tampilNilai();
                    }
                    break;
                case 4:
                    for (int i = 0; i < nilai.length-1; i++) {
                        for (int j = 1; j < nilai.length-i; j++) {
                            if (nilai[j].nilaiAkhir > nilai[j-1].nilaiAkhir) {
                                Penilaian tmp = nilai[j];
                                nilai[j] = nilai[j-1];
                                nilai[j-1] = tmp;
                            }
                        }
                    }
                    for (Penilaian penilaian : nilai) {
                        penilaian.tampilNilai();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String cari = input.nextLine();
                    for (int i = 0; i < mhs.length; i++) {
                        if (mhs[i].nim.equalsIgnoreCase(cari)) {
                            mhs[i].tampilMahasiswa();
                        }
                    }
                    break;
            }
        } while (pilih != 0);
        input.close();
    }
}
