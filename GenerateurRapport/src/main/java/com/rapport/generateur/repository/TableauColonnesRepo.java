package com.rapport.generateur.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapport.generateur.entities.TableauColonnes;

public interface TableauColonnesRepo extends JpaRepository<TableauColonnes, Long> {

}
