import java.util.*;
import java.io.*;
public class TexteCentre{
	private String texte;
	private int largeur;
	TexteCentre(String texte){
		this.texte= texte;
		int l = texte.length();
		this.largeur= 80;//l /(l % 20);
	}
	// private int calculLargeur(){
	// 	int taille_texte = this.texte.length();
	// 	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	// 	double width = screenSize.getWidth();

	// }
	void fixeLargeur(int l){
        this.largeur = l;
	}
	String texte(){
		return this.texte;
	}
	@Override
	public String toString(){
		int padding = (largeur - texte.length())/2;
		String centeredString = String.format("%" + (padding + texte.length()) + "s", texte);
		return centeredString;
	}
}