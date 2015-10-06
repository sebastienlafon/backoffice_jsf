/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greta.speedymarket.services;

 
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
 
@ManagedBean(name="treeBasicView")
@ViewScoped
public class BasicView implements Serializable {
     
    private TreeNode root;
     
    @PostConstruct
    public void init() {
        root = new DefaultTreeNode("Ciquez pour voir le menu", null);
        TreeNode node0 = new DefaultTreeNode("1er niveau 01 - racine", root);
        TreeNode node1 = new DefaultTreeNode("1er niveau 02 - racine", root);
         
        TreeNode node00 = new DefaultTreeNode("2ème niveau 01", node0);
        TreeNode node01 = new DefaultTreeNode("2ème niveau 02", node0);
         
        TreeNode node10 = new DefaultTreeNode("Node 1.0", node1);
         
        node1.getChildren().add(new DefaultTreeNode("Node 1.1"));
        node00.getChildren().add(new DefaultTreeNode("Node 0.0.0"));
        node00.getChildren().add(new DefaultTreeNode("Node 0.0.1"));
        node01.getChildren().add(new DefaultTreeNode("Node 0.1.0"));
        node10.getChildren().add(new DefaultTreeNode("Node 1.0.0"));
        root.getChildren().add(new DefaultTreeNode("Enfant de 1er niveau "));
    }
 
    public TreeNode getRoot() {
        return root;
    }
}
