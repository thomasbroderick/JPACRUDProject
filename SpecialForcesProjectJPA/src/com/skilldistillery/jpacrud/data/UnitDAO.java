package com.skilldistillery.jpacrud.data;

import com.skilldistillery.jpacrud.entities.Unit;

public interface UnitDAO {
	public Unit retrieve(int id);
	public Unit create(Unit unit);
	public Unit update(int id, Unit updatedUnit);
	public void delete(int id);
}
