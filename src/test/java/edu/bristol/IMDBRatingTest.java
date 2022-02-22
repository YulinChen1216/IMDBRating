package edu.bristol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class IMDBRatingTest
{
    @Test
    public void testAverageRating()
    {
        float averageRating=0;
        IMDBRating rater = new IMDBRating();

        for(int i=1;i<=10;i++){
            averageRating = rater.addNewRating(i);
        }
        System.out.println(averageRating);
        assertEquals(5.5, averageRating, "average should be 5.5 but it was " + averageRating);
    }
}