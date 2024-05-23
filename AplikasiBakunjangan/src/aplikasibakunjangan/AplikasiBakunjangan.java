/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package aplikasibakunjangan;
import data.DataWisata;
import java.util.Scanner;

/**
 * Kelas utama untuk mengelola data pariwisata.
 * author ACER
 */
public class AplikasiBakunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataWisata wisata = new DataWisata(); // Instansiasi objek DataWisata
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukkan Nama Kecamatan: ");
        wisata.inputNamaKec(input.nextLine());
        System.out.print("Masukkan Kota: ");
        wisata.inputKota(input.nextLine());
        System.out.print("Masukkan Kode Pos: ");
        wisata.inputKodePos(input.nextLine());
        System.out.print("Masukkan Deskripsi Kota: ");
        wisata.inputDeskripsi(input.nextLine());
        
        System.out.print("Masukkan Nama Wisata: ");
        wisata.inputNamaWisata(input.nextLine());
        System.out.print("Masukkan Alamat Wisata: ");
        wisata.inputAlamat(input.nextLine());
        System.out.print("Masukkan Fasilitas Wisata: ");
        wisata.inputFasilitas(input.nextLine());
        System.out.print("Masukkan Tipe Wisata: ");
        wisata.inputTipeWisata(input.nextLine());
        System.out.print("Masukkan Detail Wisata: ");
        wisata.inputDetail(input.nextLine());
        
        // Output data yang telah diinput
        System.out.println("\nData Wisata");
        System.out.println("Nama Kecamatan: " + wisata.ambilNamaKec());
        System.out.println("Kota: " + wisata.ambilKota());
        System.out.println("Kode Pos: " + wisata.ambilKodePos());
        System.out.println("Deskripsi Kota: " + wisata.ambilDeskripsi());
        System.out.println("Nama Wisata: " + wisata.ambilNamaWisata());
        System.out.println("Alamat Wisata: " + wisata.ambilAlamat());
        System.out.println("Fasilitas Wisata: " + wisata.ambilFasilitas());
        System.out.println("Tipe Wisata: " + wisata.ambilTipeWisata());
        System.out.println("Detail Wisata: " + wisata.ambilDetail());
    }
}
