CREATE TABLE `sellfox_amazon_ledger_detail_view_data_report`
(
    `id`                    varchar(36) NOT NULL,
    `create_by`             varchar(50)  DEFAULT NULL COMMENT '创建人',
    `create_time`           datetime     DEFAULT NULL COMMENT '创建日期',
    `update_by`             varchar(50)  DEFAULT NULL COMMENT '更新人',
    `update_time`           datetime     DEFAULT NULL COMMENT '更新日期',
    `amz_report_id`         varchar(50)  DEFAULT NULL COMMENT '报告ID',
    `shop_name`             varchar(50)  DEFAULT NULL COMMENT '店铺名称',
    `report_type`           varchar(50)  DEFAULT NULL COMMENT '报告类型',
    `report_time_range_str` varchar(50)  DEFAULT NULL COMMENT '报告时间范围',
    `date`                  varchar(50)  default null comment 'Date',
    `fnsku`                 varchar(50)  default null comment 'FNSKU',
    `asin`                  varchar(50)  default null comment 'ASIN',
    `msku`                  varchar(50)  default null comment 'MSKU',
    `title`                 varchar(50)  default null comment 'Title',
    `event_type`            varchar(50)  default null comment 'EventType',
    `reference_id`          varchar(50)  default null comment 'ReferenceID',
    `quantity`              varchar(50)  default null comment 'Quantity',
    `fulfillment_center`    varchar(50)  default null comment 'FulfillmentCenter',
    `disposition`           varchar(50)  default null comment 'Disposition',
    `reason`                varchar(200) default null comment 'Reason',
    `country`               varchar(50)  default null comment 'Country',
    `reconciled_quantity`   varchar(50)  default null comment 'ReconciledQuantity',
    `unreconciled_quantity` varchar(50)  default null comment 'UnreconciledQuantity',
    `date_and_time`         varchar(50)  default null comment 'DateAndTime',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='sellfox:库存分类账报表----详细视图';