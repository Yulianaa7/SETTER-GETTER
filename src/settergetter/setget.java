package settergetter;

/**
 *
 * @author Yuliana
 */
public class setget {
    //mendeklarasikan variabel nama,kelas, dan absen dengan tipe data String dan int, menggunakan akses modifier private
    private String nama; 
    private String kelas; 
    private int absen; 
    //mendeklarasikan variabel judulbuku, tanggalpeminjaman, tanggalpengembalian dengan tipe data String dan menggunakan akses modifier protected
    protected String judulbuku; 
    protected String tanggalpeminjaman; 
    protected String tanggalpengembalian; 
    
    //method setter untuk mengeset nilai nama
    public void setNama(String nama){
        this.nama = nama;
    }
    //method getter untuk mengembalikan nilai nama
    public String getNama(){
        return nama;
    }
    //method setter untuk mengeset nilai kelas
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    //method getter untuk mengembalikan nilai kelas
    public String getKelas(){
        return kelas;
    }
    //method setter untuk mengeset nilai absen
    public void setAbsen(int absen){
        this.absen = absen;
    }
    //method getter untuk mengembalikan nilai absen
    public int getAbsen(){
        return absen;
    }
    //method setter untuk mengeset nilai judulbuku
    public void setJudulbuku(String judulbuku){
        this.judulbuku = judulbuku;
    }
    //method getter untuk mengembalikan nilai judulbuku
    public String getJudulbuku(){
        return judulbuku;
    }
    //method setter untuk mengeset nilai tanggalpeminjaman
    public void setTanggalpeminjaman(String tanggalpeminjaman){
        this.tanggalpeminjaman = tanggalpeminjaman;
    }
    //method getter untuk mengembalikan nilai tanggalpeminjaman
    public String getTanggalpeminjaman(){
        return tanggalpeminjaman;
    }
    //method setter untuk mengeset nilai tanggalpengembalian
    public void setTanggalpengembalian(String tanggalpengembalian){
        this.tanggalpengembalian = tanggalpengembalian;
    }
    //method getter untuk mengembalikan nilai tanggalpengembalian
    public String getTanggalpengembalian(){
        return tanggalpengembalian;
    }
}