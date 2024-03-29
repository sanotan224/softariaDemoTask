package rus.nsk.softaria.demo.shtang.comparators;

import rus.nsk.softaria.demo.shtang.entities.SiteTable;

public interface ISitesComparator {
    public SiteTable getDifferences(SiteTable sitesToday, SiteTable sitesYesterday);
    public String getDesc();
}
