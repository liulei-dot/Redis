package com.atguigu;

import redis.clients.jedis.Jedis;

/**
 * @author Liulei
 * @create 2020-09-17 13:27
 */
public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.21.14.196",6379);
        System.out.println(jedis.ping());
        jedis.set("name","张三");
        System.out.println(jedis.get("name"));
        jedis.lpush("list","zs","lisi","ww");
        System.out.println(jedis.lrange("list",0,-1));
    }
}
