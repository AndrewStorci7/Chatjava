package socket.protocol;

import socket.chat1.ThreadChannel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Command {
    public void execute(ThreadChannel channel, Matcher match);
}
