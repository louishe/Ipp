###SpringMVC,MyBatis,PostgresSQL,AngularJS,jstl 
#install mvn on localside.
###install tomcat7 or 8.
###configure tomcat deploy.

1. add tomcat user configuration,tomcat\conf\tomcat-users.xml
		<role rolename="manager-gui"/>
      <role rolename="manager-script"/>
      <user username="admin" password="password" roles="manager-gui,manager-script"/>
2. configure tomcat plugin in pom.xml
   		<plugin>
				<groupId>org.apache.tomcat.maven</groupId>
				<artifactId>tomcat7-maven-plugin</artifactId>
				<version>2.2</version>
				<configuration>
					<url>http://localhost:7080/manager/text</url>
					<server>TomcatServer</server>
					<username>admin</username>
					<password>password</password>
				</configuration>
			</plugin>
3. deploy war to tomcat
	   mvn tomcat7:deploy OR mvn tomcat7:redeploy
4.PostgreSQL
	Because of restrict limitatin, need add ip to PostgreSQL\9.6\data\pg_hba.conf to access the database.
host    all             all             192.168.0.131/32            md5


		
	
