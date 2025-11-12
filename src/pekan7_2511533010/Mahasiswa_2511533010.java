package pekan7_2511533010;

public class Mahasiswa_2511533010 {
    private int nim;
    private String nama;

    // Setter
    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter
    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    // Method cetak
    public void Cetak() {
        System.out.println("Nim  : " + nim);
        System.out.println("Nama : " + nama);
    }
}