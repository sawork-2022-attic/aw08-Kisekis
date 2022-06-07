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

