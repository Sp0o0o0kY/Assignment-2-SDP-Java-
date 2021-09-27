import java.util.List;

public class Follower implements Subscriber{

    private String name;

    public Follower(String name){
        this.name = name;
    }

    @Override
    public void update(List<String> services) {
        System.out.println("Dear " + this.name + "\nThere are some changes in our services:\n" + services + "\n");
    }
}
