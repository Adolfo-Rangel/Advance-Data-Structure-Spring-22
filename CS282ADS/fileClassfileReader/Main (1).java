package com.codewithadolfo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Rose are red \nViolets are blue \nBooty booty booty booty \nRocking everywhere");
            writer.append("\n (A poem by Bro)");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
