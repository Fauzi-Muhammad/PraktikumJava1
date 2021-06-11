import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypesScanner{
 public static void main(String[] args){

  Scanner scanner = new Scanner(System.in);

  String namaDepan ="Muhammad";
  String namaBelakang ="Fauzi";
  int usia = 18;
  int targetTahunKuliah = 4;
  double ipk = 3.89764512;
  char nilaiAbjad = 'A';
  boolean tampan = true;
  
  System.out.println("Input Nama depan : ");
  namaDepan = scanner.nextLine();
  System.out.println("Nama belakang : " );
  namaBelakang = scanner.nextLine();
  System.out.println("input Usia : ");
  usia = scanner.nextInt();
  System.out.println("input IPK : ");
  ipk = scanner.nextDouble();
  System.out.println("");
  System.out.println("Nilai PBO : " );
  nilaiAbjad = scanner.next().charAt(0);
  System.out.println("Tampan : " );
  tampan = scanner.nextBoolean();
 
  System.out.println("Nama depan : "+ namaDepan);
  System.out.println("Nama belakang : " + namaBelakang);
  System.out.println("Usia : " + usia);
  System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
  System.out.println("IPK : " + ipk);
  System.out.println("Nilai PBO : " + nilaiAbjad);
  System.err.println("Tampan : " + tampan);
  JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaBelakang);
 }
} 