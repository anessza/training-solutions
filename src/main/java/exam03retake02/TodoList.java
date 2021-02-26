package exam03retake02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList {
    private List<Todo> todoList = new ArrayList<>();

    public void addTodo(Todo todo)
    {
        todoList.add(todo);
    }

    public List<Todo> getTodos()
    {
        return new ArrayList<>(todoList);
    }
//* getNumberOfItemsLeft() - visszaadja a még el nem készült tennivalók számát
    public int getNumberOfItemsLeft()
    {
        int numberOfNotCompletedTodo = 0;
        for (Todo item : todoList)
        {
            if (item.getState().equals(State.NON_COMPLETED))
            {
                numberOfNotCompletedTodo ++;
            }
        }
        return numberOfNotCompletedTodo;
    }

    //*visszaadja a legfontosabb tennivalókat. Nem feltétlen van 1-es prioritású.
    public List<String> getMostImportantTodosText(){
        List<String> mostImportantTodo = new ArrayList<>();

        /*List<Todo> nonCompletedTodo = new ArrayList<>();
        for (Todo item : todoList) {
            if (item.getState().equals(State.NON_COMPLETED)) {
                nonCompletedTodo.add(item);
            }
        }*/

        for (int i = 1; i < 6; i++)
        {
            if (mostImportantTodo.size() == 0)
            {
                for (Todo item : todoList)
                {
                    if (item.getPriority() == i) {
                        mostImportantTodo.add(item.getText());
                    }
                }
            }
        }
        System.out.println(mostImportantTodo);
        return mostImportantTodo;
    }

    public void deleteCompleted(){
        for (Iterator<Todo> iterator = todoList.iterator(); iterator.hasNext();)
        {
            Todo todo = iterator.next();

            if (todo.getState() == State.COMPLETED)
            {
                iterator.remove();
            }
        }
    }
}
