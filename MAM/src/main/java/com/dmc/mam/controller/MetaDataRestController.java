package com.dmc.mam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dmc.mam.model.MetaData;
import com.dmc.mam.repository.MetaDataJpaRepository;

@RepositoryRestController
public class MetaDataRestController {

	@Autowired
	private MetaDataJpaRepository mdRep;
	
	@RequestMapping(path="/metaDatas/search/metaSearch",method=RequestMethod.GET)
	public ResponseEntity<List<MetaData>> metaDataSearch( String meta,Pageable p){
		
		return ResponseEntity.ok(mdRep.test(meta, p));
	}
}
