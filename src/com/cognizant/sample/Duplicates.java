package com.cognizant.sample;

import java.util.*;
import java.util.Map.Entry;
public class Duplicates
{
    public static void main(String[] args)
    {

        int a = 0;
        int b = 1;
        int c = 0;
        int sum = 0;
        while (a <= 100)
        {
            sum = sum+a;
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(sum);



    }
}

