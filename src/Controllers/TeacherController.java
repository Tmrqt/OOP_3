package Controllers;

import Services.TeacherService;
import StudentDomen.Teacher;


public class TeacherController implements iUserController<Teacher> {
    private final TeacherService tchService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        tchService.create(firstName, secondName, age);
    }

}
