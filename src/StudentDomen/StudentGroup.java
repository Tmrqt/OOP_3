package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    private int groupID; // Добовляем номер группы, поскольку они(различные группы) используются для заполнения потока студентов
    private int groupSize = students.size(); // Кол-во студентов в группе

    public StudentGroup(List<Student> students) {
        this.students = students;
        this.groupID = groupID;
        this.groupSize = groupSize;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Get, set для groupID

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    // Get, set для groupSize

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);        
            }

        };
    }

    // Реализация интерфейса Comparable (сортировка по количеству студентов в группе)
    @Override
    public int compareTo(StudentGroup o) {
        if(students.size() == o.groupSize){
            return 0;
        }
        if(students.size() < o.groupSize){
            return -1;
        }
        return 1;
    }


    
}
