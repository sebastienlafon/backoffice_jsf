/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greta.speedymarket.services;
import greta.speedymarket.dao.TbCommandeDAO;
import greta.speedymarket.model.TbCommande;
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
@ManagedBean(name="TbCommandeService")
public class TbCommandeService {
    
    @ManagedProperty(value="#{TbCommandeDAO}")
    TbCommandeDAO tbCommandeDAO;
    
    private TbCommande selectedCommande;

    public TbCommande getSelectedCommande() {
        return selectedCommande;
    }

    public void setSelectedCommande(TbCommande selectedCommande) {
        this.selectedCommande = selectedCommande;
    }
    
    public void setTbCommandeDAO(TbCommandeDAO tbCommandeDAO) {
        this.tbCommandeDAO = tbCommandeDAO;
    }
    
    public List<TbCommande> loadCommandes() {
        System.out.println("loadCommandes");
        return tbCommandeDAO.findAll();
    }
    public TbCommande saveCommande(){
        return null;
}
}
