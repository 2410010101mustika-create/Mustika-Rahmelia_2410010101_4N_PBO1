package service;

import model.*;

public class SkinAnalyzer {

    public String analisis(
    User user,
    SkinData data){

        if(
        user.getJenisKulit()
        .equalsIgnoreCase("berminyak")
        && data.getJamTidur()<6){

            return
            "Kurangi begadang";

        }

        else if(
        user.getJenisKulit()
        .equalsIgnoreCase("sensitif")){

            return
            "Gunakan produk ringan";

        }

        else{

            return
            "Kondisi stabil";

        }

    }

}