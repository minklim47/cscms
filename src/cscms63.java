public class cscms63 {
    public static void main(String[] args) {
        class Car {
            public int id;
            public String brand;
            public String color;
            public String owner;
            public double distance;
            public static double accumulatedDist;
            //==== construtor=====
            public Car(int id){
                this.id = id;
            }
            public Car(int id, String brand, String color, String owner){
                this.id = id;
                this.brand = brand;
                this.color = color;
                this.owner = owner;
            }
            //====getter=====
            public int getId(){
                return id;
            }
            public String getBrand(){
                return brand;
            }
            public String getColor(){
                return color;
            }
            public String getOwner(){
                return owner;
            }
            public double getTotalDrivingDist(){
                return distance;
            }
            //====== setter =====
            public void setId(int id){
                this.id = id;
            }
            public void setBrand(String brand){
                this.brand = brand;
            }
            public void setColor(String color){
                this.color = color;
            }
            public void setOwner(String owner){
                this.owner = owner;
            }
            //======== Method===========
            public void drive(double distance){
                this.distance += distance;
                accumulatedDist += distance;
            }
        }
    }
}
