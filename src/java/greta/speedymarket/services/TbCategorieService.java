/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greta.speedymarket.services;
import greta.speedymarket.dao.TbCategorieDAO;
import greta.speedymarket.model.TbCategorie;
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
@ManagedBean(name="TbCategorieService")
public class TbCategorieService {
    
    @ManagedProperty(value="#{TbCategorieDAO}")
    TbCategorieDAO tbCategorieDAO;
    
    private TbCategorie selectedCategorie;

    public TbCategorie getSelectedCategorie() {
        return selectedCategorie;
    }

    public void setSelectedCategorie(TbCategorie selectedCategorie) {
        this.selectedCategorie = selectedCategorie;
    }
    
    public void setTbCategorieDAO(TbCategorieDAO tbCategorieDAO) {
        this.tbCategorieDAO = tbCategorieDAO;
    }
    
    public List<TbCategorie> loadCategories() {
        System.out.println("loadCategories");
        return tbCategorieDAO.findAll();
    }
//        public TreeNode getRoot() {
//        root = new DefaultTreeNode();
//        for(TbCategorie categorie : loadCategoriesParentes()){
//        TreeNode node = new DefaultTreeNode(categorie, root);
//        }
//        return root;
//    }
}
