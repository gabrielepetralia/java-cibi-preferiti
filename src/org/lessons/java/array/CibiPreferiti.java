package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		
		String[] classificaCibi = { "pizza", "pasta", "pesce", "gelato", "cioccolato" };
		
		System.out.println("Cibi Preferiti");
		System.out.println("==============");
		
		System.out.println("La classifica contiene " + classificaCibi.length + " cibi \n");
		
		System.out.println("Il primo cibo in classifica è '" + classificaCibi[0] + "'");
		System.out.println("L'ultimo cibo in classifica è '" + classificaCibi[classificaCibi.length - 1] + "'");
		System.out.println("L'ultimo cibo in classifica è '" + classificaCibi[classificaCibi.length - 1] + "'");
		
		if(classificaCibi.length%2 != 0) {
			System.out.println("Il cibo a metà classifica è '" + classificaCibi[classificaCibi.length/2] + "'");
		} else {
			System.out.println("I cibi a metà classifica sono '" + classificaCibi[classificaCibi.length/2-1] + "' e '" + classificaCibi[classificaCibi.length/2] + "'");
		}
	}
}
