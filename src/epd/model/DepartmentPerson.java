package epd.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DEPARTMENT_PERSON database table.
 * 
 */
@Entity
@Table(name="DEPARTMENT_PERSON")
@NamedQuery(name="DepartmentPerson.findAll", query="SELECT d FROM DepartmentPerson d")
public class DepartmentPerson implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DepartmentPersonPK id;

	public DepartmentPerson() {
	}

	public DepartmentPersonPK getId() {
		return this.id;
	}

	public void setId(DepartmentPersonPK id) {
		this.id = id;
	}

}