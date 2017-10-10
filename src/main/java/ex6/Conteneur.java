package ex6;

public class Conteneur {

	/** readOnly : boolean */
	private boolean readOnly;
	
	/** elements : Object[] */
	private Object[] elements;
	/** size : int */
	private int size;
	
	/**
	 * @param element
	 */
	public void add(Object element){
		if (canWrite()){
			this.verifTaille();
			elements[size++]=element;
		}
		
	}
	
	/** Vérifie la taille du tableau et le change dynamiquement
	 * 
	 */
	public void verifTaille() {
		int newSize = size+1;
		if (newSize > size) {
			Object[] newElements = new Object[size+10];
			for (int i=0; i<size; i++){
				newElements[i] = elements[i];
			}
			elements = newElements;
		}
	}
	
	/**	Regarde le contenu de la variable readOnly pour dire si on peut écrire
	 * @return
	 */
	public boolean canWrite() {
		if (readOnly) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * @param ok
	 */
	public void setReadOnly(boolean ok) {
		this.readOnly = ok;
	}
	
	/**
	 * @param i
	 * @return
	 */
	public Object getContent(int i){
		return elements[i];
	}
	
	/**
	 * @return
	 */
	public int getSize(){
		return size;
	}
}
