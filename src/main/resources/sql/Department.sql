-- auto Generated on 2019-07-22 14:02:45 
-- DROP TABLE IF EXISTS `department`; 
CREATE TABLE `department`(
    `id` BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `dep_name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'dep_name',
    `dep_phone` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'dep_phone',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`department`';
