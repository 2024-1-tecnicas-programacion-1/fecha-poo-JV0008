package com.mycompany.fecha.poo;
import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
Scanner lect = new Scanner(System.in);
int dia = Integer.parseInt(lect.nextLine());
int mes = Integer.parseInt(lect.nextLine());
int anio = Integer.parseInt(lect.nextLine());

Fecha llamaDa = new Fecha(dia, mes, anio);
    System.out.println(llamaDa.fechaCorta());
    if (llamaDa.validarFecha()){
        System.out.println("La fecha es válida");
        System.out.println(llamaDa.fechaLarga());
    }else {
        System.out.println("Ingrese una fecha válida");
    }
}
}
