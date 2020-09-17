package com.atguigu;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author Liulei
 * @create 2020-09-17 13:49
 */
public class JedisPoolTest {
    public static void main(String[] args) {
        JedisPool jedisPool = JedisPoolUtil.getJedisPoolInstance();
        Jedis jedis = jedisPool.getResource();
        jedis.set("age","18");
        System.out.println(jedis.get("age"));
        jedis.close();
        jedis.set("sex2","male");
    }
}
