package com.mkyong.web.controller;

import com.alibaba.fastjson.JSON;
import model.StaffInfo;
import org.msgpack.MessagePack;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by chenzichao on 2016/6/26.
 */
public class MessagePackT {


    public static void main(String[] args) throws Exception {


        //String staffInfoStr = "{\"companyGroup\":6,\"companyId\":6,\"companyList\":[6],\"companyListIterator\":{},\"companyListSize\":1,\"companyName\":\"希盟医院\",\"email\":\"test@cim120.com.cn\",\"id\":500023,\"loginCompany\":6,\"loginTime\":\"2016-06-25 17:16:03\",\"name\":\"希盟疗养院\",\"positionId\":0,\"profilePic\":\"http://files-test.cim120.cn/hmp/p/f/500023/7516597674_middle.jpg\",\"profilePicLarge\":\"http://files-test.cim120.cn/hmp/p/f/500023/7516597674_large.jpg\",\"profilePicMid\":\"http://files-test.cim120.cn/hmp/p/f/500023/7516597674_middle.jpg\",\"profilePicSmall\":\"http://files-test.cim120.cn/hmp/p/f/500023/7516597674_small.jpg\",\"rightInfo\":{\"companyId\":6,\"operationList\":[\"/test/authorize\",\"/users/mine/list/ajax\",\"/home\",\"/account/.*\",\"/staff/.*\",\"/role/.*\",\"/position/.*\",\"/account/month/element\",\"/user/.*\",\"/ecg/.*\",\"/task/illtype/list/ajax\",\"/task/allocate/staff/ajax\",\"/task/apply/diagnose/ajax\"],\"operationListIterator\":{},\"operationListSize\":13,\"role\":{\"companyId\":6,\"id\":1,\"name\":\"Admin\",\"parentId\":-1,\"power\":10,\"setCompanyId\":true,\"setId\":true,\"setName\":true,\"setParentId\":true,\"setPower\":true},\"setCompanyId\":true,\"setOperationList\":true,\"setRole\":true,\"setStaffId\":true,\"staffId\":500023},\"roleId\":1,\"roleName\":\"Admin\",\"roleTree\":{\"childNodes\":[{\"childNodes\":[{\"childNodes\":[{\"childNodes\":[],\"id\":\"3\",\"name\":\"医生\",\"obj\":{\"companyId\":0,\"id\":3,\"name\":\"医生\",\"parentId\":2,\"power\":30,\"setCompanyId\":true,\"setId\":true,\"setName\":true,\"setParentId\":true,\"setPower\":true},\"parent\":{\"$ref\":\"$.roleTree.childNodes[0].childNodes[0]\"},\"right\":{\"childNodes\":[],\"id\":\"4\",\"left\":{\"$ref\":\"..\"},\"name\":\"服务者\",\"obj\":{\"companyId\":0,\"id\":4,\"name\":\"服务者\",\"parentId\":2,\"power\":40,\"setCompanyId\":true,\"setId\":true,\"setName\":true,\"setParentId\":true,\"setPower\":true},\"parent\":{\"$ref\":\"$.roleTree.childNodes[0].childNodes[0]\"}}},{\"$ref\":\"$.roleTree.childNodes[0].childNodes[0].childNodes[0].right\"}],\"id\":\"2\",\"name\":\"管理员\",\"obj\":{\"companyId\":0,\"id\":2,\"name\":\"管理员\",\"parentId\":1,\"power\":20,\"setCompanyId\":true,\"setId\":true,\"setName\":true,\"setParentId\":true,\"setPower\":true},\"parent\":{\"$ref\":\"$.roleTree.childNodes[0]\"}}],\"id\":\"1\",\"name\":\"Admin\",\"obj\":{\"companyId\":0,\"id\":1,\"name\":\"Admin\",\"parentId\":-1,\"power\":10,\"setCompanyId\":true,\"setId\":true,\"setName\":true,\"setParentId\":true,\"setPower\":true},\"parent\":{\"$ref\":\"$.roleTree\"}}],\"id\":\"-1\",\"name\":\"ignore\"},\"setCompanyGroup\":true,\"setCompanyId\":true,\"setCompanyList\":true,\"setCompanyName\":true,\"setEmail\":true,\"setId\":true,\"setLoginCompany\":true,\"setLoginTime\":true,\"setName\":true,\"setPhone\":false,\"setPositionId\":true,\"setPositionName\":false,\"setProfilePic\":true,\"setProfilePicLarge\":true,\"setProfilePicMid\":true,\"setProfilePicSmall\":true,\"setRoleId\":true,\"setRoleName\":true}";
        String staffInfoStr = "{\"companyGroup\":6,\"companyId\":6,\"companyList\":[6],\"companyName\":\"希盟医院\",\"email\":\"test@cim120.com.cn\",\"id\":500023,\"loginCompany\":6,\"loginTime\":\"2016-07-04 14:21:05\",\"name\":\"希盟疗养院\",\"positionId\":0,\"profilePic\":\"http://files-test.cim120.cn/hmp/p/f/500023/warty-final-ubuntu.png\",\"profilePicLarge\":\"http://files-test.cim120.cn/hmp/p/f/500023/warty-final-ubuntu_large.png\",\"profilePicMid\":\"http://files-test.cim120.cn/hmp/p/f/500023/warty-final-ubuntu_middle.png\",\"profilePicSmall\":\"http://files-test.cim120.cn/hmp/p/f/500023/warty-final-ubuntu_small.png\",\"rightInfo\":{\"companyId\":6,\"operationList\":[\"/test/authorize\",\"/users/mine/list/ajax\",\"/home\",\"/account/.*\",\"/staff/.*\",\"/role/.*\",\"/position/.*\",\"/account/month/element\",\"/user/.*\",\"/ecg/.*\",\"/task/illtype/list/ajax\",\"/task/allocate/staff/ajax\",\"/task/apply/diagnose/ajax\"],\"operationListIterator\":{},\"operationListSize\":13,\"role\":{\"companyId\":6,\"id\":1,\"name\":\"Admin\",\"parentId\":-1,\"power\":10,\"setCompanyId\":true,\"setId\":true,\"setName\":true,\"setParentId\":true,\"setPower\":true},\"setCompanyId\":true,\"setOperationList\":true,\"setRole\":true,\"setStaffId\":true,\"staffId\":500023},\"roleId\":1,\"roleName\":\"Admin\",\"roleTree\":{\"childNodes\":[{\"childNodes\":[{\"childNodes\":[{\"childNodes\":[],\"id\":\"3\",\"name\":\"医生\",\"obj\":{\"companyId\":0,\"id\":3,\"name\":\"医生\",\"parentId\":2,\"power\":30,\"setCompanyId\":true,\"setId\":true,\"setName\":true,\"setParentId\":true,\"setPower\":true},\"parent\":{\"$ref\":\"$.roleTree.childNodes[0].childNodes[0]\"},\"right\":{\"childNodes\":[],\"id\":\"4\",\"left\":{\"$ref\":\"..\"},\"name\":\"服务者\",\"obj\":{\"companyId\":0,\"id\":4,\"name\":\"服务者\",\"parentId\":2,\"power\":40,\"setCompanyId\":true,\"setId\":true,\"setName\":true,\"setParentId\":true,\"setPower\":true},\"parent\":{\"$ref\":\"$.roleTree.childNodes[0].childNodes[0]\"}}},{\"$ref\":\"$.roleTree.childNodes[0].childNodes[0].childNodes[0].right\"}],\"id\":\"2\",\"name\":\"管理员\",\"obj\":{\"companyId\":0,\"id\":2,\"name\":\"管理员\",\"parentId\":1,\"power\":20,\"setCompanyId\":true,\"setId\":true,\"setName\":true,\"setParentId\":true,\"setPower\":true},\"parent\":{\"$ref\":\"$.roleTree.childNodes[0]\"}}],\"id\":\"1\",\"name\":\"Admin\",\"obj\":{\"companyId\":0,\"id\":1,\"name\":\"Admin\",\"parentId\":-1,\"power\":10,\"setCompanyId\":true,\"setId\":true,\"setName\":true,\"setParentId\":true,\"setPower\":true},\"parent\":{\"$ref\":\"$.roleTree\"}}],\"id\":\"-1\",\"name\":\"ignore\"}}";
        //StaffInfo staffInfoObj = JSON.parseObject(staffInfoStr.toString(), StaffInfo.class);

        StaffInfo staffInfoObj = JSON.parseObject(staffInfoStr.toString(), StaffInfo.class);


        MessagePack messagePack1 = new MessagePack();


        byte[] bytes = messagePack1.write(staffInfoObj);
        File file = new File("E:\\user.info.txt");
        if (!file.exists()) file.createNewFile();
        new FileOutputStream("E:\\user.info.txt").write(bytes);



        System.out.println(staffInfoStr.length());
        System.out.println(staffInfoStr.getBytes().length);
//        System.out.println(bytes.length);



        /*
        StaffInfo staffInfo = new StaffInfo(500023,
                "希盟疗养院",
                0,
                null,
                1,
                "Admin","希盟医院",6,6, Arrays.asList(6),"test@cim120.com.cn","null",
                "http://files-test.cim120.cn/hmp/p/f/500023/7516597674_small.jpg",
                "http://files-test.cim120.cn/hmp/p/f/500023/7516597674_middle.jpg",
                "http://files-test.cim120.cn/hmp/p/f/500023/7516597674_large.jpg",
                "http://files-test.cim120.cn/hmp/p/f/500023/7516597674_middle.jpg",
                6,"2016-06-25 17:16:03");

        StaffRight rightInfo = new StaffRight(500023,
                Arrays.asList("/test/authorize",
                        "/users/mine/list/ajax",
                        "/home",
                        "/account/.*",
                        "/staff/.*",
                        "/role/.*",
                        "/position/.*",
                        "/account/month/element",
                        "/user/.*",
                        "/ecg/.*",
                        "/task/illtype/list/ajax",
                        "/task/allocate/staff/ajax",
                        "/task/apply/diagnose/ajax"),
                new Role(1,"Admin",6,-1,10),
                6);



        LinkedList<RoleNode> childNodes = new LinkedList<RoleNode>();

        RoleNode roleTree = new RoleNode(-1,
                "ignore",
                null,
                null,
                null,
                null,
                childNodes);



        LinkedList<RoleNode> childNodes1 = new LinkedList<RoleNode>();
        RoleNode roleTree1 = new RoleNode(1,
                "Admin",
                new Role(1,
                        "Admin",
                        0,
                        -1,
                        10),
                null,
                null,
                null,
                childNodes1);
        childNodes.add(roleTree1);

*/

    }
}
