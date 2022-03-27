package Lesson4;

public class Park {
    protected String Name;
    protected String Time;
    protected int Price;

    public static void main(String[] args) {

Park Attr1 = new Park("Banan","10.00-17.00",50);
Park Attr2 = new Park("Cars","9.00-18.00", 30);
Park Attr3 = new Park("Mix", "10.00-15.30", 100);
Park Attr4 = new Park ("PainRoom", "18.30-23.30",1000);
        System.out.println("Перечень аттракционов: " + "\n");
        System.out.println(Attr1 + "\n" + Attr2 + "\n" + Attr3 + "\n" + Attr4);
    }

    public Park(String Name, String Time, int Price) {
this.Name = Name;
this.Time = Time;
this.Price = Price;
    }
    public void setName(String Name){
     this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setTime(String Time){
        this.Time = Time;
    }
    public String getTime(){
        return Time;
    }
    public void setPrice(int Price){
        this.Price = Price;
    }
    public int getPrice(){
        return Price;
    }

    @Override
    public String toString() {
        return  "Аттракцион: " + Name + "\n" +
                "Время работы: " + Time + "\n" +
                "Стоимость: " + Price + "\n";
    }
}
