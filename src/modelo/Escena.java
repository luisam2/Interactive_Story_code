package modelo;

import processing.core.PApplet;

public class Escena extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Escena.class.getName());
	} 

	public void settings () {
	}	

	public void setup (String palabra) {

		if (palabra!=null) {

			String[] lines = loadStrings ("../resources/Texto_Cuento.txt");

			if (lines!=null) {

				String [] newLines = new String [lines.length];
				for (int i = 0; i < lines.length; i++) {

					String currentWord = lines [i];
					if (currentWord == palabra)
					{
						currentWord = lines [i].toUpperCase();
					}
					newLines [i] = currentWord;
				}
				saveStrings ("../resources/Texto_Cuento", newLines);
			}
		}
	}
}



