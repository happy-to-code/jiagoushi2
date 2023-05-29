ALTER TABLE `t_post_lease_follow_up` ADD project_impairment varchar(500) comment '项目减值(元)' after state ;


 ALTER TABLE `t_post_lease_follow_up` ADD equipment_supplier varchar(50) comment '设备供应商' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD overdue_projects varchar(50) comment '当年累计回款（逾期项目）' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD whether_to_collect_collection_records bit(1) comment '是否收集催收记录' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD whether_to_collect_business_info bit(1) comment '是否收集工商信息' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD whether_to_collect_credit_report bit(1) comment '是否收集征信报告' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD whether_to_collect_court_enforcement_info bit(1) comment '是否收集征法院执行信息' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD whether_to_collect_financial_reports bit(1) comment '是否收集征财报' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD whether_to_collect_annual_audit_report bit(1) comment '是否收集征年度审计报告' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD whether_to_collect_zhong_deng_net bit(1) comment '是否收集征中登网' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD photos_or_not bit(1) comment '是否有照片' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD attachments text comment '附件' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD business_and_financial_condition text comment '承租人经营及财务状况' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD collateral_situation text comment '租赁物/抵押物情况' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD tenant_credit_situation text comment '承租人信用情况及负面情况' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD others text comment '其他需要说明事项' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD reasons_of_overdue text comment '承租人逾期原因分析' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD funding_arrange text comment '承租人后续资金安排' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD property_clues text comment '承租人财产线索' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD handling_opinions text comment '后续处理意见' after report_format;
 ALTER TABLE `t_post_lease_follow_up` ADD risk_management_department_opinions text comment '风险管理部意见' after report_format;