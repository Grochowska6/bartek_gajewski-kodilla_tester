package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTestSuite {
    @Test
    public void testFilterChemistGroup() {

    List<String> result  = UserManager.filterChemistGroup();

    List<String> userGroup = new ArrayList<>();
    userGroup.add("Walter White");
    userGroup.add("Gale Boetticher");
    assertEquals(userGroup, result);

    }
    @Test
    public void testFilterUserAge() {

    List<Integer> result = UserManager.filterUserAge();

    List<Integer> userAge = new ArrayList<>();
    userAge.add(50);
    userAge.add(57);
    assertEquals(userAge, result);
    }
    @Test
    public void testFilterNumberOfPost() {

    List<Integer> result = UserManager.filterUserNumberOfPost();

    List<Integer> usernumberofpost = new ArrayList<>();
    usernumberofpost.add(0);
    usernumberofpost.add(0);
    assertEquals(usernumberofpost, result);
    }

}