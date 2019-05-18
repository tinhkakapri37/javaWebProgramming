drop database if exists qlythuvien;
create database qlythuvien;
use qlythuvien;

drop table if exists sach;
create table sach(
masach int not null primary key auto_increment,
ten varchar(500) ,
tacGia varchar(500),
nxb varchar(500),
soLuong int
);
drop table if exists docGia;
create table docGia(
soThe int not null primary key auto_increment,
ten varchar(500) ,
khoa varchar(500),
khoaHoc varchar(500),
thoihanthe datetime
);
drop table if exists phieuMuon;
create table phieuMuon(
maSach int,
soThe int, 
ngayMuon datetime,
ngayTra datetime,
ghiChu varchar(1000),
primary key (maSach,soThe),
foreign key(masach) references sach(maSach),
foreign key(soThe) references docGia(soThe)
);
insert into sach(ten,tacGia,nxb,soLuong)value('hoa','ng văn A','giaoduc',4);
insert into sach(ten,tacGia,nxb,soLuong)value('toan','ng văn B','TPHCM',5);
insert into sach(ten,tacGia,nxb,soLuong)value('li','ng văn C','giaoduc',2);
insert into sach(ten,tacGia,nxb,soLuong)value('van','ng văn D','Hà Nội',1);
insert into sach(ten,tacGia,nxb,soLuong)value('anh','ng văn F','giaoduc',46);
insert into docGia(ten,khoa,khoaHoc,thoiHanThe)value('tuan','cntt','3',30/3/2019);
insert into docGia(ten,khoa,khoaHoc,thoiHanThe)value('an','cntt','2',17/3/2019);
insert into docGia(ten,khoa,khoaHoc,thoiHanThe)value('thành','attt','15',28/3/2019);
insert into docGia(ten,khoa,khoaHoc,thoiHanThe)value('thuận','dtvt','1',16/3/2019);
insert into docGia(ten,khoa,khoaHoc,thoiHanThe)value('đại','cntt','1',29/3/2019);
insert into phieuMuon(ngayMuon,ngayTra,ghiChu)value(30/3/2019,30/4/2019,'không có');
insert into phieuMuon(ngayMuon,ngayTra,ghiChu)value(17/3/2019,17/4/2019,'không có');
insert into phieuMuon(ngayMuon,ngayTra,ghiChu)value(28/3/2019,28/4/2019,'không có');
insert into phieuMuon(ngayMuon,ngayTra,ghiChu)value(16/3/2019,16/4/2019,'không có');
insert into phieuMuon(ngayMuon,ngayTra,ghiChu)value(29/3/2019,29/4/2019,'không có');






