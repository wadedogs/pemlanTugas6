public class Manager extends Pekerja{
    private String departemen;

    public Manager (String departemen, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, NIK, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (getGaji() * 0.1);
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen;
    }
}
