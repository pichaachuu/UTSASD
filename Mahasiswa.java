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

    void sequentialSearching(Mahasiswa[] mahasiswa, String nim){
        System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
        String cari = input.nextLine();
            for (int i = 0; i < mahasiswa.length; i++) {
                if (mhs[i].nim.equalsIgnoreCase(cari)) {
                    mhs[i].tampilMahasiswa();
                }
            }
    }
}
