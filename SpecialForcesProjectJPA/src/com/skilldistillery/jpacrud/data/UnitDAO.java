package com.skilldistillery.jpacrud.data;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Unit;

public interface UnitDAO {
	public Unit retrieveById (int id);
	public List<Unit> retrieve(String searchTerm);
	public Unit create(Unit unit);
	public Unit update(int id, Unit updatedUnit);
	public void delete(int id);
}
