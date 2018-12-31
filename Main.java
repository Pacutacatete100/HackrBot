import net.dv8tion.jda.core.*;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.util.Scanner;

public class Main extends ListenerAdapter {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        EventListener1 listener = new EventListener1();

        try{
            JDA api = new JDABuilder(AccountType.BOT).setToken("token").build();
            api.addEventListener(listener);
            api.addEventListener(listener.getEventWaiter());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //TODO: Upload to a server!
}
