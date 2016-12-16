package creational.builder.builder;

import creational.builder.product.Person;

public interface PersonBuilder {
	void buildHead();

	void buildBody();

	void buildFoot();

	Person buildPerson();
}
