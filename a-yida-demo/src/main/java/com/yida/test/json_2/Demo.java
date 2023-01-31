package com.yida.test.json_2;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/31 10:41
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        List<SakCodFreightDayExcelModel> codFreightDayExcelModels = CollUtil.newArrayList();

        List<SakCodFreightDayModel> codFreightDayModelDatas = new ArrayList<>();
        SakCodFreightDayModel sakCodFreightDayModel = new SakCodFreightDayModel();
        sakCodFreightDayModel.setSiteName("");
        sakCodFreightDayModel.setProductName("");
        sakCodFreightDayModel.setSignRate("");
        sakCodFreightDayModel.setExamineRate("");
        sakCodFreightDayModel.setTotalRevenue(new BigDecimal("10"));
        sakCodFreightDayModel.setShippingMoney(new BigDecimal("0"));
        sakCodFreightDayModel.setMerchandiseRevenue(new BigDecimal("5"));
        sakCodFreightDayModel.setAdCost(new BigDecimal("0"));
        sakCodFreightDayModel.setCpa(new BigDecimal("0"));
        sakCodFreightDayModel.setGoodValue(new BigDecimal("0"));
        sakCodFreightDayModel.setFreight(new BigDecimal("0"));
        sakCodFreightDayModel.setCollectionFreight(new BigDecimal("0"));
        sakCodFreightDayModel.setRefundFreight(new BigDecimal("0"));
        sakCodFreightDayModel.setRefundMoney(new BigDecimal("0"));
        sakCodFreightDayModel.setWarehouseFee(new BigDecimal("0"));
        sakCodFreightDayModel.setUnsignedDamageFee(new BigDecimal("0"));
        sakCodFreightDayModel.setVat(new BigDecimal("0"));
        sakCodFreightDayModel.setRevenue(new BigDecimal("0"));
        sakCodFreightDayModel.setOrderNum(0);


        codFreightDayModelDatas.add(sakCodFreightDayModel);
        codFreightDayExcelModels = codFreightDayModelDatas.stream().map(bean -> JSONUtil.toBean(JSONUtil.toJsonStr(bean), SakCodFreightDayExcelModel.class)).collect(Collectors.toList());
        codFreightDayModelDatas.clear();

        System.out.println("codFreightDayExcelModels = " + codFreightDayExcelModels);

        SakCodFreightDayExcelModel cls = new SakCodFreightDayExcelModel();
        Field[] superDeclaredFields = cls.getClass().getSuperclass().getDeclaredFields();
        System.out.println("1 = " + superDeclaredFields);
        Field[] subclassDeclaredFields = cls.getClass().getDeclaredFields();
        System.out.println("2 = " + subclassDeclaredFields);
        System.out.println("-----------------------------------------------");
        List<Field> superDeclaredFieldsList = Arrays.asList(superDeclaredFields).stream().collect(Collectors.toList());
        System.out.println("3 = " + superDeclaredFieldsList);
        List<Field> subclassDeclaredFieldsList = Arrays.asList(subclassDeclaredFields).stream().collect(Collectors.toList());
        System.out.println("4 = " + subclassDeclaredFieldsList);

        superDeclaredFieldsList.addAll(subclassDeclaredFieldsList);

        System.out.println("subclassDeclaredFieldsList = " + subclassDeclaredFieldsList);
        java.util.List<Field> fieldList = superDeclaredFieldsList.stream().filter(field -> {
            ExcelColumn annotation = field.getAnnotation(ExcelColumn.class);
            if (annotation != null && annotation.col() > 0) {
                field.setAccessible(true);
                return true;
            }
            return false;
        }).sorted(Comparator.comparing(field -> {
            int col = 0;
            ExcelColumn annotation = field.getAnnotation(ExcelColumn.class);
            if (annotation != null) {
                col = annotation.col();
            }
            return col;
        })).collect(Collectors.toList());

        System.out.println("fieldList = " + fieldList);

        fieldList.forEach(field -> {
            ExcelColumn annotation = field.getAnnotation(ExcelColumn.class);
            String columnName = "";
            if (annotation != null) {
                columnName = annotation.value();
                System.out.println(field + "\tcolumnName = " + columnName);
            }
        });
    }
}
