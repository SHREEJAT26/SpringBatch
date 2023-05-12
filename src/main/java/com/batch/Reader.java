package com.batch;

import org.springframework.batch.item.ItemReader;

public class Reader implements ItemReader<String>
{
    private String[] courses = {"Java web services","Springboot","Spring Batch"};
    private int count;

    public String read()
        {
            System.out.println("Inside Reader");
            if(count<courses.length)
            {
                return courses[count++];
            }
            else
            {
                count=0;
            }

            return null;
        }

}
