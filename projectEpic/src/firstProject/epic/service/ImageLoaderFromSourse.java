package firstProject.epic.service;

import firstProject.epic.ImageProcessor;
import firstProject.epic.entity.ImageDescriptor;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageLoaderFromSourse {


    public static void downloadImage(String linkOfPicture) throws IOException {
        //скачивает картинку по линку из image descriptor
        URL url = new URL(linkOfPicture);
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(url)))) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\java\\projectEpic\\src\\images"));
            {
                System.out.println("Done");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





