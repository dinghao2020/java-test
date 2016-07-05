package com.mkyong.web.controller;

import com.alibaba.fastjson.JSON;
import model.Role;
import model.RoleNode;
import model.StaffInfo;
import org.msgpack.MessagePack;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by chenzichao on 2016/6/26.
 */
public class MessagePackTInit {


    public static void main(String[] args) throws Exception {

        StaffInfo staffInfo = new StaffInfo(500023,
                "希盟疗养院",0,null,"Admin",1,"希盟医院",1,1,Arrays.asList(6),
                "test@cim120.com.cn","null",
                "http://files-test.cim120.cn/hmp/p/f/500023/7516597674_small.jpg",
                "http://files-test.cim120.cn/hmp/p/f/500023/7516597674_middle.jpg",
                "http://files-test.cim120.cn/hmp/p/f/500023/7516597674_large.jpg",
                "http://files-test.cim120.cn/hmp/p/f/500023/7516597674_middle.jpg",
                6,"2016-06-25 17:16:03");
        Role role = new Role(1,"Admin",6,0,100);

        RoleNode roleNode = new RoleNode(1,"admin-sub1",role,null,null,null,new LinkedList<RoleNode>());
        RoleNode roleNode2 = new RoleNode(1,"admin-sub2",role,null,null,null,new LinkedList<RoleNode>());



        LinkedList<RoleNode> childNodes = new LinkedList<RoleNode>();
        childNodes.add(roleNode);
        childNodes.add(roleNode2);

        RoleNode roleTree = new RoleNode(1,"admin",role,null,null,null,childNodes);
        roleNode.setParent(roleTree);
        roleNode2.setParent(roleTree);

        staffInfo.setRoleTree(roleTree);

        MessagePack messagePack = new MessagePack();

        String staffInfo1 = JSON.toJSONString(staffInfo);

        byte[] bytes = messagePack.write(staffInfo);

        System.out.println(bytes.length);
        System.out.println(staffInfo1.length());
        System.out.println(staffInfo1.getBytes().length);

    }
}
