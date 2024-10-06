interface Quest {
    void process();
}

class DeadIslandQuest implements Quest {
    public void process() {
        System.out.println("Dead Island quest");
    }
}

class EliteKnightQuest implements Quest {
    public void process() {
        System.out.println("Elite Knight quest");
    }
}

class Knight {

    private final Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void completeQuest() {
        quest.process();
    }

}

public class Main {
    public static void main(String[] args) {

        Quest deadIslandQuest = new DeadIslandQuest();
        Quest eliteKnightQuest = new EliteKnightQuest();

        Knight knightDeadIslandQuest = new Knight(deadIslandQuest);
        knightDeadIslandQuest.completeQuest();

        Knight knightEliteIslandQuest = new Knight(eliteKnightQuest);
        knightEliteIslandQuest.completeQuest();

    }
}