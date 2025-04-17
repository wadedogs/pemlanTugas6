import java.time.LocalDate;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int lamaKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if(lamaKerja <= 5)
        return gaji * 0.05;
        else if (lamaKerja <= 10)
        return gaji * 0.10;
        else 
        return gaji * 0.15;
    }

    public double getGaji() {
        return gaji;
    }

    @Override
    public double getPendapatan() {
        return super.getTunjangan() + getBonus() + (jumlahAnak * 20) + gaji;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTahun Masuk: " + tahunMasuk.getDayOfMonth() + " " + tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() + "\nJumlah Anak: " + jumlahAnak + "\nGaji: " + gaji;
    }
}
