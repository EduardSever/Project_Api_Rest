package com.shops.store.services;

import java.util.List;

import com.shops.store.entity.Clothing;

public interface IClothing {
	
	public Clothing save(Clothing clothing);
	
	public List<Clothing> fidAll();
	
	public Clothing update(Clothing clothing);
	
	public void delete(Clothing clothing);
	
	public Clothing findById(Clothing id);
	
}
