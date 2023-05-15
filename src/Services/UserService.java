package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.User;

public class UserService implements iUserService<User> {

    private int count;
    private List<User> users;

    public UserService() {
        this.users = new ArrayList<User>();
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        User per = new User(firstName, secondName, age, count);
       count++;
       users.add(per);
    }

    @Override
    public List<User> getAll()
    {
        return users;
    }
}