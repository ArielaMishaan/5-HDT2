/**
 * @author Seccion 40
 *
 * Alina Carías (22539), Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 2
 * 30-01-2023
 * Clase Calculadora: modela la calculadora Postfix, implementa la interface IPostfixCalculator
 */

public interface IPostfixCalculator<T> {
	
	public int Calculate(java.util.ArrayList<T> postfix_expression) throws Exception;
	
}