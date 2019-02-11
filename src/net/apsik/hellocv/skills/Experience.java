package net.apsik.hellocv.skills;

public class Experience {
    private int progress;
    private Level level;

    public enum Level{
        BEGINNER,
        INTERMEDIATE,
        ADVANCED;

        public Level expand(){
            switch (this){
                case BEGINNER:
                    return INTERMEDIATE;
                case ADVANCED:
                case INTERMEDIATE:
                    return ADVANCED;
            }
            return BEGINNER;
        }
    }

    public Experience(Level level, int progress){
        this.level = level;
        this.progress = progress;

    }

    public void increaseProgress(){
        if(++progress > 100){
            level = level.expand();
            progress = 0;
        }
    }

    public Level getExperience(){
        return level;
    }
}
