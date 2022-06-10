1. 通过post添加商品至购物车

   ![image-20220608012155108](README.assets/image-20220608012155108.png)

2. checkout结算，生成order

   ![image-20220608012208568](README.assets/image-20220608012208568.png)

![image-20220608012220953](README.assets/image-20220608012220953.png)

3. 由order生成delivery，id为71630

4. 通过直接访问delivery service（8084端口），获取delivery信息

   ![image-20220608012327998](README.assets/image-20220608012327998.png)

包含了商品信息，状态，id

5. 使用Spring integration，从gateway（8080）获取delivery信息

![image-20220608012419847](README.assets/image-20220608012419847.png)

---

### 使用此方案的优点

将delivery服务分离开，实现了解耦合，可以对delivery服务进行简单替换。

delivery服务易扩展，不受原系统限制。

message传递机制符合逻辑，由用户查询订单请求而不是delivery服务直接告知用户请求。

实现数据和业务层的分离，传给delivery服务的数据为标准pojo，delivery负责提供查询接口，因此其他服务无需关心delivery是怎样处理的，只需负责提供标准数据和调用查询接口。