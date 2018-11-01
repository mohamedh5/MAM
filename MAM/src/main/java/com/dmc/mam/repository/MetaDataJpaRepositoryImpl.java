package com.dmc.mam.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import com.dmc.mam.model.MetaData;

public class MetaDataJpaRepositoryImpl implements CustomSearch {
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MetaData> test(String meta, Pageable p) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<MetaData> criteria = builder.createQuery(MetaData.class);
		Root<MetaData> root = criteria.from(MetaData.class);
		criteria.where(builder.equal(root.get("key"),meta));
		Query q = em.createQuery(criteria);
		return q.getResultList();
	}

}
