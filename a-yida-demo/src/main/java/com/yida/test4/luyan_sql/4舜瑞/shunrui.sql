-- 企业基本信息
INSERT INTO "LY_BASE_INFO" ("PROJECT_ID", "COMPANY_NAME", "SHORT_NAME", "CREDIT_CODE", "LEGAL_PERSON",
                            "REGISTER_TIME", "REAL_CAPITAL", "WEBSITE", "AREA", "ADDRESS", "LOGO", "LOGO_URL",
                            "TAGS", "REG_USER_NAME", "REG_USER_TITLE", "IS_REG_USER_MANAGER", "CONTACTS_PHONE",
                            "CONTACTS_NAME", "CONTACTS_TITLE", "CONTACTS_EMAIL", "COMPANY_INFO")
VALUES ('23', '上海舜睿新材料股份有限公司', '舜睿新材', '91310114055052668R', '卜永生',
        TO_DATE('2012-09-27 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '500', 'http://shgrjc.com/', '上海市,闵行区',
        '上海市闵行区金都路 4299 号 6 幢', ' ',
        'https://www.china-see.com/images/202307shunrui_log.png', '70,80', '万云花', '董事、董事会秘书、财务总监', '1',
        '02160672126', '万云花', '董事、董事会秘书、财务总监', 'buyongsheng8621@163.com',
        '公司是一家专业研发、设计和销售建筑装饰环保新材料的高新技术企业。产品包括 PVC、橡胶、亚麻等各类家居装饰材料。广泛应用于办公楼，厂房，酒店，学校，医院，养老院，幼儿园，健身房，体育馆，图书馆，博物馆，展览馆，影院等精装修场所。公司本着以人为本，服务至上的经营理念，已为微软，思科，汉堡王，香格里拉酒店，万豪酒店，上海电气，上汽集团，VOLVO汽车，SOHO中国等多家世界五百强及知名建筑工程企业提供优质的产品，同时公司拥有技术可靠，真诚服务的安装及售后团队。');


-- 核心团队
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('23', '卜永生', '董事长、总经理',
        '卜永生 男，1981 年 5 月出生，中国籍，无境外永久居留权，毕业于上海开放大学工商管理专业，大专学历，初级职称。2003 年 3 月至 2006 年 5 月，任上海开启装饰有限公司销售代表；2006 年 6 月至 2009 年 6 月，任信益陶瓷（中国）有限公司上海分公司销售代表，家装部主管；2009 年 10 月至 2011 年 3 月，任上海普哲建筑材料有限公司公司区域经理，销售总监；2011 年 5 月至 2012 年 9月，任上海鸿举新型建材有限公司总经理；2012 年 9 月至今，任上海歌锐建筑装饰材料有限公司总经理。现任股份公司第一届董事会董事长、总经理。');
INSERT INTO "LY_CORE_TEAM_INFO" ("PROJECT_ID", "NAME", "TITLE", "EXPERIENCE")
VALUES ('23', '万云花', '董事、董事会秘书、财务总监',
        '万云花 女，1981 年 12 月出生，中国籍，无境外永久居留权，毕业于安徽省巢湖市夏阁中学，高中学历，无职称。2005 年 4 月至 2011 年 1 月，任上海恒美钢结构工程有限公司销售助理；2011 年 5 月至 2012 年 9 月，任上海鸿举新型建材有限公司行政主管；2012 年 9 月至今，任上海歌锐建筑装饰材料有限公司财务总监。现任股份公司第一届董事会董事、董事会秘书、财务总监。');


-- 财务数据（最近2-3年）
VALUES ('23', '2021', '3805.600801', '38.119218', '1361.168368', '724.778851');
INSERT INTO "LY_FINANCE_DATA_INFO" ("PROJECT_ID", "TIME", "INCOME", "NETPROFIT", "ASSETS", "LIABILITY")
VALUES ('23', '2020', '1011.626524', '40.445381', '823.115788', '224.845489');

-- 股东信息
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('23', '卜永生', '98.00%');
INSERT INTO "LY_SHAREHOLDER_INFO" ("PROJECT_ID", "SHAREHOLDER_NAME", "PROPORTION")
VALUES ('23', '万云花', '2.00%');


-- BP信息
INSERT INTO "LY_BP_INFO" ("PROJECT_ID", "FILE", "FILE_PATH")
VALUES ('23', '', 'https://www.china-see.com/images/202307Shunrui.pdf');

-- 项目信息
INSERT INTO "LY_PROJECT_INFO" ("ID", "PROJECT_NAME", "FINANCING_TYPE", "NEED_MONEY", "STAGE", "PROJECT_INFO",
                               "DEPT_CODE", "SERVICE_ID", "METHOD")
VALUES ('23', '环保型阻燃PVC地板研发及生产技术', '股权融资', '500-1000万', '4', '环保型阻燃PVC地板研发及生产技术，是基于我司积累的大量工艺参数和行业技术经验，自主研发设计了一种环保型阻燃PVC地板制备技术。经过多年的生产实践和多种不同配方的筛选，我们实现以低烟无毒阻燃剂为主要原料的阻燃地板，克服了行业现有的阻燃地板的不足之处。创新性的选用超薄的光学淋膜层设置，在地板表层形成透明耐磨层，其耐磨转数可达30000转，远超传统的强化木地板的6000至12000转，有效的提升了产品的耐磨度，使用寿命一般为20-30年，较传统地板使用周期有大幅提升。通过聚氯乙烯、聚对苯二甲酸乙二醇酯、ABS树脂等原料的使用，提高了材料的电绝缘性能和抗静电性能，同时利用氢氧化镁、硼酸盐等阻燃剂，及玻璃纤维和聚酰亚胺等材料，实现了较好的阻燃性能和耐热性能，从而更好地解决了现有PVC板的抗静电，阻燃性较差的缺点。', '', 'svc1d56322aa6da4f85e165947a795bbe5a6159951701298bdec5bc1769', 'regProject');

