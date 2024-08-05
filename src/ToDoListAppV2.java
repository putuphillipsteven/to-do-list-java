import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;
import service.ToDoListServiceImpl;
import view.ToDoListView;

public class ToDoListAppV2 {
    public static void main(String[] args) {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListServiceImpl toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListView.showToDoList();
    }
}
