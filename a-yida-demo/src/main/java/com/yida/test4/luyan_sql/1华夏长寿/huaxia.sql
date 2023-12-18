-- 企业基本信息
INSERT INTO "LY_BASE_INFO" ("PROJECT_ID", "COMPANY_NAME", "SHORT_NAME", "CREDIT_CODE", "LEGAL_PERSON",
                            "REGISTER_TIME", "REAL_CAPITAL", "WEBSITE", "AREA", "ADDRESS", "LOGO", "LOGO_URL",
                            "TAGS", "REG_USER_NAME", "REG_USER_TITLE", "IS_REG_USER_MANAGER", "CONTACTS_PHONE",
                            "CONTACTS_NAME", "CONTACTS_TITLE", "CONTACTS_EMAIL", "COMPANY_INFO")
VALUES ('20', '华夏长寿（上海）科技股份有限公司', '华夏长寿', '91310112MAC0XRY689', '申艳',
        TO_DATE('2022-10-13 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '500', ' ', '上海市,闵行区',
        '上海市闵行区中春路988号11幢2楼', ' ',
        'https://www.china-see.com/images/202307huaxia_log.jpg', '61,63', '娄亚丽', '董事、董事会秘书', '1',
        '13596171212', '娄亚丽', '董事、董事会秘书', '13596171212@163.com',
        '华夏长寿（上海）科技股份有限公司（股票代码：300533.SEE，简称“华夏长寿” ）由博远·祥祉圆养老养生产业园总裁万恩发起成立，创立于2022年10月，其前身是博远·祥祉圆养老养生产业园科技研发部，在科技赋能养老服务领域深耕了七年，是一家依靠先进科学技术赋能实体养老服务的智慧养老平台企业。');


-- 核心团队
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('20', '娄亚丽', '董事、董事会秘书、人事负责人',
        '娄亚丽，女，1987年3月出生，中国国籍，无境外永久居留权，毕业于长春财经学院，工商管理专业，硕士研究生学历。2014年11月至2020年8月，任吉林紫鑫药业股份有限公司海外事部部长；2020年8月至2021年6月，任长春市运通商贸有限公司总经理；2021年6月至今，任吉林省博远养老产业开发有限公司副总经理。现任华夏长寿（上海）科技股份有限公司董事、董事会秘书、人事负责人。');
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('20', '申艳', '董事、财务总监',
        '申艳，女，1971年12月出生，中国国籍，无境外永久居留权，毕业于东北师范大学心理学专业，大学本科学历。2008年8月至2018年12月，任吉林省心理教育协会副秘书长；2018年12月至2022年10月，任吉林省心理教育协会秘书长；2018年12月至今，任吉林省博远养老产业开发有限公司财务经理。现任华夏长寿（上海）科技股份有限公司董事、财务总监。');


-- 财务数据（最近2-3年）
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('20', '2022', '1450.5196', '-84.901293', '1995.773432', '1495.735211');
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('20', '2021', '1635.375226', '363.384067', '1645.202137', '1193.126061');
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('20', '2020', '855.966358', '-38.275233', '1131.536941', '1042.844932');

-- 股东信息
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('20', '上海聚龙嘉企业管理咨询有限公司', '75.00%');
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('20', '上海万利兴企业管理咨询合伙企业（有限合伙）', '10.00%');
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('20', '申莉', '10.00%');
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('20', '刘子贤', '5.00%');


-- BP信息
INSERT INTO "LY_BP_INFO" ("PROJECT_ID", "FILE", "FILE_PATH")
VALUES ('20', '', 'https://www.china-see.com/images/202307huaxia.pdf');

-- 项目信息
INSERT INTO "LY_PROJECT_INFO" ("ID", "PROJECT_NAME", "FINANCING_TYPE", "NEED_MONEY", "STAGE", "PROJECT_INFO",
                               "DEPT_CODE", "SERVICE_ID", "METHOD")
VALUES ('20', '一站式智慧养老服务平台', '股权融资', '100-500万', '4', '华夏长寿项目致力于构建一站式智慧养老服务平台，科学系统的服务体系覆盖养老、养生、医疗、康复、心理、娱乐等领域，满足老年人全方位需求。项目重视人才培训与标准化管理，推进养老服务流程化、标准化。引入元宇宙智慧平台，利用先进智能设备和数字化手段实现养老服务的管理和标准化，进一步实现可复制化。华夏长寿创新性地提供了多元化养老模式，包括健康型养老、医疗性养老、旅居养老、学习型养老，以及居家养老、日间照料、短住托养等，满足不同长者的个性化需求。以物联网、互联网、元宇宙、大数据、人工智能为核心技术，构建养老行业全生命周期闭环生态开放平台，赋能全国养老机构，为老年人提供全方位智能养老服务，结合科学、人性化的服务与前沿技术，应对老龄化社会的挑战。', '', 'svc1d56322aa6da4f85e165947a795bbe5a6159951701298bdec5bc1769', 'regProject');

