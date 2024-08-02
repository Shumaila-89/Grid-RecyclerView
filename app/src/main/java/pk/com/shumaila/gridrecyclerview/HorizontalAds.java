package pk.com.shumaila.gridrecyclerview;

import java.util.Objects;

public class HorizontalAds {
    int adsImageId;
    int appIconAds;
    String appNameAds;
    public HorizontalAds() {
    }

    public HorizontalAds(int adsImageId, int appIconAds, String appNameAds) {
        this.adsImageId = adsImageId;
        this.appIconAds = appIconAds;
        this.appNameAds = appNameAds;
    }

    public int getAdsImageId() {
        return adsImageId;
    }

    public void setAdsImageId(int adsImageId) {
        this.adsImageId = adsImageId;
    }

    public int getAppIconAds() {
        return appIconAds;
    }

    public void setAppIconAds(int appIconAds) {
        this.appIconAds = appIconAds;
    }

    public String getAppNameAds() {
        return appNameAds;
    }

    public void setAppNameAds(String appNameAds) {
        this.appNameAds = appNameAds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HorizontalAds)) return false;
        HorizontalAds that = (HorizontalAds) o;
        return adsImageId == that.adsImageId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(adsImageId);
    }

    @Override
    public String toString() {
        return "HorizontalAds{" +
                "adsImageId=" + adsImageId +
                '}';
    }
}
