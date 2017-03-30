package Core_01;

import java.util.*;

/**
 * Created by Taras on 30.03.2017.
 */
public class Library {

    private Map<Author, List<Book>> map = new HashMap<>();
    private Set<Map.Entry<Author, List<Book>>> set = map.entrySet();

    public void addAuthor(){
        System.out.println("Введіть ім'я");
        String name = Main.scanner.next();
        System.out.println("Введіть прізвище");
        String surname = Main.scanner.next();
        System.out.println("Введіть вік");
        int age = Main.scanner.nextInt();
        System.out.println("Введіть ріст");
        int growth = Main.scanner.nextInt();
        System.out.println("Введіть вагу");
        int weight = Main.scanner.nextInt();
        map.put(new Author(growth, weight, age, name, surname), new ArrayList<Book>());
    }

    public void addBookToAuthor(){
        boolean checkAuthor = false;
        System.out.println("Введіть ім'я автора");
        String name = Main.scanner.next();
        System.out.println("Введіть прізвище автора");
        String surname = Main.scanner.next();
        for(Map.Entry<Author, List<Book>> entry : set){
            if(name.equals(entry.getKey().getName()) && surname.equals(entry.getKey().getSurname())){
                System.out.println("Введіть назву книги");
                String bookName = Main.scanner.next();
                System.out.println("Введіть дату публікації книги");
                int publicationYear = Main.scanner.nextInt();
                System.out.println("Введіть кількість сторінок книги");
                int pagesNumber = Main.scanner.nextInt();
                entry.getValue().add(new Book(bookName, publicationYear, pagesNumber));
                checkAuthor = true;
            }
        }
        if(!checkAuthor){
            System.out.println("Такого автора не існує");
        }
    }

    public void removeBookFromAuthor(){
        boolean checkAuthor = false;
        System.out.println("Введіть ім'я автора");
        String name = Main.scanner.next();
        System.out.println("Введіть прізвище автора");
        String surname = Main.scanner.next();
        for(Map.Entry<Author, List<Book>> entry : set){
            if(name.equals(entry.getKey().getName()) && surname.equals(entry.getKey().getSurname())){
                System.out.println("Введіть назву книги");
                String bookName = Main.scanner.next();
                for(int i = 0; i < entry.getValue().size(); i++) {
                    if(bookName.equals(entry.getValue().get(i).getName())){
                        entry.getValue().remove(i);
                    }
                }
                checkAuthor = true;
            }
        }
        if(!checkAuthor){
            System.out.println("Такого автора не існує");
        }
    }

    public void removeAuthor() {
        boolean checkAuthor = false;
        System.out.println("Введіть ім'я автора");
        String name = Main.scanner.next();
        System.out.println("Введіть прізвище автора");
        String surname = Main.scanner.next();
        for(Map.Entry<Author, List<Book>> entry : set) {
            if(name.equals(entry.getKey().getName()) && surname.equals(entry.getKey().getSurname())){
                map.remove(entry.getKey());
                checkAuthor = true;
            }
        }
        if(!checkAuthor) {
            System.out.println("Такого автора не існує");
        }
    }

    public void viewAuthorsBooks(){
        boolean checkAuthor = false;
        System.out.println("Введіть ім'я автора");
        String name = Main.scanner.next();
        System.out.println("Введіть прізвище автора");
        String surname = Main.scanner.next();
        for(Map.Entry<Author, List<Book>> entry : set){
            if(name.equals(entry.getKey().getName()) && surname.equals(entry.getKey().getSurname())){
                System.out.print(entry.getKey().getName() + " " + entry.getKey().getSurname() + " має такі книги: ");
                for(int i = 0; i < entry.getValue().size(); i++){
                    System.out.print(entry.getValue().get(i).getName() + " ");
                }
                checkAuthor = true;
                System.out.println();
            }
        }
        if(!checkAuthor) {
            System.out.println("Такого автора не існує");
        }
    }

    public void sortByDate(){
        boolean checkAuthor = false;
        System.out.println("Введіть ім'я автора");
        String name = Main.scanner.next();
        System.out.println("Введіть прізвище автора");
        String surname = Main.scanner.next();
        for(Map.Entry<Author, List<Book>> entry : set){
            if(name.equals(entry.getKey().getName()) && surname.equals(entry.getKey().getSurname())){
                Collections.sort(entry.getValue(), new SortByDate());
                checkAuthor = true;
            }
        }
        if(!checkAuthor) {
            System.out.println("Такого автора не існує");
        }
    }

    public void sortByPages(){
        boolean checkAuthor = false;
        System.out.println("Введіть ім'я автора");
        String name = Main.scanner.next();
        System.out.println("Введіть прізвище автора");
        String surname = Main.scanner.next();
        for(Map.Entry<Author, List<Book>> entry : set){
            if(name.equals(entry.getKey().getName()) && surname.equals(entry.getKey().getSurname())){
                Collections.sort(entry.getValue(), new SortByPages());
                checkAuthor = true;
            }
        }
        if(!checkAuthor) {
            System.out.println("Такого автора не існує");
        }
    }

    public void displayLibrary(){
        System.out.println(map);
    }

    public void exit(){
        System.exit(0);
    }
}
