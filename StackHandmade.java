/**
 * @author moises.alonso
 *
 * Alina Carías (22539), Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 2
 * 30-01-2023
 * Clase StackHandmade: modela la estructura de datos Stack. 
 */
public class StackHandmade<T> implements IStack<T> {

	private Node<T> top;
	int count;
	
	public StackHandmade() {
		top = null;
		count = 0;
	}
	
	
	/** 
	 * @return int
	 */
	@Override
	public int count() {
		return count;
	}

	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {
		return count() == 0;
	}

	
	/** 
	 * @param value
	 */
	@Override
	public void push(T value) {
		Node<T> newNode = new Node<T>(value);
		
		if (isEmpty()) {
			top = newNode;
		} else {
			newNode.setNext(top);
			top = newNode;
		}
		
		count++;
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T pull() {
		
		if (isEmpty()) {
			return null;
		} else {
			Node<T> temp = top;
			top = top.getNext();
			count--;
			
			return temp.getValue();
		}
		
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T peek() {
		
		if (isEmpty()) {
			return null;
		} else {
			return top.getValue();
		}
		
	}

}
