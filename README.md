# abount
非常简单的mcp server demo

# feat
- [x] 支持2024-11-05 和 2025-03-26 
- [x] 支持多实例 
- [ ] 未支持2025-03-26中的batch messages 
- [ ] 未支持协议中的auth部分[x] 

# use
打开cursor或claude desktop，mcp配置文件里加上你的http url
```
{
  "mcpServers": {
    "ExampleServer": {
      "url": "http://localhost:8001/mcp/gw/endpoint"
    }
  }
}
```
