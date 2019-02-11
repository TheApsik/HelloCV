package net.apsik.hellocv;

public class School {
    enum Type{
        ELEMENTARY,
        MIDDLE,
        HIGH,
        TECHNICAL,
        ACADEMY
    }

    public final String name;
    public final String patron;
    public final String city;
    public final Type type;

    public School(String name, String patron, String city, Type type){
        this.name = name;
        this.patron = patron;
        this.city = city;
        this.type = type;
    }
}
