package structural.composite.composite;

import java.util.ArrayList;

import structural.composite.component.Employer;

public class ProjectManager extends Employer {

	public ProjectManager(String name) {
		setName(name);
		employers = new ArrayList<Employer>();
	}

	public void add(Employer employer) {
		employers.add(employer);
	}

	public void delete(Employer employer) {
		employers.remove(employer);
	}
}