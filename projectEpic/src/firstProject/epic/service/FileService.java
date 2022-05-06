package firstProject.epic.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {


    public FileService() {
    }

    //вычитываем текстовый файл
    //return list of strings from textFile
    public static List<String> loadLinkOfPicture(String csvFile) {

        List<String>temp = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String line ;
            while ((line = reader.readLine()) != null) {
               temp.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return temp;
    }


}

