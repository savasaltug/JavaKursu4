package _05_Hafta.Gun03._02_Enum;

import javax.management.relation.Role;

public class User {
    String username;
    Role role;
    Statu statu;

    public User(String username, Role role, Statu statu) {
        this.username = username;
        this.role = role;
        this.statu = statu;
    }




    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}

