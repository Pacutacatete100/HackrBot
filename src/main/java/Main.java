import net.dv8tion.jda.core.*;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Main extends ListenerAdapter {

    public static void main(String[] args){
        EventListener1 listener = new EventListener1();

        try{
            JDA api = new JDABuilder(AccountType.BOT).setToken("NDk3NzYwNTEzMjUwNTU3OTYz.DwqwwA.m-DVAgg3a3tHutoqQoUuC2dOjzU").build();
            api.addEventListener(listener);
            api.addEventListener(listener.getEventWaiter());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //TODO: Upload to a server!
}