/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petemuankedua.Tugas;

/**
 *
 * @author Faiq
 */
public class Ayah extends Manusia implements PekerjaanLuar, PekerjaanRumah, MendidikAnak {

    /**
     * @return the JumlahAnak
     */
    protected int getJumlahAnak() {
        return JumlahAnak;
    }

    /**
     * @return the Alamat
     */
    protected String getAlamat() {
        return Alamat;
    }

    private int JumlahAnak;
    private String Alamat;

    public Ayah(String Nama, int Umur, int JumlahAnak, String Alamat) {
        super(Nama, Umur);
        this.JumlahAnak = JumlahAnak;
        this.Alamat = Alamat;
    }

    public void bekerja() {
        System.out.println(getNama() + " bekerja sebagai Dosen di UINSA ");
    }
    
    public void berangkat() {
        System.out.println(getNama() + " berangkat bekerja pada pukul 07.00 WIB");
    }
    
    public void pulang() {
        System.out.println(getNama() + " pulang bekerja pada pukul 04.00 WIB");
    }
    
    public void memperbaiki() {
        System.out.println(getNama() + " memperbaiki kulkas di rumah");
    }
    
    public void membersihkan() {
        System.out.println(getNama() + " membersihkan ruang tamu");
    }
    
    public void mencuci() {
        System.out.println(getNama() + " mencuci baju di rumah");
    }
    
    public void membimbing() {
        System.out.println(getNama() + " membimbing kedua anaknya ke arah yang benar");
    }
    
    public void menasehati() {
        System.out.println(getNama() + " menasehati kedua anaknya dengan tegas");
    }
    
    public void mengajar() {
        System.out.println(getNama() + " mengajar kedua anaknya dengan baik");
    }
    
    public static void main(String[] args) {
        Ayah bejo = new Ayah("Asep", 30, 2, "Surabaya");
        System.out.println("DATA SEORANG AYAH");
        System.out.println("Nama : " + bejo.getNama());
        System.out.println("Umur : " + bejo.getUmur());
        System.out.println("Jumlah Anak : " + bejo.getJumlahAnak());
        System.out.println("Alamat : " + bejo.getAlamat());
        
        System.out.println("");
        System.out.println("Kegiatan Pekerjaan");
        bejo.bekerja(); 
        bejo.berangkat();
        bejo.pulang();
        
        System.out.println("");
        System.out.println("Kegiatan di Rumah");
        bejo.memperbaiki();
        bejo.membersihkan();
        bejo.mencuci();
        
        System.out.println("");
        System.out.println("Kegiatan Mendidik Anak");
        bejo.membimbing();
        bejo.menasehati();
        bejo.mengajar();
    }

}
