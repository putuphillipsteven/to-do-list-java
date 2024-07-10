public class ToDoListApp {
    public static String[] data = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        testInput();
    }
    /*
     * Menampilkan todo list
     * */
    public static void showTodoList() {
        for (var i = 0; i < data.length; i++) {
            var todo = data[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Masukkan Nama");
        System.out.println("Hi " + name);
    }

    /*
    * Menambah todo ke list
    * */
    public static void addTodoList(String todo) {
        var isFull = true;

        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                isFull = false;
                break;
            }
        }

        if(isFull) {
            var temp = data;
            data = new String[data.length * 2];
            for (var i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }


        for (var i = 0; i < data.length; i++) {
            if(data[i] == null) {
                data[i] = todo;
                break;
            }
        }

    }

    /*
    * Menghapus todo list
    * */
    public static boolean removeTodoList(Integer number) {
        if((number - 1) >= data.length) {
            return false;
        } else if(data[number-1] == null) {
            return false;
        } else {
            for (var i = (number - 1); i < data.length; i++) {
                /*
                * Satu
                * Dua
                * Tiga
                * Empat
                * Lima
                * */
                if(i == (data.length - 1)) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
           return true;
        }
    }

    /*
    * Test show to do list
    * */
    public static void testShowToDoList(){
        data[0] = "Belajar java dasar";
        data[1] = "Belajar java dasar kedua";
        showTodoList();
    }

    public static void testAddTodoList() {
        for (var i = 0;  i < 25; i++) {
            addTodoList("Test ke : " + ((int) i + 1));
        }
        showTodoList();
    }

    public static void testRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        System.out.println(removeTodoList(20));
        System.out.println(removeTodoList(2));
        showTodoList();

    }
    /*
    * Menampilkan view todo list
    * */
    public static void viewShowTodoList() {
        showTodoList();

    }
    /*
     * Menampilkan view add todo list
     * */


    public static void addShowTodoList(String todo) {


    }
    /*
     * Menampilkan view remove todo list
     * */
    public static void removeShowTodoList() {


    }
}
