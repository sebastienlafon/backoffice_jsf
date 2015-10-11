/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greta.speedymarket.dao;
import greta.speedymarket.model.TbCommande;
import greta.speedymarket.services.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.sound.midi.SysexMessage;
import org.hibernate.Session;
import java.util.Date;


/**
 *
 * @author admin - Sébastien LAFON
 */
@ManagedBean(name="TbCommandeDAO")
public class TbCommandeDAO {
    
    public List<TbCommande> findAll() {
        List<TbCommande> lesCategories = new ArrayList<>();
        System.err.println("1");
        System.err.println("HibernateUtil "+HibernateUtil.getSessionFactory());
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        System.err.println("2 session : "+session);
        session.beginTransaction();
        System.err.println("3");
        
        lesCategories = session.createQuery("select c from TbCommande as c").list();
        
        session.close();
        
        return lesCategories;
    }
    
}
