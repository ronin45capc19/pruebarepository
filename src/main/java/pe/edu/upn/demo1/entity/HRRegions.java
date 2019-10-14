package pe.edu.upn.demo1.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="regions")
public class HRRegions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="re_id")
	private Integer Region_id;
	
	@Column(name="re_name",length = 25,nullable = false)
	private String Region_name;
	
	@OneToMany(mappedBy = "countries_regions",fetch = FetchType.LAZY)
	private List<HRCountries> re_listacoun;

	public HRRegions() {
		this.re_listacoun= new ArrayList<>();
	}
	
	

}
