CREATE
OR REPLACE ALGORITHM = UNDEFINED VIEW product_view ( id, business_type, views_amount, `name`, secret_name, number_transferred, release_date, update_time, create_time, labels ) AS (
	SELECT
		info.id AS id,
		1 AS business_type,
		t.amount AS views_amount,
		info.fund_full_name AS `name`,
		info.fund_full_name_secret AS secret_name,
		info.number_of_fund_units_transferred AS number_transferred,
		info.release_date AS release_date,
		info.update_time AS update_time,
		info.create_time AS create_time,
		info.labels AS labels
	FROM
		fund_info info
		LEFT JOIN ( SELECT business_id, count( 1 ) amount FROM user_operation_log GROUP BY business_id ) t ON info.id = t.business_id UNION ALL
	SELECT
		e.id AS id,
		2 AS business_type,
		t.amount AS views_amount,
		e.target_company_name AS `name`,
		e.target_company_name_secret AS secret_name,
		e.transferred_equity_number AS number_transferred,
		e.release_date AS release_date,
		e.update_time AS update_time,
		e.create_time AS create_time,
		"" AS labels
	FROM
		equity e
	LEFT JOIN ( SELECT business_id, count( 1 ) amount FROM user_operation_log GROUP BY business_id ) t ON e.id = t.business_id
	);