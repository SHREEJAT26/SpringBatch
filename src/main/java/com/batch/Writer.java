package com.batch;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class Writer implements ItemWriter<String>
{

    @Override
    public void write(Chunk<? extends String> chunk) throws Exception {
        System.out.println("Inside Writer");
        System.out.println("Writing Data : "+chunk);
    }
}

