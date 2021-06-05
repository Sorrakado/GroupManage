package entity;

public class User {
    String id;
    String name;
    String password;
    String nickname;
    String profile;
    String gender;

    public User(String id, String name, String password, String nickname, String profile, String gender) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.nickname = nickname;
        this.profile = profile;
        this.gender = gender;
    }
    public User(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    void createGroup(String id){


    }


}
