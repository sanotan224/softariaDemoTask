package rus.nsk.softaria.demo.shtang.handlers;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import rus.nsk.softaria.demo.shtang.Consts;
import rus.nsk.softaria.demo.shtang.comparators.ISitesComparator;
import rus.nsk.softaria.demo.shtang.entities.SiteTable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class TableHandler {
    private final ApplicationContext context;

    public TableHandler(ApplicationContext context) {
        this.context = context;
    }

    public String handle(SiteTable sitesToday, SiteTable sitesYesterday) {
        String[] comparatorsName = context.getBeanNamesForType(ISitesComparator.class);
        StringBuilder stringBuilder = new StringBuilder();

        for (String comparatorName : comparatorsName) {
            ISitesComparator comparator = (ISitesComparator) context.getBean(comparatorName);
            SiteTable result = comparator.getDifferences(sitesToday, sitesYesterday);

            if (result.getSize() != 0) {
                stringBuilder.append(comparator.getDesc());
                stringBuilder.append(Stream.of(result.getUrls()).collect(Collectors.joining(", ")));
                stringBuilder.append("\n");
            }
        }

        if (stringBuilder.length() == 0) {
            stringBuilder.append(Consts.NO_CHANGES_MSG);
        }
        return stringBuilder.toString();
    }
}
