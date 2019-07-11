package org.smartregister.chw.malaria.domain;

import org.smartregister.chw.malaria.util.DBConstants;
import org.smartregister.commonregistry.CommonPersonObjectClient;

import java.io.Serializable;

public class MemberObject implements Serializable {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String gender;
    private String uniqueId;
    private String age;
    private String relationalid;
    private String details;
    private boolean isClosed;
    private String dateChwMalariaTest;
    private String feverMalariaChw;
    private String feverDuration;
    private String dateHfMalariaTest;
    private String malariaTestDate;
    private String malariaTreat;
    private String famLlin;
    private String llin2Days;
    private String llinCondition;
    private String malariaEduChw;
    private String baseEntityId;
    private String relationalId;
    private String primaryCareGiver;
    private String familyHead;
    private String familyBaseEntityId;

    public MemberObject(CommonPersonObjectClient client) {
        firstName = client.getColumnmaps().get(DBConstants.KEY.FIRST_NAME) != null ? client.getColumnmaps().get(DBConstants.KEY.FIRST_NAME) : "";
        middleName = client.getColumnmaps().get(DBConstants.KEY.MIDDLE_NAME) != null ? client.getColumnmaps().get(DBConstants.KEY.MIDDLE_NAME) : "";
        lastName = client.getColumnmaps().get(DBConstants.KEY.LAST_NAME) != null ? client.getColumnmaps().get(DBConstants.KEY.LAST_NAME) : "";
        address = client.getColumnmaps().get(DBConstants.KEY.VILLAGE_TOWN) != null ? client.getColumnmaps().get(DBConstants.KEY.VILLAGE_TOWN) : "";
        gender = client.getColumnmaps().get(DBConstants.KEY.GENDER) != null ? client.getColumnmaps().get(DBConstants.KEY.GENDER) : "";
        age = client.getColumnmaps().get(DBConstants.KEY.DOB) != null ? client.getColumnmaps().get(DBConstants.KEY.DOB) : "";
        uniqueId = client.getColumnmaps().get(DBConstants.KEY.UNIQUE_ID);
        baseEntityId = client.getColumnmaps().get(DBConstants.KEY.BASE_ENTITY_ID);
        relationalId = client.getColumnmaps().get(DBConstants.KEY.RELATIONAL_ID);
        primaryCareGiver = client.getColumnmaps().get(DBConstants.KEY.PRIMARY_CARE_GIVER);
        familyHead = client.getColumnmaps().get(DBConstants.KEY.FAMILY_HEAD);
        familyBaseEntityId = client.getColumnmaps().get(DBConstants.KEY.FAMILY_BASE_ENTITY_ID);
        relationalid = client.getColumnmaps().get(DBConstants.KEY.RELATIONALID);
        details = client.getColumnmaps().get(DBConstants.KEY.DETAILS);
        isClosed = Boolean.parseBoolean(client.getColumnmaps().get(DBConstants.KEY.IS_CLOSED));
        dateChwMalariaTest = client.getColumnmaps().get(DBConstants.KEY.DATE_CHW_MALARIA_TEST);
        feverMalariaChw = client.getColumnmaps().get(DBConstants.KEY.FEVER_MALARIA_CHW);
        feverDuration = client.getColumnmaps().get(DBConstants.KEY.FEVER_DURATION);
        dateHfMalariaTest = client.getColumnmaps().get(DBConstants.KEY.DATE_HF_MALARIA_TEST);
        malariaTestDate = client.getColumnmaps().get(DBConstants.KEY.MALARIA_TEST_DATE);
        malariaTreat = client.getColumnmaps().get(DBConstants.KEY.MALARIA_TREAT);
        famLlin = client.getColumnmaps().get(DBConstants.KEY.FAM_LLIN);
        llin2Days = client.getColumnmaps().get(DBConstants.KEY.LLIN_2DAYS);
        llinCondition = client.getColumnmaps().get(DBConstants.KEY.LLIN_CONDITION);
        malariaEduChw = client.getColumnmaps().get(DBConstants.KEY.MALARIA_EDU_CHW);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getRelationalid() {
        return relationalid;
    }

    public void setRelationalid(String relationalid) {
        this.relationalid = relationalid;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public String getDateChwMalariaTest() {
        return dateChwMalariaTest;
    }

    public void setDateChwMalariaTest(String dateChwMalariaTest) {
        this.dateChwMalariaTest = dateChwMalariaTest;
    }

    public String getFeverMalariaChw() {
        return feverMalariaChw;
    }

    public void setFeverMalariaChw(String feverMalariaChw) {
        this.feverMalariaChw = feverMalariaChw;
    }

    public String getFeverDuration() {
        return feverDuration;
    }

    public void setFeverDuration(String feverDuration) {
        this.feverDuration = feverDuration;
    }

    public String getDateHfMalariaTest() {
        return dateHfMalariaTest;
    }

    public void setDateHfMalariaTest(String dateHfMalariaTest) {
        this.dateHfMalariaTest = dateHfMalariaTest;
    }

    public String getMalariaTestDate() {
        return malariaTestDate;
    }

    public void setMalariaTestDate(String malariaTestDate) {
        this.malariaTestDate = malariaTestDate;
    }

    public String getMalariaTreat() {
        return malariaTreat;
    }

    public void setMalariaTreat(String malariaTreat) {
        this.malariaTreat = malariaTreat;
    }

    public String getFamLlin() {
        return famLlin;
    }

    public void setFamLlin(String famLlin) {
        this.famLlin = famLlin;
    }

    public String getLlin2Days() {
        return llin2Days;
    }

    public void setLlin2Days(String llin2Days) {
        this.llin2Days = llin2Days;
    }

    public String getLlinCondition() {
        return llinCondition;
    }

    public void setLlinCondition(String llinCondition) {
        this.llinCondition = llinCondition;
    }

    public String getMalariaEduChw() {
        return malariaEduChw;
    }

    public void setMalariaEduChw(String malariaEduChw) {
        this.malariaEduChw = malariaEduChw;
    }

    public String getBaseEntityId() {
        return baseEntityId;
    }

    public void setBaseEntityId(String baseEntityId) {
        this.baseEntityId = baseEntityId;
    }

    public String getRelationalId() {
        return relationalId;
    }

    public void setRelationalId(String relationalId) {
        this.relationalId = relationalId;
    }

    public String getFamilyBaseEntityId() {
        return familyBaseEntityId;
    }

    public void setFamilyBaseEntityId(String familyBaseEntityId) {
        this.familyBaseEntityId = familyBaseEntityId;
    }

    public String getPrimaryCareGiver() {
        return primaryCareGiver;
    }

    public void setPrimaryCareGiver(String primaryCareGiver) {
        this.primaryCareGiver = primaryCareGiver;
    }

    public String getFamilyHead() {
        return familyHead;
    }

    public void setFamilyHead(String familyHead) {
        this.familyHead = familyHead;
    }



}