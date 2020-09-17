package com.atguigu;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author Liulei
 * @create 2020-09-17 13:36
 */
public class JedisPoolUtil {
    private static volatile JedisPool jedisPool=null;
    private JedisPoolUtil(){}
    public static JedisPool getJedisPoolInstance(){
        if (null==jedisPool){
            synchronized (JedisPoolUtil.class){
                if (null==jedisPool){
                    JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
                    jedisPoolConfig.setMaxIdle(32);
                    jedisPoolConfig.setMaxWaitMillis(100*1000);

                    jedisPool=new JedisPool(jedisPoolConfig,"172.21.14.196");
                }
            }
        }
        return jedisPool;
    }
}
