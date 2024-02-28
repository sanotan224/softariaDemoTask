package rus.nsk.softaria.demo.shtang.entities;

import java.util.Hashtable;

public class SiteTable {
    private Hashtable<String, String> hashtable;

    public SiteTable() {
        hashtable = new Hashtable<>();
    }
    public void addSite(String url, String code) {
        hashtable.put(url, code);
    }

    public boolean containsUrl(String url) {
        return hashtable.containsKey(url);
    }

    public String getCode(String url) {
        return hashtable.get(url);
    }
    public String[] getUrls() {
        return hashtable.keySet().toArray(new String[0]);
    }
    public int getSize() {
        return hashtable.size();
    }

    public boolean isEmpty() {
        return hashtable.isEmpty();
    }
}
