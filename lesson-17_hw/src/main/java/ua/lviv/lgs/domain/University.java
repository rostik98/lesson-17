package ua.lviv.lgs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String name;

	@Column
	private Long acc_level;

	@Column
	private Long amountOfInstitutes;

	@Column
	private Long amountOfStudents;

	@Column
	private String address;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the acc_level
	 */
	public Long getAcc_level() {
		return acc_level;
	}

	/**
	 * @param acc_level the acc_level to set
	 */
	public void setAcc_level(Long acc_level) {
		this.acc_level = acc_level;
	}

	/**
	 * @return the amountOfInstitutes
	 */
	public Long getAmountOfInstitutes() {
		return amountOfInstitutes;
	}

	/**
	 * @param amountOfInstitutes the amountOfInstitutes to set
	 */
	public void setAmountOfInstitutes(Long amountOfInstitutes) {
		this.amountOfInstitutes = amountOfInstitutes;
	}

	/**
	 * @return the amountOfStudents
	 */
	public Long getAmountOfStudents() {
		return amountOfStudents;
	}

	/**
	 * @param amountOfStudents the amountOfStudents to set
	 */
	public void setAmountOfStudents(Long amountOfStudents) {
		this.amountOfStudents = amountOfStudents;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", acc_level=" + acc_level + ", amountOfInstitutes="
				+ amountOfInstitutes + ", amountOfStudents=" + amountOfStudents + ", address=" + address + "]";
	}

}
