CREATE TABLE `portfolio_assets`
(
    `id`                               varchar(20) NOT NULL,
    `publish_user_id`                  varchar(20)          DEFAULT '' COMMENT '发布用户ID',
    `assets_name`                      varchar(20) NOT NULL COMMENT '资产组合名称',
    `assets_name_secret`               varchar(20) NOT NULL COMMENT '资产组合名称（脱敏）',
    `content`                          varchar(50) NOT NULL COMMENT '资产组合包含项目内容',
    `contact_person_of_the_transferor` text COMMENT '出让方联系人',
    `phone_of_the_transferor`          varchar(20)          DEFAULT '' COMMENT '出让方联系电话',
    `create_time`                      datetime             DEFAULT NULL COMMENT '创建时间',
    `update_time`                      datetime             DEFAULT NULL COMMENT '更新时间',
    `create_by`                        varchar(20)          DEFAULT NULL COMMENT '创建人',
    `update_by`                        varchar(20)          DEFAULT NULL COMMENT '更新人',
    `deleted`                          bit(1)      NOT NULL DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='资产组合';

CREATE TABLE `portfolio_assets_fund`
(
    `id`                               varchar(20) NOT NULL,
    `publish_user_id`                  varchar(20)                                                   DEFAULT '' COMMENT '发布用户ID',
    `fund_full_name`                   varchar(100)                                                  DEFAULT '' COMMENT '基金全称',
    `fund_full_name_secret`            varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '基金全称（脱敏）',
    `number_of_fund_units_transferred` varchar(40)                                                   DEFAULT '' COMMENT '基金份额转让数量',
    `overview_of_fund_manager`         text COMMENT '基金管理人概况',
    `fund_size`                        varchar(40)                                                   DEFAULT '' COMMENT '基金规模',
    `year_of_establishment`            varchar(50)                                                   DEFAULT NULL COMMENT '成立年份',
    `investment_period`                varchar(20)                                                   DEFAULT '' COMMENT '投资期',
    `exit_period`                      varchar(20)                                                   DEFAULT '' COMMENT '退出期',
    `partner_situation`                text COMMENT '合伙人情况',
    `fund_investment_direction`        text COMMENT '基金投向',
    `project_situation_invested`       text COMMENT '所投项目情况',
    `assigned_situation`               text COMMENT '已分配情况',
    `project_exit_status`              text COMMENT '项目退出情况',
    `project_highlights`               text COMMENT '项目亮点',
    `project_risk_control`             text COMMENT '项目风控',
    `performance_compensation`         text COMMENT '业绩报酬',
    `actual_payment_status`            text COMMENT '实缴情况',
    `contact_person_of_the_transferor` text COMMENT '出让方联系人',
    `phone_of_the_transferor`          varchar(20)                                                   DEFAULT '' COMMENT '出让方联系电话',
    `name_of_transferor`               text COMMENT '出让方名称',
    `explanation_of_other_situations`  text COMMENT '其他情况说明',
    `release_date`                     date                                                          DEFAULT NULL COMMENT '发布日期',
    `fund_status`                      int                                                           DEFAULT NULL COMMENT '基金状态（1=未审核；2=变更信息未审核；3=审核通过；4=作废）',
    `labels`                           varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '标签，多个值之间使用逗号隔开',
    `create_time`                      datetime                                                      DEFAULT NULL COMMENT '创建时间',
    `update_time`                      datetime                                                      DEFAULT NULL COMMENT '更新时间',
    `create_by`                        varchar(20)                                                   DEFAULT NULL COMMENT '创建人',
    `update_by`                        varchar(20)                                                   DEFAULT NULL COMMENT '更新人',
    `deleted`                          bit(1)      NOT NULL                                          DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='资产组合-基金信息';


CREATE TABLE `portfolio_assets_equity`
(
    `id`                                    varchar(20)                                                  NOT NULL,
    `target_company_name`                   varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标的公司',
    `target_company_name_secret`            varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci          DEFAULT NULL COMMENT '标的公司名称（脱敏）',
    `transferred_equity_number`             varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '出让股权数量',
    `situation_team`                        text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标的公司管理层/创始团队情况',
    `valuation`                             text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标的公司估值及依据',
    `establishment_date`                    varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标的公司成立时间',
    `main_business`                         text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '标的公司主营业务',
    `financial_status`                      text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '标的公司财务状况',
    `business_model`                        text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '标的公司商业模式',
    `industry_situation`                    text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '标的公司所处行业情况',
    `comparative_advantages`                text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '标的公司对比优势',
    `development_plan`                      text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '标的公司发展规划',
    `shareholders_and_shareholding_ratio`   text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '标的公司股东及持股比例',
    `historical_financing_situation`        text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '标的公司历史融资情况',
    `subsequent_financing_and_listing_plan` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '标的公司后续融资及上市计划',
    `transferor_contact_person`             varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci          DEFAULT NULL COMMENT '出让方联系人',
    `transferor_contact_number`             varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci          DEFAULT NULL COMMENT '出让方联系电话',
    `transferor_name`                       varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci          DEFAULT NULL COMMENT '出让方名称',
    `other_situations_explanation`          text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '其他情况说明',
    `release_date`                          varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci          DEFAULT NULL COMMENT '发布日期',
    `publish_user_id`                       varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci          DEFAULT '' COMMENT '发布用户ID',
    `create_time`                           datetime                                                              DEFAULT NULL COMMENT '创建时间',
    `update_time`                           datetime                                                              DEFAULT NULL COMMENT '更新时间',
    `create_by`                             varchar(20)                                                           DEFAULT NULL COMMENT '创建人',
    `update_by`                             varchar(20)                                                           DEFAULT NULL COMMENT '更新人',
    `deleted`                               bit(1)                                                       NOT NULL DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='资产组合-私募股权';


CREATE TABLE `portfolio_assets_mapping`
(
    `id`          varchar(20) NOT NULL,
    `type`        int                  DEFAULT null COMMENT '1:基金；2：股权',
    `entity_id`   varchar(20) NOT NULL COMMENT '基金or股权的Id',
    `create_time` datetime             DEFAULT NULL COMMENT '创建时间',
    `update_time` datetime             DEFAULT NULL COMMENT '更新时间',
    `create_by`   varchar(20)          DEFAULT NULL COMMENT '创建人',
    `update_by`   varchar(20)          DEFAULT NULL COMMENT '更新人',
    `deleted`     bit(1)      NOT NULL DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='资产组合关系映射表';