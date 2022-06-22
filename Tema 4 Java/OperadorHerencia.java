public class OperadorHerencia extends OperadorPadre{

    public OperadorHerencia(float lunes, float martes, float miercoles, float jueves, float viernes, float sabado) {
        super(lunes, martes, miercoles, jueves, viernes, sabado);
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
}