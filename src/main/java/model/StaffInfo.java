package model;

import com.alibaba.fastjson.annotation.JSONField;
import org.msgpack.annotation.Message;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by chenzichao on 2016/6/26.
 */
@Message
public class StaffInfo {


    @JSONField
    StaffRight rightInfo;

    @JSONField
    RoleNode roleTree;


    @Field
    public int id;
    @Field
    public String name;
    @Field
    public int positionId;
    @Field
    public String positionName;
    @Field
    public String roleName;
    @Field
    public int roleId;
    @Field
    public String companyName;
    @Field
    public int companyId;
    @Field
    public int companyGroup;

    @Field
    public List<Integer> companyList;

    @Field
    public String email;
    @Field
    public String phone;
    @Field
    public String profilePicSmall;
    @Field
    public String profilePicMid;
    @Field
    public String profilePicLarge;
    @Field
    public String profilePic;
    @Field
    public int loginCompany;
    @Field
    public String loginTime;

    public StaffInfo(){}

    public StaffInfo(int id, String name, int positionId, String positionName, String roleName, int roleId, String companyName, int companyId, int companyGroup, List<Integer> companyList, String email, String phone, String profilePicSmall, String profilePicMid, String profilePicLarge, String profilePic, int loginCompany, String loginTime) {

        this.id = id;
        this.name = name;
        this.positionId = positionId;
        this.positionName = positionName;
        this.roleName = roleName;
        this.roleId = roleId;
        this.companyName = companyName;
        this.companyId = companyId;
        this.companyGroup = companyGroup;
        this.companyList = companyList;
        this.email = email;
        this.phone = phone;
        this.profilePicSmall = profilePicSmall;
        this.profilePicMid = profilePicMid;
        this.profilePicLarge = profilePicLarge;
        this.profilePic = profilePic;
        this.loginCompany = loginCompany;
        this.loginTime = loginTime;
    }

    public StaffRight getRightInfo() {
        return rightInfo;
    }

    public void setRightInfo(StaffRight rightInfo) {
        this.rightInfo = rightInfo;
    }


    public RoleNode getRoleTree() {
        return roleTree;
    }

    public void setRoleTree(RoleNode roleTree) {
        this.roleTree = roleTree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getCompanyGroup() {
        return companyGroup;
    }

    public void setCompanyGroup(int companyGroup) {
        this.companyGroup = companyGroup;
    }

    public List<Integer> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Integer> companyList) {
        this.companyList = companyList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfilePicSmall() {
        return profilePicSmall;
    }

    public void setProfilePicSmall(String profilePicSmall) {
        this.profilePicSmall = profilePicSmall;
    }

    public String getProfilePicMid() {
        return profilePicMid;
    }

    public void setProfilePicMid(String profilePicMid) {
        this.profilePicMid = profilePicMid;
    }

    public String getProfilePicLarge() {
        return profilePicLarge;
    }

    public void setProfilePicLarge(String profilePicLarge) {
        this.profilePicLarge = profilePicLarge;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public int getLoginCompany() {
        return loginCompany;
    }

    public void setLoginCompany(int loginCompany) {
        this.loginCompany = loginCompany;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}
