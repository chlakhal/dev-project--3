package dao;

import java.util.List;

import e_commerce_website.Commande;

public interface Commaneinterface {
	public boolean insertCommande(Commande model);
	//pour insérer la commande dans la base de donnée
	 public List<Commande> utilisateursCommandes(int id) ;
	 public void annulerCommande(int id);

}
