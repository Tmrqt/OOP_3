package Controllers;

import Service.StudentGroupService;
import Service.StudentService;
import StudentDomen.Student;

public class StudentController implements iUserController<Student> {

    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();
    
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
    
}
