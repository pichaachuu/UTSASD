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

    static void bubbleSort(Penilaian[] nilai){
        for (int i = 0; i < nilai.length-1; i++) {
            for (int j = 1; j < nilai.length-i; j++) {
                if (nilai[j].nilaiAkhir > nilai[j-1].nilaiAkhir) {
                    Penilaian tmp = nilai[j];
                    nilai[j] = nilai[j-1];
                    nilai[j-1] = tmp;
                }
            }
        }
    }

    static void insertionSort(Penilaian[] nilai){
        for (int i = 1; i < nilai.length; i++) {
            Penilaian temp = nilai[i];
            int j = i;
            while (j > 0 && nilai[j-1].nilaiAkhir > temp.nilaiAkhir) {
                nilai[j] = nilai[j-1];
                j--;
            }
            nilai[j] = temp;
        }
    }
}

