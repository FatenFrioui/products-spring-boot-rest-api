package com.frioui.project1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frioui.project1.model.Product; 

@Repository
public interface ProductRepository extends CrudRepository <Product, Long> { }