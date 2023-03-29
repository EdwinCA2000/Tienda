package com.mycompany.tienda.conexion;

import java.sql.Connection;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class cargarBD {

    private DataSource dataSource;
    public static JDNI jdnis = new JDNI();

    //JDNIs
   
    public static final String JDNI_TIENDA = "jdbc/tienda";
    
    //CATALOGOS
    
    public static final String CATALOGO_TIENDA = "tienda";
   
    
    public cargarBD() {
        this(CATALOGO_TIENDA);
    }

    public cargarBD(String jdni) {
        try {
            dataSource = (DataSource) new InitialContext().lookup("java:comp/env/" + jdni);
        } catch (NamingException e) {
            throw new IllegalStateException(jdni + " is missing in JNDI!", e);
        }
        
        //JDNIs
        
        jdnis.add(new JDNI.Catalogo(JDNI_TIENDA, CATALOGO_TIENDA));
    
    }

    public Connection getConexion() throws Exception {
        return dataSource.getConnection();
    }
}
