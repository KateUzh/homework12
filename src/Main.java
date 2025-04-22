public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Василий", "Пупкин");
        Author authorTwo = new Author("Макс", "Фрай");
        Book bookOne = new Book("Жизнь и подвиги Пупкина", authorOne, 2022);
        Book bookTwo = new Book("Лабиринты Мёнина", authorTwo, 2015);

        System.out.println("bookOne = " + bookOne);
        System.out.println("bookTwo = " + bookTwo);
        bookTwo.setPublicationYear(1995);
        System.out.println("bookTwo.getPublicationYear() = " + bookTwo.getPublicationYear());

        System.out.println(bookOne.equals(bookTwo));
    }
}