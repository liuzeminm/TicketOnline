/*
package cn.pwonlineordersconsumer.controller;

import cn.pwonlineordersconsumer.feigin.person.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

*/
/**
 * 与个人信息相关
 *//*

@RestController
@RequestMapping(value = "perinfocontroller",method = RequestMethod.POST)
public class PerInfoController {
    // 获取个人信息
    @Autowired
    private GetPerInfoService getPerInfoService;
    @RequestMapping(value = "/perinfo")
    public String getperinfo(String perusername){
        return getPerInfoService.getperinfo(perusername);
    }
    // 获取个人账号
    @Autowired
    private GetPeronalIdService getPeronalIdService;
    @RequestMapping(value = "/getperid")
    public String getperid(String username){
        return getPeronalIdService.getusername(username);
    }
    // 新增购票人信息
    @Autowired
    private AddBuyerInfoService addBuyerInfoService;
    @RequestMapping(value = "addbuyerinfo")
    public String addbuyerinfo(String buyerinfo){
        return addBuyerInfoService.addbuyerinfo(buyerinfo);
    }
    // 新增个人地址信息
    @Autowired
    private AddPerAddressService addPerAddressService;
    @RequestMapping(value = "/addperaddress")
    public String addperaddress(String addressinfo){
        return addPerAddressService.addperaddress(addressinfo);
    }
    // 删除购票人信息
    @Autowired
    private DelBuyerInfoService delBuyerInfoService;
    @RequestMapping(value = "/delbuyerinfo")
    public String delbuyerinfo(String buyerusername){
        return delBuyerInfoService.delbuyerinfo(buyerusername);
    }
    // 修改个人地址信息
    @Autowired
    private UpdatePerAddressService updatePerAddressService;
    @RequestMapping(value = "/updateperaddress")
    public String updateperaddress(String addressinfo){
        return updatePerAddressService.updateperaddress(addressinfo);
    }
}
*/
