package Lesson_1.Marathon.Obstacles;

public class Course {

    private Obstacle[] courses = {new Cross(800), new Water(2), new Wall(1), new Cross(120)};

    public Course() {
        this.courses = courses;
    }

    public void start(Competitor[] competitors) {
        for (Competitor c : competitors) {
            for (Obstacle o : courses) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
