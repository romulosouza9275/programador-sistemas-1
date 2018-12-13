Java + BD Mysql + Connector


https://dev.mysql.com/downloads/connector/j/8.0.html


Mudanças em relação ao original:

Conexao conex = new Conexao("jdbc:mysql://localhost:3306/conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "jeffrey","password");

CREATE USER 'jeffrey'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO 'jeffrey'@'localhost' WITH GRANT OPTION;
