package com.mycompany.tienda.conexion;

import com.mycompany.tienda.conexion.JDNI.Catalogo;
import java.util.ArrayList;


public class JDNI extends ArrayList<Catalogo>{
    public static class Catalogo{
        public String JDNI = "";
        public String Catalogo = "";

        public Catalogo(String JDNI, String Catalogo) {
            this.JDNI = JDNI;
            this.Catalogo = Catalogo;
        }
    }
    
    public String getJDNI(String Catalogo){
        for (Catalogo c : this){
            if (c.Catalogo.equalsIgnoreCase(Catalogo)) return c.JDNI;
        }
        return null;
    }
    
    public String getCatalogo(String JDNI){
        for (Catalogo c : this){
            if (c.JDNI.equalsIgnoreCase(JDNI)) return c.Catalogo;
        }
        return null;
    }

}
