package epd.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PERSON database table.
 * 
 */
@Entity
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PERSON_ID")
	private int personId;

	private String firstName;

	private String friends;

	private String lastName;

	public Person() {
	}

	public int getPersonId() {
		return this.personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFriends() {
		return this.friends;
	}

	public void setFriends(String friends) {
		this.friends = friends;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}