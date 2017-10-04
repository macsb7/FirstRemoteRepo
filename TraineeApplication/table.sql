create table trainee(
traineeID number(4) PRIMARY KEY,
traineeName Varchar2(20),
traineeDomain varchar2(20),
traineeLocation varchar2(20)
)

INSERT into trainee values(000,'Shady', 'Kali', 'Delhi');

drop table trainee;