package com.dmc.mam.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.dmc.mam.model.MetaData;

public interface CustomSearch {
	List<MetaData> test(String meta,Pageable p);
}
