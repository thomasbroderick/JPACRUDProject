package com.skilldistillery.jpacrud.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.jpacrud.entities.Unit;

@Transactional
@Component
public class UnitDAOImpl implements UnitDAO {
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Unit create(Unit unit) {
		em.persist(unit);
		em.flush();
		
		return unit;
	}

	@Override
	public Unit update(int id, Unit updatedUnit) {
		Unit managed = em.find(Unit.class, id);
		managed.setName(updatedUnit.getName());
		managed.setCountry(updatedUnit.getCountry());
		managed.setHeadquarters(updatedUnit.getHeadquarters());
		managed.setFoundingDate(updatedUnit.getFoundingDate());
		managed.setSize(updatedUnit.getSize());
		managed.setSpecializations(updatedUnit.getSpecializations());
		
		return managed;
	}

	@Override
	public void delete(int id) {
		em.remove(em.find(Unit.class, id));
	}

	@Override
	public List<Unit> retrieve(String searchTerm) {
		String query = "SELECT u FROM Unit u WHERE u.name LIKE :string";
		List<Unit> units = em.createQuery(query, Unit.class).setParameter("name", "%searchTerm%").getResultList();
		return units;
	}

	@Override
	public Unit retrieveById(int id) {
		Unit u = em.find(Unit.class, id);
		return u;
	}

}
