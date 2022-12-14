package Abstract;

import Entity.Campaign;

public interface CampaignService {
    public void addCampaign(Campaign campaign);
    public void updateCampaign(Campaign campaign);
    public void deleteCampaign(Campaign campaign);
}
