package com.ritred.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.ritred.dao.TipoUsuario;

public class TipoUsuarioCrud extends MainCrud{


	    protected void create() {
	        // code to save a tipoUsuario
	    	TipoUsuario tu = new TipoUsuario();
	    	tu.setNombre("Admin3");
	    	
	    	
	    	Session session = sessionFactory.openSession();
	        session.beginTransaction();
	     
	        session.save(tu);
	     
	        session.getTransaction().commit();
	        session.close();
	    }
	 
	    protected void read() {

	    }
	 
	    protected void update() {

	    }
	 
	    protected void delete() {

	    }
	 
	    
	
	    public static void main(String[] args) {
	        // code to run the program
	    	TipoUsuarioCrud manager = new TipoUsuarioCrud();
	        manager.setup();
	     manager.create();
	        manager.exit();
	    }

}
