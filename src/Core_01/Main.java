package Core_01;

import java.util.Scanner;

/**
 * Created by Taras on 30.03.2017.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Library library = new Library();

        while(true){
            System.out.println("Введіть '1', щоб додати автора в список");
            System.out.println("Введіть '2', щоб закріпити книжку за даним автором");
            System.out.println("Введіть '3', щоб видалити книжку за даним автором");
            System.out.println("Введіть '4', щоб видалити автора");
            System.out.println("Введіть '5', щоб вивести всі книги автора");
            System.out.println("Введіть '6', щоб провести сортування за датою видання");
            System.out.println("Введіть '7', щоб провести сортування за кількістю сторінок");
            System.out.println("Введіть '8', щоб вивести бібліотеку");
            System.out.println("Введіть '9', щоб вийти з програми");

            int menuNumber = scanner.nextInt();

            switch (menuNumber){
                case 1:
                    library.addAuthor();
                    break;
                case 2:
                    library.addBookToAuthor();
                    break;
                case 3:
                    library.removeBookFromAuthor();
                    break;
                case 4:
                    library.removeAuthor();
                    break;
                case 5:
                    library.viewAuthorsBooks();
                    break;
                case 6:
                    library.sortByDate();
                    break;
                case 7:
                    library.sortByPages();
                    break;
                case 8:
                    library.displayLibrary();
                    break;
                case 9:
                    library.exit();
            }
        }
    }
}
