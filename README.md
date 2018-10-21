### 日程管理项目
运行方式：直接运行RoutineSchedulerApplication。
提供了两个接口：
1. 创建日程：/POST localhost:8080/api/routines   
数据格式:   
```
{    
    "info": "日程说明",
    "dueTime": "日程时间的毫秒数"
}
```
例如：
```
{    
    "info": "会见A客户",
    "dueTime": "1540130244156"
}
```

2. 读取所有日程: /GET localhost:8080/api/routines
