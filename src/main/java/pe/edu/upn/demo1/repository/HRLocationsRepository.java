package pe.edu.upn.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.demo1.entity.HRLocations;

@Repository
public interface HRLocationsRepository 
extends JpaRepository<HRLocations, Integer>{

}
