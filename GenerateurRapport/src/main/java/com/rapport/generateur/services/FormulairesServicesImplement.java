package com.rapport.generateur.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import com.rapport.generateur.entities.Formulaires;
import com.rapport.generateur.repository.FormulairesRepo;
@Service("FormulairesSercices")
@Transactional
public class FormulairesServicesImplement implements FormulairesServices{
   
	@Autowired   
	private FormulairesRepo formulairesRepo;
	
    @Override
	public Iterable<Formulaires> findAll() {
		
		return formulairesRepo.findAll();
	}

	@Override
	public Formulaires find(Long formulairesId) {
		// TODO Auto-generated method stub
		return formulairesRepo.getOne(formulairesId);
	}

	@Override
	public List<Map<String, Object>> report() {
		List<Map<String, Object>> result = new ArrayList<Map<String,Object>>();
		
		for(Formulaires formulaires : this.findAll()) {
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("formulairesId", formulaires.getFormulaireId());
			item.put("formulairesLibelle", formulaires.getFormulairesLibelle());
			item.put("formulairesNombreColonnes", formulaires.getFormulairesNombreColonnes());
			result.add(item);
		}
		return result;
	}

	


	

}
