/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greta.speedymarket.services;
import greta.speedymarket.dao.TbArticleDAO;
import greta.speedymarket.model.TbArticle;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
@ManagedBean(name="TbArticleService")
public class TbArticleService {
 @ManagedProperty(value="#{TbArticleDAO}")
 TbArticleDAO tbArticleDAO;

 private TbArticle selectedArticle;
 
 public void setTbArticleDAO(TbArticleDAO tbArticleDAO) {
 this.tbArticleDAO = tbArticleDAO;
 }
 public List<TbArticle> loadArticles() {
 return tbArticleDAO.findAll();
 }

    public TbArticle getSelectedArticle() {
        return selectedArticle;
    }

    public void setSelectedArticle(TbArticle selectedArticle) {
        this.selectedArticle = selectedArticle;
    }

    public TbArticleDAO getTbArticleDAO() {
        return tbArticleDAO;
    }
    
}