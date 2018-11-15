/*
package cn.pwonlineordersprovider.rest;

import cn.pwonlineordersprovider.service.GetTicketInventory;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value="/test", tags="测试接口模块")
public class TicketInventoryContro {
    @Autowired
    private GetTicketInventory getTicketInventory;
    @ApiOperation(value="查看票库存", notes = "添加用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ticketinfo",value = "票信息",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "ticketseat",value = "座位号",dataType = "String",paramType = "query")
})
    @RequestMapping(value = "getticketinventory",method = RequestMethod.GET)
    public String getticketinventory(@RequestParam("ticketinfo") String ticketinfo, @RequestParam("ticketseat") String ticketseat, HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin","*");
        String s = getTicketInventory.getticketInventory(ticketinfo, ticketseat);
        return JSON.toJSONString(s);
    }
}
*/
