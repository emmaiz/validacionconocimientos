package com.validacionconocimiento.validacionconocimiento.composicion;

public class Empresa {
        private String cuit;
        private Direccion dirección;

        public Direccion getDirección() {
            return dirección;
        }
        public void setDirección(Direccion dirección) {
            this.dirección = dirección;
        }
        public String getCuit() {
            return cuit;
        }
        public void setCuit(String cuit) {
            this.cuit = cuit;
        }

    }

