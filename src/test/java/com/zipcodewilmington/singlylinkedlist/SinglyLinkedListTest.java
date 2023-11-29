package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void testSinglyLinkedListConstructor(){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        Assert.assertNotNull(list);
    }

    /*
     * Make a separate class to compare the nodes.
     */
//    @Test
//    public void testSinglyLinkedListCoparatorInstance(){
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
//        Assert.assertTrue(list instanceof Comparator);
//    }

    @Test
    public void testSinglyLinkedListAddNode(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Integer num = 3;
        list.add(num);

        Assert.assertEquals(num, list.get(0));
    }

    @Test
    public void testSinglyLinkedListRemoveNode(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Integer num = 4;
        Integer num2 = 5;
        Integer num3 = 8;
        list.add(num);
        list.add(num2);
        list.add(num3);
        list.remove(1);
        Assert.assertFalse(list.contains(num2));
    }

    @Test
    public void testSinglyLinkedListContains(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Integer expected = 6;
        list.add(expected);

        Assert.assertTrue(list.contains(expected));
    }

    @Test
    public void testSinglyLinkedListFind(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Integer num = 6;
        Integer num2 = 8;
        Integer num3 = 10;
        list.add(num);
        list.add(num2);
        list.add(num3);

        Assert.assertEquals(0, list.find(num));
    }

    @Test
    public void testSinglyLinkedListNotFind(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Integer num = 6;
        Integer num2 = 8;
        Integer num3 = 10;
        Integer numNotInList = 20;
        list.add(num);
        list.add(num2);
        list.add(num3);

        Assert.assertEquals(-1, list.find(numNotInList));
    }

    @Test
    public void testSinglyLinkedListSize(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Integer num = 6;
        Integer num2 = 8;
        Integer num3 = 10;
        list.add(num);
        list.add(num2);
        list.add(num3);

        Assert.assertEquals(3, list.size());
    }

    @Test
    public void testSinglyLinkedListGet(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Integer num = 6;
        Integer num2 = 8;
        Integer num3 = 10;
        list.add(num);
        list.add(num2);
        list.add(num3);

        Assert.assertEquals(num2, list.get(1));
    }

    @Test
    public void testSinglyLinkedListCopy(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Integer num = 7;
        Integer num2 = 2;
        Integer num3 = 10;
        Integer num4 = 8;
        list.add(num);
        list.add(num2);
        list.add(num3);
        list.add(num4);

        SinglyLinkedList<Integer> actual = list.copy();

        Assert.assertEquals(list.get(0), actual.get(0));
        Assert.assertEquals(list.get(1), actual.get(1));
        Assert.assertEquals(list.get(2), actual.get(2));

    }

    @Test
    public void testSinglyLinkedListSortInt(){
        /*
         * How do you want to sort?
         * By hashcodes?
         * Or ascending order -- you'll need to write at least 2 comparators
         * one for strings, another for numbers
         * What if we get a user-made class's object? How to sort that?
         * ... think about this
         */
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Integer num = 7;
        Integer num2 = 2;
        Integer num3 = 10;
        Integer num4 = 8;
        list.add(num);
        list.add(num2);
        list.add(num3);
        list.add(num4);


    }
}
