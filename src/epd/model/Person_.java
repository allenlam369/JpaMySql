package epd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-03-12T12:58:03.749+0800")
@StaticMetamodel(Person.class)
public class Person_ {
	public static volatile SingularAttribute<Person, Integer> personId;
	public static volatile SingularAttribute<Person, String> firstName;
	public static volatile SingularAttribute<Person, String> friends;
	public static volatile SingularAttribute<Person, String> lastName;
}
