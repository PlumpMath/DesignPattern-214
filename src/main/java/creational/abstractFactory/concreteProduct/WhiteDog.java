package creational.abstractFactory.concreteProduct;

import creational.abstractFactory.abstractProduct.IDog;

public class WhiteDog implements IDog {

	@Override
	public void eat() {
		System.out.println("The white dog is eating!");
	}

}
