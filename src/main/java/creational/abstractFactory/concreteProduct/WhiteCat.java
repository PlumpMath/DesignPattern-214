package creational.abstractFactory.concreteProduct;

import creational.abstractFactory.abstractProduct.ICat;

public class WhiteCat implements ICat {

	@Override
	public void eat() {
		System.out.println("The white cat is eating!");
	}

}
