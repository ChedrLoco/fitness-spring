INSERT INTO `fitness`.`roles` (`version`, `role`) VALUES ('0', 'USER');
INSERT INTO `fitness`.`roles` (`version`, `role`) VALUES ('0', 'ADMIN');

INSERT INTO `fitness`.`users` (`version`, `username`, `password`, `enabled`) VALUES ('0', 'bob@aol.com', '$2a$10$8jBGVl3r1DCCHqLHUabm2uV3IT8tA2p8yfYmR7Lru1QcspIYwrf8S', '1');

INSERT INTO `fitness`.`roles_users` (`role_id`, `user_id`) VALUES ('1', '1');
INSERT INTO `fitness`.`roles_users` (`role_id`, `user_id`) VALUES ('2', '1');

INSERT INTO `fitness`.`profiles` (`version`, `user_id`, `gender`, `age`, `height`, `weight`) VALUES ('0', '1', 'M', '50', '245', '63');