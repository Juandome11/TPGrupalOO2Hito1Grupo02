package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Staff;
import datos.Cajero;

public class StaffDao {

	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public int agregar(Staff objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}

	public void actualizar(Staff objeto) {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

	public void eliminar(Staff objeto) {
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

	public Staff traer(long idStaff) {
		Staff objeto = null;
		try {
			iniciaOperacion();
			objeto = (Staff) session.get(Staff.class, idStaff);
		} finally {
			session.close();
		}
		return objeto;
	}

	public Staff traer(String dni) {
		Staff objeto = null;
		try {
			iniciaOperacion();
			objeto = (Staff) session.createQuery("from Staff s where s.dni=:dni").setParameter("dni", dni)
					.uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}

	// Caso de uso de ejemplo (Herencia): consulta polimórfica, trae Cocineros y Cajeros mezclados
	public List<Staff> traer() throws HibernateException {
		List<Staff> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Staff s order by s.apellido asc, s.nombre asc", Staff.class)
					.getResultList();
		} finally {
			session.close();
		}
		return lista;
	}
	

	public List<Cajero> traerCajerosTurnoManiana(String turno) throws HibernateException {
		List<Cajero> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Cajero c where c.turno = :turno", Cajero.class)
					.setParameter("turno", turno)
					.getResultList();
		} finally {
			session.close();
		}
		return lista;
	}
}
