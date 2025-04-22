public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }

    static void sequentialSearching(Mahasiswa[] mahasiswa, String cari){
        boolean ditemukan = false;
        for (int i = 0; i < mahasiswa.length; i++) {
            if (mahasiswa[i].nim.equalsIgnoreCase(cari)) {
                mahasiswa[i].tampilMahasiswa();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + cari + " tidak ditemukan.");
        }
    }
}