package com.cg.op.model;

//PassportRegistrationModel
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="USER_REGISTRATION_table")
public class PassportRegistrationModel
{

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @Column(name = "firstName")
	    private String firstName;

	    @Column(name = "lastName")
	    private String lastName;

	   @Column(name = "DateofBirth")
	    private LocalDate dateOfBirth;

	    @Column(name = "gender")
	    private String gender;

	    @Column(name="email")
	    private String email;

	    @Column(name = "qualification1")
	    private String qualification1;

	    @Column(name = "qualification2")
	    private String qualification2;

	    @Column(name = "qualification3")
	    private String qualification3;
	    
	    
	    @Column(name = "plotNo")
	    private String plotNo;

	    @Column(name = "street")
	    private String street;

	    @Column(name = "city")
	    private String city;

	    @Column(name = "districts")
	    private String districts;

	    @Column(name = "sate")
	    private String state;

	    @Column(name = "zipcode")
	    private Long zipcode;

	    @Column(name="mobileNo")
	    private Long mobileNo;
	    /**
		 * creating one to one relation with login
		 */
//	    @OneToOne(cascade= CascadeType.ALL)
//	    private LoginModel login;
	    /**
	  		 * creating many to one relation with address
	  		 */
//	    @ManyToOne(cascade = CascadeType.ALL)
//	    private AddressModel address;
	    
	    /**
		 * 
		 * Constructor generation
		 */
	       public PassportRegistrationModel() {
			super();
			
	    	}
		public PassportRegistrationModel(Long id, String firstName, String lastName, LocalDate dateOfBirth, String gender,
				String email, String qualification1, String qualification2, String qualification3, String plotNo,
				String street, String city, String districts, String state, Long zipcode, Long mobileNo) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.gender = gender;
			this.email = email;
			this.qualification1 = qualification1;
			this.qualification2 = qualification2;
			this.qualification3 = qualification3;
			this.plotNo = plotNo;
			this.street = street;
			this.city = city;
			this.districts = districts;
			this.state = state;
			this.zipcode = zipcode;
			this.mobileNo = mobileNo;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getQualification1() {
			return qualification1;
		}
		public void setQualification1(String qualification1) {
			this.qualification1 = qualification1;
		}
		public String getQualification2() {
			return qualification2;
		}
		public void setQualification2(String qualification2) {
			this.qualification2 = qualification2;
		}
		public String getQualification3() {
			return qualification3;
		}
		public void setQualification3(String qualification3) {
			this.qualification3 = qualification3;
		}
		public String getPlotNo() {
			return plotNo;
		}
		public void setPlotNo(String plotNo) {
			this.plotNo = plotNo;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDistricts() {
			return districts;
		}
		public void setDistricts(String districts) {
			this.districts = districts;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public Long getZipcode() {
			return zipcode;
		}
		public void setZipcode(Long zipcode) {
			this.zipcode = zipcode;
		}
		public Long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(Long mobileNo) {
			this.mobileNo = mobileNo;
		}
		@Override
		public String toString() {
			return "PassportRegistrationModel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", email=" + email + ", qualification1="
					+ qualification1 + ", qualification2=" + qualification2 + ", qualification3=" + qualification3
					+ ", plotNo=" + plotNo + ", street=" + street + ", city=" + city + ", districts=" + districts
					+ ", state=" + state + ", zipcode=" + zipcode + ", mobileNo=" + mobileNo + "]";
		}
	        
		
}
		
		
