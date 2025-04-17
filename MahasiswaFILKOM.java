public class MahasiswaFILKOM extends Manusia {
    private String NIM;
    private double IPK;

    public MahasiswaFILKOM(String NIM, double IPK, String Nama, String NIK, boolean jenisKelamin, boolean menikah) {
         super(Nama, NIK, jenisKelamin, menikah);
         this.NIM = NIM;
         this.IPK = IPK;
    }

    public double getBeasiswa() {
        if (IPK >= 3.5) {
            return 75;
        }else if (IPK >= 3.0) {
            return 50;
        }
        return 0;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa(); 
    }

    public String getStatus() {
        String Angkatan = "20" + NIM.substring(0, 2);
        char NoProdi = NIM.charAt(6);
        String Prodi;
        switch (NoProdi) {
            case '2':
            Prodi = "Teknik Informatika";
            break;
            case '3':
            Prodi = "Teknik Komputer";
            break;
            case '4':
            Prodi = "Sistem Informasi";
            break;
            case '6':
            Prodi = "Pendidikan Teknologi Informasi";
            break;
            case '7':
            Prodi = "Teknologi Informasi";
            break;
            default:
            Prodi = "Uknown Code";
        }
        return Prodi + ", " + Angkatan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + NIM + "\nIPK: " + IPK + "\nStatus: " + getStatus();
    }
}
