package model;

public class SkinData {

    private int jamTidur;
    private int tingkatStres;

    public SkinData(int jamTidur,int tingkatStres){

        this.jamTidur=jamTidur;
        this.tingkatStres=tingkatStres;

    }

    public int getJamTidur(){

        return jamTidur;

    }

    public void setJamTidur(int jamTidur){

        this.jamTidur=jamTidur;

    }

    public int getTingkatStres(){

        return tingkatStres;

    }

    public void setTingkatStres(int tingkatStres){

        this.tingkatStres=tingkatStres;

    }

}