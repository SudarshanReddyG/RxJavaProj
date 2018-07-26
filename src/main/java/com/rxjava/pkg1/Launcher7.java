package com.rxjava.pkg1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;

import org.davidmoten.rx.jdbc.ConnectionProvider;
import org.davidmoten.rx.jdbc.Database;
import org.davidmoten.rx.jdbc.tuple.Tuple4;

import io.reactivex.Observable;

public class Launcher7 {

	private static final String DB_URL = "jdbc:h2:file:///D:/services_ws/h2tesdb;AUTO_SERVER=TRUE";  

	private static final String USER = "sa"; 
	private static final String PASS = ""; 

	public static void main(String[] args) {

		Connection connection = null;
		Database database = null;
		try {

			connection = DriverManager.getConnection(DB_URL,USER,PASS);

			ConnectionProvider connectionProvider = ConnectionProvider.from(connection);

			database = Database.fromBlocking(connectionProvider);

			Observable<Tuple4<Integer, String, String, Date>> observable = database.select("SELECT id, title, author, submission_date FROM SUDARSHAN.TUTORIALS_TBL").getAs(Integer.class, String.class, String.class, Date.class).toObservable();

			observable.subscribe(tuple4 -> System.out.println("ID "+ tuple4.value1() + " , TITLE "+tuple4.value2() + " , AUTHOR "+tuple4.value3()+" , Submission Date "+tuple4.value4()));

		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			try {
				if(database!=null)
					database.close();
				if(connection!=null)
					connection.close();
			} catch (Exception exp) {

			}
		}
	}

}
