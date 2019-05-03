 
/****** Object:  Table [dbo].[AppSetting]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE AppSetting(
	`Key` nvarchar(255) NOT NULL,
	`Value` nvarchar(255) NOT NULL
);

/****** Object:  Table [dbo].[Event]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE Event(
	`Id` int AUTO_INCREMENT NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`Version` bigint NOT NULL,
	`Title` nvarchar(255) NOT NULL,
	`SubsequentEventId` int NOT NULL,
	`SortOrder` int NOT NULL,
	`StartTime` nvarchar(50) NOT NULL,
	`EndTime` nvarchar(50) NOT NULL,
	`LocationName` nvarchar(255) NOT NULL,
	`LocationLatitude` Double NOT NULL,
	`LocationLongitude` Double NOT NULL,
	`DetailTemplateFilePath` nvarchar(255) NULL,
	`AdvertiseDate` nvarchar(50) NOT NULL,
	`LargeImageFilePath` nvarchar(255) NOT NULL,
	`MediumImageFilePath` nvarchar(255) NULL,
	`SmallImageFilePath` nvarchar(255) NULL,
	`LocationAddress` nvarchar(1000) NOT NULL,
	`Priority` int NOT NULL,
	`IsDelete` Tinyint NOT NULL,
	`CanBuyByOnlineBooking` Tinyint NOT NULL,
	`CanBuyByOnlinePayment` Tinyint NOT NULL,
	`CanBuyByPhoneBooking` Tinyint NOT NULL,
	`CanBuyByDirectSale` Tinyint NOT NULL,
	`NumberOfOutlet` int NOT NULL,
	`NumberOfUser` int NOT NULL
);

/****** Object:  Table [dbo].[EventMember]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
/* SET ANSI_PADDING ON */
 
CREATE TABLE EventMember(
	`Id` int AUTO_INCREMENT NOT NULL,
	`EventId` int NOT NULL,
	`UserId` int NOT NULL,
	`Role` varchar(50) NOT NULL,
	`OutletId` int NULL,
	`IsDelete` Tinyint NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`Version` bigint NOT NULL
);

/* SET ANSI_PADDING OFF */
 
/****** Object:  Table [dbo].[EventTicket]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE EventTicket(
	`Id` int AUTO_INCREMENT NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`EventId` int NOT NULL,
	`TicketTypeDescription` nvarchar(500) NOT NULL,
	`DiscountPercentage` Double NULL,
	`DiscountExpireDate` nvarchar(50) NULL,
	`MaximumNoOfTicket` int NOT NULL,
	`SoldOutNoOfTicket` int NOT NULL,
	`SaleCloseDate` nvarchar(50) NOT NULL,
	`SortOrder` int NOT NULL,
	`HoldingNoOfTicket` int NOT NULL,
	`IsDelete` Tinyint NOT NULL,
	`OnlineFeePercentage` Double NOT NULL
);

/****** Object:  Table [dbo].[EventTicketPricing]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE EventTicketPricing(
	`Id` int AUTO_INCREMENT NOT NULL,
	`EventId` int NOT NULL,
	`EventTicketId` int NOT NULL,
	`CurrencyId` int NOT NULL,
	`Price` Double NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`IsDelete` Tinyint NOT NULL
);

/****** Object:  Table [dbo].[Login]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE Login(
	`Id` int AUTO_INCREMENT NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`Email` nvarchar(255) NOT NULL,
	`Password` nvarchar(500) NOT NULL,
	`Provider` nvarchar(255) NULL,
	`IsDelete` Tinyint NOT NULL,
	`Version` bigint NOT NULL
);

/****** Object:  Table [dbo].[MasterCode]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE MasterCode(
	`Id` int AUTO_INCREMENT NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`Name` nvarchar(255) NOT NULL,
	`Description` nvarchar(500) NOT NULL,
	`ParentId` int NOT NULL,
	`CodeType` nvarchar(255) NOT NULL,
	`IsDelete` Tinyint NOT NULL,
	`Version` bigint NOT NULL
);

/****** Object:  Table [dbo].[Outlet]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE Outlet(
	`Id` int AUTO_INCREMENT NOT NULL,
	`EventId` int NOT NULL,
	`Name` nvarchar(255) NOT NULL,
	`Address` nvarchar(1000) NULL,
	`Phone` nvarchar(255) NULL,
	`IsDelete` Tinyint NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`Version` bigint NOT NULL
);

/****** Object:  Table [dbo].[OutletSalePaymentLedger]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE OutletSalePaymentLedger(
	`Id` int AUTO_INCREMENT NOT NULL,
	`TicketInOutletId` int NOT NULL,
	`Quantity` int NOT NULL,
	`PaidAmount` Double NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`Version` bigint NOT NULL,
	`IsDelete` Tinyint NOT NULL
);

/****** Object:  Table [dbo].[OutletTicketPricing]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE OutletTicketPricing(
	`Id` int AUTO_INCREMENT NOT NULL,
	`TicketInOutletId` int NOT NULL,
	`CurrencyId` int NOT NULL,
	`Price` Double NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`IsDelete` Tinyint NOT NULL
);

/****** Object:  Table [dbo].[PaymentTransactionLog]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE PaymentTransactionLog(
	`OrderNo` nvarchar(50) NOT NULL,
	`Parameter` nvarchar(3000) NULL,
	`Provider` nvarchar(255) NULL,
	`CreatedTime` datetime(3) NULL
);

/****** Object:  Table [dbo].[SaleOrder]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE SaleOrder(
	`Id` int AUTO_INCREMENT NOT NULL,
	`OrderNo` nvarchar(50) NULL,
	`CustomerId` int NOT NULL,
	`CustomerEmail` nvarchar(255) NULL,
	`PaymentMethod` nvarchar(50) NULL,
	`CurrencyCode` nvarchar(50) NOT NULL,
	`CurrencyDescription` nvarchar(50) NOT NULL,
	`OrderedTime` nvarchar(50) NOT NULL,
	`OrderedAmount` Double NOT NULL,
	`BilledTime` nvarchar(50) NULL,
	`OutletId` int NULL,
	`OutletName` nvarchar(255) NULL,
	`TicketIssueOutletId` int NULL,
	`TicketIssueOutletName` nvarchar(255) NULL,
	`DeliveryType` nvarchar(50) NULL,
	`OrderType` nvarchar(50) NOT NULL,
	`Status` nvarchar(50) NOT NULL,
	`ETicketCode` nvarchar(2000) NULL,
	`ETicketCodeFilePath` nvarchar(255) NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`EventId` int NOT NULL,
	`IsDelete` Tinyint NOT NULL,
	`BillToken` nvarchar(50) NULL,
	`BillExpireTime` nvarchar(50) NULL,
	`OnlineAmount` Double NULL
);

/****** Object:  Table [dbo].[SaleOrderItem]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE SaleOrderItem(
	`Id` int AUTO_INCREMENT NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`OrderId` int NOT NULL,
	`EventTicketId` int NOT NULL,
	`OrderedPrice` Double NOT NULL,
	`Quantity` int NOT NULL,
	`EventId` int NOT NULL,
	`OnlineFeePercentage` Double NOT NULL,
	`CurrencyCode` nvarchar(50) NULL
);

/****** Object:  Table [dbo].[TicketInOutlet]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE TicketInOutlet(
	`Id` int AUTO_INCREMENT NOT NULL,
	`EventId` int NOT NULL,
	`OutletId` int NOT NULL,
	`EventTicketId` int NOT NULL,
	`TicketTypeDescription` nvarchar(500) NOT NULL,
	`Quantity` int NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`IsDelete` Tinyint NOT NULL,
	`Version` bigint NOT NULL
);

/****** Object:  Table [dbo].[User]    Script Date: 5/2/2019 9:24:19 AM ******/
/* SET ANSI_NULLS ON */
 
/* SET QUOTED_IDENTIFIER ON */
 
CREATE TABLE User(
	`Id` int AUTO_INCREMENT NOT NULL,
	`CreatedTime` datetime(3) NOT NULL,
	`CreatedUserId` int NOT NULL,
	`UpdatedTime` datetime(3) NULL,
	`UpdatedUserId` int NULL,
	`IsDelete` Tinyint NOT NULL,
	`Version` bigint NOT NULL,
	`Name` nvarchar(100) NULL,
	`Phone` nvarchar(100) NULL,
	`Gender` nvarchar(6) NULL,
	`CityId` int NOT NULL,
	`TownshipId` int NOT NULL,
	`Address` nvarchar(1000) NULL,
	`DayOfBirth` int NULL,
	`MonthOfBirth` int NULL,
	`YearOfBirth` int NULL,
	`LoginId` int NOT NULL,
	`NRCPassportNo` nvarchar(100) NULL,
	`Roles` nvarchar(100) NULL
);