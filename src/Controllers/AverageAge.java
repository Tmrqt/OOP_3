package Controllers;

import java.util.List;

import StudentDomen.User;

// Обобщенный класс AverageAge для подсчета среднего возраста студентов, учителей и работников
public class AverageAge implements iUserController<User> {

    private  List<User> users;
    private int count;

    // Создаем и заносим в список всех пользователей
    @Override
    public void create(String firstName, String secondName, int age) {
        User per = new User(firstName, secondName, age, count);
       count++;
       users.add(per);
    }
    
    // Метод подсчета среднего возраста. В EmploeeController.java есть общий метод.
    public int mean(int[] age) {
        int sum = 0;
        for(int i =0; i < users.size(); i++)
        {
            sum= sum + age[i];
        }
        sum=sum/users.size();
        return sum;
    }
}
