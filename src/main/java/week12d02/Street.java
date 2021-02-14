package week12d02;

import java.util.ArrayList;
import java.util.List;

import static week12d02.Fence.*;

public class Street {

    public static List<Site> sellSite(List<Site> siteList, Site site) {
        siteList.add(site);
        return siteList;
    }

    public static int lastSaledHouseNumber(List<Site> siteList) {
        int houseCounter = siteList.size();
        int paros = 0;
        int paratlan = 0;
        int resolve = 0;
        for (Site item : siteList) {
            if (item.getSide() == 0) {
                paros = paros + 2;
            }
            if (item.getSide() == 1 && paratlan == 0) {
                paratlan = 1;
            } else if (item.getSide() == 1) {
                paratlan = paratlan + 2;
            }
        }
        if (siteList.get(houseCounter-1).getSide() == 0) {
            resolve = paros;
        }
        if (siteList.get(houseCounter-1).getSide() == 1) {
            resolve = paratlan;
        }
        return resolve;
    }

    public static int[] saledSiteByFence(List<Site> siteList) {
        int[] fence = new int[]{0, 0, 0};
        for (Site item : siteList) {
            if (item.getFence() == PERFECT) {
                fence[0] = fence[0] + 1;
            }
            if (item.getFence() == NEED_UPGRADE) {
                fence[1] = fence[1] + 1;
            } else if (item.getFence() == NO_FENCE) {
                fence[2] = fence[2] + 1;
            }
        }
        return fence;
    }


    public static void main(String[] args) {
        List<Site> siteList = new ArrayList<>();
        Site site1 = new Site(0, 10, PERFECT);
        sellSite(siteList, site1);
        Site site2 = new Site(0, 7, NEED_UPGRADE);
        sellSite(siteList, site2);
        Site site3 = new Site(1, 12, NEED_UPGRADE);
        sellSite(siteList, site3);
        Site site4 = new Site(0, 9, PERFECT);
        sellSite(siteList, site4);
        Site site5 = new Site(0, 11, NO_FENCE);
        sellSite(siteList, site5);
        Site site6 = new Site(1, 13, PERFECT);
        sellSite(siteList, site6);

        int[] saledByFence = saledSiteByFence(siteList);
        int houseNumber = lastSaledHouseNumber(siteList);


        System.out.println("Az utolsó értékestett telek házszáma: " + houseNumber);
        System.out.println("Tökéletes a kerítése: " + saledByFence[0]);
        System.out.println("A kerítése felújítandó: " + saledByFence[1]);
        System.out.println("Nincs kertése: " + saledByFence[2]);
    }
}
