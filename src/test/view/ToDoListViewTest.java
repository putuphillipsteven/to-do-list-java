package test.view;

import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;
import service.ToDoListService;
import service.ToDoListServiceImpl;
import view.ToDoListView;

public class ToDoListViewTest {

    public static void main(String[] args) {
        testAddToDoList();
    }

    public static void testShowToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListService.addToDoList("Belajar Java Dasar");
        toDoListService.addToDoList("Belajar Java OOP");
        toDoListService.addToDoList("Belajar Java Standard Classes");

        toDoListView.showToDoList();
    }

    public static void testAddToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListView.addToDoList();
        toDoListService.showToDoList();
        toDoListView.addToDoList();
        toDoListService.showToDoList();
    }

    public static void testRemoveToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListService.addToDoList("Belajar Java Dasar");
        toDoListService.addToDoList("Belajar Java OOP");
        toDoListService.addToDoList("Belajar Java Standard Classes");

        toDoListView.removeToDoList();
        toDoListView.showToDoList();
        toDoListView.removeToDoList();
        toDoListView.showToDoList();
    }
}
