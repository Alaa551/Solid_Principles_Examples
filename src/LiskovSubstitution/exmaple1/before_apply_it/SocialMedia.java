package LiskovSubstitution.exmaple1.before_apply_it;

public abstract class SocialMedia {
    abstract void chat(String user);

    abstract void publish(Object post);

    abstract void groupCall(String ...users);
}
