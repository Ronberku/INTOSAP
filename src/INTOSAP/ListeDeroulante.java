package INTOSAP;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JList;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class ListeDeroulante extends JList{
	
	public org.jdom2.Document document;
	public Element racine;
	public String[] tableau;

	public ListeDeroulante (String vType) {
		super();
	    File f = new File("/Intosap_java/configuration.xml");
	    System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());

		//Cr�ation d'une instance de SAXBuilder
		SAXBuilder sxb = new SAXBuilder();
		try{
	         //On cr�e un nouveau document JDOM avec en argument le fichier XML
	         document = sxb.build(new File("/Intosap_java/configuration.xml"));
	       //Le parsing est termin�
		}
	    catch(Exception e){}
		
	    //On initialise un nouvel �l�ment racine avec l'�l�ment racine du document.
	    racine = document.getRootElement();
	    
	    //Cr�ation de la liste
	    ArrayList<Object> listConfig = new ArrayList<Object>(racine.getChildren(vType));
	    		
	  		
	  	//Cr�ation de l'iterator sur la liste
	  	Iterator i = listConfig.iterator();
	  	int ind = 1;

	  	while(i.hasNext()){
	  		//Cr�ation de l'�l�ment courant
	  		Element ligneLu = (Element)i.next();
	  		//Ajout dans la liste deroulante de retour
	  		tableau[ind] = ligneLu.getChild("LIBELLE").getText();
	  		ind++;
	  	}
	  	this.setListData(tableau);
	}	
}
