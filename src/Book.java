public class Book {
    StatusEnum status = StatusEnum.AVAILABLE;
    String name;

    public Book (String name) {
        this.name = name;
        System.out.println("Book created: " + toString());
    }

    public String toString () {
        return "name: " + name + ", status: " + status;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
