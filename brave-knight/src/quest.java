import java.util.*;

interface Quest{
    public String process();
}

class DeadIslandQuest implements Quest {
    public String process() {
        System.out.println("Przygoda na martwej wyspie:");
        System.out.print("Nasz bohater dzisiaj ");
        String events[] = {"pokonał elitarnego zombi i zdobył legendarny miecz", "został pojmany przez hordę troli", "został okradziony z ekwipunku i stał się bezbronny", "znalazł dużo złota i kupił nowy miecz oraz magiczną tarczę", "zginął od ataku cyklopa", "zaatakował z ukrycia przywódcę zombi i zabił go", "dostał śmiertelny cios od spotkanej niewiasty", "poddał się bez walki w obliczu przeważającej siły wroga", "znalazł sekretne przejście do twierdzy troli", "w morderczej walce zwyciężył czarnoksiężnika"};
        Random r = new Random();
        int randomNum = r.nextInt(10);
        return events[randomNum];
    }
}

class EliteKnightQuest implements Quest {
    public String process() {
        System.out.println("Raport z turnieju elitarnych rycerzy:");
        System.out.println("Podczas walki rycerz zakonu Ponurych Grabarzy zdobył:");
        Random r = new Random();
        int randomNum1 = r.nextInt(11);
        int randomNum2 = r.nextInt(11);
        int randomNum3 = r.nextInt(11);
        return randomNum1 + " pkt. wytrzymałości,\t" + randomNum2 + " pkt. zwinności,\t" + randomNum3 + " pkt. inteligencji.";
    }
}

class Knight {
    Quest quest;
    Knight(Quest quest) {
        this.quest = quest;
    }

    String processKnight() {
        return this.quest.process();
    }
}

class Application {
    public static void main(String[] args) {
        Knight myKnight1 = new Knight(new DeadIslandQuest());
        String textQuest1 = myKnight1.processKnight();
        System.out.println(textQuest1);
        System.out.println();
        Knight myKnight2 = new Knight(new EliteKnightQuest());
        String textQuest2 = myKnight2.processKnight();
        System.out.println(textQuest2);
    }
}
