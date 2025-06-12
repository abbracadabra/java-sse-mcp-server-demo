package com.hellobike.cooltest.repeater.console.web.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * mcp的oauth流程（2025-03-26），整个交互流程和在idea里登陆通义灵码账号类似:
 * mcp server return 401
 * mcp client访问mcp server的/.well-known/oauth-authorization-server得到auth地址
 * mcp client唤起浏览器打开auth地址进行sso流程
 * sso好了之后，浏览器跳转到本地mcp client的本地端口，跳转url中有auth code
 * mcp client 访问sso，用auth code获取access token
 *
 * @see: <a href="https://github.com/modelcontextprotocol/modelcontextprotocol/blob/main/docs/specification/2025-03-26/basic/authorization.mdx#25-authorization-flow-steps">...</a>
 **/
@Slf4j
@RestController
public class OAuthController {

    @RequestMapping(value = "/.well-known/oauth-authorization-server", method = RequestMethod.GET)
    public JSONObject discoverAuth() {
        return new JSONObject().fluentPut("authorization_endpoint", "...");
    }
}
