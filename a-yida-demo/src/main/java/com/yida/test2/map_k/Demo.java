package com.yida.test2.map_k;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/11 18:54
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        Map<String, String> map = initReportType();
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println("string = " + string);
        }

    }

    private static  Map<String, String> initReportType() {
        Map<String, String> map = new HashMap<>();
        map.put("fbaFulfillmentMonthlyInventoryData", "每月库存历史记录");
        map.put("fbaFulfillmentInventoryReceiptsData", "已接收库存");
        map.put("ledgerDetailViewData", "库存分类账报表---详细视图");
        map.put("fbaFulfillmentCustomerShipmentSalesData", "已完成销售订单报告");
        map.put("returns", "退货报告");
        map.put("removalOrder", "移除订单详情报告");
        map.put("fbaInventoryPlanningData", "亚马逊物流管理库存状况报告");
        map.put("storage", "月仓储费报告");
        map.put("longtermStorage", "长期仓储费报告");
        map.put("reimbursements", "赔偿数量报告");
        return map;
    }
}
