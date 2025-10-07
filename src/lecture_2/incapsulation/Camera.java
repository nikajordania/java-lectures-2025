package lecture_2.incapsulation;

public class Camera {
    private int memory; // private - only within this class possible to access this variable
    private String[] photos = new String[memory];

    public Camera(int memory) {
        this.memory = memory;
    }

    public void takePhoto() {
        if (memory > 0) {
            memory -= 10;
            System.out.println("Photo taken!");
        } else {
            System.out.println("Not enough memory!");
        }
    }

    public int getMemory() {
        return memory;
    }

    public String[] getPhotos() {
        return photos;
    }
}
