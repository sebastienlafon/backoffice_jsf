/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greta.speedymarket.dao;
import greta.speedymarket.model.TbPersonne;
import greta.speedymarket.model.TbPersonne;
import greta.speedymarket.model.TbPersonne;
import greta.speedymarket.services.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

import org.hibernate.Session;

/**
 *
 * @author Sébastien LAFON
 */
@ManagedBean(name = "TbPersonneDAO")
public class TbPersonneDAO {
    public void save(TbPersonne tpersonne) {
        System.out.println("persist tpersonne");
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
                session.beginTransaction();
                session.save(tpersonne);
                session.getTransaction().commit();
        } catch (RuntimeException e) {
                e.printStackTrace();
                session.getTransaction().rollback();
        }
    }
	public void update(TbPersonne tpersonne) {
		System.out.println("merge tpersonne " + tpersonne.getIdPersonne() + " - ");
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.update(tpersonne);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	public void remove(TbPersonne tpersonne) {
		System.out.println("Suppression du tpersonne " + tpersonne);
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.delete(tpersonne);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	public List < TbPersonne > findAll() {
		List < TbPersonne > lesPersonnes = new ArrayList < > ();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			lesPersonnes = session.createQuery("from TbPersonne").list();
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return lesPersonnes;
	}
}

