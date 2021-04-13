package settergetter;
import java.util.Scanner;
/**
 *
 * @author Yuliana
 */
public class Settergetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek o dari class setget
        setget o = new setget();
        //menggunakan method setter dan mengisi parameternya
        o.setNama("Yuliana Nur Hanifah");
        o.setKelas("X RPL-2");
        o.setAbsen(35);
        o.setJudulbuku("Hujan");
        o.setTanggalpeminjaman("12 April 2021");
        o.setTanggalpengembalian("19 April 2021");
        
        //membuat objek a dari class setget
        setget a = new setget();
        //menggunakan method setter dan mengisi parameternya
        a.setNama("Fiona G.");
        a.setKelas("X TKJ-6");
        a.setAbsen(8);
        a.setJudulbuku("Bulan");
        a.setTanggalpeminjaman("3 April 2021");
        a.setTanggalpengembalian("10 April 2021");
        
        //membuat judul
        System.out.println("=============================================");
        System.out.println("      DATA PEMINJAMAN BUKU PERPUSTAKAAN");
        System.out.println("=============================================");
        //menampilkan output dengan menggunakan method getter
        System.out.println("1.  Nama Siswa/i                : "+o.getNama());
        System.out.println("    Kelas Siswa/i               : "+o.getKelas());
        System.out.println("    No. Absen Siswa/i           : "+o.getAbsen());
        System.out.println("    Judul Buku yang di Pinjam   : "+o.getJudulbuku());
        System.out.println("    Tanggal Peminjaman Buku     : "+o.getTanggalpeminjaman());
        System.out.println("    Tanggal Pengembalian Buku   : "+o.getTanggalpengembalian());
        
        System.out.println("\n");//untuk spasi
        //menampilkan output dengan menggunakan method getter
        System.out.println("2.  Nama Siswa/i                : "+a.getNama());
        System.out.println("    Kelas Siswa/i               : "+a.getKelas());
        System.out.println("    No. Absen Siswa/i           : "+a.getAbsen());
        System.out.println("    Judul Buku yang di Pinjam   : "+a.getJudulbuku());
        System.out.println("    Tanggal Peminjaman Buku     : "+a.getTanggalpeminjaman());
        System.out.println("    Tanggal Pengembalian Buku   : "+a.getTanggalpengembalian());
        
        //membuat scanner
        Scanner input = new Scanner(System.in);
        System.out.print("\nNomer Manakah Yang Merupakan Nama Anda (1/2) ? ");
        int nomer = input.nextInt(); //untuk menyimpan masukkan dari user
        //percabangan switch case
        switch(nomer){
            case 1: //jika user memasukkan angka 1, maka akan muncul kata berikut
                System.out.println("\nTerimakasih Sudah Meminjam Buku dengan Judul "+o.getJudulbuku()+" dan Mengembalikannya Tepat Waktu");
                break;
            case 2: //jika user memasukkan angka 2, maka akan muncul kata berikut
                System.out.println("\nTerimakasih Sudah Meminjam Buku dengan Judul "+a.getJudulbuku()+" dan Mengembalikannya Tepat Waktu");
                break;
            default: //jika user tidak memasukkan angka 1/2, maka akan muncul kata berikut
                System.out.println("\nERROR");
        }
        
    }
    
}