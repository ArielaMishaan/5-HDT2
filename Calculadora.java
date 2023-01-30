import java.util.ArrayList;

/*
 * Alina Carías (22539), Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 2
 * 30-01-2023
 * Clase Calculadora: modela la calculadora Postfix, implementa la interface IPostfixCalculator
 */

public class Calculadora implements IPostfixCalculator {

    //Atributos
    private StackHandmade <Integer> stack;
    
    //Constructor

    public Calculadora() {
        this.stack = new StackHandmade();
    }

    public Calculadora(StackHandmade stack) {
        this.stack = stack;
    }    
    
    //Métodos
    /** 
     * @param postfix_expression
     * @return int
     * @throws Exception
     */
    @Override
    public int Calculate(ArrayList postfix_expression) throws Exception {
        int resultado = 0;
        ArrayList<String> caracteres = postfix_expression;
        for(String caracter : caracteres){
            if(verificar(caracter)){
                int numero = Integer.parseInt(caracter);
                stack.push(numero);
            }
            else if(verificar(caracter) == false){
                if(caracter.equals("+")){
                    resultado = stack.pull() + stack.pull();
                    stack.push(resultado);
                }
                else if(caracter.equals("-")){
                    resultado = stack.pull() - stack.pull();
                    stack.push(resultado);
                }
                else if(caracter.equals("*")){
                    resultado = stack.pull() * stack.pull();
                    stack.push(resultado);
                }
                else if(caracter.equals("/")){
                    resultado = stack.pull() / stack.pull();
                    stack.push(resultado);
                }
            }
        }              

        return resultado;
    }

    private boolean verificar(String caracter){
        try {
            Integer.parseInt(caracter);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
    
}
