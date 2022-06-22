public class Operador {

    //Atributos generales
    private final float cantidadUnidades;
    private final float totalUnidades;
    private float lunes;
    private float martes;
    private float miercoles;
    private float jueves;
    private float viernes;
    private float sabado;
    private float domingo;

    //Metodo Constructor
    public Operador(float lunes, float martes, float miercoles, float jueves, float viernes, float sabado) {
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.cantidadUnidades= lunes + martes + miercoles + jueves + viernes + sabado;
        this.totalUnidades = cantidadUnidades/6;


        if (totalUnidades >=100) {
            System.out.println("Tus incentivos son de: " + totalUnidades);
            System.out.println("Recibirás tus incentivos");
        } else {
            System.out.println("Tus incentivos son de: " + totalUnidades);
            System.out.println("No recibirás tus incentivos");
        }

    }

    //Sobrecarga
    public Operador(float lunes, float martes, float miercoles, float jueves, float viernes, float sabado,float domingo) {
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
        this.cantidadUnidades= lunes + martes + miercoles + jueves + viernes + sabado + domingo;
        this.totalUnidades = cantidadUnidades/7;

        if (totalUnidades >=100) {
            System.out.println("Tus incentivos son de: " + totalUnidades);
            System.out.println("Recibirás tus incentivos");
        } else {
            System.out.println("Tus incentivos son de: " + totalUnidades);
            System.out.println("No recibirás tus incentivos");
        }

    }

    //Metodo de clase
    public static float calcularIncentivo(float lunes, float martes, float miercoles, float jueves, float viernes, float sabado) {
        float calcularUnidades = lunes + martes + miercoles + jueves + viernes + sabado;
        float totalUnidades = calcularUnidades /6;

        if (totalUnidades >=100) {
            System.out.println("Tus incentivos son de: " + totalUnidades);
            System.out.println("Recibirás tus incentivos");
        } else {
            System.out.println("Tus incentivos son de: " + totalUnidades);
            System.out.println("No recibirás tus incentivos");
        }
        return totalUnidades;
    }

}