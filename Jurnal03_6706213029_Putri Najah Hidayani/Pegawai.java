public class Pegawai{
    private String nip;
    private String nama;
    private String divisi;

    public Pegawai (int nip2, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }
    public String getNip() {
        return nip;
    }
    public String toString() {
        return "nip= '" + nip + '\'' + ",nama= '" + nama + '\'' + ", divisi='" + divisi + '\'';
        
    }
}