package exam03retake02;
/*
Tennivalólista
Írj egy tennivaló osztályt (Todo), melynek attribútumai:
text, state és priority, rendre String, State és int típusú.
A State egy saját enum COMPLETED és NON_COMPLETED értékekkel.
A prioritás 1 és 5 közötti egész szám. Ha nem ilyet kap, akkor
kivételt dob. Konstuktorban csak a szövegét és a prioritását
kell megadni, alapértelmezetten NON_COMPLETED állapottal jön
létre. Legyen egy complete() metódusa, mely átállítja az állapotát!

Legyen egy TodoList osztály, mely több tennivalót tartalmaz!
Egy List<Todo> attribútumban tartalmazza a tennivalókat.
Metódusai:
    getNumberOfItemsLeft() - visszaadja a még el nem készült tennivalók számát
    getMostImportantTodosText() - visszaadja a legfontosabb tennivalókat. Nem feltétlen van 1-es prioritású.
    deleteCompleted() - a listából kitörli az elvégzetteket
 */

public class Todo {
    private String text;
    private State state;
    private int priority;

    public Todo(String text, int priority)
    {
        if (priority < 1 || priority > 5) {
            throw new IllegalArgumentException("Invalid number of priority.");
        }
        this.text = text;
        this.priority = priority;
        this.state = State.NON_COMPLETED;
    }

    public State getState()
    {
        return state;
    }

    public void complete()
    {
        this.state = State.COMPLETED;
    }

    public String getText()
    {
        return text;
    }

    public int getPriority()
    {
        return priority;
    }
}
