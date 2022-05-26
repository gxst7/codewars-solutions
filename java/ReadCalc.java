import java.util.Scanner;

public class ReadCalc {
    public static void main(String...strings) {
        int pagesAll;
        int currentPage;
        int deadline;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter how much pages the book has");
        pagesAll = Integer.parseInt(scanner.nextLine());
        System.out.println("enter current page");
        currentPage = Integer.parseInt(scanner.nextLine());
        System.out.println("how much days to deadline left");
        deadline = Integer.parseInt(scanner.nextLine());

        System.out.println("you need to read " + (pagesAll - currentPage) / deadline + " pages every day");
        
        scanner.close();
    }
}
