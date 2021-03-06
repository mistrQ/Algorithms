package me.aslam.khurram.ds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {

    @Test
    public void testEnqueue() {
        IQueue<Integer> myQueue = new Queue<>(10);
        myQueue.enqueue(10);
        assertEquals("Queue should not be empty", false, myQueue.isEmpty());
    }

    @Test
    public void testDequeue() throws Exception {
        IQueue<Integer> myQueue = new Queue<>(10);
        myQueue.enqueue(10);
        int dequeuedValue = myQueue.dequeue();
        assertEquals("Value dequeued is not correct", 10, dequeuedValue);
    }

    @Test
    public void testIsEmpty() throws Exception {
        IQueue<Integer> emptyQueue = new Queue<>(10);
        assertEquals("Queue is not empty", true, emptyQueue.isEmpty());

        IQueue<Integer> nonEmptyQueue = new Queue<>(10);
        nonEmptyQueue.enqueue(10);
        assertEquals("Queue is empty", false, nonEmptyQueue.isEmpty());
    }
}
