package com.mycompany.fecha.poo;

import java.util.HashMap;
public class Fecha { //O1
private int dia;
private int mes;
private int anio;
    
public Fecha (int dia, int mes, int anio) { //O1
this.dia = dia;
this.mes = mes;
this.anio = anio;
}
public String fechaCorta (){ //O1

return (dia + "/" + mes + "/" + anio);
}

    public String mesLetra (int mes){ //O1
HashMap<Integer, String> meses = new HashMap<>();
meses.put(1, "enero");
meses.put(2, "febrero");
meses.put(3, "marzo");
meses.put(4, "abril");
meses.put(5, "mayo");
meses.put(6, "junio");
meses.put(7, "julio");
meses.put(8, "agosto");
meses.put(9, "septiembre");
meses.put(10, "octubre");
meses.put(11, "noviembre");
meses.put(12, "diciembre");

    String resultado = meses.get(mes);
    return resultado;
}
        public boolean validarFecha (){ //O1
    
        return !(dia >= 32 || dia <= 0 || mes >= 13 || mes <= 0);   
}
    public String fechaLarga (){ //O1
    if (validarFecha()){
        String resultado = mesLetra(mes);
        return (dia + " de " + resultado + " de " + anio);
       }else 
        return "";                              
}
}    

