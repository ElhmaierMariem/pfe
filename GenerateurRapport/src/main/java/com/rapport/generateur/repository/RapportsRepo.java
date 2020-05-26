package com.rapport.generateur.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapport.generateur.entities.Rapports;

public interface RapportsRepo extends JpaRepository<Rapports, Long> {

}
