import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StatisticsTest {

    @Test
    public void testGetMode() {
        //Arrange
        int[] arr = new int[]{1,2,3,1,0,5,2,1};
        //Act
        int result = Statistics.getMode(arr);
        //Assert
        assertEquals(1,result);
    }

    @Test
    public void testGetModeMultiple() {
        //Arrange
        int[] arr = new int[]{1,2,3,1,0,5,2,2,1};
        //Act
        int result = Statistics.getMode(arr);
        //Assert
        assertEquals(2,result);
    }

    @Test
    public void testGetMedianOdd() {
        //Arrange
        int[] arr = new int[]{3,6,7,1,3,9,8};
        //Act
        double result = Statistics.getMedian(arr);
        //Assert
        assertEquals(6, result);
    }
    @Test
    public void testGetMedianEven() {
        //Arrange
        int[] arr = new int[]{3,6,7,1,3,8};
        //Act
        double result = Statistics.getMedian(arr);
        //Assert
        assertEquals(4.5, result);
    }

    @Test
    public void testGetMean() {
        //Arrange
        int[] arr = new int[]{1,2,3,4,5,6};
        //Act
        double result = Statistics.getMean(arr);
        //Assert
        assertEquals(3.5, result);
    }

    @Test
    public void testGetMeanEmpty() {
        //Arrange
        int[] arr = new int[]{};
        //Act
        double result = Statistics.getMean(arr);
        //Assert
        assertEquals(-2.147483648E9, result);
    }


    @Test
    public void testGetRatio(){
        //Arrange
        int[] arr = new int[]{1,0,-1,0,9,-1000,32};
        //Act
        double[] result = Statistics.getRatio(arr);
        //Assert
        assertEquals(new double[]{0.42857142857142855, 0.2857142857142857, 0.2857142857142857}, result);
    }
}