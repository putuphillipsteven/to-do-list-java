package test.service;

import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;
import service.ToDoListService;
import service.ToDoListServiceImpl;

public class ToDoListServiceTest {
    public static void main(String[] args) {
        testRemoveToDoList();
    }

    public static void testShowToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        toDoListService.addToDoList("Tambah pertama");
        toDoListService.addToDoList("Tambah kedua");
        toDoListService.addToDoList("Tambah ketiga");
        toDoListService.showToDoList();
    }

    public static void testAddToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        toDoListService.addToDoList("Tambah pertama");
        toDoListService.addToDoList("Tambah kedua");
        toDoListService.addToDoList("Tambah ketiga");
        toDoListService.showToDoList();
    }

    public static void testRemoveToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        toDoListService.addToDoList("Tambah pertama");
        toDoListService.addToDoList("Tambah kedua");
        toDoListService.addToDoList("Tambah ketiga");
        toDoListService.showToDoList();
        toDoListService.removeToDoList(10);
        toDoListService.showToDoList();

    }
}
