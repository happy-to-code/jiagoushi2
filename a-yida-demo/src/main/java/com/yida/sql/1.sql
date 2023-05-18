CREATE TABLE `user`
(
    `id`                    varchar(20) NOT NULL,
    `name`                  varchar(20)          DEFAULT NULL COMMENT '用户名',
    `password`              varchar(80)          DEFAULT NULL COMMENT '密码',
    `locked_or_not`         bit(1)      NOT NULL DEFAULT b'0' COMMENT '是否锁定（0：正常；1：已锁定）',
    `contact_person`        varchar(80)          DEFAULT NULL COMMENT '联络人',
    `position`              varchar(50)          DEFAULT NULL COMMENT '职位',
    `phone`                 varchar(20)          DEFAULT NULL COMMENT '联络号码',
    `business_card_path`    varchar(200)         DEFAULT NULL COMMENT '联络人上传名片附件路径',
    `id_card_path`          varchar(200)         DEFAULT NULL COMMENT '联络人身份证附件路径',
    `unit_name`             varchar(200)         DEFAULT NULL COMMENT '所属单位名称',
    `business_license_path` varchar(200)         DEFAULT NULL COMMENT '所属单位营业执照附件路径',
    `agreement_path`        varchar(200)         DEFAULT NULL COMMENT '基金合伙协议附件路径',
    `wechat`                varchar(100)         DEFAULT NULL COMMENT '微信号',
    `email`                 varchar(50)          DEFAULT NULL COMMENT '邮箱',
    `status`                int(11) DEFAULT NULL COMMENT '状态（0：刚注册等待后台激活，1：已激活；2：冻结）',
    `gender`                bit(1)               DEFAULT NULL COMMENT '性别（0：女；1：男）',
    `age`                   int(11) DEFAULT NULL COMMENT '年龄',
    `create_time`           datetime             DEFAULT NULL COMMENT '创建时间',
    `update_time`           datetime             DEFAULT NULL COMMENT '更新时间',
    `create_by`             varchar(20)          DEFAULT NULL COMMENT '创建人',
    `update_by`             varchar(20)          DEFAULT NULL COMMENT '更新人',
    `deleted`               bit(1)      NOT NULL DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `fund_info`
(
    `id`                               varchar(20) NOT NULL,
    `publish_user_id`                  varchar(20)          default '' comment '发布用户ID',
    `fund_full_name`                   varchar(100)         default '' comment '基金全称',
    `number_of_fund_units_transferred` varchar(40)          default '' comment '基金份额转让数量',
    `overview_of_fund_manager`         text                 default null comment '基金管理人概况',
    `fund_size`                        varchar(40)          default '' comment '基金规模',
    `year_of_establishment`            date                 default null comment '成立年份',
    `investment_period`                varchar(20)          default '' comment '投资期',
    `exit_period`                      varchar(20)          default '' comment '退出期',
    `partner_situation`                text                 default null comment '合伙人情况',
    `fund_investment_direction`        text                 default null comment '基金投向',
    `project_situation_invested`       text                 default null comment '所投项目情况',
    `assigned_situation`               text                 default null comment '已分配情况',
    `project_exit_status`              text                 default null comment '项目退出情况',
    `project_highlights`               text                 default null comment '项目亮点',
    `project_risk_control`             text                 default null comment '项目风控',
    `performance_compensation`         text                 default null comment '业绩报酬',
    `actual_payment_status`            text                 default null comment '实缴情况',
    `contact_person_of_the_transferor` text                 default null comment '出让方联系人',
    `phone_of_the_transferor`          varchar(20)          default '' comment '出让方联系电话',
    `name_of_transferor`               text                 default null comment '出让方名称',
    `explanation_of_other_situations`  text                 default null comment '其他情况说明',
    `release_date`                     datetime             default null comment '发布日期',
    `create_time`                      datetime             DEFAULT NULL COMMENT '创建时间',
    `update_time`                      datetime             DEFAULT NULL COMMENT '更新时间',
    `create_by`                        varchar(20)          DEFAULT NULL COMMENT '创建人',
    `update_by`                        varchar(20)          DEFAULT NULL COMMENT '更新人',
    `deleted`                          bit(1)      NOT NULL DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT ='基金信息';


CREATE TABLE `fund_file`
(
    `id`                  varchar(20)  NOT NULL,
    `fund_id`             varchar(20)  NOT NULL,
    `file_type`           int                   DEFAULT NULL COMMENT '文件类型（1=基金买卖双方保密协议；2=卖方提供更多文件；3=卖方提供基金转让信息文件）',
    `file_path`           varchar(200) NOT NULL,
    `file_upload_user_id` varchar(20)  NOT NULL,
    `create_time`         datetime              DEFAULT NULL COMMENT '创建时间',
    `update_time`         datetime              DEFAULT NULL COMMENT '更新时间',
    `create_by`           varchar(20)           DEFAULT NULL COMMENT '创建人',
    `update_by`           varchar(20)           DEFAULT NULL COMMENT '更新人',
    `deleted`             bit(1)       NOT NULL DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='基金文件列表';

CREATE TABLE `fund_communication_situation`
(
    `id`                 varchar(20) NOT NULL,
    `fund_id`            varchar(20) NOT NULL,
    `content`            text                 DEFAULT NULL COMMENT '交流内容',
    `communication_time` datetime    NOT NULL COMMENT '交流日期',
    `user_id`            varchar(20) NOT NULL COMMENT '发表交流内容所属用户ID',
    `parent_id`          varchar(20) NOT NULL COMMENT '上级交流ID',
    `create_time`        datetime             DEFAULT NULL COMMENT '创建时间',
    `update_time`        datetime             DEFAULT NULL COMMENT '更新时间',
    `create_by`          varchar(20)          DEFAULT NULL COMMENT '创建人',
    `update_by`          varchar(20)          DEFAULT NULL COMMENT '更新人',
    `deleted`            bit(1)      NOT NULL DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='基金交流情况';


CREATE TABLE `user_features`
(
    `id`          varchar(20) NOT NULL,
    `user_id`     varchar(20) NOT NULL COMMENT '用户ID',
    `features`    int         NOT NULL COMMENT '1=有过合作；2=合作协议；3=已签买家平台保密协议；4=是否已签平台用户协议；5=用户已认证，所属机构为中心开户客户',
    `create_time` datetime             DEFAULT NULL COMMENT '创建时间',
    `update_time` datetime             DEFAULT NULL COMMENT '更新时间',
    `create_by`   varchar(20)          DEFAULT NULL COMMENT '创建人',
    `update_by`   varchar(20)          DEFAULT NULL COMMENT '更新人',
    `deleted`     bit(1)      NOT NULL DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户特征表';

CREATE TABLE `buyer_collection`
(
    `id`          varchar(20) NOT NULL,
    `user_id`     varchar(20) NOT NULL COMMENT '用户ID',
    `fund_id`     varchar(20) NOT NULL COMMENT '基金ID',
    `create_time` datetime             DEFAULT NULL COMMENT '创建时间',
    `update_time` datetime             DEFAULT NULL COMMENT '更新时间',
    `create_by`   varchar(20)          DEFAULT NULL COMMENT '创建人',
    `update_by`   varchar(20)          DEFAULT NULL COMMENT '更新人',
    `deleted`     bit(1)      NOT NULL DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='买家收藏';

CREATE TABLE `user_operation_log`
(
    `id`              varchar(20) NOT NULL,
    `user_id`         varchar(20) NOT NULL COMMENT '用户ID',
    `fund_id`         varchar(20) NOT NULL COMMENT '基金ID',
    `operation_type`  int         not null comment '操作类型（1=浏览基金 2=变更基金信息）',
    `has_push_or_not` bit(1)      NOT NULL DEFAULT b'0' COMMENT '0=未推送 1=已推送',
    `create_time`     datetime             DEFAULT NULL COMMENT '创建时间',
    `update_time`     datetime             DEFAULT NULL COMMENT '更新时间',
    `create_by`       varchar(20)          DEFAULT NULL COMMENT '创建人',
    `update_by`       varchar(20)          DEFAULT NULL COMMENT '更新人',
    `deleted`         bit(1)      NOT NULL DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户操作日志';


CREATE TABLE `fund_questionnaire`
(
    `id`                            varchar(20) NOT NULL,
    `user_id`                       varchar(20) NOT NULL COMMENT '用户ID',
    `name`                          varchar(20)          default NULL COMMENT '投资者名称/姓名',
    `contact_name`                  varchar(20)          default null comment '联系人姓名',
    `contact_title`                 varchar(20)          default null COMMENT '联系人职务',
    `phone`                         varchar(20)          default null COMMENT '电话',
    `email`                         varchar(50)          default null COMMENT '邮箱',
    `counterpart`                   varchar(20)          default null COMMENT '上股交对口人',
    `investment_stage`              varchar(10)          default null COMMENT '1、您/贵机构关注的投资阶段？(A.募集期     B.投资期     C.管理期     D.退出期)',
    `amount_range`                  varchar(250)         default null COMMENT '2、您/贵机构计划投资金额区间？(A.5000万以下   B.5000万—1亿   C.1亿—2亿  D.2亿以上  E.其他：— )',
    `prefer_industries`             varchar(250)         default null COMMENT '3、您/贵机构所偏好投资的行业？(A.信息技术  B.汽车  C.现代金融  D.新能源  E.医药健康  F.新材料  G.装备制造 H.电子  I.大消费 J.电子商务 K.数字创意产业 L.社会服务 M.交通运输 N.生物技术 O.节能环保 P.房地产 Q.其他：)',
    `holding_period`                varchar(250)         default null COMMENT '4、您/贵机构计划持有的期限？(A.1年以内   B.1—5年   C.5—10年   D.10年以上 E.其他：)',
    `dpi_requirement`               varchar(250)         default null COMMENT '5、您/贵机构对标的基金DPI的要求？(A.不做要求 B.1—1.1  C.1.1—1.2  D.1.2—1.3  E.1.3以上  F.其他：)',
    `moc_min_requirement`           varchar(250)         default null COMMENT '6、您/贵机构对标的基金MOC的最低要求？(A.不做要求   B.1.2倍   C.1.5倍   D.2倍   E.其他：)',
    `irr_requirement`               varchar(250)         default null COMMENT '7、您/贵机构对标的基金IRR的要求？(A.不做要求  B.0%—10%  C.10%—20%  D.20%—30%  E.30%以上  E.其他：)',
    `risk_appetite`                 varchar(250)         default null COMMENT '8、您/贵机构是否偏好投资结构化（优先级）的私募基金份额？您对投资的风险偏好情况如何？(A.是 B.否 C.其他风险偏好说明：)',
    `management_scale`              varchar(250)         default null COMMENT '9.1、您对标的基金管理人要求如何？(管理规模)',
    `past_performance`              varchar(250)         default null COMMENT '9.2、您对标的基金管理人要求如何？(过往业绩)',
    `ranking`                       varchar(250)         default null COMMENT '9.3、您对标的基金管理人要求如何？(排名)',
    `foreign_investment_be_allowed` varchar(250)         default null COMMENT '9.4、您对标的基金管理人要求如何？(管理人性质可否外资)',
    `other_requirements`            varchar(250)         default null COMMENT '9.5、您对标的基金管理人要求如何？(其他要求)',
    `other_appeal`                  varchar(500)         default null COMMENT '10、其他关注要点或诉求',
    `create_time`                   datetime             DEFAULT NULL COMMENT '创建时间',
    `update_time`                   datetime             DEFAULT NULL COMMENT '更新时间',
    `create_by`                     varchar(20)          DEFAULT NULL COMMENT '创建人',
    `update_by`                     varchar(20)          DEFAULT NULL COMMENT '更新人',
    `deleted`                       bit(1)      NOT NULL DEFAULT b'0' COMMENT '删除标记（0：正常；1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='私募基金投资者调查问卷';