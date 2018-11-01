package com.dmc.mam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dmc.mam.model.HistoryManager;

@CrossOrigin
@RepositoryRestResource(path="history",collectionResourceRel="history",itemResourceRel="history")
public interface HistoryManagerJpaRepository extends JpaRepository<HistoryManager, Integer> {

}
