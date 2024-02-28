package rus.nsk.softaria.demo.shtang.comparators;

import org.springframework.stereotype.Component;
import rus.nsk.softaria.demo.shtang.Consts;
import rus.nsk.softaria.demo.shtang.entities.SiteTable;


@Component
public class DeletedSitesComparator implements ISitesComparator {
    @Override
    public SiteTable compare(SiteTable sitesToday, SiteTable sitesYesterday) {
        SiteTable result = new SiteTable();

        for (String url : sitesYesterday.getUrls()) {
            if (!sitesToday.containsUrl(url)) {
                result.addSite(url, sitesYesterday.getCode(url));
            }
        }

        return result;
    }
    @Override
    public String getDesc() {
        return Consts.DELETED_URLS_DESCRIPTION;
    }

}
