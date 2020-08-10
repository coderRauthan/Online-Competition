package org.platforms.leetcode.AprilChallenge;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache 
{
    Map<Integer,Integer> map = null;
    int gCapacity = 0;
    
    public LRUCache(int capacity) 
    {
        map = new LinkedHashMap<>(capacity);
        gCapacity = capacity;
    }
    
    public int get(int key) 
    {
       if(map.containsKey(key))
       {
           int value = map.get(key);
           map.remove(key);
           map.put(key,value);
           return value;
       } 
       return -1; 
    }
    
    public void put(int key,int value) 
    {
       if(map.containsKey(key))
       {
           map.remove(key);
           map.put(key,value);
       }
       else if(map.size() == gCapacity)
       {
           map.remove(map.keySet().iterator().next());
           map.put(key,value);
       }
       else
       {
           map.put(key,value);
       }
    }

}
