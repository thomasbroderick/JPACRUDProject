package com.skilldistillery.jpacrud.client;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpacrud.data.UnitDAOImpl;
import com.skilldistillery.jpacrud.entities.Unit;
public class UnitClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SpecialForces");
		EntityManager em = emf.createEntityManager();
		
		UnitDAOImpl udi = new UnitDAOImpl();
		Unit test = new Unit(3, "Rainbow 6", "Global", "Bern", new Date(115,11,1), 6, "Counter-terrorism");
		
		System.out.println(test);
		
		udi.create(test);
	}

}
