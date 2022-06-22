public class Main {

    public static void main(String[] args) {

        System.out.print("Resultado del metodo de instancia");
        System.out.println(" ");
        Operador operador = new Operador(80,100,120,140,160,180);

        System.out.println(" ");
        System.out.print("Resultado de la clase abstracta");
        System.out.println(" ");
        System.out.print(OperadorAbstracto.calcularIncentivo(80,100,120,140,160,180));

        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Resultado de la sobrecarga");
        System.out.println(" ");
        Operador operador1 = new Operador(80,100,120,140,160,180,200);

        System.out.println(" ");
        System.out.println("Resultado del metodo de clase");
        System.out.println(Operador.calcularIncentivo(80,100,120,140,160,180));


    }
}