class Room{
double getRate(){return 0;}
}

class DeluxeRoom extends Room{
double getRate(){return 3000;}
}

class StandardRoom extends Room{
double getRate(){return 1500;}
}

class TestRoom{
public static void main(String[] args){
Room[] rooms=new Room[2];
rooms[0]=new DeluxeRoom();
rooms[1]=new StandardRoom();
double total=0;

for(int i=0;i<rooms.length;i++){
total+=rooms[i].getRate();
}
System.out.println(total);
}
}