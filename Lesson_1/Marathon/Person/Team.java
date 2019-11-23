package Lesson_1.Marathon.Person;

import Lesson_1.Marathon.Obstacles.*;

public class Team {
    public Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Human("Ева")};

    public Team() {
        this.competitors = competitors;
    }


    public void showResults() {
        for (Competitor c : competitors) {
        c.info();
        }
   }

}
