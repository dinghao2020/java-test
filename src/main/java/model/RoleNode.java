package model;

import com.alibaba.fastjson.annotation.JSONField;
import org.msgpack.annotation.Message;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.LinkedList;

@Message
public class RoleNode {

    @Field
    public Integer id;
    @Field
    public String name;


    @JSONField
    public Role obj;
    @JSONField
    public RoleNode parent;
    @JSONField
    public RoleNode left;
    @JSONField
    public RoleNode right;

    @JSONField
    public LinkedList<RoleNode> childNodes ;


    public RoleNode() {
    }

    public RoleNode(Integer id, String name, Role obj, RoleNode parent, RoleNode left, RoleNode right, LinkedList<RoleNode> childNodes) {
        this.id = id;
        this.name = name;
        this.obj = obj;
        this.parent = parent;
        this.left = left;
        this.right = right;
        this.childNodes = childNodes;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getObj() {
        return obj;
    }

    public void setObj(Role obj) {
        this.obj = obj;
    }

    public RoleNode getParent() {
        return parent;
    }

    public void setParent(RoleNode parent) {
        this.parent = parent;
    }

    public RoleNode getLeft() {
        return left;
    }

    public void setLeft(RoleNode left) {
        this.left = left;
    }

    public RoleNode getRight() {
        return right;
    }

    public void setRight(RoleNode right) {
        this.right = right;
    }


    public LinkedList<RoleNode> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(LinkedList<RoleNode> childNodes) {
        this.childNodes = childNodes;
    }
}