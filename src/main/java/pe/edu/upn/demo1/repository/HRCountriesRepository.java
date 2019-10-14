package pe.edu.upn.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.demo1.entity.HRCountries;

@Repository
public interface HRCountriesRepository 
extends JpaRepository<HRCountries, String>{

}
