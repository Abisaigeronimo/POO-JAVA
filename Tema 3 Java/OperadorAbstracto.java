public abstract class OperadorAbstracto {

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