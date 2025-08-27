/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petemuankedua.Tugas;

/**
 *
 * @author Faiq
 */
public class Manusia {

    /**
     * @return the Nama
     */
    protected String getNama() {
        return Nama;
    }

    /**
     * @return the Umur
     */
    protected int getUmur() {
        return Umur;
    }
    private String Nama;
    private int Umur;

    public Manusia(String Nama, int Umur) {
        this.Nama = Nama;
        this.Umur = Umur;
    }
}
