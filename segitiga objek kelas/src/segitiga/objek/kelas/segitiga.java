/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segitiga.objek.kelas;

/**
 *
 * @author ASUS
 */
public class segitiga {
    double alas=1;
    double tinggi=1;
    double sisi=1;
    
    double getluas(){
        return alas*tinggi*0.5;
    }
     double getkeliling(){
        return 3*sisi;
    }
     
     void setAlas(double alas){
         this.alas=alas;
     }
      void setTinggi(double tinggi){
         this.tinggi=tinggi;
     }
      void setSisi(double sisi){
         this.sisi=sisi;
     }
}
