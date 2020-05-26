package com.rapport.generateur.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapport.generateur.entities.Tableaux;

public interface TableauxRepo extends JpaRepository<Tableaux, Long> {

}
