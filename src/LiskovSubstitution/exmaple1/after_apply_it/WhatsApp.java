package LiskovSubstitution.exmaple1.after_apply_it;

import LiskovSubstitution.exmaple1.after_apply_it.ChatFeature;
import LiskovSubstitution.exmaple1.after_apply_it.GroupCallFeature;

public class WhatsApp implements GroupCallFeature, ChatFeature {
    @Override
    public void chat(String user) {

    }

    @Override
    public void groupCall(Object post) {

    }
}
