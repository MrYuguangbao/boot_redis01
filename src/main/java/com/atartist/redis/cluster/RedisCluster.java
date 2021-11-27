package com.atartist.redis.cluster;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.time.LocalDateTime;

/**
 * @version 1.0
 * @project: boot_redis01
 * @package: com.atartist.redis.cluster
 * @author:admin
 * @createTime 2021/11/26 15:37:34
 */
public class RedisCluster {

    public static void main(String[] args) {
        /*HostAndPort hostAndPort = new HostAndPort("192.168.141.65", 6379);
        JedisCluster cluster = new JedisCluster(hostAndPort);

        cluster.set("springboot", LocalDateTime.now().toString());
        String value = cluster.get("springboot");
        System.out.println("value = " + value);*/

        //cluster.close();
    }



}
