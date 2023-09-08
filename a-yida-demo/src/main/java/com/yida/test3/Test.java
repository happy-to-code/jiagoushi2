package com.yida.test3;

import cn.hutool.core.date.DateUnit;

/**
 * @author: zhangyifei
 * @version: 1.0
 * @since: 2023/4/14.sql 17:48
 */
public class Test {
    public static void main(String[] args) {
        String s = "[{\"itemType\":\"0\",\"code\":\"code\",\"title\":\"NCR系统报告编号\",\"sort\":1,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"ncrNo\",\"title\":\"NCR编号\",\"sort\":2,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"companyName\",\"title\":\"企业名称-修改测试\",\"sort\":3,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"project\",\"title\":\"项目名称\",\"sort\":4,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"equipment\",\"title\":\"设备名称\",\"sort\":5,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"parts\",\"title\":\"零/部件名称\",\"sort\":6,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"trackingNo\",\"title\":\"追踪编号\",\"sort\":7,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"纠正措施类型\"},{\"itemType\":\"0\",\"code\":\"lossCategory\",\"title\":\"质量损失类型\",\"sort\":8,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"status\",\"title\":\"目前状态\",\"sort\":9,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"ncrStartTime\",\"title\":\"开启日期\",\"sort\":10,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"ncrCloseTime\",\"title\":\"关闭日期\",\"sort\":11,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"disposalOpinion\",\"title\":\"处置意见\",\"sort\":12,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"level\",\"title\":\"NCR等级\",\"sort\":13,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"summary\",\"title\":\"NCR摘要\",\"sort\":14.sql,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"stage\",\"title\":\"NCR产生阶段\",\"sort\":15,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"description\",\"title\":\"NCR内容描述\",\"sort\":16,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"causeCategory\",\"title\":\"原因类别\",\"sort\":17,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"causeAnalysis\",\"title\":\"原因分析\",\"sort\":18,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"subcategory\",\"title\":\"NCR类别细分\",\"sort\":19,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"responsibleDepartment\",\"title\":\"初步责任部门\",\"sort\":20,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"ultimateResponsibleDepartment\",\"title\":\"最终责任部门\",\"sort\":21,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"responsibleVendor\",\"title\":\"供应商\",\"sort\":22,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"纠正措施类型\"},{\"itemType\":\"0\",\"code\":\"versionNo\",\"title\":\"版本号\",\"sort\":23,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"comment\",\"title\":\"备注\",\"sort\":24,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"nudefpro\",\"title\":\"阶段\",\"sort\":25,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"纠正措施类型\"},{\"itemType\":\"0\",\"code\":\"nudefpha\",\"title\":\"主要工序\",\"sort\":26,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"nudefsta\",\"title\":\"使用设备或方法\",\"sort\":27,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"nudefmr\",\"title\":\"主要原因\",\"sort\":28,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\"},{\"itemType\":\"0\",\"code\":\"nudefcl\",\"title\":\"原因分类\",\"sort\":29,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"nudefrsub\",\"title\":\"原因细分\",\"sort\":30,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"nudefcla\",\"title\":\"缺陷类型\",\"sort\":31,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"nuprocl\",\"title\":\"问题种类\",\"sort\":32,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"syncDate\",\"title\":\"同步日期\",\"sort\":33,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"correctiveMeasureType\"},{\"itemType\":\"0\",\"code\":\"column9\",\"title\":\"是否纳入考核原因\",\"sort\":34,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\"},{\"itemType\":\"1\",\"code\":\"column1\",\"title\":\"焊材种类\",\"sort\":35,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictList\":[{\"editable\":false,\"description\":\"\",\"itemText\":\"1\",\"itemValue\":\"1\",\"sort\":\"1\"},{\"editable\":false,\"description\":\"\",\"itemText\":\"2\",\"itemValue\":\"2\",\"sort\":\"2\"},{\"editable\":false,\"description\":\"\",\"itemText\":\"3\",\"itemValue\":\"3\",\"sort\":\"3\"}]},{\"itemType\":\"1\",\"code\":\"column2\",\"title\":\"焊接方法\",\"sort\":36,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\"},{\"itemType\":\"1\",\"code\":\"column3\",\"title\":\"焊接缺陷类型\",\"sort\":37,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"aaa\"},{\"itemType\":\"1\",\"code\":\"column4\",\"title\":\"焊缝类型\",\"sort\":38,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"aaa\"},{\"itemType\":\"1\",\"code\":\"column5\",\"title\":\"WPS编号\",\"sort\":39,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"satisfactionDict\"},{\"itemType\":\"1\",\"code\":\"column6\",\"title\":\"处理方案描述\",\"sort\":40,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\"},{\"itemType\":\"1\",\"code\":\"column7\",\"title\":\"操作者（制造部填写）\",\"sort\":41,\"display\":true,\"WheDisplay\":\"是\",\"isDict\":\"1\"},{\"itemType\":\"1\",\"code\":\"column8\",\"title\":\"原材料类型\",\"sort\":42,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\"},{\"itemType\":\"1\",\"code\":\"column10\",\"title\":\"自定义字段10\",\"sort\":43,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"name\"},{\"itemType\":\"1\",\"code\":\"column11\",\"title\":\"自定义字段11\",\"sort\":44,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"name\"},{\"itemType\":\"1\",\"code\":\"column12\",\"title\":\"自定义字段12\",\"sort\":45,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"name\"},{\"itemType\":\"1\",\"code\":\"column13\",\"title\":\"自定义字段13\",\"sort\":46,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"name\"},{\"itemType\":\"1\",\"code\":\"column14\",\"title\":\"自定义字段14\",\"sort\":47,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"name\"},{\"itemType\":\"1\",\"code\":\"column15\",\"title\":\"自定义字段15\",\"sort\":48,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"name\"},{\"itemType\":\"1\",\"code\":\"column16\",\"title\":\"自定义字段16\",\"sort\":49,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"name\"},{\"itemType\":\"1\",\"code\":\"column17\",\"title\":\"自定义字段17\",\"sort\":50,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"name\"},{\"itemType\":\"1\",\"code\":\"column18\",\"title\":\"自定义字段18\",\"sort\":51,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"name\"},{\"itemType\":\"1\",\"code\":\"column19\",\"title\":\"自定义字段19\",\"sort\":52,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"name\"},{\"itemType\":\"1\",\"code\":\"column20\",\"title\":\"自定义字段20\",\"sort\":53,\"display\":false,\"WheDisplay\":\"是\",\"isDict\":\"1\",\"dictValue\":\"name\"}]";


        String ss = "2015-01-22 00:00:00.0";


    }
}
