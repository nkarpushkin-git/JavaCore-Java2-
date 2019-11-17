package Lesson_1.Marathon;

import Lesson_1.Marathon.Obstacles.*;
import Lesson_1.Marathon.Person.*;
//import Lesson_1.Marathon.Team.Dog;
//import Lesson_1.Marathon.Team.Human;

public class Main {
    public static void main(String[] args) {


        Course c = new Course(); // Создаем полосу препятствий
        Team team = new Team(); // Создаем команду
        c.start(team.competitors); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}