CREATE TABLE `sellfox_amazon_fba_fulfillment_monthly_inventory_data_report`
(
    `id`                    varchar(36) NOT NULL,
    `create_by`             varchar(50) DEFAULT NULL COMMENT '创建人',
    `create_time`           datetime    DEFAULT NULL COMMENT '创建日期',
    `update_by`             varchar(50) DEFAULT NULL COMMENT '更新人',
    `update_time`           datetime    DEFAULT NULL COMMENT '更新日期',
    `amz_report_id`         varchar(50) DEFAULT NULL COMMENT '报告ID',
    `shop_name`             varchar(50) DEFAULT NULL COMMENT '店铺名称',
    `report_type`           varchar(50) DEFAULT NULL COMMENT '报告类型',
    `report_time_range_str` varchar(50) DEFAULT NULL COMMENT '报告时间范围',
    `month`                 varchar(50) DEFAULT NULL COMMENT 'month',
    `fnsku`                 varchar(50) DEFAULT NULL COMMENT 'fnsku',
    `sku`                   varchar(50) DEFAULT NULL COMMENT 'sku',
    `product_name`          varchar(500) DEFAULT NULL COMMENT 'product-name',
    `average_quantity`      varchar(50) default null comment 'average-quantity',
    `end_quantity`          varchar(50) default null comment 'end-quantity',
    `fulfillment_center_id` varchar(50) default null comment 'fulfillment-center-id',
    `detailed_disposition`  varchar(50) default null comment 'detailed-disposition',
    `country`               varchar(50) default null comment 'country',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='sellfox:每月库存历史记录';
