package net.apsik.hellocv.skills;

import java.util.*;
import java.util.function.Predicate;

public class ProgramingLanguage implements Skill {
	public static final String JAVA = "Java";
	public static final String CPP = "C++";
	public static final String C = "C";
	public static final String PYTHON = "Python";
	public static final String HTML = "HTML";
	public static final String CSS = "CSS";
	public static final String JAVASCRIPT = "JavaScript";
	public static final String XML = "XML";


	private String name;
	private Experience experience;
	private Set<String> libraries;

	public ProgramingLanguage(String name, Experience experience){
		if(name != null && experience != null) {
			this.name = name;
			this.experience = experience;
			this.libraries = new LinkedHashSet<>();
		}
		else
			throw new IllegalArgumentException("Arguments can not be null");
	}

	public void addLibrary(String library) {
		this.libraries.add(library);
	}

	@Override
	public Iterator<Experience> getIteratorOfExperience() {
		return new Iterator<Experience>() {
			private boolean show = true;
			@Override
			public boolean hasNext() {
				return show;
			}

			@Override
			public Experience next() {
				if(show) {
					show = false;
					return experience;
				}
				throw new NoSuchElementException("No more Experience");
			}
		};
	}

	@Override
	public String getName() {
		return name;
	}
}
