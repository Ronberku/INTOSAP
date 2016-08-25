package INTOSAP;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

public class Accueil {

		public static void main(String[] args) throws InvocationTargetException, InterruptedException {
			// TODO Auto-generated method stub
			SwingUtilities.invokeAndWait(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					JFrameAccueil fenetre_accueil = new JFrameAccueil();
					
					fenetre_accueil.setVisible(true);
				}
			});
		}
	}


