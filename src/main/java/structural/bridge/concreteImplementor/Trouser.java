package structural.bridge.concreteImplementor;

import structural.bridge.abstraction.Person;
import structural.bridge.implementor.Clothing;

public class Trouser extends Clothing {

	public void personDressCloth(Person person) {
		System.out.println(person.getType() + "穿裤子");
	}
}
