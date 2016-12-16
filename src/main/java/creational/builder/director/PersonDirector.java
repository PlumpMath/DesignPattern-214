package creational.builder.director;

import creational.builder.builder.PersonBuilder;
import creational.builder.product.Person;

public class PersonDirector {
	public Person constructPerson(PersonBuilder pb) {
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}
}
