package rus.nsk.softaria.demo.shtang;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rus.nsk.softaria.demo.shtang.entities.SiteTable;
import rus.nsk.softaria.demo.shtang.handlers.TableHandler;
import rus.nsk.softaria.demo.shtang.messages.MessageGenerator;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SiteTable sitesYesterday = new SiteTable();
        SiteTable sitesToday = new SiteTable();

        ApplicationContext context = new AnnotationConfigApplicationContext(Consts.BASE_PACKAGE_FOR_SITE_COMPARATOR);
        TableHandler tableHandler = context.getBean(TableHandler.class);
        String result = tableHandler.handle(sitesToday, sitesYesterday);

        MessageGenerator messageGenerator = new MessageGenerator();
        String message = messageGenerator.generateMessage(Consts.RECEIVER_NAME, result, Consts.SENDER_NAME);
        System.out.println(message);
    }
}