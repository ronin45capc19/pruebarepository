package pe.edu.upn.demo1.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class HRCountries {
	@Id
	@Column(name="co_id",length = 2,nullable = false)
	private String Country_id;
	
	@Column(name="co_name",length = 40,nullable = false)
	private String Country_name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="re_id")
	private HRRegions countries_regions;
	
	@OneToMany(mappedBy = "lo_country")
	private List<HRLocations> co_listaloca;


	public HRCountries() {
		this.co_listaloca=new ArrayList<>();
	}
	
	

}
