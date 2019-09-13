import java.util.*;

class StudentAssessment {
    ArrayList<Integer> evaluationList = new ArrayList<Integer>();

    public void createEvaluation() {
        Random rand = new Random();
        System.out.println("Wykaz ocen z przdmiotu: Informatyka, dla ucznia: Grzegorz Brzeczyszczykiewicz");
        for (int i = 0; i < 20; i++) {
            evaluationList.add(rand.nextInt(6) + 1);
            System.out.print(evaluationList.get(i) + ", ");
        }
        System.out.println("--> ilosc: " + evaluationList.size());
        evaluationList.sort(null);
        System.out.println("Oceny po sortowaniu:");
        for (Integer i : evaluationList) {
            System.out.print(i + ", ");
        }
        System.out.println("--> ilosc: " + evaluationList.size());
    }

    public double averageEvaluation() {
        Integer sumEvaluation = 0;
        System.out.println("Oceny po wycieciu dwoch skrajnych wartosci:");
        for (int i = 1; i < evaluationList.size() - 1; i++) {
            sumEvaluation += evaluationList.get(i);
            System.out.print(evaluationList.get(i) + ", ");
        }
        System.out.println("--> ilosc: " + (evaluationList.size() - 2));
        return (double) sumEvaluation / (evaluationList.size() - 2);
    }
}

class Book2 {
    String bookTitle;
    int publicDate;
    Book2(String bookTitle, int publicDate) {
        this.bookTitle = bookTitle;
        this.publicDate = publicDate;
    }
}

class Application5 {
    public static void main(String[] args) {
        StudentAssessment myStudent = new StudentAssessment();
        myStudent.createEvaluation();
        System.out.printf("Srednia ocen ucznia wynosi: " + "%.2f", myStudent.averageEvaluation());
        System.out.println();
        LinkedList<Book2> library = new LinkedList<Book2>();
        library.add(new Book2("50 shades of Grey", 2012));
        library.add(new Book2("Sherlock Holmes", 1998));
        library.add(new Book2("The Last Mohican", 1977));
        library.add(new Book2("The infinity", 2006));
        library.add(new Book2("Better Call Soul", 2001));
        library.add(new Book2("A Journey Into the Earth", 1982));
        library.add(new Book2("Neverending Story", 2000));
        System.out.println("\nWykaz ksiazek zawartych na liscie 'library':");
        for (Book2 showBook : library) {
            System.out.println("tytul: " + showBook.bookTitle + ", rok wydania: " + showBook.publicDate);
        }
        System.out.println("\nWykaz ksiazek wydanych od roku 2000:");
        for (Book2 showBook : library) {
            if (showBook.publicDate >= 2000) {
                System.out.println("tytul: " + showBook.bookTitle + ", rok wydania: " + showBook.publicDate);
            }
        }
    }
}
