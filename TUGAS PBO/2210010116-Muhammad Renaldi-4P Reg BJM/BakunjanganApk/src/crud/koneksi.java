/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud; // Deklarasi paket 'crud'

import java.sql.Connection; // Mengimpor kelas 'Connection' dari pustaka 'java.sql'
import java.sql.DriverManager; // Mengimpor kelas 'DriverManager' dari pustaka 'java.sql'
import java.sql.PreparedStatement; // Mengimpor kelas 'PreparedStatement' dari pustaka 'java.sql'
import java.sql.Date; // Mengimpor kelas 'Date' dari pustaka 'java.sql'
import java.sql.ResultSet; // Mengimpor kelas 'ResultSet' dari pustaka 'java.sql'
import java.sql.SQLException; // Mengimpor kelas 'SQLException' dari pustaka 'java.sql'

/**
 *
 * @author ACER
 */
public class koneksi { // Deklarasi kelas 'koneksi'
    private String databasename = "2210010116"; // Mendeklarasikan dan menginisialisasi variabel 'databasename'
    private String username = "root"; // Mendeklarasikan dan menginisialisasi variabel 'username'
    private String password = ""; // Mendeklarasikan dan menginisialisasi variabel 'password'
    private String lokasi = "jdbc:mysql://localhost/" + databasename; // Mendeklarasikan dan menginisialisasi variabel 'lokasi'
    public static Connection koneksidb; // Mendeklarasikan variabel 'koneksidb' sebagai 'Connection' yang bersifat statis
    
    public koneksi() { // Konstruktor kelas 'koneksi'
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Memuat driver JDBC MySQL
            koneksidb = DriverManager.getConnection(lokasi, username, password); // Mencoba melakukan koneksi ke database
            System.out.println("Database terkoneksi"); // Menampilkan pesan jika koneksi berhasil
            
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk menyimpan data kota ke dalam tabel 'table_datakota'
    public void simpandatakota(String idkota, String namakec, String kota, String kodepos, String deskripsi) {
        try {
            String sql = "INSERT INTO table_datakota(id_kota, nama_kec, kota, kodepos, deskripsi) VALUES (?, ?, ?, ?, ?)"; // Query SQL untuk menyimpan data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            perintah.setString(1, idkota); // Mengisi parameter pertama dengan 'idkota'
            perintah.setString(2, namakec); // Mengisi parameter kedua dengan 'namakec'
            perintah.setString(3, kota); // Mengisi parameter ketiga dengan 'kota'
            perintah.setString(4, kodepos); // Mengisi parameter keempat dengan 'kodepos'
            perintah.setString(5, deskripsi); // Mengisi parameter kelima dengan 'deskripsi'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Kota berhasil disimpan"); // Menampilkan pesan jika data berhasil disimpan
            
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk mengubah data kota di dalam tabel 'table_datakota'
    public void ubahdatakota(String idkota, String namakec, String kota, String kodepos, String deskripsi) {
        try {
            String sql = "UPDATE table_datakota SET nama_kec = ?, kota = ?, kodepos = ?, deskripsi = ? WHERE id_kota = ?"; // Query SQL untuk mengubah data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            perintah.setString(1, namakec); // Mengisi parameter pertama dengan 'namakec'
            perintah.setString(2, kota); // Mengisi parameter kedua dengan 'kota'
            perintah.setString(3, kodepos); // Mengisi parameter ketiga dengan 'kodepos'
            perintah.setString(4, deskripsi); // Mengisi parameter keempat dengan 'deskripsi'
            perintah.setString(5, idkota); // Mengisi parameter kelima dengan 'idkota'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Kota berhasil diubah"); // Menampilkan pesan jika data berhasil diubah
            
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk menghapus data kota dari tabel 'table_datakota'
    public void hapusdatakota(String idkota) {
        try {
            String sql = "DELETE FROM table_datakota WHERE id_kota = ?"; // Query SQL untuk menghapus data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            perintah.setString(1, idkota); // Mengisi parameter pertama dengan 'idkota'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Kota berhasil dihapus"); // Menampilkan pesan jika data berhasil dihapus
            
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk mencari data kota di dalam tabel 'table_datakota'
    public ResultSet caridatakota(String idKota) {
        ResultSet rs = null; // Mendeklarasikan objek 'ResultSet' untuk menyimpan hasil query
        try {
            String query = "SELECT * FROM table_datakota WHERE id_kota = ?"; // Query SQL untuk mencari data
            PreparedStatement ps = koneksidb.prepareStatement(query); // Menyiapkan perintah SQL
            ps.setString(1, idKota); // Mengisi parameter pertama dengan 'idKota'
            rs = ps.executeQuery(); // Menjalankan perintah SQL dan menyimpan hasilnya di 'ResultSet'
        } catch (SQLException e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println("Error: " + e.getMessage()); // Menampilkan pesan kesalahan
        }
        return rs; // Mengembalikan hasil query
    }
    
    // Metode untuk menyimpan data wisata ke dalam tabel 'table_datawisata'
    public void simpandatawisata(String idwisata, String namawisata, String alamat, String wilayah, String fasilitas, String tipewisata, String detail) {
        try {
            String sql = "INSERT INTO table_datawisata(id_wisata, nama_wisata, alamat, wilayah, fasilitas, tipe_wisata, detail) VALUES (?, ?, ?, ?, ?, ?, ?)"; // Query SQL untuk menyimpan data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            perintah.setString(1, idwisata); // Mengisi parameter pertama dengan 'idwisata'
            perintah.setString(2, namawisata); // Mengisi parameter kedua dengan 'namawisata'
            perintah.setString(3, alamat); // Mengisi parameter ketiga dengan 'alamat'
            perintah.setString(4, wilayah); // Mengisi parameter keempat dengan 'wilayah'
            perintah.setString(5, fasilitas); // Mengisi parameter kelima dengan 'fasilitas'
            perintah.setString(6, tipewisata); // Mengisi parameter keenam dengan 'tipewisata'
            perintah.setString(7, detail); // Mengisi parameter ketujuh dengan 'detail'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Wisata berhasil disimpan"); // Menampilkan pesan jika data berhasil disimpan
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk mengubah data wisata di dalam tabel 'table_datawisata'
    public void ubahdatawisata(String idwisata, String namawisata, String alamat, String wilayah, String fasilitas, String tipewisata, String detail) {
        try {
            String sql = "UPDATE table_datawisata SET nama_wisata = ?, alamat = ?, wilayah = ?, fasilitas = ?, tipe_wisata = ?, detail = ? WHERE id_wisata = ?"; // Query SQL untuk mengubah data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            perintah.setString(1, namawisata); // Mengisi parameter pertama dengan 'namawisata'
            perintah.setString(2, alamat); // Mengisi parameter kedua dengan 'alamat'
            perintah.setString(3, wilayah); // Mengisi parameter ketiga dengan 'wilayah'
            perintah.setString(4, fasilitas); // Mengisi parameter keempat dengan 'fasilitas'
            perintah.setString(5, tipewisata); // Mengisi parameter kelima dengan 'tipewisata'
            perintah.setString(6, detail); // Mengisi parameter keenam dengan 'detail'
            perintah.setString(7, idwisata); // Mengisi parameter ketujuh dengan 'idwisata'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Wisata berhasil diubah"); // Menampilkan pesan jika data berhasil diubah
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk menghapus data wisata dari tabel 'table_datawisata'
    public void hapusdatawisata(String idwisata) {
        try {
            String sql = "DELETE FROM table_datawisata WHERE id_wisata = ?"; // Query SQL untuk menghapus data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            perintah.setString(1, idwisata); // Mengisi parameter pertama dengan 'idwisata'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Wisata berhasil dihapus"); // Menampilkan pesan jika data berhasil dihapus
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk mencari data wisata di dalam tabel 'table_datawisata'
    public ResultSet caridatawisata(String idWisata) {
        ResultSet rs = null; // Mendeklarasikan objek 'ResultSet' untuk menyimpan hasil query
        try {
            String query = "SELECT * FROM table_datawisata WHERE id_wisata = ?"; // Query SQL untuk mencari data
            PreparedStatement ps = koneksidb.prepareStatement(query); // Menyiapkan perintah SQL
            ps.setString(1, idWisata); // Mengisi parameter pertama dengan 'idWisata'
            rs = ps.executeQuery(); // Menjalankan perintah SQL dan menyimpan hasilnya di 'ResultSet'
        } catch (SQLException e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println("Error: " + e.getMessage()); // Menampilkan pesan kesalahan
        }
        return rs; // Mengembalikan hasil query
    }
    
    // Metode untuk menyimpan komentar ke dalam tabel 'table_komentar'
    public void simpankomentar(String idcomment, String nama, String email, String komentar, String tempDateStr, String arturl) {
        try {
            String sql = "INSERT INTO table_komentar(id_comment, nama, email, komentar, date, art_url) VALUES (?, ?, ?, ?, ?, ?)"; // Query SQL untuk menyimpan data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            perintah.setString(1, idcomment); // Mengisi parameter pertama dengan 'idcomment'
            perintah.setString(2, nama); // Mengisi parameter kedua dengan 'nama'
            perintah.setString(3, email); // Mengisi parameter ketiga dengan 'email'
            perintah.setString(4, komentar); // Mengisi parameter keempat dengan 'komentar'
            Date sqlDate = Date.valueOf(tempDateStr); // Mengonversi string tanggal ke objek 'Date'
            perintah.setDate(5, sqlDate); // Mengisi parameter kelima dengan 'sqlDate'
            perintah.setString(6, arturl); // Mengisi parameter keenam dengan 'arturl'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Komentar berhasil disimpan"); // Menampilkan pesan jika data berhasil disimpan
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk mengubah komentar di dalam tabel 'table_komentar'
    public void ubahkomentar(String idcomment, String nama, String email, String komentar, String tempDateStr, String arturl) {
        try {
            String sql = "UPDATE table_komentar SET nama = ?, email = ?, komentar = ?, date = ?, art_url = ? WHERE id_comment = ?"; // Query SQL untuk mengubah data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            perintah.setString(1, nama); // Mengisi parameter pertama dengan 'nama'
            perintah.setString(2, email); // Mengisi parameter kedua dengan 'email'
            perintah.setString(3, komentar); // Mengisi parameter ketiga dengan 'komentar'
            Date sqlDate = Date.valueOf(tempDateStr); // Mengonversi string tanggal ke objek 'Date'
            perintah.setDate(4, sqlDate); // Mengisi parameter keempat dengan 'sqlDate'
            perintah.setString(5, arturl); // Mengisi parameter kelima dengan 'arturl'
            perintah.setString(6, idcomment); // Mengisi parameter keenam dengan 'idcomment'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Komentar berhasil diubah"); // Menampilkan pesan jika data berhasil diubah
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk menghapus komentar dari tabel 'table_komentar'
    public void hapuskomentar(String idcomment) {
        try {
            String sql = "DELETE FROM table_komentar WHERE id_comment = ?"; // Query SQL untuk menghapus data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            perintah.setString(1, idcomment); // Mengisi parameter pertama dengan 'idcomment'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Komentar berhasil dihapus"); // Menampilkan pesan jika data berhasil dihapus
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk mencari komentar di dalam tabel 'table_komentar'
    public ResultSet carikomentar(String idKomentar) {
        ResultSet rs = null; // Mendeklarasikan objek 'ResultSet' untuk menyimpan hasil query
        try {
            String query = "SELECT * FROM table_komentar WHERE id_comment = ?"; // Query SQL untuk mencari data
            PreparedStatement ps = koneksidb.prepareStatement(query); // Menyiapkan perintah SQL
            ps.setString(1, idKomentar); // Mengisi parameter pertama dengan 'idKomentar'
            rs = ps.executeQuery(); // Menjalankan perintah SQL dan menyimpan hasilnya di 'ResultSet'
        } catch (SQLException e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println("Error: " + e.getMessage()); // Menampilkan pesan kesalahan
        }
        return rs; // Mengembalikan hasil query
    }
    
    // Metode untuk menyimpan berita ke dalam tabel 'table_berita'
    public void simpanberita(String idberita, String tempDateStr, String gambar, String judul, String konten) {
        try {
            String sql = "INSERT INTO table_berita(id_berita, tanggal_post, gambar, judul, konten) VALUES (?, ?, ?, ?, ?)"; // Query SQL untuk menyimpan data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            perintah.setString(1, idberita); // Mengisi parameter pertama dengan 'idberita'
            Date sqlDate = Date.valueOf(tempDateStr); // Mengonversi string tanggal ke objek 'Date'
            perintah.setDate(2, sqlDate); // Mengisi parameter kedua dengan 'sqlDate'
            perintah.setString(3, gambar); // Mengisi parameter ketiga dengan 'gambar'
            perintah.setString(4, judul); // Mengisi parameter keempat dengan 'judul'
            perintah.setString(5, konten); // Mengisi parameter kelima dengan 'konten'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Berita berhasil disimpan"); // Menampilkan pesan jika data berhasil disimpan
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk mengubah berita di dalam tabel 'table_berita'
    public void ubahberita(String idberita, String tempDateStr, String gambar, String judul, String konten) {
        try {
            String sql = "UPDATE table_berita SET tanggal_post = ?, gambar = ?, judul = ?, konten = ? WHERE id_berita = ?"; // Query SQL untuk mengubah data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            Date sqlDate = Date.valueOf(tempDateStr); // Mengonversi string tanggal ke objek 'Date'
            perintah.setDate(1, sqlDate); // Mengisi parameter pertama dengan 'sqlDate'
            perintah.setString(2, gambar); // Mengisi parameter kedua dengan 'gambar'
            perintah.setString(3, judul); // Mengisi parameter ketiga dengan 'judul'
            perintah.setString(4, konten); // Mengisi parameter keempat dengan 'konten'
            perintah.setString(5, idberita); // Mengisi parameter kelima dengan 'idberita'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Berita berhasil diubah"); // Menampilkan pesan jika data berhasil diubah
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk menghapus berita dari tabel 'table_berita'
    public void hapusberita(String idberita) {
        try {
            String sql = "DELETE FROM table_berita WHERE id_berita = ?"; // Query SQL untuk menghapus data
            PreparedStatement perintah = koneksidb.prepareStatement(sql); // Menyiapkan perintah SQL
            perintah.setString(1, idberita); // Mengisi parameter pertama dengan 'idberita'
            perintah.executeUpdate(); // Menjalankan perintah SQL
            System.out.println("Data Berita berhasil dihapus"); // Menampilkan pesan jika data berhasil dihapus
        } catch (Exception e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan
        }
    }
    
    // Metode untuk mencari berita di dalam tabel 'table_berita'
    public ResultSet cariberita(String idBerita) {
        ResultSet rs = null; // Mendeklarasikan objek 'ResultSet' untuk menyimpan hasil query
        try {
            String query = "SELECT * FROM table_berita WHERE id_berita = ?"; // Query SQL untuk mencari data
            PreparedStatement ps = koneksidb.prepareStatement(query); // Menyiapkan perintah SQL
            ps.setString(1, idBerita); // Mengisi parameter pertama dengan 'idBerita'
            rs = ps.executeQuery(); // Menjalankan perintah SQL dan menyimpan hasilnya di 'ResultSet'
        } catch (SQLException e) { // Menangani pengecualian jika terjadi kesalahan
            System.out.println("Error: " + e.getMessage()); // Menampilkan pesan kesalahan
        }
        return rs; // Mengembalikan hasil query
    }
}
