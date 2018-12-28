CREATE TABLE `user` (
`id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
`email` varchar(255) NOT NULL COMMENT 'email',
`username` varchar(255) NOT NULL,
`password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`regTime` datetime NOT NULL COMMENT 'register time',
PRIMARY KEY (`id`),
UNIQUE KEY `email` (`email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8
