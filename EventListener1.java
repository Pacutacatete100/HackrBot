import LangCode.*;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;
import java.util.*;

public class EventListener1 extends ListenerAdapter {

    EventWaiter getEventWaiter() {
        return eventWaiter;
    }


    EventWaiter eventWaiter = new EventWaiter();
    EmbedBuilder embedBuilder = new EmbedBuilder();

    public void onMessageReceived(MessageReceivedEvent event) {

        if (event.getAuthor().isBot())
            return;
        Message message = event.getMessage();
        String messageString = message.getContentRaw();
        MessageChannel channel = event.getChannel();

        if (messageString.startsWith(">help")){
           helpCall(channel, event);
        }

        if(messageString.startsWith(">docs")){
            docsCalls(channel, event);
        }

        if (messageString.startsWith(">java")) {
            javaCodeCalls(channel, event);
        }

        if(messageString.startsWith(">js")){
            jsCodeCalls(channel, event);
        }

        if(messageString.startsWith(">python") || messageString.startsWith(">py")){
            pythonCodeCalls(channel, event);
        }

        if(messageString.startsWith(">kotlin")||messageString.startsWith(">kot")){
            kotlinCodeCalls(channel, event);
        }

        if(messageString.startsWith(">swift")){
            swiftCodeCalls(channel, event);
        }

        if(messageString.startsWith(">cpp")){
            cppCodeCall(channel, event);
        }
        if(messageString.startsWith(">csh")){
            cshCodeCall(channel, event);
        }
        if(messageString.startsWith(">go")){
            goCodeCall(channel, event);
        }
    }
    public void docsCalls(MessageChannel channel, MessageReceivedEvent event){

        channel.sendMessage("1. Java docs\n" +
                "2. JavaScript docs\n" +
                "3. Python docs\n" +
                "4. Kotlin docs\n" +
                "5. Swift docs\n" +
                "6. C++ docs\n" +
                "7. C# docs\n" +
                "8. Go docs").queue();
        eventWaiter.waitForEvent(MessageReceivedEvent.class,
            e -> e.getAuthor().equals(event.getAuthor()) && e.getChannel().equals(event.getChannel()),
            e -> {
                int choice = Integer.parseInt(e.getMessage().getContentRaw());
                switch (choice){
                    case 1:
                        channel.sendMessage("https://www.geeksforgeeks.org/java/").queue();
                        channel.sendMessage("https://github.com/EbookFoundation/free-programming-books/blob/master/free-programming-books.md#java").queue();
                        break;
                    case 2:
                        channel.sendMessage("https://www.w3schools.com/js/default.asp").queue();
                        channel.sendMessage("https://developer.mozilla.org/en-US/docs/Web/JavaScript").queue();
                        break;
                    case 3:
                        channel.sendMessage("https://www.python.org/dev/").queue();
                        channel.sendMessage("https://www.geeksforgeeks.org/python/").queue();
                        break;
                    case 4:
                        channel.sendMessage("https://kotlinlang.org/docs/reference/").queue();
                        channel.sendMessage("https://www.youtube.com/watch?v=H_oGi8uuDpA").queue();
                        break;
                    case 5:
                        channel.sendMessage("https://docs.swift.org/swift-book/GuidedTour/GuidedTour.html").queue();
                        channel.sendMessage("https://www.tutorialspoint.com/swift").queue();
                        break;
                    case 6:
                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    case 9:

                        break;
                }
            }
        );
    }
    public void javaCodeCalls(MessageChannel channel, MessageReceivedEvent event){
        channel.sendMessage("1. variables\n" +
                "2. operators\n" +
                "3. if-statements\n" +
                "4. switch case\n" +
                "5. loops\n" +
                "6. functions\n" +
                "7. objects").queue();
        eventWaiter.waitForEvent(MessageReceivedEvent.class,
            e -> e.getAuthor().equals(event.getAuthor()) && e.getChannel().equals(event.getChannel()),
            e -> {
                int choice = Integer.parseInt(e.getMessage().getContentRaw());
                switch (choice){
                    case 1:
                        channel.sendMessage(JavaCode.vars()).queue();
                        break;
                    case 2:
                        channel.sendMessage(JavaCode.operators()).queue();
                        break;
                    case 3:
                        channel.sendMessage(JavaCode.ifStatement()).queue();
                        break;
                    case 4:
                        channel.sendMessage(JavaCode.switchCase()).queue();
                        break;
                    case 5:
                        channel.sendMessage(JavaCode.loops()).queue();
                        break;
                    case 6:
                        channel.sendMessage(JavaCode.functions()).queue();
                        break;
                    case 7:
                        channel.sendMessage(JavaCode.objects()).queue();
                        break;
                }
            }
        );
    }
    public void jsCodeCalls(MessageChannel channel, MessageReceivedEvent event){
        channel.sendMessage("1. variables\n" +
                "2. operators\n" +
                "3. if-statements\n" +
                "4. switch case\n" +
                "5. loops\n" +
                "6. functions\n" +
                "7. Simple DOM Manipulation\n" +
                "8. objects").queue();
        eventWaiter.waitForEvent(MessageReceivedEvent.class,
            event1 -> event1.getAuthor().equals(event.getAuthor()) && event1.getChannel().equals(event.getChannel()),
            event1 -> {
                int choice = Integer.parseInt(event1.getMessage().getContentRaw());
                switch (choice){
                    case 1:
                        channel.sendMessage(JSCode.variables()).queue();
                        break;
                    case 2:
                        channel.sendMessage(JSCode.operators()).queue();
                        break;
                    case 3:
                        channel.sendMessage(JSCode.ifStatement()).queue();
                        break;
                    case 4:
                        channel.sendMessage(JSCode.switchCase()).queue();
                        break;
                    case 5:
                        channel.sendMessage(JSCode.loops()).queue();
                        break;
                    case 6:
                        channel.sendMessage(JSCode.functions()).queue();
                        break;
                    case 7:
                        channel.sendMessage(JSCode.DOMManipulation()).queue();
                        break;
                    case 8:
                        channel.sendMessage(JSCode.objects()).queue();
                }
            }
        );
    }
    public void pythonCodeCalls(MessageChannel channel, MessageReceivedEvent event){
        channel.sendMessage("1. variables\n" +
                "2. operators\n" +
                "3. if-statements\n" +
                "4. loops\n" +
                "5. functions\n" +
                "6. data structures\n" +
                "7. objects").queue();
        eventWaiter.waitForEvent(MessageReceivedEvent.class,
            e -> e.getAuthor().equals(event.getAuthor()) && e.getChannel().equals(event.getChannel()),
            e -> {
                int choice = Integer.parseInt(e.getMessage().getContentRaw());
                switch (choice){
                    case 1:
                        channel.sendMessage(PythonCode.variables()).queue();
                        break;
                    case 2:
                        channel.sendMessage(PythonCode.operators()).queue();
                        break;
                    case 3:
                        channel.sendMessage(PythonCode.ifStatement()).queue();
                        break;
                    case 4:
                        channel.sendMessage(PythonCode.loops()).queue();
                        break;
                    case 5:
                        channel.sendMessage(PythonCode.functions()).queue();
                        break;
                    case 6:
                        channel.sendMessage(PythonCode.dataStructures()).queue();
                        break;
                    case 7:
                        channel.sendMessage(PythonCode.objects()).queue();
                        break;
                }
            }
        );
    }
    public void kotlinCodeCalls(MessageChannel channel, MessageReceivedEvent event){
        channel.sendMessage("1. variables\n" +
                "2. operators\n" +
                "3. if-statements\n" +
                "4. when statements\n" +
                "5. loops\n" +
                "6. functions\n" +
                "7. objects\n").queue();
        eventWaiter.waitForEvent(MessageReceivedEvent.class,
            e -> e.getAuthor().equals(event.getAuthor()) && e.getChannel().equals(event.getChannel()),
            e -> {
                int choice = Integer.parseInt(e.getMessage().getContentRaw());
                switch (choice){
                    case 1:
                        channel.sendMessage(KotlinCode.variables()).queue();
                        break;
                    case 2:
                        channel.sendMessage(KotlinCode.operators()).queue();
                        break;
                    case 3:
                        channel.sendMessage(KotlinCode.ifStatements()).queue();
                        break;
                    case 4:
                        channel.sendMessage(KotlinCode.whenStatements()).queue();
                        break;
                    case 5:
                        channel.sendMessage(KotlinCode.loops()).queue();
                        break;
                    case 6:
                        channel.sendMessage(KotlinCode.functions()).queue();
                        break;
                    case 7:
                        channel.sendMessage(KotlinCode.objects()).queue();
                        break;
                }
            }
        );
    }
    public void swiftCodeCalls(MessageChannel channel, MessageReceivedEvent event){
        channel.sendMessage("1. variables\n" +
                "2. operators\n" +
                "3. IBOutlet\n" +
                "4. IBAction\n" +
                "5. if statements\n" +
                "6. switch statements\n" +
                "7. loops\n" +
                "8. functions\n" +
                "9. objects").queue();
        eventWaiter.waitForEvent(MessageReceivedEvent.class,
            e -> e.getAuthor().equals(event.getAuthor()) && e.getChannel().equals(event.getChannel()),
            e ->{
                int choice = Integer.parseInt(e.getMessage().getContentRaw());
                switch (choice){
                    case 1:
                        channel.sendMessage(SwiftCode.variables()).queue();
                        break;
                    case 2:
                        channel.sendMessage(SwiftCode.operators()).queue();
                        break;
                    case 3:
                        channel.sendMessage(SwiftCode.ibOutlet()).queue();
                        break;
                    case 4:
                        channel.sendMessage(SwiftCode.ibAction()).queue();
                        break;
                    case 5:
                        channel.sendMessage(SwiftCode.ifStatements()).queue();
                        break;
                    case 6:
                        channel.sendMessage(SwiftCode.switchStatements()).queue();
                        break;
                    case 7:
                        channel.sendMessage(SwiftCode.loops()).queue();
                        break;
                    case 8:
                        channel.sendMessage(SwiftCode.functions()).queue();
                        break;
                    case 9:
                        channel.sendMessage(SwiftCode.objects()).queue();
                        break;
                }
            }
        );
    }

    public void helpCall(MessageChannel channel, MessageReceivedEvent event){

        embedBuilder.setTitle("Help and Commands");
        embedBuilder.setColor(Color.RED);
        embedBuilder.setDescription("Supported languages (so far):\n\n" +
                "**JavaScript** ⟹ >js\n" +
                "**Python** ⟹ >python OR >py\n" +
                "**Kotlin** ⟹ >kotlin OR >kot\n" +
                "**Swift** ⟹ >swift\n" +
                "**C++** ⟹ >cpp\n" +
                "**C#** ⟹ >csh\n" +
                "**Go** ⟹ >go\n" +
                "**Ruby** ⟹ >ruby\n" +
                "**Docs and links** ⟹ >docs");
        channel.sendMessage(embedBuilder.build()).queue();

    }

    public void cppCodeCall(MessageChannel channel, MessageReceivedEvent event){
        channel.sendMessage("1. variables\n" +
                "2. operators\n" +
                "3. if statements\n" +
                "4. switch statements\n" +
                "5. loops\n" +
                "6. functions\n" +
                "7. objects").queue();
        eventWaiter.waitForEvent(MessageReceivedEvent.class,
            e -> e.getAuthor().equals(event.getAuthor()) && e.getChannel().equals(event.getChannel()),
            e -> {
                int choice = Integer.parseInt(e.getMessage().getContentRaw());
                switch (choice){
                    case 1:
                        channel.sendMessage(CppCode.variables()).queue();
                        break;
                    case 2:
                        channel.sendMessage(CppCode.operators()).queue();
                        break;
                    case 3:
                        channel.sendMessage(CppCode.ifStatements()).queue();
                        break;
                    case 4:
                        channel.sendMessage(CppCode.switchStatements()).queue();
                        break;
                    case 5:
                        channel.sendMessage(CppCode.loops()).queue();
                        break;
                    case 6:
                        channel.sendMessage(CppCode.functions()).queue();
                        break;
                    case 7:
                        channel.sendMessage(CppCode.objects()).queue();
                        break;

                }
            }
        );
    }
    public void cshCodeCall(MessageChannel channel, MessageReceivedEvent event){
        channel.sendMessage("1. variables\n" +
                "2. operators\n" +
                "3. if statements\n" +
                "4. switch statements\n" +
                "5. loops\n" +
                "6. functions\n" +
                "7. objects").queue();
        eventWaiter.waitForEvent(MessageReceivedEvent.class,
            e -> e.getAuthor().equals(event.getAuthor()) && e.getChannel().equals(event.getChannel()),
            e -> {
                int choice = Integer.parseInt(e.getMessage().getContentRaw());
                switch(choice){
                    case 1:
                        channel.sendMessage(CsharpCode.variables()).queue();
                        break;
                    case 2:
                        channel.sendMessage(CsharpCode.operators()).queue();
                        break;
                    case 3:
                        channel.sendMessage(CsharpCode.ifStatement()).queue();
                        break;
                    case 4:
                        channel.sendMessage(CsharpCode.switchStatement()).queue();
                        break;
                    case 5:
                        channel.sendMessage(CsharpCode.loops()).queue();
                        break;
                    case 6:
                        channel.sendMessage(CsharpCode.functions()).queue();
                        break;
                    case 7:
                        channel.sendMessage(CsharpCode.objects()).queue();
                        break;
                }
            }
        );
    }
    public void goCodeCall(MessageChannel channel, MessageReceivedEvent event){
        channel.sendMessage("1. variables\n" +
                "2. operators\n" +
                "3. if statements\n" +
                "4. switch statements\n" +
                "5. loops\n" +
                "6. functions\n" +
                "7. structs").queue();
        eventWaiter.waitForEvent(MessageReceivedEvent.class,
            e -> e.getAuthor().equals(event.getAuthor()) && e.getChannel().equals(event.getChannel()),
            e -> {
                int choice = Integer.parseInt(e.getMessage().getContentRaw());
                switch (choice){
                    case 1:
                        channel.sendMessage(GoCode.variables()).queue();
                        break;
                    case 2:
                        channel.sendMessage(GoCode.operators()).queue();
                        break;
                    case 3:
                        channel.sendMessage(GoCode.ifStatements()).queue();
                        break;
                    case 4:
                        channel.sendMessage(GoCode.switchStatements()).queue();
                        break;
                    case 5:
                        channel.sendMessage(GoCode.loops()).queue();
                        break;
                    case 6:
                        channel.sendMessage(GoCode.functions()).queue();
                        break;
                    case 7:
                        channel.sendMessage(GoCode.structs()).queue();
                        break;
                }
            }
        );
    }

}
