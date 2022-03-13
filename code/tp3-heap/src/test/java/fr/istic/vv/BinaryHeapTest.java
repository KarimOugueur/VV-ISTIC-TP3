package fr.istic.vv;


import org.junit.*;

import java.sql.Array;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Supplier;

import static org.junit.Assert.*;


public class BinaryHeapTest {

    Comparator<Integer> compa = new Comparator<Integer>() {
        @Override
        public int compare(Integer lElement, Integer rElement) {
            return lElement.compareTo(rElement);
        }
    };
    private Integer [] heap;
    private BinaryHeap binaryHeap;
    @Before
    public void setup() {
        heap = new Integer[4];
        binaryHeap = new BinaryHeap<Integer>(compa, heap);
    }

    @Test
    public void testPop(){

        binaryHeap.push(4);
        binaryHeap.push(3);
        binaryHeap.push(2);
        binaryHeap.push(1);

        assertEquals(1, binaryHeap.pop());
        assertEquals(false, binaryHeap.isFull());
        assertEquals(false, binaryHeap.isEmpty());
    }
    @After
    public void tearDownPop(){

    }

    @Test
    public void testPush(){

        binaryHeap.push(4);
        binaryHeap.push(3);
        binaryHeap.push(2);
        binaryHeap.push(1);

        assertEquals(4,binaryHeap.count());
        assertEquals(true, binaryHeap.isFull());
        assertEquals(false, binaryHeap.isEmpty());
     }

    @After
    public void tearDownPush(){

    }
     @Test
    public void testPeek(){
         binaryHeap.push(4);
         binaryHeap.push(3);
         binaryHeap.push(2);
         binaryHeap.push(1);

         assertEquals(1,  binaryHeap.peek());
     }

    @After
    public void tearDownPeek(){

    }
     @Test
    public void testCount(){

         binaryHeap.push(4);
         binaryHeap.push(3);
         binaryHeap.push(2);
         binaryHeap.push(1);

         assertEquals(4, binaryHeap.count());

     }

    @After
    public void tearDownCount(){

    }
}