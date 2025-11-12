package pekan7_2511533010;

public class PanggilMahasiswa_2511533010 {
    public static void main(String[] args) {
        Mahasiswa a = new Mahasiswa();
        a.setNim(23532);
        a.setNama("Rahmat");

        System.out.println(a.getNim());
        System.out.println(a.getNama());
        a.Cetak();
    }
}
