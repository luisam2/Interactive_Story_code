

package vista;

/*import java.lang.reflect.Array;
import java.util.ArrayList;
import controlador.Movimiento;*/
import processing.core.PApplet;
import modelo.Escena;
import processing.core.PImage;


public class MainMenu extends PApplet {	
	public static void main(String[] args) {

		String[] processingArgs = {"MainMenu"};
		MainMenu mySketch = new MainMenu();
		PApplet.runSketch(processingArgs, mySketch);
	} //end main

	/****VARIABLES***/
	//FOR THE IMAGES
		//COMPLETED SCREENS
		PImage start;
		PImage intro;
		PImage intro2;
		PImage intro3;
		PImage stage1;
		PImage stage2;
		PImage end;
	
	//PARALLAX
		PImage parallax;
	
	//CHARACTERS
		//ALICE
		PImage alice1;
		PImage alice2;
		PImage alice3;
		PImage alice4;
		PImage alice5;	
		
		//THE MAD HATTER
		PImage madhat2;
		PImage madhat3;
		PImage madhat4;
		PImage madhat5;
		PImage madhat6;
		
		//BUNNY
		PImage bunny2;
		PImage bunny3;
		PImage bunny4;
		PImage bunny5;
		
		// CAT
		PImage cat1;
		PImage cat2;
		
		//ITEMS
		PImage frame;
		PImage teapot1;
		PImage catchair;
		PImage table;
		PImage chairs;
		
		//SELECTIONS
		PImage sel_teapot;
		PImage sel_alice1;
		PImage sel_alice2;
		PImage sel_bunny1;
		PImage sel_mad;
		PImage sel_cat;

		//DIALOGUES IMAGES
		PImage dialogue1img;
		PImage dialogue2img;
		PImage dialogue3img;
		PImage dialogue4img;
		PImage dialogue5img;
		PImage dialogue6img;
		PImage dialogue7img;
		PImage dialogue8img;
		PImage dialogue9img;
		PImage dialogue10img;
		PImage dialogue11img;
		PImage dialogue12img;
		
	//BOOLEAN STATES
		boolean dialogue1;
		boolean dialogue2;
		boolean dialogue3;
		boolean dialogue4;
		boolean dialogue5;
		boolean dialogue6;
		boolean dialogue7;
		boolean dialogue8;
		boolean dialogue9;
		boolean dialogue10;
		boolean dialogue11;
		boolean dialogue12;
		//
		boolean teapot;
		boolean alice;
		boolean madhat;
		boolean bunny;
		boolean cat;
	//
		int screen;
		int clickcounter1;
		int clickcounter2;
		int clickcounter3;
		int clickcounter4;
		int clickcounter5;
		int segundos;
	
	//MODEL
		Escena palabra;
		
	//END
	
	public void settings () {
		size (1200,806);
		screen = 1;                              
	} //here commit

	public void setup () {

	//LOAD IMAGES 
		//START
			start = loadImage ("images/start.png");
			intro = loadImage ("images/intro.png");
			intro2 = loadImage ("images/intro2.png");
			intro3 = loadImage ("images/intro3.png");
			stage1 = loadImage ("images/stage1.png");
			stage2 = loadImage ("images/stage2.png");
			//button = loadImage ("images/button.png");
			
		//PARALLAX
			parallax  = loadImage ("images/fondo.jpg");
		
		//CHARACTERS
		//ALICE
			alice1 = loadImage ("images/alice1.png");
			alice2 = loadImage ("images/alice2.png");
			alice3 = loadImage ("images/alice3.png");
			alice4 = loadImage ("images/alice4.png");
			alice5 = loadImage ("images/alice5.png");
			
		//THE MAD HATTER
			madhat2 = loadImage ("images/madhat2.png");
			madhat3 = loadImage ("images/madhat3.png");
			madhat4 = loadImage ("images/madhat4.png");
			madhat5 = loadImage ("images/madhat5.png");
			madhat6 = loadImage ("images/madhat6.png");
			
		//BUNNY
			bunny2 = loadImage ("images/liebre2.png");
			bunny3 = loadImage ("images/liebre3.png");
			bunny4 = loadImage ("images/liebre4.png");
			bunny5 = loadImage ("images/liebre5.png");
		
		//CAT
			cat1 = loadImage ("images/cat1.png");
			cat2 = loadImage ("images/cat2.png");
			
		//ITEMS
			frame = loadImage ("images/marco.png");
			teapot1 = loadImage ("images/tetera.png");
			catchair = loadImage ("images/sillagato.png");
			table = loadImage ("images/mesa.png");
			chairs = loadImage ("images/sillas.png");
			
		//DIALOGUES IMAGES
			dialogue1img = loadImage ("images/dialogue1img.png");
			dialogue2img = loadImage ("images/dialogue2img.png");
			dialogue3img = loadImage ("images/dialogue3img.png");
			dialogue4img = loadImage ("images/dialogue4img.png");
			dialogue5img = loadImage ("images/dialogue5img.png");
			dialogue6img = loadImage ("images/dialogue6img.png");
			dialogue7img = loadImage ("images/dialogue7img.png");
			dialogue8img = loadImage ("images/dialogue8img.png");
			dialogue9img = loadImage ("images/dialogue9img.png");
			dialogue10img = loadImage ("images/dialogue10img.png");
			dialogue11img = loadImage ("images/dialogue11img.png");
			dialogue12img = loadImage ("images/dialogue12img.png");

		//INITIALIZE BOOLEANS + VARIABLES
			teapot = false;
			alice = false;
			madhat = false;
			bunny = false;
			cat = false;
		
			clickcounter1 = 0; //TEAPOT
			clickcounter2 = 0; //ALICE
			clickcounter3 = 0; //THE MAD HATTER
			clickcounter4 = 0; //BUNNY 
			clickcounter5 = 0; //CAT
			
			
	} //End setup

	
	public void draw () {

		switch (screen) {

		case 1: 
			image (start, 0,0);
			break;
		case 2:
			image (intro, 0,0);
			break;
		case 3:
			image (intro2, 0,0);
			break;
		case 4:
			image (intro3, 0,0);
			break;
		case 5:
		
			break;
		
		case 6:
		
			break;
			
////////////////////////////////////////////////GAME-PLAY SCREEN////////////////////////////////////////////	
		case 7:

	
			break;
		} // END SWITCH
	} // DRAW

	
	public void mousePressed () {

	

	} //MOUSEPRESSED

	//////////////////////////////////////////METHODS/////////////////////////////////////////////
	

	public void showDialogues () {

	} //dilogues

	public void catExpressions () {

	}//catex

	public void aliceExpressions () {

	
	}//aliceex

	public void bunnyExpressions () {

		
	}//bunnyex

	public void madhatExpressions () {

		
	}//madex
	
	
	
} //MAINMENU