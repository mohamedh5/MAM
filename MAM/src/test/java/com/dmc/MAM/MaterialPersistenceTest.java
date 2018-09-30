package com.dmc.MAM;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dmc.repository.MaterialJpaRepository;

public class MaterialPersistenceTest {

	@Autowired
	private MaterialJpaRepository materilaJpa;
	
	@Test
	public void testCountOfMaterials() {
		assertEquals("Wrong count ",5001, materilaJpa.count());
	}

}
