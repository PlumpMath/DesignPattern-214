package test;

import org.junit.Test;

import structural.adapter.Adaptee;
import structural.adapter.Adapter;
import structural.adapter.Target;
import structural.bridge.abstraction.Person;
import structural.bridge.concreteImplementor.Jacket;
import structural.bridge.concreteImplementor.Trouser;
import structural.bridge.implementor.Clothing;
import structural.bridge.refinedAbstraction.Lady;
import structural.bridge.refinedAbstraction.Man;

public class StructuralTest {

	@Test
	public void adapt() {
		Target target = new Adapter(new Adaptee());
		target.adapteeMethod();

		target.adapterMethod();
	}

	@Test
	public void bridge() {
		Person man = new Man();

		Person lady = new Lady();

		Clothing jacket = new Jacket();

		Clothing trouser = new Trouser();

		jacket.personDressCloth(man);
		trouser.personDressCloth(man);

		jacket.personDressCloth(lady);
		trouser.personDressCloth(lady);
	}
}
