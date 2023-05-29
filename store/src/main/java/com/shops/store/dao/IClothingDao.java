package com.shops.store.dao;

import org.springframework.data.repository.CrudRepository;

import com.shops.store.entity.Clothing;

public interface IClothingDao extends CrudRepository<Clothing, String> {

}
