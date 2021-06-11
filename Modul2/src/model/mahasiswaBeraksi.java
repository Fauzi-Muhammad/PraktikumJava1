package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java .util.Date;

public class mahasiswaBeraksi {
    public static void main(String[] args) throws ParseException{

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        mahasiswa mahasiswa = new mahasiswa();
        mahasiswa.npm = "19639999";
        mahasiswa. nama ="Sembilu";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("09-09-2009");

        System .out .println ( "Nama  \t \t \t  : " + mahasiswa.nama);
        System .out .println ( "NPM  \t\t\t  : "  +  mahasiswa.npm);
        System .out .println ( "Tanggal Lahir \t : " + mahasiswa .tanggalLahir );

        mahasiswa   mahasiswa2   = new   mahasiswa();
        mahasiswa2.npm   = "19638888";
        mahasiswa2.nama = "Delapu";
        mahasiswa2.tanggalLahir   = simpleDateFormat.parse("08-08-2008");

        System .out .println ("Nama  \t \t \t : " + mahasiswa2. nama );
        System .out .println ( "NPM  \t \t\t : " + mahasiswa2. npm );
        System .out .println ( "Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2 .tanggalLahir ));
        }
    }


