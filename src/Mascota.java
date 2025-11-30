

public class Mascota {
    
    private String nombre,especie;
    private int edad;
    private double peso;
    private final double peso_minimo=0.5;
    private boolean adulto;

    public Mascota(String nombre, String especie, int edad, double peso) {
        assert nombre!=null && !nombre.isEmpty():"Error:El nombre debe de estar relleno";
        assert especie!=null && !especie.isEmpty():"Error:La especie debe de estar relleno";
        assert edad>0:"Error:La edad debe ser mayor que 0";
        assert peso>=peso_minimo:"Error:El peso debe ser minimo de 0.5 Kg";
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        assert peso>=peso_minimo:"Error:El peso debe ser minimo de 0.5 Kg";
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        assert edad>0:"Error:La edad debe ser mayor que 0";
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        assert especie!=null && !especie.isEmpty():"Error:La especie debe de estar relleno";
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        assert nombre!=null && !nombre.isEmpty():"Error:El nombre debe de estar relleno";
        this.nombre = nombre;
    }

    public boolean esAdulto(){
        return edad>=1;
    }

}
