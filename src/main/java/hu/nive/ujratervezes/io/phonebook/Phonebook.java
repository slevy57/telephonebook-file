package hu.nive.ujratervezes.io.phonebook;

import java.io.*;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {

        if (contacts == null) {
            throw new IllegalArgumentException();
        }
        File file = new File(output);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
            writer.flush();
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}