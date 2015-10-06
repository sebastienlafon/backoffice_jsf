/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greta.speedymarket.services;
import greta.speedymarket.dao.TbCommandeDAO;
import greta.speedymarket.dao.TbLigneCommandeDAO;
import greta.speedymarket.model.TbCommande;
import greta.speedymarket.model.TbLigneCommande;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 *
 * @author admin Sébastien LAFON
 */
@ManagedBean(name="TbLigneCommandeService")
public class TbLigneCommandeService {
    
    @ManagedProperty(value="#{TbLigneCommandeDAO}")
    TbLigneCommandeDAO tbLigneCommandeDAO;
    
    private TbLigneCommande selectedLigneCommande;

    public TbLigneCommande getSelectedLigneCommande() {
        return selectedLigneCommande;
    }

    public void setSelectedLigneCommande(TbLigneCommande selectedLigneCommande) {
        this.selectedLigneCommande = selectedLigneCommande;
    }
    
    public void setTbLigneCommandeDAO(TbLigneCommandeDAO tbLigneCommandeDAO) {
        this.tbLigneCommandeDAO = tbLigneCommandeDAO;
    }
    
    public List<TbLigneCommande> loadLigneCommandes() {
        System.out.println("loadLigneCommandes");
        return tbLigneCommandeDAO.findAll();
    }

}
