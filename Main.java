public class Main {
    public static void main(String[] args) {
        // Laki-laki telah menikah
        Manusia lakinikah = new Manusia("Rusdi", "123456789", true, true);
        System.out.println(lakinikah);
        System.out.println();

        // Perempuan telah menikah
        Manusia perempuanmenikah = new Manusia("Andriana", "987654321", false, true);
        System.out.println(perempuanmenikah);
        System.out.println();

        // Laki-laki belum menikah
        Manusia lakibelumnikah = new Manusia("Andre", "164356789", true, false);
        System.out.println(lakibelumnikah);
        System.out.println();

        // MAHASISWA FILKOM
        // IPK < 3
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("153456789", 2.5, "Fuad", "123456789", true, false);
        System.out.println(mahasiswa1);
        System.out.println();

        // IPK 3 - 3.5
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("017654321", 3, "Clara", "987654321", false, true);
        System.out.println(mahasiswa2);
        System.out.println();

        // IPK 3.5 - 4
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("173456789", 4, "Luna", "123456789", true, true);
        System.out.println(mahasiswa3);
        System.out.println();

        // PEKERJA
        // Lama bekerja kurang dari 5 tahun
        Pekerja pekerja1 = new Pekerja(5000, 2023, 1, 1, 2, "Oki", "993456789", true, false);
        System.out.println(pekerja1);
        System.out.println();

        // Lama bekerja 5 - 10 tahun
        Pekerja pekerja2 = new Pekerja(7000, 2016, 1, 1, 1, "Clara", "917654321", false, true);
        System.out.println(pekerja2);
        System.out.println();

        // Lama bekerja lebih dari 10 tahun
        Pekerja pekerja3 = new Pekerja(10000, 2005, 1, 1, 10, "Luna", "873456789", true, true);
        System.out.println(pekerja3);
        System.out.println();

        // MANAGER, lama bekerja lebih dari 10 tahun 
        Manager manager1 = new Manager("IT", 7500, 2010, 1, 1, 3, "Gibran", "883456789", true, false);
        System.out.println(manager1);
    }
}
