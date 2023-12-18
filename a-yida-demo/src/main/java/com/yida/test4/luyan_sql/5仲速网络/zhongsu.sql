-- 企业基本信息   缺少logo（done）
INSERT INTO "LY_BASE_INFO" ("PROJECT_ID", "COMPANY_NAME", "SHORT_NAME", "CREDIT_CODE", "LEGAL_PERSON",
                            "REGISTER_TIME", "REAL_CAPITAL", "WEBSITE", "AREA", "ADDRESS", "LOGO", "LOGO_URL",
                            "TAGS", "REG_USER_NAME", "REG_USER_TITLE", "IS_REG_USER_MANAGER", "CONTACTS_PHONE",
                            "CONTACTS_NAME", "CONTACTS_TITLE", "CONTACTS_EMAIL", "COMPANY_INFO")
VALUES ('24', '上海仲速网络科技股份有限公司', '仲速网络', '91310118MA1JLJ6Y9M', '于通',
        TO_DATE('2016-10-11 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '600', 'http://www.linkzonetel.net/', '上海市,宝山区',
        '上海市宝山区锦乐路947号1幢A3754室', ' ',
        'https://www.china-see.com/images/202307zhongsu_logo.png', '48,53', '周莹', '董事会秘书', '1',
        '15386417019', '周莹', '董事会秘书', 'yutong@llland.com',
        '2017年9月1日公司获得《中华人民共和国增值电信业务经营许可证》，经营许可证编号：Bl-20172156，业务覆盖范围（服务项目）为：上海1直辖市含网站接入，北京、江苏、浙江、广东、重庆5省（直辖市）不含网站接入，有效期至2022年9月1日。公司扎根于互联网宽带运营，投资兴建基础网络，搭建城市环网。同时，公司是一家专业为设计制造、零售服务、教育培训等行业提供虚拟化和云桌面服务的整体方案提供商和服务商。包括从桌面端到网络、存储的系统架构咨询，软硬件增值产品的采购，集成方案的实施和维护服务以及相关设备和服务的租赁等。');


-- 核心团队
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('24', '于通', '董事长',
        '于通，男，1980年2月出生，中国国籍，无境外永久居留权，毕业于瑞士理诺士国际酒店管理学院酒店管理专业，学士学位。2003年1月至2005年3月，任香港新世界集团广州分公司客户经理；2005年4月至2006年3月，任香港新世界保险经纪公司上海分公司副总经理；2006年4月至2008年9月，任伟莱保险经纪公司业务拓展部副总监；2008年10月至今，任仲益控股集团公关关系事业部总监。现任股份公司第一届董事会董事长。');
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('24', 'LIU SHI YANG', '董事、总经理',
        'LIU SHI YANG，男，1981年7月出生，澳大利亚国籍，毕业于美国南加州大学商学院工商管理专业，学士学位。2008年8月至2011年1月曾任上海仲盛虹桥房地产开发公司执行董事；2011年2月至2015年6月，任上海乔华房产经营管理有限公司董事总经理；2015年7月至2018年6月，任仲益集团控股有限公司总裁；2018年7月至今，任上海仲益体育场馆管理有限公司董事长、北京联众国际通信有限公司董事。现任股份公司第一届董事会董事、总经理。');
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('24', '忻一亮', '财务总监',
        '忻一亮，男，1983年5月出生，中国国籍，无境外永久居留权，毕业于上海海洋大学物业管理专业，大专学历。2007年4月至2015年1月，任上海诚成物业管理有限公司会计；2015年2月至2020年10月，任上海乔华房产经营管理有限公司会计。现任上海仲速网络科技股份有限公司财务总监。');
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('24', '周莹', '董事会秘书',
        '周莹，女，1993年12月出生，中国国籍，无境外永久居留权，毕业于中南林业科技大学森林工程专业，本科学历，工学学士学位。2016年11月至2017年10月，任上海仲速网络科技有限公司综合运营助理；2017年11月至今，任上海仲速网络科技有限公司综合管理部部门主管。现任股份公司第一届董事会秘书。');


-- 财务数据（最近2-3年）
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('24', '2022', '315.740024', '-805.858522', '1348.732623', '1743.943571');
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('24', '2021', '630.119498', '-475.605211', '2035.499939', '1624.852365');
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('24', '2020', '653.089964', '-620.05888', '1249.825157', '763.572372');

-- 股东信息
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('24', '上海亘能网络科技有限公司', '70.00%');
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('24', '上海仲益实业发展有限公司', '20.00%');
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('24', '上海百容网络科技合伙企业（有限合伙）', '10.00%');


-- BP信息
INSERT INTO "LY_BP_INFO" ("PROJECT_ID", "FILE", "FILE_PATH")
VALUES ('24', '', 'https://www.china-see.com/images/202307Zhongsu.pdf');

-- 项目信息
INSERT INTO "LY_PROJECT_INFO" ("ID", "PROJECT_NAME", "FINANCING_TYPE", "NEED_MONEY", "STAGE", "PROJECT_INFO",
                               "DEPT_CODE", "SERVICE_ID", "METHOD")
VALUES ('24', '稚果云电脑 3.0', '股权融资', '500-1000万', '3', '稚果云电脑3.0是一款支持144hz高频高帧率的云电脑服务，通过优化算法，减少带宽应用和撕裂，提供在7毫秒内的显示输出延迟，实现低延迟体验。技术优势包括：优化的远端渲染和编解码技术，确保了最佳的感观体验；全面解耦的系统、应用和数据，强化了数据安全；弹性、动态的资源调度技术，以及本地化键鼠功能，确保了鼠标落位准确和键盘反应快速。稚果云电脑3.0支持多地、多机房、集群部署方式，可适应云端或本地私有化部署，满足不同用户的需求。其节省成本和简化运维的特性使得总体拥有成本（TCO）相比传统PC节省了30%以上，同时能耗降低了80%。其小巧的体积（仅两幅扑克牌大小）以及账号在任意终端登录的能力，提供了极高的移动性。此外，稚果云电脑3.0在产业园/孵化器、教育、设计、医疗等多个行业都有应用，并提供了客厅云电脑云电竞高性能云图站等创新方案。', '', 'svc1d56322aa6da4f85e165947a795bbe5a6159951701298bdec5bc1769', 'regProject');

