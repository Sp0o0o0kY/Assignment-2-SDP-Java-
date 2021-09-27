import java.util.ArrayList;
import java.util.List;

public class ServicesSite implements Publisher{

    private List<String> services = new ArrayList<>();
    private List<Subscriber> followers = new ArrayList<>();

    public void addService(String service){
        this.services.add(service);
        notifyAllSubs();
    }

    public void removeService(String service){
        this.services.remove(service);
        notifyAllSubs();
    }


    @Override
    public void follow(Subscriber subscriber) {
        this.followers.add(subscriber);
    }

    @Override
    public void unfollow(Subscriber subscriber) {
        this.followers.remove(subscriber);
    }

    @Override
    public void notifyAllSubs() {
        for(Subscriber follower:followers){
            follower.update(this.services);
        }
    }
}
