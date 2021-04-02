package com.example.lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab1ApplicationTests {
	
	//Tests for Task 1
	@Test
    public void task1a(){
        final ArrayList output = Solutions.getIntegersFromList(Arrays.asList(1, 2 ,'a', 'b', 0, 15));
        final List<Integer> truth = Arrays.asList(1, 2, 0, 15);
        assertEquals(truth, output);
    }
	@Test
    public void task1b(){
        final ArrayList output = Solutions.getIntegersFromList(Arrays.asList(1, 2 ,'a', 'b', "aasf", 0, 15));
        final List<Integer> truth = Arrays.asList(1, 2, 0, 15);
        assertEquals(truth, output);
    }
	@Test
    public void task1c(){
        final ArrayList output = Solutions.getIntegersFromList(Arrays.asList(1, 2 ,'a', 'b', "aasf", '1', "123", 231));
        final List<Integer> truth = Arrays.asList(1, 2, 231);
        assertEquals(truth, output);
    }

	//Tests for Task 2
	@Test
    public void task2a(){
        final char output = Solutions.firstNonRepeatingLetter("stress");
        final char truth = 't';
        assertEquals(truth, output);
    }
	@Test
	public void task2b(){
        final char output = Solutions.firstNonRepeatingLetter("sTreSs");
        final char truth = 'T';
        assertEquals(truth, output);
    }
	@Test
	public void task2c(){
        final char output = Solutions.firstNonRepeatingLetter("AAbBcc");
        final char truth = ' ';
        assertEquals(truth, output);
    }

	//Tests for Task 3
	@Test
    public void task3a(){
        final int output = Solutions.digitalRoot(16);
        final int truth = 7;
        assertEquals(truth, output);
    }
	@Test
    public void task3b(){
        final int output = Solutions.digitalRoot(942);
        final int truth = 6;
        assertEquals(truth, output);
    }
	@Test
    public void task3c(){
        final int output = Solutions.digitalRoot(493193);
        final int truth = 2;
        assertEquals(truth, output);
    }

	//Tests for Task 4
	@Test
    public void task4a(){
        final int output = Solutions.countSumPairs(new int[]{1, 3, 6, 2, 2, 0, 4, 5}, 5);
        final int truth = 4;
        assertEquals(truth, output);
    }
	@Test
    public void task4b(){
        final int output = Solutions.countSumPairs(new int[]{1, 3, 6, 8}, 6);
        final int truth = 0;
        assertEquals(truth, output);
    }

	@Test
    public void task4c(){
        final int output = Solutions.streamCountSumPairs(new int[]{4, 4, 2, 4}, 6);
        final int truth = 3;
        assertEquals(truth, output);
    }

	//Tests for Task 5
	@Test
    public void task5a(){
        final String output = Solutions.sortGuests("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill");
        final String truth = "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)";
        assertEquals(truth, output);
    }
	@Test
    public void task5b(){
        final String output = Solutions.sortGuests("Vadym:Chernovskyi;Ben:Bailey;Xena:Zinke;Vadym:Chernovskyi");
        final String truth = "(BAILEY, BEN)(CHERNOVSKYI, VADYM)(CHERNOVSKYI, VADYM)(ZINKE, XENA)";
        assertEquals(truth, output);
    }


    //Tests for EXTRA Task (2)
	@Test
    public void extra2a(){
        final String output = Solutions.convertToIPv4(2149583361L);
        final String truth = "128.32.10.1";
        assertEquals(truth, output);
    }
    @Test
    public void extra2b(){
        final String output = Solutions.convertToIPv4(32L);
        final String truth = "0.0.0.32";
        assertEquals(truth, output);
    }

    @Test
    public void extra2c(){
        final String output = Solutions.convertToIPv4(0L);
        final String truth = "0.0.0.0";
        assertEquals(truth, output);
    }

}


