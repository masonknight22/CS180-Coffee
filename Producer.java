public class Producer {

    private String name;
    private String location;

    public Producer(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public Producer(Producer producer) {
        this.name = producer.name;
        this.location = producer.location;
    }

    public Producer() {
        this.name = null;
        this.location = null;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "Producer<name=" + name + ",location=" + location + ">";
    }
}
