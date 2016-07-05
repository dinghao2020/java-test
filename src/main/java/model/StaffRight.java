package model;

import com.alibaba.fastjson.annotation.JSONField;
import org.msgpack.annotation.Message;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by chenzichao on 2016/6/26.
 */
@Message
public class StaffRight {

    @Field
    public int staffId;
    @Field
    public List<String> operationList;
    @JSONField
    public Role role;
    @Field
    public int companyId;

    public StaffRight(int staffId, List<String> operationList, Role role, int companyId) {
        this.staffId = staffId;
        this.operationList = operationList;
        this.role = role;
        this.companyId = companyId;
    }
    public StaffRight(){

    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public List<String> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<String> operationList) {
        this.operationList = operationList;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}
