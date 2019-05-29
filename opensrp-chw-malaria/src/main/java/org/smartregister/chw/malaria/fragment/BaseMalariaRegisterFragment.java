package org.smartregister.chw.malaria.fragment;

import android.widget.ImageView;
import android.widget.TextView;

import org.smartregister.chw.malaria.contract.MalariaRegisterFragmentContract;
import org.smartregister.chw.malaria.model.BaseMalariaRegisterFragmentModel;
import org.smartregister.chw.malaria.presenter.BaseMalariaRegisterFragmentPresenter;
import org.smartregister.chw.malaria.provider.MalariaRegisterProvider;
import org.smartregister.commonregistry.CommonPersonObjectClient;
import org.smartregister.configurableviews.model.View;
import org.smartregister.cursoradapter.RecyclerViewPaginatedAdapter;
import org.smartregister.malaria.R;
import org.smartregister.view.customcontrols.CustomFontTextView;
import org.smartregister.view.customcontrols.FontVariant;
import org.smartregister.view.fragment.BaseRegisterFragment;

import java.util.HashMap;
import java.util.Set;

public class BaseMalariaRegisterFragment extends BaseRegisterFragment implements MalariaRegisterFragmentContract.View {
    private static final String TAG = BaseMalariaRegisterFragment.class.getCanonicalName();
    public static final String CLICK_VIEW_NORMAL = "click_view_normal";
    public static final String CLICK_VIEW_DOSAGE_STATUS = "click_view_dosage_status";
    @Override
    public void initializeAdapter(Set<View> visibleColumns) {
        if(getActivity() != null ) {
            MalariaRegisterProvider malariaRegisterProvider = new MalariaRegisterProvider(getActivity(), paginationViewHandler);
            clientAdapter = new RecyclerViewPaginatedAdapter(null, malariaRegisterProvider, context().commonrepository(this.tablename));
            clientAdapter.setCurrentlimit(20);
            clientsView.setAdapter(clientAdapter);
        }
    }

    @Override
    public void setupViews(android.view.View view) {
        super.setupViews(view);

        // Update top left icon
        qrCodeScanImageView = view.findViewById(R.id.scanQrCode);
        if (qrCodeScanImageView != null) {
            qrCodeScanImageView.setVisibility(android.view.View.GONE);
        }

        // Update Search bar
        android.view.View searchBarLayout = view.findViewById(R.id.search_bar_layout);
        searchBarLayout.setBackgroundResource(R.color.customAppThemeBlue);

        if (getSearchView() != null) {
            getSearchView().setBackgroundResource(R.color.white);
            getSearchView().setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_search, 0, 0, 0);
        }

        // Update sort filter
        TextView filterView = view.findViewById(R.id.filter_text_view);
        if (filterView != null) {
            filterView.setText(getString(R.string.sort));
        }

        // Update title name
        ImageView logo = view.findViewById(R.id.opensrp_logo_image_view);
        if (logo != null) {
            logo.setVisibility(android.view.View.GONE);
        }

        CustomFontTextView titleView = view.findViewById(R.id.txt_title_label);
        if (titleView != null) {
            titleView.setVisibility(android.view.View.VISIBLE);
            titleView.setText(getString(R.string.malaria));
            titleView.setFontVariant(FontVariant.REGULAR);
        }
    }

    @Override
    public MalariaRegisterFragmentContract.Presenter presenter() {
        return (MalariaRegisterFragmentContract.Presenter) presenter;
    }

    @Override
    protected void initializePresenter() {
        if (getActivity() == null) {
            return;
        }
        presenter = new BaseMalariaRegisterFragmentPresenter(this, new BaseMalariaRegisterFragmentModel(), null);
    }

    @Override
    public void setUniqueID(String s) {
        if (getSearchView() != null) {
            getSearchView().setText(s);
        }
    }

    @Override
    public void setAdvancedSearchFormData(HashMap<String, String> hashMap) {
//        implement search here
    }

    @Override
    protected String getMainCondition() {
        return "";
    }

    @Override
    protected String getDefaultSortQuery() {
        return "";
    }

    @Override
    protected void startRegistration() {
//        BaseMalariaRegisterActivity baseMalariaActivity;
//        baseMalariaActivity = (BaseMalariaRegisterActivity) getActivity();
//        if(baseMalariaActivity != null ) {
//            baseMalariaActivity.startFormActivity(Utils.metadata().malariaRegister.formName, null, null);
//        }
    }

    @Override
    protected void onViewClicked(android.view.View view) {

//        if (getActivity() == null) {
//            return;
//        }
//
//        if (view.getTag() != null && view.getTag(R.id.VIEW_ID) == CLICK_VIEW_NORMAL) {
//            goToPatientDetailActivity((CommonPersonObjectClient) view.getTag(), false);
//        } else if (view.getTag() != null && view.getTag(R.id.VIEW_ID) == CLICK_VIEW_DOSAGE_STATUS) {
//            goToPatientDetailActivity((CommonPersonObjectClient) view.getTag(), true);
//        }
    }



    private void goToPatientDetailActivity(CommonPersonObjectClient patient,
                                           boolean goToDuePage) {

//        Intent intent = new Intent(getActivity(), Utils.metadata().profileActivity);
//        intent.putExtra(Constants.INTENT_KEY.FAMILY_BASE_ENTITY_ID, patient.getCaseId());
//        intent.putExtra(Constants.INTENT_KEY.FAMILY_HEAD, Utils.getValue(patient.getColumnmaps(), DBConstants.KEY.FAMILY_HEAD, false));
//        intent.putExtra(Constants.INTENT_KEY.PRIMARY_CAREGIVER, Utils.getValue(patient.getColumnmaps(), DBConstants.KEY.PRIMARY_CAREGIVER, false));
//        intent.putExtra(Constants.INTENT_KEY.VILLAGE_TOWN, Utils.getValue(patient.getColumnmaps(), DBConstants.KEY.VILLAGE_TOWN, false));
//        intent.putExtra(Constants.INTENT_KEY.FAMILY_NAME, Utils.getValue(patient.getColumnmaps(), DBConstants.KEY.FIRST_NAME, false));
//        intent.putExtra(Constants.INTENT_KEY.GO_TO_DUE_PAGE, goToDuePage);
//
//        startActivity(intent);
    }

    @Override
    public void showNotFoundPopup(String s) {
//        implement dialog
    }
}
