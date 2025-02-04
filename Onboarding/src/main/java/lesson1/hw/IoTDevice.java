package lesson1.hw;

public abstract class IoTDevice {

    private String  id;

    private String name;

    public IoTDevice(String  id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void performAction() {
        System.out.println("Performing action for device: " + name);
    }
}
