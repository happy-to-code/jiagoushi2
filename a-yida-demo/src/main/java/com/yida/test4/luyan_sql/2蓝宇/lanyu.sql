-- 企业基本信息  缺邮箱（done）
INSERT INTO "LY_BASE_INFO" ("PROJECT_ID", "COMPANY_NAME", "SHORT_NAME", "CREDIT_CODE", "LEGAL_PERSON",
                            "REGISTER_TIME", "REAL_CAPITAL", "WEBSITE", "AREA", "ADDRESS", "LOGO", "LOGO_URL",
                            "TAGS", "REG_USER_NAME", "REG_USER_TITLE", "IS_REG_USER_MANAGER", "CONTACTS_PHONE",
                            "CONTACTS_NAME", "CONTACTS_TITLE", "CONTACTS_EMAIL", "COMPANY_INFO")
VALUES ('21', '上海蓝宇水处理股份有限公司', '蓝宇股份', '913101157465226000', '袁树东',
        TO_DATE('2003-01-21 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '500', 'http://www.shlanyu.cn/', '上海市,浦东新区',
        '中国（上海）自由贸易试验区碧波路518号1幢 204室', ' ',
        'https://www.china-see.com/images/202307lanyu_log.png', '47,50,54', '陈正', '董事会秘书', '1',
        '021-5830830', '陈正', '董事会秘书', '13916235777@139.com',
        '上海蓝宇水处理股份有限公司（上股交代码:300141）是专注泳池及医废水处理领域的专业设计、工程施工、设备及化学品销售、水质托管整体解决方案服务商。蓝宇自研生产化学品、多介质过滤器、自由基发生器、水质监测仪、自动加药器、大数据管理平台、全自主知识产权国家高新技术，专精特新、工匠企业。蓝宇"水管家"为江浙沪80%的知名场馆提供洁净、安全、健康的水质服务。是第一个（001）获得国家体育总局游泳池水处理服务NSCC认证的企业。');


-- 核心团队
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('21', '袁树东', '董事长、总经理',
        '袁树东，男，1972 年 2 月出生，中国国籍，无境外永久居留权，1986 年 6月至 1992 年 12 月，在江苏省江都区丁沟镇从事玻璃仪器工作；1993 年 1 月至1999 年 5 月，在上海浦东新区泾南新村从事水电维修工作；1999 年 6 月至 2003年 11 月，从事泳池药剂销售工作；2003 年 12 月至今任上海蓝宇水处理有限公司执行董事、总经理。2011 年被中国游泳协会聘为水质培训讲师，2011 年 8 月参与编写《公共浴池水质标准 CJ/T325-2010》，2015 年 6 月参与起草《公共泳池场所卫生管理规范 DB31》（上海地方标准），2015 年 12 月被评为全国泳池水处理技术研发中心专家，同时担任国家职业技能鉴定考评员；2016 年 12 月参与编写、修订《游泳池水质标准 CJ/T244-2016》。现任股份公司董事长、总经理。');
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('21', '高建秋', '董事、财务总监',
        '高建秋，女，1955 年 07 月出生，中国国籍，无境外永久居留权，毕业于四川凉山彝族自治州财贸学校，中专学历。1990 年至 2002 年，任四川长虹电器股份有限公司财务经理；2003 年至 2010 年，任上海长虹空调销售有限公司财务总监；现任股份公司第一届董事会董事、财务总监。');
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('21', '周洁', '董事会秘书',
        '周洁，女，1987 年 6 月出生，中国国籍，无境外永久居留权，毕业于上海立信会计学院会计专业，专科学历。2007 年至 2009 年，任上海意彩建材有限公司经理助理；2010 年至 2012 年，任上海柳嘉山环境科技有限公司总经理助理；2013 年至 2016 年，任上海市建筑装饰工程集团有限公司项目助理；2016年至今，任公司采购部经理。现任股份公司董事会秘书。');


-- 财务数据（最近2-3年）
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('21', '2021', '2171.323044', '6.783519', '2192.130441', '1002.027307');
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('21', '2020', '1669.732764', '61.543992', '2002.396604', '818.420925');

-- 股东信息
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('21', '袁树东 ', '70.00%');
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('21', '赵秀梅', '30.00%');


-- BP信息
INSERT INTO "LY_BP_INFO" ("PROJECT_ID", "FILE", "FILE_PATH")
VALUES ('21', '', 'https://www.china-see.com/images/202307Lanyu.pdf');

-- 项目信息
INSERT INTO "LY_PROJECT_INFO" ("ID", "PROJECT_NAME", "FINANCING_TYPE", "NEED_MONEY", "STAGE", "PROJECT_INFO",
                               "DEPT_CODE", "SERVICE_ID", "METHOD")
VALUES ('21', '蓝宇水处理技术', '股权融资', '1000-3000万', '3', '解决游泳池和医疗废水处理等场景中中遇到的挑战。提供一系列高效过滤器、纳米级消毒设备和自动加药系统，通过自主研发的智能物联系统，我们可以做到全自动监控和药剂投加，降低刺激性和事故风险。对于医疗废水处理，蓝宇解决方案能够应对处理难度大、混杂大量的医疗废弃的水溶性物质、细菌和病毒等问题，改善当前的处理状况。', '', 'svc1d56322aa6da4f85e165947a795bbe5a6159951701298bdec5bc1769', 'regProject');

