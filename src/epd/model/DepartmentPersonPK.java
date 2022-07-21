package epd.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DEPARTMENT_PERSON database table.
 * 
 */
@Embeddable
public class DepartmentPersonPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int department_DEPT_ID;

	private int persons_PERSON_ID;

	public DepartmentPersonPK() {
	}
	public int getDepartment_DEPT_ID() {
		return this.department_DEPT_ID;
	}
	public void setDepartment_DEPT_ID(int department_DEPT_ID) {
		this.department_DEPT_ID = department_DEPT_ID;
	}
	public int getPersons_PERSON_ID() {
		return this.persons_PERSON_ID;
	}
	public void setPersons_PERSON_ID(int persons_PERSON_ID) {
		this.persons_PERSON_ID = persons_PERSON_ID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DepartmentPersonPK)) {
			return false;
		}
		DepartmentPersonPK castOther = (DepartmentPersonPK)other;
		return 
			(this.department_DEPT_ID == castOther.department_DEPT_ID)
			&& (this.persons_PERSON_ID == castOther.persons_PERSON_ID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.department_DEPT_ID;
		hash = hash * prime + this.persons_PERSON_ID;
		
		return hash;
	}
}