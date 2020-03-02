package com.interview.java.resource;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class BaseStream {
    static FileReader fileInputStream;
    static BufferedReader bufferedInputStream;

    public BaseStream(FileReader fileInputStream, BufferedReader bufferedInputStream) {
        BaseStream.fileInputStream = fileInputStream;
        BaseStream.bufferedInputStream = bufferedInputStream;
    }
}
