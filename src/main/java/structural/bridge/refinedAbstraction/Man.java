package structural.bridge.refinedAbstraction;

import structural.bridge.abstraction.Person;
import structural.bridge.implementor.Clothing;

public class Man extends Person {

	public Man() {
		setType("男人");
	}

	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressCloth(this);
	}

}
