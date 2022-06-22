package Archivo;

public class Operador {

    private final int cantidadUnidades;
    private final int totalUnidades;
    private int lunes;
    private int martes;
    private int miercoles;
    private int jueves;
    private int viernes;
    private int sabado;

    public Operador(int lunes, int martes, int miercoles, int jueves, int viernes, int sabado) {
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.cantidadUnidades= lunes + martes + miercoles + jueves + viernes + sabado;
        this.totalUnidades = cantidadUnidades/6;
        this.calcularIncentivos();

    }
    public void calcularIncentivos(){
        if (totalUnidades >=100) {
            System.out.println("Tus incentivos son de: " + totalUnidades);
            System.out.println("Recibirás tus incentivos");
        } else {
            System.out.println("Tus incentivos son de: " + totalUnidades);
            System.out.println("No recibirás tus incentivos");
        }
    }

    public int getTotalUnidades(){
        return totalUnidades;
    }


    public int getLunes(){
        return lunes;
    }

    public int getMartes(){
        return martes;
    }

    public int getMiercoles(){
        return miercoles;
    }

    public int getJueves(){
        return jueves;
    }

    public int getViernes(){
        return viernes;
    }

    public int getSabado() {
        return sabado;
    }

    public static void main(String[] args) {
        Operador operador = new Operador(150,164,150,250,300,550);
    }

}
