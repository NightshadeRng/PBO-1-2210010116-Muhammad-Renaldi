/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;

/**
 *
 * @author ACER
 */
public class koneksi {
    private String databasename = "2210010116";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/"+databasename;
    public static Connection koneksidb;
    
    public koneksi(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksidb = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database terkoneksi");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //tabel simpan DataKota
    public void simpandatakota(int idkota, String namakec , String kota, String kodepos, String deskripsi){
        
        try {
            String sql = "insert into table_datakota(id_kota, nama_kec, kota, kodepos,deskripsi) value (?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idkota);
            perintah.setString(2, namakec);
            perintah.setString(3, kota);
            perintah.setString(4, kodepos);
            perintah.setString(5, deskripsi);
            perintah.executeUpdate();
            System.out.println("Data Kota berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk ubah DataKota
    public void ubahdatakota(int idkota, String namakec , String kota, String kodepos, String deskripsi){
        
        try {
            String sql = "update table_datakota set nama_kec = ?, kota = ?, kodepos = ?, deskripsi = ? where id_kota = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, namakec);
            perintah.setString(2, kota);
            perintah.setString(3, kodepos);
            perintah.setString(4, deskripsi);
            perintah.setInt(5, idkota);
            perintah.executeUpdate();
            System.out.println("Data Kota berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk hapus DataKota
    public void hapusdatakota(int idkota){
        
        try {
            String sql = "delete from table_datakota where id_kota = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idkota);
            perintah.executeUpdate();
            System.out.println("Data Kota berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //tabel simpan DataWisata
    public void simpandatawisata(int idwisata, String namawisata, String alamat, String wilayah, String fasilitas, String tipewisata, String detail) {
    
        try {
            String sql = "INSERT INTO table_datawisata(id_wisata, nama_wisata, alamat, wilayah, fasilitas, tipe_wisata, detail) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idwisata);
            perintah.setString(2, namawisata);
            perintah.setString(3, alamat);
            perintah.setString(4, wilayah);
            perintah.setString(5, fasilitas);
            perintah.setString(6, tipewisata);
            perintah.setString(7, detail);
            perintah.executeUpdate();
            System.out.println("Data Wisata berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk ubah DataWisata
    public void ubahdatawisata(int idwisata, String namawisata, String alamat, String wilayah, String fasilitas, String tipewisata, String detail) {
        try {
            String sql = "UPDATE table_datawisata SET nama_wisata = ?, alamat = ?, wilayah = ?, fasilitas = ?, tipe_wisata = ?, detail = ? WHERE id_wisata = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, namawisata);
            perintah.setString(2, alamat);
            perintah.setString(3, wilayah);
            perintah.setString(4, fasilitas);
            perintah.setString(5, tipewisata);
            perintah.setString(6, detail);
            perintah.setInt(7, idwisata);
            perintah.executeUpdate();
            System.out.println("Data Wisata berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk hapus DataWisata
    public void hapusdatawisata(int idwisata){
        
        try {
            String sql = "delete from table_datawisata where id_wisata = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idwisata);
            perintah.executeUpdate();
            System.out.println("Data Wisata berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //tabel simpan Komentar
    public void simpankomentar(int idcomment, String nama, String email, String komentar, String tempDateStr, String arturl) {
    
        try {
            String sql = "INSERT INTO table_komentar(id_comment, nama, email, komentar, date, art_url) VALUE (?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idcomment);
            perintah.setString(2, nama);
            perintah.setString(3, email);
            perintah.setString(4, komentar);
            // Konversi LocalDate ke java.sql.Date
            Date sqlDate = Date.valueOf(tempDateStr);
            perintah.setDate(5, sqlDate);
            perintah.setString(6, arturl);
            perintah.executeUpdate();
            System.out.println("Data Komentar berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk ubah Komentar
    public void ubahkomentar(int idcomment, String nama, String email, String komentar, String tempDateStr, String arturl) {
        try {
            String sql = "UPDATE table_komentar SET nama = ?, email = ?, komentar = ?, date = ?, art_url = ? WHERE id_comment = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, email);
            perintah.setString(3, komentar);
            perintah.setString(4, tempDateStr);
            perintah.setString(5, arturl);
            perintah.setInt(6, idcomment);
            perintah.executeUpdate();
            System.out.println("Data Komentar berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk hapus Komentar
    public void hapuskomentar(int idcomment){
        
        try {
            String sql = "delete from table_komentar where id_comment = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idcomment);
            perintah.executeUpdate();
            System.out.println("Data Wisata berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //tabel simpan Berita
    public void simpanberita(int idberita, String tempDateStr, String gambar, String judul, String konten) {
    
        try {
            String sql = "INSERT INTO table_berita(id_berita, tanggal_post, gambar, judul, konten) VALUE (?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idberita);
            Date sqlDate = Date.valueOf(tempDateStr);
            perintah.setDate(2, sqlDate);
            perintah.setString(3, gambar);
            perintah.setString(4, judul);
            perintah.setString(5, konten);
            perintah.executeUpdate();
            System.out.println("Data Berita berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
    //untuk ubah Berita
    public void ubahberita(int idberita, String tempDateStr, String gambar, String judul, String konten) {
        try {
            String sql = "UPDATE table_berita SET tanggal_post = ?, gambar = ?, judul = ?, konten = ? WHERE id_berita = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempDateStr);
            perintah.setString(2, gambar);
            perintah.setString(3, judul);
            perintah.setString(4, konten);
            perintah.setInt(5, idberita);
            perintah.executeUpdate();
            System.out.println("Data Berita berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
 //untuk hapus Berita
    public void hapusberita(int idberita){
        
        try {
            String sql = "delete from table_berita where id_berita = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idberita);
            perintah.executeUpdate();
            System.out.println("Data Berita berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
