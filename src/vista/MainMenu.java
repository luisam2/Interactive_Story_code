
/****************************************************** IMPORTANTE **********************************************************/	
/**************************************************************************************************************************/	

/* ESTA ALGO PESADO POR LAS ILUSTRACIONES HEHE
 * 
 * INTERACCIONES EN ORDEN
 * EFECTO PARALLAX
 * 1 ALICIA (PARADA) 
 * 2 ALICIA (SENTADA)
 * 3 TETERA 
 * 4 CONEJO
 * 5 SOMBRERERO
 * 6 GATO
 */

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
	} 

	public void setup () {

	/***LOAD IMAGES**/
		//START
		start = loadImage ("images/start.png");
		intro = loadImage ("images/intro.png");
		intro2 = loadImage ("images/intro2.png");
		intro3 = loadImage ("images/intro3.png");
		stage1 = loadImage ("images/stage1.png");
		stage2 = loadImage ("images/stage2.png");
		end = loadImage ("images/end.png");
			
	//PARALLAX
		parallax  = loadImage ("images/fondo.jpg");
		
	/***CHARACTERS***/
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
		
		//SELECTIONS
		sel_teapot = loadImage ("images/sel_teapot.png");;
		sel_alice1 = loadImage ("images/sel_alice1.png");;
		sel_alice2 = loadImage ("images/sel_alice2.png");;
		sel_bunny1 = loadImage ("images/sel_bunny1.png");;
		sel_mad = loadImage ("images/sel_mad.png");;
		sel_cat = loadImage ("images/sel_cat.png");;
			
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
		bunny = false;
		madhat = false;
		cat = false;
		//
		clickcounter1 = 0; //TEAPOT
		clickcounter2 = 0; //ALICE
		clickcounter4 = 0; //BUNNY
		clickcounter3 = 0; //THE MAD HATTER
		clickcounter5 = 0; //CAT
			
	} //End setup

	
	public void draw () {

		switch (screen) {
		case 1: 
			image (start, 0,0);
			if (mouseX > 484 && mouseX < 484 + 233 && mouseY > 551 && mouseY < 551 + 91) { //show the cursor on the button
				cursor(HAND);
			} else {
				cursor(ARROW);
		}		
			break;
			
		case 2:
			image (intro, 0,0);
			if ((mouseX > 858 && mouseX < 858 + 233 && mouseY > 608 && mouseY < 608 + 91) //show the cursor on the next button
				|| (mouseX > 66 && mouseX < 66 + 67 && mouseY > 89 && mouseY < 89 + 63)) {//show the cursor on the back button
				cursor(HAND);
			} else {
				cursor(ARROW);
			}
			
			break;
		case 3:
			image (intro2, 0,0);
			if ((mouseX > 858 && mouseX < 858 + 233 && mouseY > 608 && mouseY < 608 + 91) //show the cursor on the next button
				|| (mouseX > 66 && mouseX < 66 + 67 && mouseY > 89 && mouseY < 89 + 63)) {//show the cursor on the back button
					cursor(HAND);
				} else {
					cursor(ARROW);
				}
			
			break;
		case 4:
			image (intro3, 0,0);
			if ((mouseX > 858 && mouseX < 858 + 233 && mouseY > 608 && mouseY < 608 + 91) //show the cursor on the next button
				|| (mouseX > 66 && mouseX < 66 + 67 && mouseY > 89 && mouseY < 89 + 63)) {//show the cursor on the back button
					cursor(HAND);
				} else {
					cursor(ARROW);
				}
			break;
		
		case 5:
		//STAGE1	
			/*** THE PARALLAX THING ***/ 
			//its the middle of the whole canvas 1200/2 =600 so -600 
			float first=map(mouseX,0,width,0,-600);
			image(parallax,first+0,0,1793,806);
			image (chairs,0,0);//BACKGROUND ITEMS
			image (stage1, -6,0);//CHARACTERS FIRST APPEARENCE
			
			if (teapot == false && alice == false && bunny == false && madhat == false && cat == false
					&& mouseX > 915 && mouseX < 915 + 203 && mouseY > 175 && mouseY < 175 + 593) {
					image (sel_alice1,-5,0); //ALICE stage 1 selection
			}
			break;
			
		case 6:
		//STAGE2
			// THE PARALLAX THING
				float second=map(mouseX,0,width,0,-600);
				image(parallax,second+0,0,1793,806);
				image (chairs,0,0);//BACKGROUND ITEMS
				
				//CHARACTERS SECOND APPEARENCE
				image (alice2, 0,0);
				image (madhat2, 0,0);
				image (bunny2, 0,0);
				image (table,0,0);
				image (teapot1,0,0);
				image (stage2,0,0,1200,806);
				image (cat1,0,0);//CAT
				image (frame,0,0);
			
				if (mouseX > 1042 && mouseX < 1042 + 90 && mouseY > 83 && mouseY < 83 + 70) {//show the cursor on the next button
					cursor(HAND);
				} else {
					cursor(ARROW);
				}
					
				break;
				
			
/****************************************************** GAME-PLAY SCREEN **********************************************************/	
		
		case 7:

		//THE PARALLAX THING
			float last=map(mouseX,0,width,0,-600);
			image(parallax,last+0,0,1793,806);
			image (chairs,0,0);//BACKGROUND ITEMS
			
			//CHARACTERS FIRST APPEARENCE
			image (alice2, 0,0);
			image (madhat3, 0,0);
			image (bunny3, 0,0);
			
			//CHARACTERS EXPRESSIONS
			bunnyExpressions();
			madhatExpressions();
			aliceExpressions();
			
			// ITEMS
			image (table,0,0);
			image (teapot1,0,0);
			image (catchair,0,0);
			catFace(); //CAT
			showDialogues(); //DIALOGUES
			showSelectedItems(); //SHOW ITEMS SELECTIONS
			image (frame,0,0);  //GAME WHITE FRAME
			
			if (teapot == true && alice == true && bunny == true && madhat == true && cat == true 	//show cursor of next button
					&& clickcounter5 ==1	
					&& mouseX > 1042 && mouseX < 1042 + 90 && mouseY > 83 && mouseY < 83 + 70) {
				cursor(HAND);
			} else {
				cursor(ARROW);	
			}
			break;
			
		case 8:
			//END GAME
			image (end,0,0);
	
			if (mouseX > 483 && mouseX < 483 + 233 && mouseY > 566 && mouseY < 566 + 54) {//FINAL BUTTON EXIT CURSOR
				cursor(HAND);
			} else {
				cursor(ARROW);
			}
			break;

		} // end switch 
	} // end draw

	
	public void mousePressed () {

		switch (screen) {
		
		//START SCREEN 
		case 1:
			if (mouseX > 484 && mouseX < 484 + 233 && mouseY > 551 && mouseY < 551 + 91) //START BUTTON 
				screen = 2; 
			break;
		
		//INTRO SCREEN
		case 2:
			if (mouseX > 858 && mouseX < 858 + 233 && mouseY > 608 && mouseY < 608 + 91) //NEXT BUTTON
				screen = 3; 
			if (mouseX > 66 && mouseX < 66 + 67 && mouseY > 89 && mouseY < 89 + 63) //BACK BUTTON
				screen = 1;
			break;
			
		//INTRO 2
		case 3:
			if (mouseX > 858 && mouseX < 858 + 233 && mouseY > 608 && mouseY < 608 + 91) //NEXT BUTTON
				screen = 4;
			if (mouseX > 66 && mouseX < 66 + 67 && mouseY > 89 && mouseY < 89 + 63) //BACK BUTTON
				screen = 2;
			break;
			
		//INTRO 3
		case 4:
			if (mouseX > 858 && mouseX < 858 + 233 && mouseY > 608 && mouseY < 608 + 91) //NEXT BUTTON
				screen = 5;
			if (mouseX > 66 && mouseX < 66 + 67 && mouseY > 89 && mouseY < 89 + 63) //BACK BUTTON
				screen = 3;
			break;
			
		//STAGE 1
		case 5:
			if (mouseX > 915 && mouseX < 915 + 203 && mouseY > 175 && mouseY < 175 + 593) //CLIC ON ALICE = NEXT SCREEN
				screen = 6;
			break;
			
		//STAGE 2
		case 6:
			if (mouseX > 1042 && mouseX < 1042 + 90 && mouseY > 83 && mouseY < 83 + 70) //NEXT BUTTON
					screen = 7;
			break;																											
	
/****************************************************** GAME-PLAY SCREEN **********************************************************/																																

		//CLICKCOUNTERS
		case 7:
		if (mouseX > 660 && mouseX < 660 + 130 && mouseY > 400 && mouseY < 400 + 100) { //TEAPOD
				clickcounter1 ++;
			} 

		if (mouseX > 600 && mouseX < 600 + 203 && mouseY > 234 && mouseY < 234 + 169) { //ALICE
				clickcounter2 ++;
			}
		if (mouseX > 62 && mouseX < 62 + 155 && mouseY > 281 && mouseY < 281 + 244) { //BUNNY
			clickcounter3 ++;
		}
		if (mouseX > 272 && mouseX < 272 + 163 && mouseY > 159 && mouseY < 159 + 322) { //MAD HATTER
			clickcounter4 ++;
		}
		if (mouseX > 724 && mouseX < 724 + 442 && mouseY > 456 && mouseY < 456 + 219) { //CAT
			clickcounter5 ++;
		}

	///CLICS 
		//ON TEAPOT	
		if (mouseX > 660 && mouseX < 660 + 130 && mouseY > 400 && mouseY < 400 + 100 && clickcounter1 %2 == 1 ){
				teapot = true;
				dialogue3 = true;
			}
		if (mouseX > 660 && mouseX < 660 + 130 && mouseY > 400 && mouseY < 400 + 100 && clickcounter1 %2 == 0 ){
				teapot = false;
				dialogue3 = false;
			}
		//ON ALICE	
		if (alice == false && clickcounter2 == 1 && mouseX > 600 && mouseX < 600 + 203 && mouseY > 234 && mouseY < 234 + 169) {
				alice = true;
				dialogue4 = true;
			}
			
		if (alice == true && clickcounter2 == 2 && mouseX > 600 && mouseX < 600 + 203 && mouseY > 234 && mouseY < 234 + 169) {
				alice = true;
				dialogue5 = true;
			}
		//ON BUNNY	
		if (bunny == false && clickcounter3 == 1 && mouseX > 62 && mouseX < 62 + 155 && mouseY > 281 && mouseY < 281 + 244) {
				bunny = true;
				dialogue6 = true;
			}
				
			if (bunny == true && clickcounter3 == 2 && mouseX > 62 && mouseX < 62 + 155 && mouseY > 281 && mouseY < 281 + 244) {
				bunny = true;
				dialogue7 = true;
			}
		//ON MAD HATTER	
		if (madhat == false && clickcounter4 == 1 && mouseX > 272 && mouseX < 272 + 163 && mouseY > 159 && mouseY < 159 + 322) {
				madhat = true;
				dialogue8 = true;
			}
					
		if (madhat == true && clickcounter4 == 2 && mouseX > 272 && mouseX < 272 + 163 && mouseY > 159 && mouseY < 159 + 322) {
				madhat = true;
				dialogue9 = true;
			}
		if (madhat == true && clickcounter4 == 3 && mouseX > 272 && mouseX < 272 + 163 && mouseY > 159 && mouseY < 159 + 322) {
				madhat = true;
				dialogue10 = true;
			}	
		if (madhat == true && clickcounter4 == 4 && mouseX > 272 && mouseX < 272 + 163 && mouseY > 159 && mouseY < 159 + 322) {
				madhat = true;
				dialogue11 = true;
			}	
		//ON CAT
		if (mouseX > 724 && mouseX < 724 + 442 && mouseY > 456 && mouseY < 456 + 219 && clickcounter5 %2 == 1 ){
				cat = true;
				dialogue12 = true;
			}
		if (mouseX > 724 && mouseX < 724 + 442 && mouseY > 456 && mouseY < 456 + 219 && clickcounter5 %2 == 0 ){
				cat = false;
				dialogue12 = false;
			}
		
		//next button
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == true
				&& clickcounter5 ==1
				&& mouseX > 1042 && mouseX < 1042 + 90 && mouseY > 83 && mouseY < 83 + 70){
			screen = 8;
		}
			break;
			
		case 8:
			//END GAME
			if (mouseX > 483 && mouseX < 483 + 233 && mouseY > 566 && mouseY < 566 + 54){//EXIT BUTTON
				exit();	
			}	
			break;
		} //Switch
	} //mouse pressed

/****************************************************** METHODS **********************************************************/
	
	public void showDialogues () {
		
		PImage dialogues = null ;//DIALOGUE ON SCREEN
		//DIALOG OF TEAPOT
		if (dialogue3 == true && teapot == true && alice == false && bunny == false && madhat == false && cat == false) { 
			dialogues = dialogue3img;
		}
		//DIALOGS FOR ACILCE 1
		if (dialogue4 == true && teapot == true && alice == true && bunny == false && madhat == false && cat == false) { 
			dialogues = dialogue4img;
		}
		//DIALOGS FOR ACILCE 2
		if (dialogue5 == true && teapot == true && alice == true && bunny == false && madhat == false && cat == false) { 
			dialogues = dialogue5img;
		}
		//DIALOGS FOR BUNNY 1
		if (dialogue6 == true && teapot == true && alice == true && bunny == true  && madhat == false && cat == false) { 
			dialogues = dialogue6img;
		}
		//DIALOGS FOR BUNNY 2
		if (dialogue7 == true && teapot == true && alice == true && bunny == true && madhat == false && cat == false) { 
			dialogues = dialogue7img;
		}
		//DIALOGS FOR MAD HATTER 1
		if (dialogue8 == true && teapot == true && alice == true && bunny == true && madhat == true && cat == false) { 
			dialogues = dialogue8img;
		}
		//DIALOGS FOR MAD HATTER 2
		if (dialogue9 == true && teapot == true && alice == true && bunny == true && madhat == true && cat == false) { 
			dialogues = dialogue9img;
		}
		//DIALOGS FOR MAD HATTER 3
		if (dialogue10 == true && teapot == true && alice == true && bunny == true && madhat == true && cat == false) { 
			dialogues = dialogue10img;
		}
		//DIALOGS FOR MAD HATTER 4
		if (dialogue11 == true && teapot == true && alice == true && bunny == true && madhat == true && cat == false) { 
			dialogues = dialogue11img;
		}
		//DIALOGS FOR CAT
		if (dialogue12 == true && teapot == true && alice == true && bunny == true && madhat == true && cat == true) { 
			dialogues = dialogue12img;
		}
		
		if (dialogues != null) {		
			image (dialogues,0,0); 
		}

	} //END

	public void aliceExpressions () {
		
		//ANOYED
		PImage aliceFace= null;
		if (teapot == true && alice == true && bunny == false && madhat == false && cat == false && clickcounter2 ==2) { 
			aliceFace = alice4;
		}
		if (teapot == true && alice == true && bunny == true && madhat == false && cat == false && clickcounter3 ==1) { 
			aliceFace = alice4;
		}
		if (teapot == true && alice == true && bunny == true && madhat == false && cat == false && clickcounter3 ==2) { 
			aliceFace = alice4;
		}
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false && clickcounter4 ==1) { 
			aliceFace = alice4;
		}
		//HAPPY
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false && clickcounter4 ==2) { 
			aliceFace = alice3;
		}
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false && clickcounter4 ==3) { 
			aliceFace = alice3;
		}
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false && clickcounter4 ==4) { 
			aliceFace = alice5;
		}
		//CAT FINAL
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == true && clickcounter5 ==1) { 
			aliceFace =  alice5; 
		}
		
		if (aliceFace != null) {		
			image (aliceFace,0,0);
			}
	}//END

	public void bunnyExpressions () {
		
		//ENOJO
		PImage bunnyFace= null;
		if (teapot == true && alice == true && bunny == false && madhat == false && cat == false && clickcounter3 ==2) { 
			bunnyFace = bunny4;
		}
		if (teapot == true && alice == true && bunny == true && madhat == false && cat == false && clickcounter3 ==1) { 
			bunnyFace = bunny4;
		}
		//ASHAMED
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false && clickcounter4 ==4) { 
			bunnyFace = bunny5;
		}
		//CAT FINAL
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == true && clickcounter5 ==1) { 
			bunnyFace = bunny5;
		}
		if (bunnyFace != null) {		
			image (bunnyFace,0,0);
			}

	}//END

	public void madhatExpressions () {
		
		//SPEAKING
		PImage madhatFace= null;
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false && clickcounter4 ==1) { 
			madhatFace = madhat4;
		}
		//EYES CLOSED
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false && clickcounter4 ==2) { 
			madhatFace = madhat5;
		}
		//lIL MAD
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false && clickcounter4 ==3) { 
			madhatFace = madhat3;
		}
		//SUPER MAD
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false && clickcounter4 ==4) { 
			madhatFace = madhat6;
		}
		//CAT FINAL
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == true && clickcounter5 ==1) { 
			madhatFace = madhat6;
		}
		
		if (madhatFace != null) {		
			image (madhatFace,0,0);
			}
	}//END
	
	public void catFace () {
		
		PImage Now= null ;
		//APPEAR1
		if (teapot == false && alice == false && bunny == false && madhat == false && cat == false) {
			Now = cat1; 
		}
		if (teapot == true && alice == false && bunny == false && madhat == false && cat == false) {
			Now = cat1; 
		}
		if (teapot == true && alice == true && bunny == false && madhat == false && cat == false) {
			Now = cat1; 
		}
		if (teapot == true && alice == true && bunny == true && madhat == false && cat == false) {
			Now = cat1; 
		}
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false) {
			Now = cat1; 
		}
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == true) {
			Now = cat1; 
		}
		//DESAPAIR
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == true && clickcounter5 ==1 ) {
			Now = cat2; 
		}
		
		if (Now != null) {		
			image (Now,0,0);
		}		
	}//END
	
	public void showSelectedItems () {
		
		if (teapot == false && alice == false && bunny == false && madhat == false && cat == false
				&& mouseX > 660 && mouseX < 660 + 130 && mouseY > 400 && mouseY < 400 + 100) {
				image (sel_teapot,0,0); //teapot selection
		}
		
		if (teapot == true && alice == false && bunny == false && madhat == false && cat == false
				&& clickcounter1 ==1	
				&& mouseX > 600 && mouseX < 600 + 203 && mouseY > 234 && mouseY < 234 + 169) {
				image (sel_alice2,0,0); // ALICE selection 1
		}
		if (teapot == true && alice == true && bunny == false && madhat == false && cat == false
				&& clickcounter2 ==1	
				&& mouseX > 600 && mouseX < 600 + 203 && mouseY > 234 && mouseY < 234 + 169) {
				image (sel_alice2,0,0); // ALICE selection 2
			}
		if (teapot == true && alice == true && bunny == false && madhat == false && cat == false
				&& clickcounter2 ==2	
				&& mouseX > 62 && mouseX < 62 + 155 && mouseY > 281 && mouseY < 281 + 244) { 
				image (sel_bunny1,0,0); // bunny selection 1
		}
		if (teapot == true && alice == true && bunny == true && madhat == false && cat == false
				&& clickcounter3 ==1	
				&& mouseX > 62 && mouseX < 62 + 155 && mouseY > 281 && mouseY < 281 + 244) { 
				image (sel_bunny1,0,0); // bunny selection 2
		}
		if (teapot == true && alice == true && bunny == true && madhat == false && cat == false
				&& clickcounter3 ==2	
				&& mouseX > 272 && mouseX < 272 + 163 && mouseY > 159 && mouseY < 159 + 322) { 
				image (sel_mad,0,0); // mad hater selection 2
		}
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false
				&& clickcounter4 ==1	
				&& mouseX > 272 && mouseX < 272 + 163 && mouseY > 159 && mouseY < 159 + 322) { 
				image (sel_mad,0,0); // mad hater selection 2
		}
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false
				&& clickcounter4 ==2	
				&& mouseX > 272 && mouseX < 272 + 163 && mouseY > 159 && mouseY < 159 + 322) { 
				image (sel_mad,0,0); // mad hater selection 2
		}
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false
				&& clickcounter4 ==3	
				&& mouseX > 272 && mouseX < 272 + 163 && mouseY > 159 && mouseY < 159 + 322) { 
				image (sel_mad,0,0); // mad hater selection 2
		}
		if (teapot == true && alice == true && bunny == true && madhat == true && cat == false
				&& clickcounter4 ==4	
				&& mouseX > 724 && mouseX < 724 + 442 && mouseY > 456 && mouseY < 456 + 219) {
				image (sel_cat,0,0); // cat  
		}
	}//END
			
} //END GENERAL MAINMENU


