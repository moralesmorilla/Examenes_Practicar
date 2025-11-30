

public class ClinicaVeterinaria {
    private String nombre;
    private Mascota [] mascotas = new Mascota[3];


    public ClinicaVeterinaria(String nombre,Mascota m1,Mascota m2,Mascota m3) {
        assert nombre!=null && !nombre.isEmpty():"Error:El nombre de la clinica debe rellenarse";
        assert m1!=null && m2!=null && m3!=null:"Las mascotas deben de estar rellenas";
        this.nombre = nombre;
        mascotas[0]=m1;
        mascotas[1]=m2;
        mascotas[2]=m3;

    }

    public double getPesoPromedio(){
        double pesoPromedio=0;
        for (Mascota mascota : mascotas) {
            pesoPromedio += mascota.getPeso();
        }
        return pesoPromedio/mascotas.length;
    }
    public int getNumeroAdultos(){
        int numAdulto=0;
        for (Mascota mascota : mascotas) {
            if (mascota.esAdulto()) {
                numAdulto++;
            }
        }
        return numAdulto;
    }
    public Mascota getMascotaMasPesada(){
        double mascotaMasPesada=0;
        int pos=0;
        for (int i=0;i<mascotas.length;i++){
            if (mascotas[i].getPeso()>mascotaMasPesada){
                mascotaMasPesada=mascotas[i].getPeso();
                pos=i;
            }
        }
        return mascotas[pos];
    }
}
