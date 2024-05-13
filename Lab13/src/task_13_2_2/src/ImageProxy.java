package task_13_2_2.src;

public class ImageProxy implements DisplayObject {
    private String imagePath;
    private ImageFile imageFile;

    public ImageProxy(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void display() {
        if (imageFile == null) {
            imageFile = new ImageFile(imagePath);
        }
        imageFile.display();
    }
}
