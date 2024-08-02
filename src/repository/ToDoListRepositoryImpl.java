package repository;

import entity.ToDoList;

public class ToDoListRepositoryImpl  implements  ToDoListRepository{
    private ToDoList[] data = new ToDoList[10];

    public boolean isFull() {
        var isFull = true;

        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIsFull() {
        if(isFull()) {
            var temp = data;
            data = new ToDoList[data.length * 2];
            for (var i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public ToDoList[] getAll() {
       return data;
    }

    @Override
    public void add(ToDoList todoList) {
        resizeIsFull();

        for (var i = 0; i < data.length; i++) {
                if(data[i] == null) {
                    data[i] = todoList;
                    break;
                }
        }
    }

    @Override
    public Boolean remove(Integer number) {
        if((number - 1) >= data.length) {
            return false;
        } else if(data[number-1] == null) {
            return false;
        } else {
            for (var i = (number - 1); i < data.length; i++) {
                if(i == (data.length - 1)) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
            return true;
        }
    }
}
