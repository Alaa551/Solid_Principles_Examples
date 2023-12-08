package LiskovSubstitution.exmaple1.after_apply_it;

public class Facebook implements ChatFeature,GroupCallFeature,PublishFeature{
    @Override
    public void chat(String user) {
        //
    }

    @Override
    public void groupCall(Object post) {

    }

    @Override
    public void publish(Object post) {

    }
}
