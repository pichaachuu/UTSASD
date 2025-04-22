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
}
