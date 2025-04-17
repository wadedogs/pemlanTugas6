public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String NIK;
    private Boolean menikah;

    public Manusia (String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\nNIK: " + NIK + "\nJenis Kelamin: " + jenisKelamin + "\nTotal Pendapatan: " + getPendapatan();
    }
}
