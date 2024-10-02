# xdd_speeches_spiders/习近平总书记系列重要讲话爬虫

![](https://jhsjk.people.cn/static/resource/top480new.jpg)

> 声明：本项目是基于[peopleSpider](https://github.com/booooodv/peopleSpider)的修改和更新，感谢原作者的贡献。

## 运行环境：
- `JDK`: `17.0.12`
- `Maven`: `3.6.3`
- `MySQL`: `8.4.2`

## 需求  
[http://jhsjk.people.cn/result/](http://jhsjk.people.cn/result/1?keywords=&year=0&button=%E6%90%9C%E7%B4%A2)  
从这个网站获取网站列表  
[![H_N_LTW_7_T_KA8_T_R_S0.png](https://s26.postimg.cc/7fyuj8cbt/H_N_LTW_7_T_KA8_T_R_S0.png)](https://postimg.cc/image/7sq8peulh/)  
再获取目标页面的信息  
[![H57_U_NU_JMO_8_L6_BKJ33_M.png](https://s26.postimg.cc/v6y81ehop/H57_U_NU_JMO_8_L6_BKJ33_M.png)](https://postimg.cc/image/8i911u0at/)  
最后写入数据库  
## 解决思路
思维导图：  
[![OUEY_F2_IC_I1_YWW_CQNG.png](https://s26.postimg.cc/vwh0dui95/OUEY_F2_IC_I1_YWW_CQNG.png)](https://postimg.cc/image/c1uyrq31h/)  
## 结果
数据库结果：  
[![ID_7_RXXR69_3_B_JU7_W_B.png](https://s26.postimg.cc/isby7itrd/ID_7_RXXR69_3_B_JU7_W_B.png)](https://postimg.cc/image/dtofszpyd/)