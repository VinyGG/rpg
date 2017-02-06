package br.com.viny.rpg.skills;

public class Skill {

    private int id;
    private String name;
    private Object skill;

    public Skill(int id, String name, Object skill) {
        this.id = id;
        this.name = name;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getSkill() {
        return skill;
    }

    public void setSkill(Object skill) {
        this.skill = skill;
    }

}
