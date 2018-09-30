/**
 * 
 */
package com.dmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmc.model.Material;

/**
 * @author Mohamed Hussein
 *
 */
public interface MaterialJpaRepository extends JpaRepository<Material, String> {

}
