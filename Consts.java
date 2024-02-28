package rus.nsk.softaria.demo.shtang;

public class Consts {
    public static final String BASE_PACKAGE_FOR_SITE_COMPARATOR = "rus.nsk.softaria.demo.shtang";
    public static final String DELETED_URLS_DESCRIPTION = "Исчезли следующие страницы: ";
    public static final String MODIFIED_URLS_DESCRIPTION = "Изменились следующие страницы: ";
    public static final String NEW_URLS_DESCRIPTION = "Появились следующие новые страницы: ";

    public static final String SENDER_NAME = "автоматизированная система мониторинга";
    public static final String EMAIL_MESSAGE_TEMPLATE = "Здравствуйте, дорогая %s\n" +
            "За последние сутки во вверенных Вам сайтах произошли следующие изменения:\n" +
            "%s\n" +
            "С уважением,\n%s.";;
    public static final String RECEIVER_NAME = "и. о. секретаря";
    public static final String NO_CHANGES_MSG = "Не произошло никаких изменений";
}
