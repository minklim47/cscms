package cscms131;

class Factory{
    // Implement your cscms131.Factory class here
    private double iron;
    private double copper;
    private double silver;
    private double gold;
    private int board;

    public double getIron(){
        return iron;
    }
    public double getCopper(){
        return copper;
    }
    public double getSilver(){
        return silver;
    }
    public double getGold(){
        return gold;
    }

    public Factory(double iron, double copper, double silver, double gold){
        this.iron = iron;
        this.copper = copper;
        this.silver = silver;
        this.gold = gold;
        board = 0;
    }
    public void buildCircuitBoard(int number){
            silver -= 0.000002 * number;
            gold -= 0.00000001 * number;
            copper -= 0.000005 * number;
            board += number;
    }
    public int getCircuitBoard(){
        return board;
    }
}
public class Main{
    public static void main(String[] args) {
        Factory fac1 = new Factory(67,9,10,1);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());

        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
        fac1.buildCircuitBoard(500000);
        fac1.buildCircuitBoard(850000);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
    }
}
