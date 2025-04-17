class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah matakuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public Penilaian(Mahasiswa mahasiswa, MataKuliah matakuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir(){
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    void tampilNilai(){
        System.out.println(mahasiswa.nama + " | " + matakuliah.namaMK + " | Nilai Akhir: " + nilaiAkhir);
    }

    

}

