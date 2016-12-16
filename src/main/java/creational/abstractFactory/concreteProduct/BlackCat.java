package creational.abstractFactory.concreteProduct;

import creational.abstractFactory.abstractProduct.ICat;

public class BlackCat implements ICat {

	@Override
	public void eat() {
		System.out.println("The black cat is eating!");
	}

}
