package net.apsik.hellocv.skills;

import java.util.Iterator;

public interface Skill {
    String getName();
    Iterator<Experience> getIteratorOfExperience();
}
