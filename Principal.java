/*
 * Alina Carías (22539), Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 2
 * 30-01-2023
 * Clase Principal: para la interacción con el usuario
 */

 import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
                    
        Archivo archivo = new Archivo("./datos.txt");
        ArrayList<String> lineasDatos = archivo.leerArchivo();
        

        for (String fila : lineasDatos) {
            ArrayList<String> oneLine = new ArrayList<String>();
            String [] lineaSeparada = fila.split(" ");
            for (String caracter : lineaSeparada) {
                oneLine.add(caracter);
            }
            
            try {
                calculadora = new Calculadora();
                System.out.println("Resultado: " + calculadora.Calculate(oneLine));
            } catch (Exception nullException) {
                System.out.println("No se pudo realizar la operación, revise archivo de entrada");
            }
        }




        
    }








    
}
