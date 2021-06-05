package serviceImpl;

import entity.Group;
import entity.User;
import serviceInterface.deleteInterface;

public class delete implements deleteInterface {
    @Override
    public boolean del(Group group, User user){

        return true;
    }
}
