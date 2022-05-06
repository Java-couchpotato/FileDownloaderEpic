package firstProject.epic.service;

import firstProject.epic.entity.ImageDescriptor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImageDescriptorService {
    private final FileService fileService;

    public ImageDescriptorService(FileService fileService) {
        this.fileService = fileService;
    }


   //получает строки из файла
    public List<ImageDescriptor> getImageDescriptions(String csvFile) {
        List<ImageDescriptor> imageDescriptors=new ArrayList<>();
        List<String>str = fileService.loadLinkOfPicture(csvFile);
        for (int i = 0; i < str.size(); i++) {
            String s = str.get(i);
            ImageDescriptor id = stringToImageDescriptor(s);
            imageDescriptors.add(id);
        }
        return imageDescriptors;
    }


    public static ImageDescriptor stringToImageDescriptor(String string) {
        String[] rows = string.split(",");
        return new ImageDescriptor(rows[0], rows[1]);
    }
}
