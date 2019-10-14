package pe.edu.upn.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.demo1.entity.HRRegions;

@Repository
public interface HRRegionsRepository 
extends JpaRepository<HRRegions, Integer>{

}
