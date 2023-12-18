-- 企业基本信息
INSERT INTO "LY_BASE_INFO" ("PROJECT_ID", "COMPANY_NAME", "SHORT_NAME", "CREDIT_CODE", "LEGAL_PERSON",
                            "REGISTER_TIME", "REAL_CAPITAL", "WEBSITE", "AREA", "ADDRESS", "LOGO", "LOGO_URL",
                            "TAGS", "REG_USER_NAME", "REG_USER_TITLE", "IS_REG_USER_MANAGER", "CONTACTS_PHONE",
                            "CONTACTS_NAME", "CONTACTS_TITLE", "CONTACTS_EMAIL", "COMPANY_INFO")
VALUES ('22', '上海罗克环控节能科技股份有限公司', '罗克节能', '91310000703022513J', '黄跃弟',
        TO_DATE('2000-12-13 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '900', 'http://www.rock-hvac.com/', '上海市,奉贤区',
        '上海市奉贤区南桥镇南亭公路 303 号 1 幢 301 室', ' ',
        'https://www.china-see.com/images/202307luoke_logo.png', '91,369', '夏磊', '董事会秘书', '1',
        '18916741566', '夏磊', '董事会秘书', 'l.xia@rock-hvac.com',
        '公司专注于为客户提供环境控制系统集成服务，主要包括：中央空调系统设计、施工、维保一站式服务，中央空调设备研发、销售，空气和水净化处理。公司主营业务为环境控制系统的研发、设计、销售、安装、维修，具体可分为环境控制系统集成服务及环控产品的销售两大类。公司业务以工艺性环控系统集成服务为主，具有技术门槛较高、专业性强的特点。');


-- 核心团队
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('22', '黄跃弟', '董事、董事长、总经理',
        '黄跃弟，男，1965 年出生，中国国籍，无境外永久居留权，汉族，MBA 硕士研究生学历。1984 年 7 月至 1987 年 2 月期间任上海通惠机器厂技术员、暖通工程师；1987 年2 月至 2003 年 3 月期间历任上海通惠－开利空调设备有限公司工程师、计划主管、部门经理、产品经理；2003 年 4 月至 2014 年 7 月期间任上海罗克空调系统工程有限公司法人代表、总经理。现任公司董事、董事长、总经理，由创立大会暨第一次临时股东大会、董事会选举产生，任期三年（2014 年 7 月 30 日至 2017 年 7 月 29 日）。');
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('22', '夏磊', '董事会秘书',
        '夏磊,1988 年出生,中国国籍,无境外永久居留权，上海交通大学 MBA 毕业。2008年 2 月至 2010 年 10 月期间任上海润莱投资管理有限公司销售代表；2010 年 10 月至 2013年 12 月期间任上海罗克空调系统工程有限公司总经理助理；2014 年 1 月至 2014 年 7月任上海罗克空调系统工程有限公司物料管理部副经理兼上海罗克空调节能技术有限公司法定代表人。2014 年 7 月起，任股份公司董事会秘书，由第一届董事会第一次会议聘任，任期三年（2014 年 7 月 30 日至 2017 年 11 月 29 日。');
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('22', '何萍', '财务负责人',
        '何萍，1979 年出生，中国国籍，无境外永久居留权，大专学历。2003 年 6 月至2005 年 7 月任上海食品销售出纳员；2005 年 9 月至 2008 年 4 月任海轩木业财务兼会计助理；2008 年 5 月至 2010 年 5 月任星本机电财务兼会计助理；2010 年 5 月至 2014 年 6月任冷艺展览展示财务主管兼总帐主管；2014 年 7 月至今任上海罗克空调系统工程有限公司会计经理兼会计主管。2014 年 7 月起，任股份公司财务负责人，由第一届董事会第一次会议聘任，任期三年（2014 年 7 月 30 日至 2017 年 11 月 29 日）');


-- 财务数据（最近2-3年）
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('22', '2022', '3781.885833', '91.450938', '5487.81302', '3244.30153');
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('22', '2021', '8093.757807', '230.872708', '5770.037457', '3699.878422');
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('22', '2020', '8071.695798', '101.448362', '7939.161135', '6090.317659');

-- 股东信息
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('22', '黄跃弟', '95.00%');
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('22', '钟秀云', '5.00%');


-- BP信息
INSERT INTO "LY_BP_INFO" ("PROJECT_ID", "FILE", "FILE_PATH")
VALUES ('22', '', 'https://www.china-see.com/images/202307luoke.pdf');

-- 项目信息
INSERT INTO "LY_PROJECT_INFO" ("ID", "PROJECT_NAME", "FINANCING_TYPE", "NEED_MONEY", "STAGE", "PROJECT_INFO",
                               "DEPT_CODE", "SERVICE_ID", "METHOD")
VALUES ('22', '罗沄富氧抗菌AOA技术', '股权融资', '1000-3000万', '3', '开发并应用AOA富氧抗菌技术，实现空气净化，释放负氧离子，并有效消灭新冠病毒。凭借20年环保领域经验，我司致力于人类呼吸安全保障。
项目基于“6恒健康环境系统”——恒安、恒绿、恒净、恒温、恒湿、恒氧，营造健康舒适的室内环境。我们提供高品质室内健康环境方案，优化生产和生活环境，精准控制空气参数，提高生产环境健康水平、生产效率和产品品质，降低生产能耗，推动企业可持续发展。
AOA技术利用纳米冷触媒技术，分解有害气体，提高负氧离子浓度，达到常态化空间防疫。公司也提供升级传统中央空调服务，让室内环境更安全、健康、舒适。此外，也研发了一系列产品，如空调富氧抗菌系列、空气消毒机系列等，将节能环保、空气处理等创新技术与服务结合，为客户提供绿色节能和室内环境控制科技集成服务。', '', 'svc1d56322aa6da4f85e165947a795bbe5a6159951701298bdec5bc1769', 'regProject');

