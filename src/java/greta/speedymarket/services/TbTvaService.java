/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greta.speedymarket.services;
import greta.speedymarket.dao.TbTvaDAO;
import greta.speedymarket.model.TbTva;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "TbTvaService")
@ViewScoped
public class TbTvaService {

    private TbTva selectedTva;
    
    public TbTva getSelectedTva() {
        return selectedTva;
    }
    
    public void setSelectedTva(TbTva selectedTva) {
        this.selectedTva = selectedTva;
    }

    public List < TbTva > loadTva() {
        TbTvaDAO tbTvaDAO = new TbTvaDAO();
        return tbTvaDAO.findAll();
    }
	
    public void createTva() {   
        TbTva newTva = new TbTva("Nouveau taux de TVA", 0);

        TbTvaDAO tbTvaDAO = new TbTvaDAO();
        tbTvaDAO.save(newTva);
    }

    public void saveTva(TbTva tva) {
        if (tva != null) {
            TbTvaDAO tbTvaDAO = new TbTvaDAO();
            tbTvaDAO.update(tva);
        }
    }

    public void deleteTva(TbTva tva) {
        if (tva != null) {
            TbTvaDAO tbTvaDAO = new TbTvaDAO();
            tbTvaDAO.remove(tva);
        }
    }
    
}