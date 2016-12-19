package test;

import java.util.List;

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
import structural.composite.component.Employer;
import structural.composite.composite.ProjectManager;
import structural.composite.leaf.Programmer;
import structural.composite.leaf.ProjectAssistant;

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

	@Test
	public void composite() {
		Employer pm = new ProjectManager("项目经理");
		Employer pa = new ProjectAssistant("项目助理");
		Employer programmer1 = new Programmer("程序员一");
		Employer programmer2 = new Programmer("程序员二");

		pm.add(pa);// 为项目经理添加项目助理
		pm.add(programmer2);// 为项目经理添加程序员

		List<Employer> ems = pm.getEmployers();
		for (Employer em : ems) {
			System.out.println(em.getName());
		}
	}
}
