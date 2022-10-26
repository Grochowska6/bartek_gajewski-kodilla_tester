package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.List;

public class ForumStats {


    public static double filterUserNumberOfPostOlderThanForty(List<User> userList)  {
            return UserRepository.getUsersList()
                    .stream()
                    .filter(user -> user.getAge() >= 40)
                    .mapToInt(user -> user.getNumberOfPost())
                    .average()
                    .getAsDouble();

    }
    public static double filterUserNumberOFPostYoungerThanForty(List<User> userList) {
        return UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {

        double  agvUp40 = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(agvUp40);


        double agvUnder40 =  UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(agvUnder40);
    }

}
