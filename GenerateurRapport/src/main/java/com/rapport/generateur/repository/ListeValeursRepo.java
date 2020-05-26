package com.rapport.generateur.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapport.generateur.entities.ListeValeurs;

public interface ListeValeursRepo  extends JpaRepository<ListeValeurs, Long>{

}
