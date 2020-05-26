package com.rapport.generateur.services;

import java.util.List;
import java.util.Map;

import com.rapport.generateur.entities.Formulaires;

public interface FormulairesServices {
   public Iterable<Formulaires> findAll();
   public Formulaires find(Long formulairesId);
   public List<Map<String ,Object>> report();
}
