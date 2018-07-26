DROP SCHEMA sa cascade

CREATE SCHEMA sudarshan	AUTHORIZATION sa;

drop table sudarshan.tutorials_tbl;

CREATE TABLE sudarshan.tutorials_tbl ( 
   id INT NOT NULL, 
   title VARCHAR(50) NOT NULL, 
   author VARCHAR(20) NOT NULL, 
   submission_date DATE, 
);

insert into sudarshan.TUTORIALS_TBL values(1, 'Java', 'Ram', sysdate());
insert into sudarshan.TUTORIALS_TBL values(2, 'DOTNET', 'Gopi', sysdate()-1);
insert into sudarshan.TUTORIALS_TBL values(3, 'RxJava', 'Mahesh', sysdate()-2);
insert into sudarshan.TUTORIALS_TBL values(4, 'Spring', 'Ravi', sysdate()-1);
insert into sudarshan.TUTORIALS_TBL values(5, 'Servlets', 'Sri', sysdate());
insert into sudarshan.TUTORIALS_TBL values(6, 'JSP', 'Lokesh', sysdate()-2);

commit;

