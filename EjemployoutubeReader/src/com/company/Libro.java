package com.company;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;
    private int estanten;
    private String seccion;
    private int piso;
    private String edificio;
    private String sede;

    //MÉTODO CONSTRUCTOR -this.atributo es para especificar que tome el atributo y no el parametro
    public Libro(String titulo,String autor, int anio, int estanten,String seccion, int piso, String edificio, String sede){
        this.titulo=titulo;
        this.autor=autor;
        this.anio=anio;
        this.estanten=estanten;
        this.seccion=seccion;
        this.piso=piso;
        this.edificio=edificio;
        this.sede=sede;
    }

        public String getTitulo () {
        return titulo;
    }
        public String getAutor () {
        return autor;
    }
        public int getAnio () {
        return anio;
    }
        public int getEstanten () {
        return estanten;
    }
        public String getSeccion () {
        return seccion;
    }
        public int getPiso () {
        return piso;
    }
        public String getEdificio () {
        return edificio;
    }
        public String getSede () {
        return sede;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setEstanten(int estanten) {
        this.estanten = estanten;
    }
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }
    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }





    ///Funcion para mostrar libro
    public void mostrarLibro(){
        System.out.println("titulo: "+titulo);
    }

    public void editartitulo(){
    }

    public void editarsede(){
    }

    public void editarseccion(){
    }

    public void editarpiso(){
    }
}