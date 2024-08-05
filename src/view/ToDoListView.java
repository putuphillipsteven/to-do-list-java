package view;

import service.ToDoListService;
import util.InputUtil;

public class ToDoListView {
    private ToDoListService toDoListService;

    public ToDoListView(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    public void showToDoList() {
        while(true) {
            toDoListService.showToDoList();
            System.out.println("Menu: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("X. Keluar");

            var input = InputUtil.input("Pilih");

            if(input.equals("1")) {
               addToDoList();
            } else if(input.equals("2")) {
                removeToDoList();
            } else if(input.toUpperCase().equals("X")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti.");
            }
        }
    }

    public void addToDoList() {
        System.out.println("MENAMBAH TODO LIST");

        var todo  = InputUtil.input("[TEKAN X JIKA INGIN MEMBATALKAN]");
        if(todo.toUpperCase().equals("X")) {
        // batal
        } else {
           toDoListService.addToDoList(todo);
        }
    }
    public void removeToDoList() {
        System.out.println("MENGHAPUS TODO LIST");
        var input = InputUtil.input("[MASUKKAN NOMOR YANG INGIN DIHAPUS | X UNTUK BATAL]");

        if(input.toUpperCase().equals("X")) {
            // batal
        } else {
            toDoListService.removeToDoList(Integer.parseInt(input));
        }

    }
}
