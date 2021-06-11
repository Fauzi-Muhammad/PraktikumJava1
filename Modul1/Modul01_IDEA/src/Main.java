import javax.swing.*;

public class Main {
public static void main(String[] args) {
    String namaDepan = "Muhammad";
    String namaBelakang = " Fauzi";
    int usia =  18;
    int targetTahunKuliah = 4;
    double ipk = 3.89764512;
    char nilaiAbjad = 'A';
    boolean tampan = true;
    System.out .println(namaDepan + namaBelakang);

    char [ ] uniskaChar = {'U' ,'N' ,'I' ,'S' ,'K' , 'A' };
    String uniskaString = new String(uniskaChar);
    System.out.println(uniskaString);

    String namalengkap  = namaDepan  +  " "  +  namaBelakang;
    System.out.println(namalengkap.length ());
    System.out.println(namalengkap.indexOf("NIS"));
    System.out.println(namalengkap.substring(5));
    System.out.println(namalengkap.substring(5,12));
    System.out.println(namalengkap.replace ("Fau", "U"));
    System.out.println(namalengkap.toUpperCase());
    System.out.println(namalengkap.toLowerCase());
    System.out.println(namalengkap.charAt (6));

    String []namaArray = namalengkap .split( " ");

    for(String nama : namaArray){
        System.out .println(nama);


}
    }

}
