USE [MybatisDB]
GO
/****** Object:  Table [dbo].[tb_lecture]    Script Date: 2017/6/23 13:55:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_lecture](
	[id] [varchar](36) NOT NULL,
	[lecture_name] [varchar](60) NOT NULL,
	[lecture_no] [varchar](50) NOT NULL,
	[remark] [varchar](1024) NOT NULL,
 CONSTRAINT [PK_tb_lecture] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_role]    Script Date: 2017/6/23 13:55:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_role](
	[id] [varchar](36) NOT NULL,
	[role_name] [varchar](60) NOT NULL,
	[remark] [varchar](1024) NOT NULL,
 CONSTRAINT [PK_tb_role] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_student]    Script Date: 2017/6/23 13:55:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_student](
	[id] [varchar](36) NOT NULL,
	[name] [varchar](50) NOT NULL,
	[sex] [int] NOT NULL,
	[card_no] [varchar](50) NOT NULL,
	[student_no] [varchar](50) NOT NULL,
	[remark] [varchar](1024) NOT NULL,
 CONSTRAINT [PK_tb_student] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_student_card]    Script Date: 2017/6/23 13:55:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_student_card](
	[id] [varchar](36) NOT NULL,
	[student_id] [varchar](36) NOT NULL,
	[native] [varchar](50) NOT NULL,
	[issue_date] [date] NOT NULL,
	[end_date] [date] NOT NULL,
	[remark] [varchar](1024) NOT NULL,
	[no] [varchar](50) NOT NULL,
 CONSTRAINT [PK_tb_student_card] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_student_health_female]    Script Date: 2017/6/23 13:55:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_student_health_female](
	[id] [varchar](36) NOT NULL,
	[no] [varchar](50) NOT NULL,
	[student_id] [varchar](36) NOT NULL,
	[check_date] [date] NOT NULL,
	[heart] [varchar](50) NOT NULL,
	[liver] [varchar](50) NOT NULL,
	[lung] [varchar](50) NOT NULL,
	[kidney] [varchar](50) NOT NULL,
	[uterus] [varchar](50) NOT NULL,
	[remark] [varchar](1024) NULL,
 CONSTRAINT [PK_tb_student_health_female] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_student_health_male]    Script Date: 2017/6/23 13:55:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_student_health_male](
	[id] [varchar](36) NOT NULL,
	[no] [varchar](50) NOT NULL,
	[student_id] [varchar](36) NOT NULL,
	[check_date] [date] NOT NULL,
	[heart] [varchar](50) NOT NULL,
	[liver] [varchar](50) NOT NULL,
	[lung] [varchar](50) NOT NULL,
	[kidney] [varchar](50) NOT NULL,
	[spleen] [varchar](50) NOT NULL,
	[prostate] [varchar](50) NOT NULL,
	[remark] [varchar](1024) NULL,
 CONSTRAINT [PK_tb_student_health_male] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_student_lecture]    Script Date: 2017/6/23 13:55:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_student_lecture](
	[id] [varchar](36) NOT NULL,
	[student_id] [varchar](36) NOT NULL,
	[lecture_id] [varchar](36) NOT NULL,
	[grade] [varchar](50) NOT NULL,
	[no] [varchar](50) NOT NULL,
	[remark] [varchar](1024) NOT NULL,
 CONSTRAINT [PK_tb_student_lecture] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_user]    Script Date: 2017/6/23 13:55:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_user](
	[user_no] [varchar](50) NOT NULL,
	[user_name] [varchar](60) NOT NULL,
	[id] [varchar](36) NOT NULL,
	[phone] [varchar](20) NOT NULL,
	[sex] [int] NOT NULL,
	[email] [varchar](60) NOT NULL,
	[remark] [varchar](1024) NOT NULL,
 CONSTRAINT [PK_tb_user] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_user_role]    Script Date: 2017/6/23 13:55:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_user_role](
	[user_id] [varchar](36) NOT NULL,
	[role_id] [varchar](36) NOT NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
