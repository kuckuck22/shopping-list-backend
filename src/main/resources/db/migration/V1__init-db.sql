CREATE TABLE `shoppingitem` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL DEFAULT NULL,
  `amount` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  COLLATE='utf8_general_ci'
  ENGINE=InnoDB
;

CREATE USER 'shopping-user'@'%' IDENTIFIED BY 'start123';
GRANT USAGE ON *.* TO 'shopping-user'@'%';
GRANT SELECT, DELETE, INSERT, UPDATE  ON `shopping-list`.* TO 'shopping-user'@'%';
