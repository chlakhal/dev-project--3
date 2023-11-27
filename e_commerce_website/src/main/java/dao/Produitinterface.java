package dao;

import java.util.ArrayList;
import java.util.List;

import e_commerce_website.Panier;
import e_commerce_website.Produit;

public interface Produitinterface {
	 public List<Produit> getAll(String catégorie);//pour montrer les produits selon leurs catégories
	 public List<Produit> getAll() ;
	 //pour afficher tous les produits
	 public List<Panier> getPanierProduits(ArrayList<Panier> panierList);//pour les produits qui sont sélectionnes dans le panier
	 public double getTotalPrixPanier(ArrayList<Panier> panierList);//pour le calcul du montant à payer
	 public Produit getSingleProduit(int id);
}
