package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaffTest {

    Staff staffOne = new Staff("Mike","Odongo","ek22","VAS");

    @Test
    public void getFirstname() {
        assertEquals(staffOne.getFirstname(),"Mike");
    }


    @Test
    public void getLastname() {
        assertEquals(staffOne.getLastname(),"Odongo");

    }
}