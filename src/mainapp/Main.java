package mainapp;

import java.time.LocalDate;
import model.*;
import service.*;
import utility.*;
import inheritance.*;

public class Main {

    public static void main(String[] args){

        InputHandler input=
        new InputHandler();

        User[] dataUser=
        new User[100];

        String[][] histori=
        new String[100][3];

        int jumlah=0;

        int pilih=0;

        do{

        try{

        System.out.println(
        "\n=== Rahmelia SkinMood Advisor ===");

        System.out.println(
        "Tanggal : "
        +LocalDate.now());

        System.out.println(
        "1.Input Data");

        System.out.println(
        "2.Lihat Riwayat");

        System.out.println(
        "3.Cari Data");

        System.out.println(
        "4.Statistik");

        System.out.println(
        "5.Keluar");

        pilih=
        input.inputInt(
        "Pilih : ");

        input.clear();

        switch(pilih){

        case 1:

        String nama=
        input.inputString(
        "Nama : ");

        String kulit=
        input.inputString(
        "Jenis kulit : ");

        int tidur=
        input.inputInt(
        "Jam tidur : ");

        int stres=
        input.inputInt(
        "Stres : ");

        input.clear();

        if(
        !Validator
        .cekTidur(
        tidur)){

        System.out.println(
        "Jam salah");

        break;

        }

        User user=
        new User(
        nama,
        kulit);

        SkinData skin=
        new SkinData(
        tidur,
        stres);

        SkinAnalyzer a=
        new SkinAnalyzer();

        Recommendation r=
        new Recommendation();

        r.informasi();

        String hasil=
        a.analisis(
        user,
        skin);

        r.tampilkan(
        hasil);

        dataUser[jumlah]
        =user;

        histori[jumlah][0]
        =nama;

        histori[jumlah][1]
        =kulit;

        histori[jumlah][2]
        =String.valueOf(
        tidur);

        jumlah++;

        BasicSkin sk;

        if(
        kulit.equalsIgnoreCase(
        "sensitif")){

        sk=
        new SensitiveSkin();

        }

        else if(
        kulit.equalsIgnoreCase(
        "berminyak")){

        sk=
        new OilySkin();

        }

        else{

        sk=
        new BasicSkin();

        }

        sk.tampilSaran();

        break;

        case 2:

        for(
        int i=0;
        i<jumlah;
        i++){

        System.out.println(

        (i+1)
        +". "
        +histori[i][0]
        +" | "
        +histori[i][1]

        );

        }

        break;

        case 3:

        String cari=
        input.inputString(
        "Cari nama : ");

        boolean ketemu=
        false;

        for(
        int i=0;
        i<jumlah;
        i++){

        if(
        dataUser[i]
        .getNama()
        .equalsIgnoreCase(
        cari)){

        System.out.println(
        "Data ditemukan");

        ketemu=true;

        }

        }

        if(!ketemu){

        System.out.println(
        "Data tidak ada");

        }

        break;

        case 4:

        System.out.println(
        "Total pengguna : "
        +jumlah);

        break;

        case 5:

        System.out.println(
        "Program selesai");

        }

        }

        catch(Exception e){

        System.out.println(
        "Input salah");

        input.clear();

        }

        }

        while(
        pilih!=5);

    }

}