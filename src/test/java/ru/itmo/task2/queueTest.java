package ru.itmo.task2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class queueTest {
    static BinQueue testQueue;

    @BeforeEach
    void setQue()
    {
        testQueue = new BinQueue();
    }

    @Test
    void MinTest()
    {
        testQueue.insert("c");
        testQueue.insert("a");
        testQueue.insert("b");

        assertEquals(testQueue.getSize(), 3);

        assertEquals(testQueue.extractMin(), "a");
        assertEquals(testQueue.extractMin(), "b");
        assertEquals(testQueue.extractMin(), "c");

        assertTrue(testQueue.isEmpty());
    }

    @Test
    void GetMinWithoutDeleteTest()
    {
        testQueue.insert("c");
        testQueue.insert("a");
        testQueue.insert("b");

        assertEquals(testQueue.findMinimum(), "a");

        assertEquals(testQueue.getSize(), 3);
    }

    @Test
    void MakeEmptyTest()
    {
        testQueue.insert("c");
        testQueue.insert("a");
        testQueue.insert("b");

        assertEquals(testQueue.getSize(), 3);

        testQueue.makeEmpty();

        assertEquals(testQueue.getSize(), 0);
    }

    @Test
    void DecreaseTest()
    {
        testQueue.insert("c");
        testQueue.insert("d");
        testQueue.insert("b");

        testQueue.decreaseKeyValue("d", "a");

        assertEquals(testQueue.extractMin(), "a");
        assertEquals(testQueue.extractMin(), "b");
        assertEquals(testQueue.extractMin(), "c");

        assertTrue(testQueue.isEmpty());
    }
}
