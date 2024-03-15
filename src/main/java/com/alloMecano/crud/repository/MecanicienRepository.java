package com.alloMecano.crud.repository;

import com.alloMecano.crud.controller.Mecanicien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MecanicienRepository extends JpaRepository<Mecanicien, Long > {

}
