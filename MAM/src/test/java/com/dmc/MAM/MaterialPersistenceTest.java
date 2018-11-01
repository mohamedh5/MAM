package com.dmc.MAM;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dmc.mam.repository.MaterialJpaRepository;


@RunWith(SpringJUnit4ClassRunner.class)
public class MaterialPersistenceTest {

	@Autowired
	private MaterialJpaRepository materilaJpa;
	
	@Test
	public void testCountOfMaterials() {
		assertEquals("Wrong count ",5001, materilaJpa.count());
	}

	@Test
	public void testExistsById() {
		assertEquals("Exist ",true, materilaJpa.existsById("00045D9B5A89B1B5L1I"));
	}
	
	@Test
	public void testFindById() {
		assertEquals("found ",true, materilaJpa.findById("00045D9B5A89B1B5L1I").isPresent());
	}
}
