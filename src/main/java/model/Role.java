package model;

import org.msgpack.annotation.Message;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * Created by chenzichao on 2016/6/26.
 */
@Message
public class Role implements Serializable{

    @Field
    public int id;
    @Field
    public String name;
    @Field
    public int companyId;
    @Field
    public int parentId;
    @Field
    public int power;

    public Role(){}

    public Role(int id, String name, int companyId, int parentId, int power) {
        this.id = id;
        this.name = name;
        this.companyId = companyId;
        this.parentId = parentId;
        this.power = power;
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

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
