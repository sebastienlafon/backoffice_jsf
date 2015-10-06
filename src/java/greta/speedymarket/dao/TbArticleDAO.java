/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greta.speedymarket.dao;
import greta.speedymarket.model.TbArticle;
import greta.speedymarket.model.TbArticle;
import greta.speedymarket.services.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author Sébastien LAFON
 */
@ManagedBean(name="TbArticleDAO")
public class TbArticleDAO {
    
//    @PersistenceContext
// private EntityManager entityManager;
// public void persist(TbArticle transientInstance) {
// try {
// entityManager.persist(transientInstance);
// } catch (RuntimeException re) {
// throw re;
// }
// }
// public void remove(TbArticle persistentInstance) {
// try {
// entityManager.remove(persistentInstance);
// } catch (RuntimeException re) {
// throw re;
// }
// }
// public TbArticle merge(TbArticle detachedInstance) {
// try {
// TbArticle result = entityManager.merge(detachedInstance);
// return result;
// } catch (RuntimeException re) {
// throw re;
// }
// }
// public TbArticle findById(Integer id) {
// try {
// TbArticle instance = entityManager.find(TbArticle.class, id);
// return instance;
// } catch (RuntimeException re) {
// throw re;
// }
// }
// public List<TbArticle> findAll() {
// Query q = entityManager.createNamedQuery("TbArticle.findAll");
// List<TbArticle> l = q.getResultList();
// return l;
// }

public List<TbArticle> findAll(){

        List<TbArticle> lesArticles = new ArrayList<>();
        System.err.println("1");
        System.err.println("HibernateUtil "+HibernateUtil.getSessionFactory());
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        System.err.println("2 session : "+session);
        session.beginTransaction();
        System.err.println("3");
        
        lesArticles = session.createQuery("select c from TbArticle as c").list();
        
        session.close();
        
        return lesArticles;
}
}


