package service;

import entity.ToDoList;
import repository.ToDoListRepository;

public class ToDoListServiceImpl implements ToDoListService{
    private ToDoListRepository toDoListRepository;
    private ToDoList[] data;

    public ToDoListServiceImpl(ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
        this.data = toDoListRepository.getAll();
    }

    @Override
    public void showToDoList() {
        System.out.println("TO DO LIST");
        for (var i = 0; i < data.length; i++) {
            var todo = data[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println(no + ". " + todo.getTodo());
            }
        }
    }

    @Override
    public void addToDoList(String todo) {
        ToDoList toDoList = new ToDoList(todo);
        toDoListRepository.add(toDoList);
        System.out.println("Sukses Menambahkan : " + toDoList.getTodo());
    }

    @Override
    public void removeToDoList(Integer number) {
        boolean result =  toDoListRepository.remove(number);
        if(result) {
        System.out.println("Sukses menghapus To Do List nomor : " + number);
        } else {
            System.out.println("Gagal menghapus To Do List nomor : " + number);
        }
    }
}
