package dev.naclara.dcmodel.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Team {
    private int id;
    private String name;

    @Setter(AccessLevel.NONE)
    private List<Character> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void write() {
        System.out.println("----------------------");
        System.out.println(name + " (Team)");
        System.out.println("----------------------");

        System.out.println("Members: ");
        for (Character member : members) {
            System.out.println(member.getName());
        }
    }

    public boolean hasMember(Character member) {
        if (members == null) {
            return false;
        }

        boolean hasMember = false;

        for (Character character : members) {
            if (character == member) {
                hasMember = true;
                break;
            }
        }

        return hasMember;
    }

    public void addMember(Character member) {
        if (member == null) {
            return;
        }

        members.add(member);
    }

    public void removeMember(Character member) {
        if (member == null) {
            return;
        }

        members.remove(member);
    }
}
