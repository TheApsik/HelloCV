package net.apsik.hellocv.skills;

import java.util.Iterator;

public class Language implements Skill {
    public static final String ENGLISH = "English";
    public static final String FRENCH = "French";
    public static final String GERMAN = "German";
    private String name;
    private Experience grammar;
    private Experience speech;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Iterator<Experience> getIteratorOfExperience() {
        return new Iterator<Experience>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Experience next() {
                return null;
            }
        };
    }

    public Experience getGrammar() {
        return grammar;
    }

    public Experience getSpeech() {
        return speech;
    }

    public Language(String name, Experience grammar, Experience speech){
        if(name == null)
            throw new IllegalArgumentException("String: Name can not be null");
        if(grammar != null && speech != null) {
            this.name = name;
            this.grammar = grammar;
            this.speech = speech;
        }else
            throw new IllegalArgumentException("Experience: can not be null and experience name can not be different than: grammar/speech");

    }


}
