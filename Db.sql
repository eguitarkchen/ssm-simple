CREATE TABLE `user` (
`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
`email` varchar(255) NOT NULL COMMENT '用户邮箱',
`username` varchar(255) NOT NULL COMMENT '用户昵称',
`password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
`regTime` datetime NOT NULL COMMENT '注册时间',
PRIMARY KEY (`id`),
UNIQUE KEY `email` (`email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8