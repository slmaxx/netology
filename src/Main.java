public class Main {
    public static void main(String[] args) {
        // Создаем книги
        Book harryPotter = new Book ("Harry Potter");
        Book lordOfTheRings = new Book ("The Lord of the Rings");

        //Меняем статус
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(harryPotter, StatusEnum.BORROWED);

        //Получаем статус книги
        System.out.println("Статус книги " + harryPotter.toString());


    }
}
