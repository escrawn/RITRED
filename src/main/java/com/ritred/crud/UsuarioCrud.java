package com.ritred.crud;

import org.hibernate.Session;
import com.ritred.dao.TipoUsuario;
import com.ritred.dao.Usuario;

public class UsuarioCrud extends MainCrud{

	

	public UsuarioCrud() {
		
	}
	


	protected void create(Usuario us) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(us);
		
		
		session.getTransaction().commit();
		session.close();

	}

	protected void read(Usuario us) {

	}

	protected void update(Usuario us) {

	}

	protected void delete(Usuario us) {

	}

}
