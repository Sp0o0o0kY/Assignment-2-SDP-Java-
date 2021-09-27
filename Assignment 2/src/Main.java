public class Main {
    public static void main(String[] args){
        ServicesSite NaimiKZ = new ServicesSite();

        NaimiKZ.addService("Cleaning the house");
        NaimiKZ.addService("Mowing the lawn");
        NaimiKZ.addService("The opportunity to buy the furniture for the sale");

        Follower someone = new Follower("Condoriano");

        NaimiKZ.follow(someone);

        NaimiKZ.addService("Washing the dress");
        NaimiKZ.removeService("The opportunity to buy the furniture for the sale");
    }
}