import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HotelManagement {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        while (true){
            System.out.println("欢迎使用本系统,请认真阅读一下说明来进行操作。");
            System.out.println("输入相应的功能编号：[1]查看所有房间;[2]订房;[3]退房;[4]退出");
            Scanner num = new Scanner(System.in);
            int i = num.nextInt();
            if(i == 1){
                h.findAll();
            }else if(i == 2){
                System.out.print("请输入房间编号：");
                Scanner id = new Scanner(System.in);
                int x = id.nextInt();
                h.order(x);
            }else if(i == 3){
                System.out.print("请输入房间编号：");
                Scanner id = new Scanner(System.in);
                int x = id.nextInt();
                h.quit(x);
            }else if(i == 4){
                break;
            }
        }
    }
}

class Room{
    private int id;
    private String types;
    private boolean status;

    public Room() {
    }

    public Room(int id, String types, boolean status) {
        this.id = id;
        this.types = types;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void orderOrQuit(int id){
        if(this.id == id){
            this.status = !this.status;
        }
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return this.id == room.id;
    }

    public String toString() {
        return "[" + id + "," + types + "," + (status ? "占用" : "空闲") + "]";
    }

}

class Hotel{
    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[4][6];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if(i == 0) rooms[i][j] = new Room((i + 1) * 100 + j + 1,"普通间",false);
                if(i == 1) rooms[i][j] = new Room((i + 1) * 100 + j + 1,"标准间",false);
                if(i == 2) rooms[i][j] = new Room((i + 1) * 100 + j + 1,"豪华间",false);
                if(i == 3) rooms[i][j] = new Room((i + 1) * 100 + j + 1,"总统间",false);
            }
        }
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public void findAll(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void order(int id){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {

                if(id == rooms[i][j].getId() && !rooms[i][j].isStatus()){
                    rooms[i][j].setStatus(true);
                    System.out.println("订房成功.");
                    return;
                }else if(id == rooms[i][j].getId() && rooms[i][j].isStatus()){
                    System.out.println(id + "号房间已被占用,订房失败!");
                    return;
                }
            }
        }
        System.out.println("请输入正确的房间号码.");
    }

    public void quit(int id){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if(id == rooms[i][j].getId() && rooms[i][j].isStatus()){
                    rooms[i][j].setStatus(false);
                    System.out.println(id + "号房间退房成功!");
                    return;
                }else if(id == rooms[i][j].getId() && !rooms[i][j].isStatus()){
                    System.out.println("该房间未被占用,退房失败.");
                    return;

                }
            }
        }
        System.out.println("请输入正确的房间号码.");

    }

    public String toString() {
        return "Hotel{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}