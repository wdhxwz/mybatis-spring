CREATE TABLE sys_user
(
  id BIGINT NOT NULL  AUTO_INCREMENT COMMENT '用户id',
  user_name VARCHAR(50) COMMENT  '用户名',
  user_password VARCHAR(50) COMMENT '密码',
  user_email VARCHAR(50) COMMENT '邮箱',
  user_info VARCHAR(250) COMMENT '简介',
  head_img VARCHAR(50) COMMENT '头像',
  create_time DATETIME COMMENT '创建时间',
  PRIMARY KEY(id)
);
ALTER  TABLE sys_user COMMENT '用户表';

CREATE TABLE sys_role
(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '角色id',
  role_name VARCHAR(50) COMMENT '角色名称',
  enabled INT COMMENT '有限标致',
  create_by BIGINT COMMENT '创建人',
  create_time DATETIME COMMENT '创建时间',
  PRIMARY KEY(id)
);
ALTER TABLE sys_role COMMENT '角色表';

CREATE TABLE sys_privilege
(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '权限id',
  privilege_name VARCHAR(50) COMMENT '权限名称',
  privilege_url VARCHAR(200) COMMENT '权限url',
  PRIMARY KEY(id)
);
ALTER TABLE sys_privilege COMMENT '权限表';

CREATE TABLE sys_user_role
(
  user_id BIGINT COMMENT '用户id',
  role_id BIGINT COMMENT '角色id'
);
ALTER TABLE sys_user_role COMMENT '角色用户关联表';

CREATE TABLE sys_role_privilege
(
  role_id BIGINT COMMENT '角色id',
  privilege_id BIGINT COMMENT '权限id'
);
ALTER TABLE sys_role_privilege COMMENT '角色权限表';

INSERT INTO `sys_user` VALUES ('1','admin','123456','admin@wangdh.com','管理员',null,'2018-02-05 16:01:01');
INSERT INTO `sys_user` VALUES ('1001','test','123456','test@wangdh.com','测试用户',null,'2018-02-05 16:01:01');

INSERT INTO `sys_role` VALUES ('1','管理员','1','1','2018-02-05 16:02:02');
INSERT INTO `sys_role` VALUES ('2','普通用户','1','1','2018-02-05 16:02:02');

INSERT INTO `sys_user_role` VALUES ('1','1');
INSERT INTO `sys_user_role` VALUES ('1','2');
INSERT INTO `sys_user_role` VALUES ('1001','2');

INSERT INTO `sys_privilege` VALUES ('1','用户管理','/users');
INSERT INTO `sys_privilege` VALUES ('2','角色管理','/roles');
INSERT INTO `sys_privilege` VALUES ('3','系统管理','/logs');
INSERT INTO `sys_privilege` VALUES ('4','人员管理','/persons');
INSERT INTO `sys_privilege` VALUES ('5','单位管理','/companies');

INSERT INTO `sys_role_privilege` VALUES ('1','1');
INSERT INTO `sys_role_privilege` VALUES ('1','2');
INSERT INTO `sys_role_privilege` VALUES ('1','3');
INSERT INTO `sys_role_privilege` VALUES ('1','4');
INSERT INTO `sys_role_privilege` VALUES ('1','5');
INSERT INTO `sys_role_privilege` VALUES ('2','4');
INSERT INTO `sys_role_privilege` VALUES ('2','5');