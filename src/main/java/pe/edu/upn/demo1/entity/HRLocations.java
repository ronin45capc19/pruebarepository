package pe.edu.upn.demo1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="locations")
public class HRLocations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="lo_id")
	private Integer Location_id;
	
	@Column(name="lo_address",length = 40,nullable = false)
	private String Street_address;
	
	@Column(name="lo_postal",length = 12,nullable = false)
	private String Postal_code;
	
	@Column(name="lo_city",length = 30,nullable = false)
	private String City;
	
	@Column(name="lo_state",length = 25,nullable = false)
	private String State_province;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="co_id")
	private HRCountries lo_country;
	

}
