## 项目介绍
javase项目实例

## 配置:
eclipse4.4.2 build使用gradle2.10  
1.有的项目改成了java包。2.有的项目独立为gradle子项目

## 调试设置
edit configuration:
working directory:F:\probox\pro_github_codehero\javase.demo\demo_xxx  这样加载项目根目录/images中的图片才会成功  

## 项目
gobang：		第1章 控制台五子棋
cal：		第2章 仿Windows计算器
viewer：		第3章 图片浏览器
ball：		第4章 桌面弹球
tetris：		第5章 俄罗斯方块
image：		第6章 仿Windows画图
linkgame：		第7章 单机连连看
editor：		第8章 简单Java IDE工具
book：		第9章 图书进存销系统
transaction：	第10章 事务跟踪系统
flashget：		第11章 多线程下载工具
foxmail：		第12章 邮件客户端
mysql-manager：	第13章 MySQL管理器
IoC：		第14章 自己开发IoC容器（容器源代码）
book(IoC)：		第14章 自己开发IoC容器（整合图书进存销系统）
GameHall-Client：	第15章 游戏大厅客户端框架
GameHall-Commons：	第15章 游戏大厅公用模块
GameHall-Server：	第15章 游戏大厅服务器端框架
chat-room-server：	第15章 聊天室服务器端模块
chat-room-client：	第15章 聊天室客户端模块
fivechess-server：	第15章 五子棋游戏大厅服务器端模块
fivechess-client：	第15章 五子棋游戏大厅客户端模块
fivechess-commons：	第15章 五子棋游戏大厅公用模块

### 注意事项
1) 如果需要将游戏大厅的源代码导入Eclipse，需要将所有游戏大厅的相关模块都导入。
   包括code目录下的GameHall-Client、GameHall-Commons、GameHall-Server、
   fivechess-client、fivechess-commons和fivechess-server，即完成了五子棋游戏大厅该模块的导入，
   如果需要导入聊天室模块，还需要导入chat-room-server和chat-room-client项目。

2) 案例中有些项目需要连接数据库，读者应修改数据库URL以及用户名、密码
   让这些代码与读者运行环境一致。如果项目下有SQL脚本，导入SQL脚本即可，如果
   没有SQL脚本，系统将在运行时自动建表，读者只需创建对应数据库即可。

### ref
E:\360\IT资料库\ref-个人\杨恩雄\疯狂java实战演义\51CTO下载-疯狂Java实战演义(光盘代码部分).rar