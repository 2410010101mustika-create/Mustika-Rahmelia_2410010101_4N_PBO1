package model;

public class User {

    private String nama;
    private String jenisKulit;

    public User(String nama, String jenisKulit){
        this.nama = nama;
        this.jenisKulit = jenisKulit;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getJenisKulit(){
        return jenisKulit;
    }

    public void setJenisKulit(String jenisKulit){
        this.jenisKulit = jenisKulit;
    }

}