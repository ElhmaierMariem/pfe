package com.rapport.generateur.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapport.generateur.entities.RessourceDonnees;

public interface RessourceDonneesRepo extends JpaRepository<RessourceDonnees, Long> {

}
