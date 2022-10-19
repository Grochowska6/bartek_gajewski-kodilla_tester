package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;
public class UserManager {

    public static void main(String[] args) {
        List<String> chemistGroupUserNames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUserNames);
    }
    static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UserManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static String getGroup(User user) {
        return user.getGroup();
    }
    public static int getAge(User user){
        return user.getAge();
    }
    static List<String> filterChemistGroup() {
        List<String> chemist
                = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(User::getUsername)
                .collect(Collectors.toList());
        return chemist;
    }
    static List<Integer> filterUserAge() {
        List<Integer> userage
                = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 49)
                .map(User::getAge)
                .collect(Collectors.toList());
        return userage;
    }
    static List<Integer> filterUserNumberOfPost() {
        List<Integer> usernumberofpost
                = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() < 2)
                .map(User::getNumberOfPost)
                .collect(Collectors.toList());
        return usernumberofpost;
    }
}

