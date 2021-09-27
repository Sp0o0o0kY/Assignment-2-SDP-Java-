public interface Publisher {
    void follow(Subscriber subscriber);
    void unfollow(Subscriber subscriber);
    void notifyAllSubs();
}
