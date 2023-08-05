import Tree.FamilyTree;
import human.Gender;
import human.Human;
import writer.FileHandler;
import java.time.LocalDate;
import java.util.Scanner;

public class Communicator {
    String filePath = "src/tree.out";

    // Сохраняем результат работы методов с объектами классов
    // FileHandler fileHandler = new FileHandler();
    // fileHandler.save(familyTree, filePath);

    // Не запуская методы классов, выводим результат того, что было сделано ранее
    // FileHandler fileHandler = new FileHandler();
    // FamilyTree familyTree = (FamilyTree)fileHandler.read(filePath);

    private Scanner scanner;
    
    public Communicator() {
        scanner = new Scanner(System.in);
    }
    
    public void run() {
        while (true) {
            System.out.print("Главное меню GeoTree vers.999");
            System.out.print("Введите команду на выбор (look, exit): \n");
            String command = scanner.nextLine();
            
            if (command.equals("look")) {
                FamilyTree<Human> familyTree = new FamilyTree<>();
                Human oleg = new Human("Олег", Gender.MALE, "50", LocalDate.of(1973, 1, 1));
                Human olga = new Human("Ольга", Gender.FEMALE, "49", LocalDate.of(1974, 1, 1));
                Human dima = new Human("Дмитрий", Gender.MALE, "20", LocalDate.of(2003, 1, 1), oleg, olga);
                Human vova = new Human("Владимир", Gender.MALE, "20", LocalDate.of(2003, 1, 1), oleg, olga);
                familyTree.add(oleg);
                familyTree.add(olga);
                familyTree.add(dima);
                familyTree.add(vova);
                Human babushka = new Human("Петровна", Gender.FEMALE,  "100", LocalDate.of(1923, 1, 1));
                babushka.addChild(oleg);
                familyTree.add(babushka);
                System.out.println("Сортировка по имени:\n");
                familyTree.sortByName();
                System.out.println(familyTree);
                System.out.println("Сортировка по возрасту:\n");
                familyTree.sortByAge();
                System.out.println(familyTree);
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}