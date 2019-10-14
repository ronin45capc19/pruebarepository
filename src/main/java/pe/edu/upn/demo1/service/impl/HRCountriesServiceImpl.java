package pe.edu.upn.demo1.service.impl;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo1.entity.HRCountries;
import pe.edu.upn.demo1.repository.HRCountriesRepository;
import pe.edu.upn.demo1.service.HRCountriesService;

public class HRCountriesServiceImpl implements HRCountriesService{
	
	@Autowired
	private HRCountriesRepository hrcountriesrepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<HRCountries> findAll() throws Exception {
		return hrcountriesrepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<HRCountries> findById(String id) throws Exception {
		
		return hrcountriesrepository.findById(id);
	}

	@Transactional
	@Override
	public HRCountries save(HRCountries entity) throws Exception {

		return hrcountriesrepository.save(entity);
	}

	@Transactional
	@Override
	public HRCountries update(HRCountries entity) throws Exception {
		
		return hrcountriesrepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		hrcountriesrepository.deleteById(id);
		
	}
	
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		hrcountriesrepository.deleteAll();
		
	}

}
