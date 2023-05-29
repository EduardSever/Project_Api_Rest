package com.shops.store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shops.store.dao.IClothingDao;
import com.shops.store.entity.Clothing;
@Service
public class ClothingService implements IClothing{
	
	@Autowired
	private IClothingDao dao;

	@Override
	public Clothing save(Clothing clothing) {
		return dao.save(clothing);
	}

	@Override
	public List<Clothing> fidAll() {
		return (List<Clothing>)dao.findAll();
	}

	@Override
	public Clothing update(Clothing clothing) {
		return dao.save(clothing);
	}

	@Override
	public void delete(Clothing clothing) {
		dao.delete(clothing);
		
	}

	@Override
	public Clothing findById(Clothing id) {
		return dao.findById(id.getId()).orElse(null);
	}

}