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
                    
        ArrayList<ArrayList<String>> lineasSeparadas = new ArrayList<ArrayList<String>>();
        Archivo archivo = new Archivo("./datos.txt");
        ArrayList<String> lineasDatos = archivo.leerArchivo();
        ArrayList<String> oneLine = new ArrayList<String>();

        for (String fila : lineasDatos) {
            oneLine = fila.split(" ");
            String nombre = participanteString[0];
            int tipo = Integer.valueOf(participanteString[1]);
            boolean liderazgo = Boolean.valueOf(participanteString[2]);
            boolean colaboracion = Boolean.valueOf(participanteString[3]);
            boolean companierismo = Boolean.valueOf(participanteString[4]);
            boolean experiencia = Boolean.valueOf(participanteString[5]);
            boolean conocimiento = Boolean.valueOf(participanteString[6]);
            boolean creatividad = Boolean.valueOf(participanteString[7]);
            boolean barato = Boolean.valueOf(participanteString[8]);
            boolean profesional = Boolean.valueOf(participanteString[9]);
            boolean tiempoCompleto = Boolean.valueOf(participanteString[10]);

            Participante participante = new Participante(liderazgo, colaboracion, companierismo, experiencia, conocimiento, creatividad, barato, profesional, tiempoCompleto, nombre, tipo);
            potencialesParticipantes.add(participante);
        }
        
    }








    
}
