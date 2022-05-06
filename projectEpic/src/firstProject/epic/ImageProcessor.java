package firstProject.epic;

import firstProject.epic.entity.ImageDescriptor;
import firstProject.epic.service.FileService;
import firstProject.epic.service.ImageDescriptorService;
import firstProject.epic.service.ImageLoaderFromSourse;

import java.io.IOException;
import java.util.List;


public class ImageProcessor {
    public static void main(String[] args) throws IOException {

    FileService fileService = new FileService();
    ImageDescriptorService imageDescriptorService = new ImageDescriptorService(fileService);
    imageDescriptorService = new ImageDescriptorService(fileService);
        List<ImageDescriptor> list1 = imageDescriptorService.getImageDescriptions("UrlList.csv");
        String s="";
        for (int i = 0; i < list1.size(); i++) {
            s = list1.get(i).getLinkOfPicture();
        }
        ImageLoaderFromSourse imageLoaderFromSourse = new ImageLoaderFromSourse();
        imageLoaderFromSourse.downloadImage(s);
    }
}
