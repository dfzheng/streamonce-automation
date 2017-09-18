package step_definitions;

import org.junit.Before;

import javax.mail.*;
import javax.mail.search.FlagTerm;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by dfzheng on 08/08/2017.
 */
public class Hooks {

//Set unread email to read
@Before
public void MarkEmailAsRead() throws Exception{
    Session session = Session.getDefaultInstance(new Properties());
    Store store = session.getStore("imaps");
    String username = System.getenv("USER3_USERNAME");
    String password = System.getenv("USER_GOOGLE_PASSWORD");
    store.connect("imap.googlemail.com", 993, username, password);
    Folder inbox = store.getFolder("INBOX");
    inbox.open(Folder.READ_WRITE);

    // Fetch unseen messages from inbox folder
    Message[] messages = inbox.search(
            new FlagTerm(new Flags(Flags.Flag.SEEN), false));

    // Sort messages from recent to oldest
    Arrays.sort(messages, (Message m1, Message m2) -> {
        try {
            return m2.getSentDate().compareTo(m1.getSentDate());
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    });

    //Set unread message to read
    inbox.setFlags(messages, new Flags(Flags.Flag.SEEN), true);

}
}
