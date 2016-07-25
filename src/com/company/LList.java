package com.company;

import java.util.Scanner;

public class LList<T>
{
    MyNode<T> head = null;
    MyNode<T> tail = null;
    MyNode<T> temp = null;
    int count = 0;
    Scanner scan = new Scanner(System.in);

    //puts a new value at the edn of the list
    public void add(T i)
    {
        if(head == null)
        {
            head = new MyNode<T>();
            head.data = i;
            head.next = tail;
            tail = head;
        }
        else
        {
            tail.next = new MyNode<T>();
            tail = tail.next;
            tail.data = i;
        }
        count ++;
    }

    //returns the number of values in the list
    public int size()
    {
        return count;
    }

    public T get(int index)
    {
        if(head == null || index > count -1)
        {
            return null;
        }
        if(index < 0 || index >= count)
        {
            System.out.println("This does not exist");
        }
        MyNode<T> p = head;
        int size = 0;
        while(size < index && p.next != null)
        {
            p = p.next;
            size++;
        }
        if(count != index)
        {
            return null;
        }
        else
        {
            return p.data;
        }
    }

    //removes and returns the value at a given index
    public T remove(T elem)
    {
        temp = head;
        MyNode<T> two = null;
        if(head.data.equals(elem))
        {
            head = head.next;
            head.previous = null;
            count--;
            return elem;
        }
        else if(tail.data.equals(elem))
        {
            tail = tail.previous;
            tail.next = null;
            count--;
            return elem;
        }
        while(temp != null && !temp.data.equals(elem))
        {
            two = temp;
            temp = temp.next;
        }
        if(temp == null)
        {
            return null;
        }
        two.next = temp.next;
        T spare = temp.data;
        temp = null;
        count--;
        return spare;
    }

}
