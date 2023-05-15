package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

// Создаем класс TeacherService с подключение обобщеннго интерфейса iUserService
public class TeacherService implements iUserService<Teacher> {

    private int count;
    private String academicDegree;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    // Реализация create в соответствии с полями класса Techer.java
    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, count, academicDegree);
       count++;
       teachers.add(per);
    }

    // Реализация getALL, прописанная в iUserService
    @Override
    public List<Teacher> getAll()
    {
        return teachers;
    }

    //  Реализация метода вывода списка учителей, отсортированного обобщенным классом UserComparator
    public List<Teacher> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Teacher> tchs = new ArrayList<>(teachers);
        tchs.sort(new UserComparator<Teacher>());
        return tchs;
    }
}