package net.apsik.hellocv;

import java.util.Calendar;

public class Education extends LifePeriod {
    public enum Direction{
        BIOLOGY,
        CHEMISTRY,
        INFORMATIONS,
        ENGINEERING,
        MATHS,
        PHYSICS
    }

    private School school;
    private Direction direction;

    public Education(Calendar start, Calendar end, School school, Direction direction){
        super(start,end);
    }
}
