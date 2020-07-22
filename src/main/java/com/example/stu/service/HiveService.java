package com.example.stu.service;

import java.util.List;
import java.util.Map;

/**
 * java连接hive进行操作
 */
public interface HiveService {
    List<Map<String,Object>> getSessionIdCount();
}
