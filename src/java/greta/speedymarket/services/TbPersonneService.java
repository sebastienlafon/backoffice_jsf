/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greta.speedymarket.services;
import greta.speedymarket.dao.TbPersonneDAO;
import greta.speedymarket.model.TbPersonne;
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
@ManagedBean(name="TbPersonneService")
public class TbPersonneService {
    
    @ManagedProperty(value="#{TbPersonneDAO}")
    TbPersonneDAO tbPersonneDAO;
    
    private TbPersonne selectedPersonne;

    public TbPersonne getSelectedPersonne() {
        return selectedPersonne;
    }

    public void setSelectedPersonne(TbPersonne selectedPersonne) {
        this.selectedPersonne = selectedPersonne;
    }
    
    public void setTbPersonneDAO(TbPersonneDAO tbPersonneDAO) {
        this.tbPersonneDAO = tbPersonneDAO;
    }
    
    public List<TbPersonne> loadPersonnes() {
        System.out.println("loadPersonnes");
        return tbPersonneDAO.findAll();
    }

}
