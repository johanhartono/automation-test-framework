// Date Created         : 11 August 2024
// Author               : Johan Hartono Ho
// Modified/Updated by  : 19 August 2024

package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
//import helper.Utility;

public class Hooks {

    @BeforeAll
    public static void setUp() {
        //System.out.println("Before All");
    }
    @AfterAll
    public static void tearDown() {
        //System.out.println("After All");
    }

    @Before
    public static void beforeTest() {
        //Utility.startDriver();
    }

    @After
    public static void afterTest() {

    }


}
