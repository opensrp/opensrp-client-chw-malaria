package org.smartregister.malaria.model;

import org.json.JSONObject;
import org.smartregister.malaria.contract.MalariaRegisterContract;

import java.util.List;

public class BaseMalariaRegisterModel implements MalariaRegisterContract.Model  {
    @Override
    public void registerViewConfigurations(List<String> viewIdentifiers) {

    }

    @Override
    public void unregisterViewConfiguration(List<String> viewIdentifiers) {

    }

    @Override
    public void saveLanguage(String language) {

    }

    @Override
    public String getLocationId(String locationName) {
        return null;
    }

    @Override
    public JSONObject getFormAsJson(String formName, String entityId, String currentLocationId) throws Exception {
        return null;
    }

    @Override
    public String getInitials() {
        return null;
    }
}
