-- user_operation_log
--     1、将fund_id 修改为 business_id
ALTER TABLE user_operation_log CHANGE fund_id business_id VARCHAR(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '业务 ID  (基金、股权、基金和股权的组合)';
--     2、增加字段 business_type
ALTER TABLE user_operation_log ADD COLUMN business_type int DEFAULT NULL COMMENT '业务 类型  (基金:1   股权:2    基金和股权的组合:3)' AFTER business_id;
--     3、将数据表中数据 business_type 设置为--> 基金:1
UPDATE user_operation_log SET business_type=1


-- user_info
--      1、增加字段：open_id
ALTER TABLE user_info ADD COLUMN open_id VARCHAR(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '小程序openId' AFTER authentication_tape_file_path;


-- buyer_collection
--      1、将fund_id 修改为 business_id
ALTER TABLE buyer_collection CHANGE fund_id business_id VARCHAR(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '业务 ID  (基金、股权、基金和股权的组合)';
--     2、增加字段 type
ALTER TABLE buyer_collection ADD COLUMN type int DEFAULT NULL COMMENT '业务类型  (基金:1   股权:2    基金和股权的组合:3)' AFTER business_id;
--     3、将数据表中数据 type 设置为--> 基金:1
UPDATE buyer_collection SET type=1


-- 创建视图
CREATE VIEW product_view ( id, business_type, views_amount, `name`, secret_name, number_transferred, release_date, update_time, create_time, labels ) AS (
    SELECT
    `info`.`id` AS `id`,
    1 AS `business_type`,
    `t`.`amount` AS `views_amount`,
    `info`.`fund_full_name` AS `name`,
    `info`.`fund_full_name_secret` AS `secret_name`,
    `info`.`number_of_fund_units_transferred` AS `number_transferred`,
    `info`.`release_date` AS `release_date`,
    `info`.`update_time` AS `update_time`,
    `info`.`create_time` AS `create_time`,
    `info`.`labels` AS `labels`
    FROM
    (
    `fund_info` `info`
    LEFT JOIN ( SELECT `user_operation_log`.`business_id` AS `business_id`, count( 1 ) AS `amount` FROM `user_operation_log` GROUP BY `user_operation_log`.`business_id` ) `t` ON ((
     `info`.`id` = `t`.`business_id`
    )))
    WHERE
    ( `info`.`deleted` = 0 ) UNION ALL
    SELECT
    `e`.`id` AS `id`,
    2 AS `business_type`,
    `t`.`amount` AS `views_amount`,
    `e`.`target_company_name` AS `name`,
    `e`.`target_company_name_secret` AS `secret_name`,
    `e`.`transferred_equity_number` AS `number_transferred`,
    `e`.`release_date` AS `release_date`,
    `e`.`update_time` AS `update_time`,
    `e`.`create_time` AS `create_time`,
    '' AS `labels`
    FROM
    (
    `equity` `e`
    LEFT JOIN ( SELECT `user_operation_log`.`business_id` AS `business_id`, count( 1 ) AS `amount` FROM `user_operation_log` GROUP BY `user_operation_log`.`business_id` ) `t` ON ((
     `e`.`id` = `t`.`business_id`
    )))
    WHERE
    ( `e`.`deleted` = 0 )
)