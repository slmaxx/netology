public class FromArchievedStatusMover extends BookMover {
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {
        if (book.status == StatusEnum.ARCHIVED) {

            switch (requestedStatus) {
                case AVAILABLE:
                    System.out.println("Установлен запрошенный статус");
                    book.setStatus(requestedStatus);
                    //System.out.println("Перевод книги из статуса " + book.status + " в " + requestedStatus + " невозможен");
                    break;
                case ARCHIVED:
                    //System.out.println("Установлен запрошенный статус");
                    //book.setStatus(requestedStatus);
                    System.out.println("Перевод книги из статуса " + book.status + " в " + requestedStatus + " невозможен");
                    break;
                case BORROWED:
                    //System.out.println("Установлен запрошенный статус");
                    //book.setStatus(requestedStatus);
                    System.out.println("Перевод книги из статуса " + book.status + " в " + requestedStatus + " невозможен");
                    break;
                case OVERDUED:
                    //System.out.println("Установлен запрошенный статус");
                    //book.setStatus(requestedStatus);
                    System.out.println("Перевод книги из статуса " + book.status + " в " + requestedStatus + " невозможен");
                    break;
            }

        } else System.out.println("Книга в статусе " + book.status);
    }
}
