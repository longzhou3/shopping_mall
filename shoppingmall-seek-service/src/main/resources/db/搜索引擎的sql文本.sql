#创建 shopping_mall 数据库
DROP DATABASE IF EXISTS `shoppingMall`;
CREATE DATABASE IF NOT EXISTS `shoppingMall` CHARSET 'utf8';
#指向 shoppingMall 数据库
USE `shoppingMall`;
#创建 type(类型表)
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type`(
  `id` INT AUTO_INCREMENT UNIQUE COMMENT '类型id',
  `typeName` VARCHAR(50) COMMENT '类型名称'
)CHARSET 'utf8';
#添加数据
INSERT `type`(`typeName`) VALUES ('图书');
INSERT `type`(`typeName`) VALUES ('美妆');
INSERT `type`(`typeName`) VALUES ('乐器');
INSERT `type`(`typeName`) VALUES ('电器');
INSERT `type`(`typeName`) VALUES ('美妆');
INSERT `type`(`typeName`) VALUES ('家庭');
INSERT `type`(`typeName`) VALUES ('手机数码');
#创建 discount(折扣表)
DROP TABLE IF EXISTS `discount`;
CREATE TABLE `discount`(
  `id` INT AUTO_INCREMENT UNIQUE COMMENT '折扣id',
  `discountPrice` DECIMAL COMMENT '折扣价格',
  `discountIntroduce` VARCHAR(50) COMMENT '折扣介绍' DEFAULT '',
  `discountTypeId` INT COMMENT '折扣类型id_外键 Type(类型表)'DEFAULT 0
)CHARSET 'utf8';
INSERT `discount`(discountPrice) VALUES (5);
#SELECT * FROM discount;
#创建 commodity(商品表)
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity`(
  `id` INT AUTO_INCREMENT UNIQUE COMMENT '商品id',
  `commodityName` VARCHAR(20) COMMENT '商品名称',
  `commodityPrice` DECIMAL COMMENT '商品价格',
  `commodityIntroduce` VARCHAR(200) COMMENT '商品介绍',
  `commodityPictureUrl` VARCHAR(100) COMMENT '商品图片路径' DEFAULT '',
  `commodityNumber` INT COMMENT '商品数量'
)CHARSET 'utf8';
INSERT
  `commodity`(commodityName, commodityPrice, commodityIntroduce,  commodityNumber)
VALUES
  ('十万个为什么',20.00,'有益于儿童和少儿的书籍',10);
INSERT
  `commodity` (commodityName, commodityPrice, commodityIntroduce,  commodityNumber)
VALUES
  ('平底锅',38,'炒菜，红太狼打灰太狼，吃鸡必备神器',50);
INSERT
  `commodity`(commodityName, commodityPrice, commodityIntroduce, commodityNumber)
VALUES ('iphoneX',8888,'来自美国的手机',10);
#创建 commodityTypeRelation(商品分类关系表)
DROP TABLE IF EXISTS `commodityTypeRelation`;
CREATE TABLE `commodityTypeRelation`(
  `id` INT AUTO_INCREMENT UNIQUE COMMENT '商品分类关系id',
  `shopPrimaryTypeId` INT COMMENT '商品一级分类_外键 Type(类型表)',
  `shopMinorTypeId` INT COMMENT '商品二级分类_外键 Type(类型表)',
  `commodityId` INT COMMENT '商品Id_外键 Commodity(商品表)'
)CHARSET 'utf8';
# SELECT * FROM type;
# SELECT * FROM commodityTypeRelation;
# SELECT * from commodity;

INSERT
  commodityTypeRelation(shopPrimaryTypeId, shopMinorTypeId, commodityId)
VALUES (4,7,3);
