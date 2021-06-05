package entity;

public class Group {
    String owner;
    String id;
    String name;
    String profile;
    String task;
    String announcement;
    String tag;

    public Group() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Group(String owner, String id, String name, String profile, String task, String announcement, String tag) {
        this.owner = owner;
        this.id = id;
        this.name = name;
        this.profile = profile;
        this.task = task;
        this.announcement = announcement;
        this.tag = tag;
    }

    boolean destroy(){


        return true;
    }

}
