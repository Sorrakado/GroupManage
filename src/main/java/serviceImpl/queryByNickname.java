package serviceImpl;

import serviceInterface.queryInterface;

public class queryByNickname implements queryInterface {
    @Override
    public boolean query(String nickname){
        return true;
    }
}
