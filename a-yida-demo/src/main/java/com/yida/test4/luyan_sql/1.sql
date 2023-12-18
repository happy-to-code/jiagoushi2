-- 企业基本信息
INSERT INTO "LY_BASE_INFO" ("PROJECT_ID", "COMPANY_NAME", "SHORT_NAME", "CREDIT_CODE", "LEGAL_PERSON",
                            "REGISTER_TIME", "REAL_CAPITAL", "WEBSITE", "AREA", "ADDRESS", "LOGO", "LOGO_URL",
                            "TAGS", "REG_USER_NAME", "REG_USER_TITLE", "IS_REG_USER_MANAGER", "CONTACTS_PHONE",
                            "CONTACTS_NAME", "CONTACTS_TITLE", "CONTACTS_EMAIL", "COMPANY_INFO")
VALUES ('16', '威泊（上海）新能源科技股份有限公司', '威泊股份', '91310107324485470F', '刘跃进',
        TO_DATE('2015-01-22 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '2000', 'https://www.wiposh.cn/', '上海市,上海市',
        '中国（上海）自由贸易试验区郭守敬路498号8幢19号楼3层', ' ',
        'https://www.china-see.com/attached/logo20230616.jpg', '33,35,76', '刘跃进', '董事长、总经理', '1',
        '13788956259', '刘跃进', '董事长、总经理', 'xierui@wipo.com',
        '2015由国务院“百人计划”归国博士团队创建。
连续6年年均营收增长率超过100%！
产品一直处于供不应求状态。
主要产品系列：
1. 智能仓储无线充电产品
2. 智慧小区无线充电产品
3. 新能源汽车无线充电产品
4. 双模桩---无线+有线充电桩
5. 路上充---数字道路无线充电
6. 移电宝---移动无线充电机器人
7. 飞电宝---无人机高空无线充电
8. 港船潜---涉水无线充电产品');


-- 核心团队
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('16', '刘跃进', '董事长、总经理',
        '刘跃进，男，1959 年 12 月出生，中国国籍，无境外永久居留权，毕业于瑞典皇家理工学院无线通信系统专业，博士研究生学历，高级职称。1982 年08 月至 1985 年 06 月，任河北省邮电局助理工程师；1985 年 07 月至 1988 年07 月，任国家经委培训中心 MBA 研究生培训；1988 年 08 月至 1990 年 07 月，瑞典皇家理工学院硕士研究生在读；1990 年 08 月至 1993 年 07 月，瑞典皇家理工学院博士研究生在读；1993 年 08 月至 2002 年 12 月，任瑞典爱立信总部无线网络与系统研发中心研发工程师、项目经理、资深专家、技术总监；2002年 12 月至 2005 年 12 月，任瑞典林雪平大学教授、博士生导师，瑞典皇家理工学院博士生导师；2006 年 01 月至 2008 年 12 月，任上海联合通信有限公司技术总监；2009 年 01 月至 2014 年 12 月，任瑞典皇家理工学院博士生导师；2015 年 01 月至今，任有限公司董事长、总经理。现任股份公司第一届董事会董事长兼总经理。');
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('16', '王俊生', '副总经理',
        '本科学历，曾任多家国企领导管理岗位、地方政府领导管理工作，具有三十多年的领导管理工作经验，良好的地方政府沟通协调能力，现任威泊股份副总经理，主要负责公司的渠道开发和管理。');


-- 财务数据（最近2-3年）
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('16', '2022', '5752.675555', '88.219998', '2193.055359', '2550.723282');
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('16', '2021', '3992.326970', '-17.317998', '2104.835361', '171.400466');
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('16', '2020', '1868.637243', '61.277184', '2122.153359', '294.543761');

-- 股东信息
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('16', '刘跃进', '71.83%');
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('16', '王华礼', '11.58%');
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('16', '上海威充新能源', '15.00%');
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('16', '吴晓龙', '1.60%');


-- BP信息
INSERT INTO "LY_BP_INFO" ("PROJECT_ID", "FILE", "FILE_PATH")
VALUES ('16', '', 'https://www.china-see.com/marketServiceDetail.do?articleId=664974324&articleType=trz_fw');

-- 项目信息
INSERT INTO "LY_PROJECT_INFO" ("ID", "PROJECT_NAME", "FINANCING_TYPE", "NEED_MONEY", "STAGE", "PROJECT_INFO",
                               "DEPT_CODE", "SERVICE_ID", "METHOD")
VALUES ('16', '研发及生产基地建设', '股权融资', '5000万-1亿', '4', '1. 建设自有生产基地3000~5000万元；（目前主要是以代加工为主）；
2. 团队扩建1000~2000万元；
3. 加大科研投入1000~3000万元。', '', 'svc1d56322aa6da4f85e165947a795bbe5a6159951701298bdec5bc1769', 'updateProject');

