package StudentDomen;

import java.util.Iterator;
import java.util.List;

// Создаем класс StudentSteam (поток студентов с полем номер потока) содержащий в себе список учебных групп(StudentGroup)
// с реализа встроенного интерфейса Iterable и Comparable
public class StudentSteam implements Iterable<StudentGroup> {

    private List<StudentGroup> groups; //Список наших учебных групп со студентами
    private int steamID; // Номер потока

    public StudentSteam(List<Student> students) {
        this.groups = groups;
        this.steamID = steamID;
    }

    // Прописываем get и set для groups и steamID
    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setStudents(List<StudentGroup> groups) {
        this.groups = groups;
    }

    public int getStudentID() {
        return steamID;
    }

    public void setStudentID(int steamID) {
        this.steamID = steamID;
    }

    // Реализация нтерфейса Iterabl, который позволяет пройтись по группам студентов в потоке
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index < groups.size();
            }
            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return groups.get(index++);        
            }
        };
    }

}
