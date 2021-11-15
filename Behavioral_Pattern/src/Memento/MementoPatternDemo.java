package Memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
        originator.getStateFromMemento(caretaker.get(2));
        System.out.println("Third saved State: " + originator.getState());
    }
}
