/**
 * 
 */
package com.dmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmc.model.MetaData;

/**
 * @author Mohamed Hussein
 *
 */
public interface MetaDataJpaRepository extends JpaRepository<MetaData, String> {

}
