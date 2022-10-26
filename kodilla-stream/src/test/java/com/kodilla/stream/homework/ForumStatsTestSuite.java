package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;
import org.junit.jupiter.api.Test;

import java.awt.desktop.UserSessionEvent;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTestSuite {

    @Test
    public void testAveragePostsUsersOlderThanFortyYears() {
    List<User> users = UserRepository.getUsersList();
    users.add(new User("Walter White", 50, 7, "Chemists"));
    users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
    users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
    users.add(new User("Gus Firing", 49, 0, "Board"));
    users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
    users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
    double test = ForumStats.filterUserNumberOfPostOlderThanForty(users);
    assertEquals(2.25, test);
    }

    @Test
    public void TestAveragePostUsersYoungerThanFortyYears() {
    List<User> users = UserRepository.getUsersList();
    users.add(new User("Walter White", 50, 7, "Chemists"));
    users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
    users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
    users.add(new User("Gus Firing", 49, 0, "Board"));
    users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
    users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
    double test = ForumStats.filterUserNumberOFPostYoungerThanForty(users);
    assertEquals(2382.0, test);
    }

}