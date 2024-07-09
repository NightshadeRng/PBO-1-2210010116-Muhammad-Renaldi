/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author ACER
 */
public class DataWisata extends DataKota {
    private String namaWisata;
    private String alamat;
    private String fasilitas;
    private String tipeWisata;
    private String detail;

    public DataWisata() {
        //super(); constructor pada bagian ini tidak diperlukan karena sudah otomatis dari kelas induk nya
    }

    public DataWisata(String namaKec, String kota, String kodePos, String deskripsi, String namaWisata, String alamat, String fasilitas, String tipeWisata, String detail) {
        super(namaKec, kota, kodePos, deskripsi);
        this.namaWisata = namaWisata;
        this.alamat = alamat;
        this.fasilitas = fasilitas;
        this.tipeWisata = tipeWisata;
        this.detail = detail;
    }

    public void inputNamaWisata(String namaWisata) {
        this.namaWisata = namaWisata;
    }

    public String ambilNamaWisata() {
        return this.namaWisata;
    }

    public void inputAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String ambilAlamat() {
        return this.alamat;
    }

    public void inputFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public String ambilFasilitas() {
        return this.fasilitas;
    }

    public void inputTipeWisata(String tipeWisata) {
        this.tipeWisata = tipeWisata;
    }

    public String ambilTipeWisata() {
        return this.tipeWisata;
    }

    public void inputDetail(String detail) {
        this.detail = detail;
    }

    public String ambilDetail() {
        return this.detail;
    }
}