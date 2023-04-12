CREATE TABLE `t_project`
(
    `id`                varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '项目ID',
    `dept_user`         varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT NULL COMMENT '项目默认的经理审批人id',
    `name`              varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
    `code`              varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '项目编号唯一',
    `attachment`        json                                                          DEFAULT NULL COMMENT '附件',
    `category`          tinyint                                                       DEFAULT NULL COMMENT '项目分类  （基金项目、直投项目）',
    `fund`              json                                                          DEFAULT NULL COMMENT '基金类',
    `direct_investment` json                                                          DEFAULT NULL COMMENT '直投类',
    `status`            tinyint                                                       DEFAULT NULL COMMENT '流程状态 （已审批、未审批）',
    `submit_status`     tinyint                                                       DEFAULT NULL COMMENT '提交状态(已经提交，未提交)',
    `process_id`        varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '流程id',
    `manage_user`       varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT NULL COMMENT '项目默认的主管审批人id',
    `stage`             tinyint                                                       DEFAULT NULL COMMENT '项目阶段 数据字典（立项、尽调、管理）',
    `create_time`       datetime                                                      DEFAULT NULL COMMENT '创建日期',
    `update_time`       datetime                                                      DEFAULT NULL COMMENT '更新日期',
    `create_by`         varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT NULL COMMENT '创建人',
    `update_by`         varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT NULL COMMENT '更新人',
    `deleted`           varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   DEFAULT '0' COMMENT '删除标签  逻辑删除（0：未删除，1：已删除）',
    `delay_code`        tinyint                                                       DEFAULT NULL COMMENT '项目超期状态',
    `fund_list`         json                                                          DEFAULT NULL COMMENT '基金列表',
    `time`              int                                                           DEFAULT NULL COMMENT '项目时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE `t_risk_monitoring_indicators`
(
    `id`                            varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '项目ID',
    `year`                          year                                                         DEFAULT NULL COMMENT '年',
    `month`                         tinyint                                                      DEFAULT NULL COMMENT '月份',
    `defect_rate`                   float                                                        DEFAULT NULL COMMENT '不良率',
    `single_related_party`          float                                                        DEFAULT NULL COMMENT '单一关联方集中度',
    `all_related_parties`           float                                                        DEFAULT NULL COMMENT '全部关联方集中度',
    `securities_investment`         float                                                        DEFAULT NULL COMMENT '证券投资比重',
    `single_group_customers`        float                                                        DEFAULT NULL COMMENT '单一集团客户集中度',
    `parties_of_single_shareholder` float                                                        DEFAULT NULL COMMENT '单一股东关联方集中度',
    `leverage_ratio`                float                                                        DEFAULT NULL COMMENT '杠杆倍数',
    `single_customer_concentration` float                                                        DEFAULT NULL COMMENT '单一客户集中度',
    `net_assets`                    float                                                        DEFAULT NULL COMMENT '集团外负债敞口/净资产',
    `liquidity_ratio`               float                                                        DEFAULT NULL COMMENT '流动性比率',
    `provision_coverage`            float                                                        DEFAULT NULL COMMENT '拨备覆盖率',
    `leased_assets`                 float                                                        DEFAULT NULL COMMENT '租赁资产比重',
    `create_time`                   datetime                                                     DEFAULT NULL COMMENT '创建日期',
    `update_time`                   datetime                                                     DEFAULT NULL COMMENT '更新日期',
    `create_by`                     varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建人',
    `update_by`                     varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '更新人',
    `deleted`                       varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT '0' COMMENT '删除标签  逻辑删除（0：未删除，1：已删除）',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE KEY `idx_year_month` (`year`, `month`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='风险监控指标';



CREATE TABLE `t_financial_operational_indicators`
(
    `id`                            varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '项目ID',
    `year`                          year                                                         DEFAULT NULL COMMENT '年',
    `month`                         tinyint                                                      DEFAULT NULL COMMENT '月份',
    `total_assets`                  float                                                        DEFAULT NULL COMMENT '总资产',
    `total_liabilities`             float                                                        DEFAULT NULL COMMENT '总负债',
    `net_assets`                    float                                                        DEFAULT NULL COMMENT '净资产',
    `business_income`               float                                                        DEFAULT NULL COMMENT '营业收入',
    `net_profit`                    float                                                        DEFAULT NULL COMMENT '净利润',
    `asset_liability_ratio`         float                                                        DEFAULT NULL COMMENT '资产负债率',
    `provision_and_withdrawal`      float                                                        DEFAULT NULL COMMENT '拨备计提',
    `profit_budget`                 float                                                        DEFAULT NULL COMMENT '利润预算数',
    `profit_budget_completion_rate` float                                                        DEFAULT NULL COMMENT '利润预算完成率',
    `create_time`                   datetime                                                     DEFAULT NULL COMMENT '创建日期',
    `update_time`                   datetime                                                     DEFAULT NULL COMMENT '更新日期',
    `create_by`                     varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建人',
    `update_by`                     varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '更新人',
    `deleted`                       varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT '0' COMMENT '删除标签  逻辑删除（0：未删除，1：已删除）',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE KEY `idx_year_month` (`year`, `month`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='财务经营指标';


CREATE TABLE `t_risk_statement`
(
    `id`                   varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '项目ID',
    `contract_no`          varchar(64)                                                  DEFAULT NULL COMMENT '合同编号',
    `project_leader`       varchar(32)                                                  DEFAULT NULL COMMENT '项目负责人',
    `filling_date`         datetime                                                     DEFAULT NULL COMMENT '填报日期',
    `reporting_department` varchar(32)                                                  DEFAULT NULL COMMENT '填报部门',
    `risk_events`          varchar(128)                                                 DEFAULT NULL COMMENT '风险事件',
    `risk_response`        varchar(512)                                                 DEFAULT NULL COMMENT '风险应对',
    `follow_up_id`         varchar(32)                                                  DEFAULT NULL COMMENT '后续跟踪',
    `risk_manager`         varchar(32)                                                  DEFAULT NULL COMMENT '风险部经理',
    `risk_director`        varchar(32)                                                  DEFAULT NULL COMMENT '风险总监',
    `create_time`          datetime                                                     DEFAULT NULL COMMENT '创建日期',
    `update_time`          datetime                                                     DEFAULT NULL COMMENT '更新日期',
    `create_by`            varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建人',
    `update_by`            varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '更新人',
    `deleted`              varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT '0' COMMENT '删除标签  逻辑删除（0：未删除，1：已删除）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='风险提示';
CREATE TABLE `t_risk_statement_follow_up`
(
    `id`          varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '项目ID',
    `follow_up`   text                                                         DEFAULT NULL COMMENT '后续跟踪',
    `create_time` datetime                                                     DEFAULT NULL COMMENT '创建日期',
    `update_time` datetime                                                     DEFAULT NULL COMMENT '更新日期',
    `create_by`   varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建人',
    `update_by`   varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '更新人',
    `deleted`     varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT '0' COMMENT '删除标签  逻辑删除（0：未删除，1：已删除）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='风险提示-后续跟踪';


CREATE TABLE `t_operation_opinion_tracking`
(
    `id`                               varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '项目ID',
    `start_time`                       datetime                                                     default null comment '周次（开始时间）',
    `end_time`                         datetime                                                     default null comment '周次（结束时间）',
    `weekly`                           int                                                          default null comment '周次',
    `project_number`                   varchar(32)                                                  default null comment '项目编号',
    `business_department`              varchar(32)                                                  default null comment '业务部门',
    `contract_number`                  varchar(32)                                                  default null comment '合同编号',
    `project_leader`                   varchar(32)                                                  default null comment '项目负责人',
    `entry_name`                       varchar(32)                                                  default null comment '项目名称',
    `project_operation_opinions`       varchar(500)                                                 default null comment '项目操作意见',
    `earliest_completion_time`         datetime                                                     default null comment '最早完成时点',
    `latest_completion_time`           datetime                                                     default null comment '最晚完成时间',
    `operating_frequency`              varchar(32)                                                  default null comment '操作频率',
    `completed_or_not`                 varchar(4)                                                   default null comment '是否完成（0：未完成，1：已完成）',
    `reason_for_incomplete_completion` varchar(500)                                                 default null comment '未完成原因（是否完成=否时，页面展示）',
    `implement_the_plan`               varchar(32)                                                  default null comment '落实计划（是否完成=否时，页面展示）',
    `attachment`                       varchar(500)                                                 default null comment '附件（是否完成=是时，页面展示）',
    `create_time`                      datetime                                                     DEFAULT NULL COMMENT '创建日期',
    `update_time`                      datetime                                                     DEFAULT NULL COMMENT '更新日期',
    `create_by`                        varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建人',
    `update_by`                        varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '更新人',
    `deleted`                          varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT '0' COMMENT '删除标签  逻辑删除（0：未删除，1：已删除）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='项目操作意见落实跟踪模块';


CREATE TABLE `t_risk_warning`
(
    `id`                                         varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '项目ID',
    `number`                                     varchar(32)                                                  default null comment '编号',
    `department`                                 varchar(32)                                                  default null comment '所属部门',
    `report_time`                                varchar(32)                                                  default null comment '报告时间',
    `lessee`                                     varchar(32)                                                  default null comment '承租人',
    `total_equipment_amount`                     varchar(32)                                                  default null comment '设备总额',
    `remaining_rent`                             varchar(32)                                                  default null comment '尚余租金',
    `net_financing`                              float8                                                       default null comment '净融资额',
    `net_remaining_principal`                    float8                                                       default null comment '净剩余本金',
    `project_overview_and_risk_profile`          varchar(32)                                                  default null comment '项目基本概况及风险情况',
    `rental_property_information`                varchar(32)                                                  default null comment '租赁物信息',
    `analysis_of_early_warning_situation`        varchar(32)                                                  default null comment '预警情况分析',
    `detailed_description_of_warning_indicators` varchar(32)                                                  default null comment '预警指标详细描述',
    `opinions_from_various_departments`          varchar(32)                                                  default null comment '各部门意见',
    `risk_level_and_expected_loss_level`         varchar(32)                                                  default null comment '我司风险程度及预计损失程度',
    `opinions_response`                          varchar(32)                                                  default null comment '风险管理部意见及风险应对',
    `early_warning_tracking`                     varchar(32)                                                  default null comment '预警跟踪',
    `risk_manager`                               varchar(32)                                                  default null comment '风险部经理',
    `risk_control_director`                      varchar(32)                                                  default null comment '风控总监',
    `create_time`                                datetime                                                     DEFAULT NULL COMMENT '创建日期',
    `update_time`                                datetime                                                     DEFAULT NULL COMMENT '更新日期',
    `create_by`                                  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建人',
    `update_by`                                  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '更新人',
    `deleted`                                    varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT '0' COMMENT '删除标签  逻辑删除（0：未删除，1：已删除）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='风险预警';

CREATE TABLE `t_contract_details`
(
    `id`                        varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'ID',
    `business_type`             varchar(32)                                                  default null comment '业务类型',
    `contract_number`           varchar(32)                                                  default null comment '合同编号',
    `starting_date_of_lease`    varchar(32)                                                  default null comment '起租日',
    `due_date`                  varchar(32)                                                  default null comment '到期日',
    `contract_execution_status` varchar(500)                                                 default null comment '合同执行情况',
    `past_due_records`          varchar(100)                                                 default null comment '逾期记录',
    `create_time`               datetime                                                     DEFAULT NULL COMMENT '创建日期',
    `update_time`               datetime                                                     DEFAULT NULL COMMENT '更新日期',
    `create_by`                 varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建人',
    `update_by`                 varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '更新人',
    `deleted`                   varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT '0' COMMENT '删除标签  逻辑删除（0：未删除，1：已删除）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='合同明细';

CREATE TABLE `t_rental_property_info`
(
    `id`                       varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'ID',
    `device_name`              varchar(32)                                                  default null comment '设备名称',
    `project_equipment_amount` float8                                                       default null comment '项目设备额',
    `create_time`              datetime                                                     DEFAULT NULL COMMENT '创建日期',
    `update_time`              datetime                                                     DEFAULT NULL COMMENT '更新日期',
    `create_by`                varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建人',
    `update_by`                varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '更新人',
    `deleted`                  varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT '0' COMMENT '删除标签  逻辑删除（0：未删除，1：已删除）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='租赁物信息';

CREATE TABLE `t_early_warning_tracking`
(
    `id`          varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'ID',
    `follow_up`   varchar(32)                                                  default null comment '后续跟踪',
    `create_time` datetime                                                     DEFAULT NULL COMMENT '创建日期',
    `update_time` datetime                                                     DEFAULT NULL COMMENT '更新日期',
    `create_by`   varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建人',
    `update_by`   varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '更新人',
    `deleted`     varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT '0' COMMENT '删除标签  逻辑删除（0：未删除，1：已删除）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='预警跟踪';