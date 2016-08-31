CREATE TABLE `fitness`.`profiles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `version` INT NOT NULL DEFAULT 0,
  `user_id` INT NOT NULL,
  `gender` ENUM('M','F') NOT NULL,
  `age` INT NOT NULL,
  `height` INT NOT NULL DEFAULT 0,
  `weight` INT NOT NULL DEFAULT 0,
  `created` TIMESTAMP NOT NULL DEFAULT NOW(),
  `modified` TIMESTAMP NOT NULL DEFAULT NOW(),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_users_profile`
  FOREIGN KEY (`user_id`)
  REFERENCES `fitness`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);