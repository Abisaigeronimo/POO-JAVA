package Archivo;

import java.io.*;
import java.util.ArrayList;

public class pruebaArchivo {

    private ArrayList<String> contenidoArchivo = new ArrayList<>();
    private ArrayList<Operador> listaEntrada = new ArrayList<>();
    private final String rutaWindows = ""C:\\Datos Java\\datos.txt"";


    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<Operador> getListaEntrada() {
        return listaEntrada;
    }

    public void leerArchivo(){
        LeerArchivo leer = new LeerArchivo();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaWindows);
        for (int i=0; i < this.contenidoArchivo.size();i++){
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split(",");
            try {
                int lunes= Integer.parseInt(elementosLinea[0]);
                int martes= Integer.parseInt(elementosLinea[1]);
                int miercoles= Integer.parseInt(elementosLinea[2]);
                int jueves= Integer.parseInt(elementosLinea[3]);
                int viernes= Integer.parseInt(elementosLinea[4]);
                int sabado= Integer.parseInt(elementosLinea[5]);
                listaEntrada.add(new Operador(lunes, martes, miercoles, jueves, viernes, sabado));
            } catch (NumberFormatException ex){
                ex.printStackTrace();
                listaEntrada.add(new Operador(0,0,0,0,0,0));
            }
        }
    }

    public void escribirArchivo(ArrayList<Operador> lista){
        String archivo = "resultados.csv";
        File f = new File(archivo);
        //Escritura
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Total Incentivos\n");
            for (int i=0; i < lista.size(); i++) {
                wr.append(lista.get(i).getLunes() +"," + lista.get(i).getMartes() + "," + lista.get(i).getMiercoles() + "," + lista.get(i).getJueves() + "," + lista.get(i).getViernes() + "," + lista.get(i).getSabado() + "," + lista.get(i).getTotalUnidades() + "\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }

    public static void main (String args[]){
        pruebaArchivo prueba = new pruebaArchivo();
        prueba.leerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++){
            System.out.println(prueba.getListaEntrada().get(i).getLunes() + "\t" +prueba.getListaEntrada().get(i).getMartes() + "\t" + prueba.getListaEntrada().get(i).getMiercoles() + "\t" + prueba.getListaEntrada().get(i).getJueves() + "\t" + prueba.getListaEntrada().get(i).getViernes() + "\t" + prueba.getListaEntrada().get(i).getSabado() + "\t" + prueba.getListaEntrada().get(i).getTotalUnidades());
        }
        prueba.escribirArchivo(prueba.getListaEntrada());

    }
}
