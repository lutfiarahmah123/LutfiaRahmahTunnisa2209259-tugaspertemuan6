/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segitiga.objek.kelas;

/**
 *
 * @author ASUS
 */
public class SegitigaObjekKelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        segitiga segitiga1=new segitiga();
        System.out.println("Alas " +segitiga1.alas+ ", tinggi " +segitiga1.tinggi+ ", sisi " +segitiga1.sisi );
        System.out.println("Luas " +segitiga1.getluas()+ ", keliling " +segitiga1.getkeliling());
        
        segitiga segitiga2=new segitiga();
        segitiga2.alas=30;
        segitiga2.tinggi=10;
        segitiga2.sisi=90;
        System.out.println("Alas " +segitiga2.alas+ ", tinggi " +segitiga2.tinggi+ ", sisi " +segitiga2.sisi );
        System.out.println("Luas " +segitiga2.getluas()+ ", keliling " +segitiga2.getkeliling());

        segitiga segitiga3=new segitiga();
        segitiga3.setAlas(20);
        segitiga3.setTinggi(30);
        segitiga3.setSisi(60);
        System.out.println("Alas " +segitiga3.alas+ ", tinggi " +segitiga3.tinggi+ ", sisi " +segitiga3.sisi );
        System.out.println("Luas " +segitiga3.getluas()+ ", keliling " +segitiga3.getkeliling());


    }
    
}
