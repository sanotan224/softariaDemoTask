package rus.nsk.softaria.demo.shtang.comparators;

import org.springframework.stereotype.Component;
import rus.nsk.softaria.demo.shtang.Consts;
import rus.nsk.softaria.demo.shtang.entities.SiteTable;

@Component
public class NewSitesComparator implements ISitesComparator {
    @Override
    public SiteTable compare(SiteTable sitesToday, SiteTable sitesYesterday) {
        SiteTable result = new SiteTable();

        for (String url : sitesToday.getUrls()) {
            if (!sitesYesterday.containsUrl(url)) {
                result.addSite(url, sitesToday.getCode(url));
            }
        }
        return result;
    }

    @Override
    public String getDesc() {
        return Consts.NEW_URLS_DESCRIPTION;
    }
}
