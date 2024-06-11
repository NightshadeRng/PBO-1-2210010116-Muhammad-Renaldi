/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author ACER
 */
public class DataKota {
    private String namaKec;
    private String kota;
    private String kodePos;
    private String deskripsi;

    public DataKota() {}

    public DataKota(String namaKec, String kota, String kodePos, String deskripsi) {
        this.namaKec = namaKec;
        this.kota = kota;
        this.kodePos = kodePos;
        this.deskripsi = deskripsi;
    }

    public void inputNamaKec(String namaKec) {
        this.namaKec = namaKec;
    }

    public String ambilNamaKec() {
        return this.namaKec;
    }

    public void inputKota(String kota) {
        this.kota = kota;
    }

    public String ambilKota() {
        return this.kota;
    }

    public void inputKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String ambilKodePos() {
        return this.kodePos;
    }

    public void inputDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String ambilDeskripsi() {
        return this.deskripsi;
    }
}
