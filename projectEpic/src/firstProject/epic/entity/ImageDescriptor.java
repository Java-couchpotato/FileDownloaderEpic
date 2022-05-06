package firstProject.epic.entity;

public class ImageDescriptor {

    private String linkOfPicture;
    private String actionForPicture;

    @Override
    public String toString() {
        return  linkOfPicture +","+ actionForPicture+"  \n" ;
    }

    public ImageDescriptor(String linkOfPic, String action) {
        this.linkOfPicture = linkOfPic;
        this.actionForPicture = action;
    }




    public String getLinkOfPicture() {
        return linkOfPicture;
    }

    public void setLinkOfPicture(String linkOfPicture) {
        this.linkOfPicture = linkOfPicture;
    }

    public String getActionForPicture() {
        return actionForPicture;
    }

    public void setActionForPicture(String actionForPicture) {
        this.actionForPicture = actionForPicture;
    }


}
