class Product{

private int id;
private String name;
private double price;
Product(int id,String name,double price){

this.id=id;
this.name=name;
this.price=price;
}

void display(){
System.out.println(id+" "+name+" "+price);
}

public static void main(String[] args){
Product p=new Product(1,"Pen",20);
p.display();
}
}