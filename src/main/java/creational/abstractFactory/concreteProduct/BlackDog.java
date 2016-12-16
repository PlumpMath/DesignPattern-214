package creational.abstractFactory.concreteProduct;

import creational.abstractFactory.abstractProduct.IDog;

public class BlackDog implements IDog {

	@Override
	public void eat() {
		System.out.println("The black dog is eating");
	}

}
