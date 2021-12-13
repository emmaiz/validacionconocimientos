package com.validacionconocimiento.validacionconocimiento.composicion;

public class Principal {
    public static void main(String[] args) {

        Direccion d1= new Direccion("calle A",3);
        Direccion d2= new Direccion("calle B",7);
        Persona pepe= new Persona("pepe",20);
        pepe.setDirección(d1);
        Empresa petrobras= new Empresa();
        petrobras.setCuit("23-345679-1");
        petrobras.setDirección(d2);

        System.out.println(pepe.getDirección().getCalle());
        System.out.println(petrobras.getDirección().getCalle());
    }
}
