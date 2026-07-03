package service;

public class Recommendation implements Info{

    @Override
    public void informasi(){

        System.out.println(
        "Sistem rekomendasi kondisi kulit");

    }

    public void tampilkan(){

        System.out.println(
        "Data kosong");

    }

    public void tampilkan(String hasil){

        System.out.println(
        "Rekomendasi : "+hasil);

    }

}