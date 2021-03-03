import org.junit.Assert;
import org.junit.Test;

public class TestMassConvector {
    MassConvector massConvector = new MassConvector();

    @Test
    public void testDescendingSort(){
        Assert.assertArrayEquals(new int []{5,4,3,2,1},massConvector.descendingSort(new int[]{1,2,3,4,5}));
    }

    @Test
    public void testSortAscending(){
        Assert.assertArrayEquals(new int []{1,2,3,4,5},massConvector.sortAscending(new int[]{5,4,3,2,1}));
    }

    @Test
    public void testMinElement(){
        Assert.assertEquals(1,massConvector.minElement(new int[]{5,4,3,2,1}),0);
    }

    @Test
    public void testMaxElement(){
        Assert.assertEquals(5,massConvector.maxElement(new int[]{5,4,3,2,1}),0);
    }

    @Test
    public void testMax(){
        Assert.assertEquals(5,massConvector.max(new int[][]{{5,4,3,2,1},{0,3,2,1,4},{0,0,3,2,1},{0,0,0,2,1}}),0);
    }
}
