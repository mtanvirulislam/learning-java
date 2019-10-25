package database.exercises.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearDbTablas {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.sqlite.JDBC());
			Connection conn = DriverManager.getConnection("jdbc:sqlite:db/centro.db");
			if (!conn.isClosed()) {
				System.out.println("!! Conectado !!\n");
			}
			
			Statement statement1 = conn.createStatement();
			Statement statement2 = conn.createStatement();
			Statement statement3 = conn.createStatement();
			
			/*borrar las tablas si existen*/
			try {
				borrarTabla(statement1, "PRODUCTOS");
				System.out.println("#### Borrado tabla: PRODUCTOS");
			} catch (Exception e) {
				System.out.println("## No existe la tabla: PRODUCTOS");
			}
			try {
				borrarTabla(statement1, "CLIENTES");
				System.out.println("#### Borrado tabla: CLIENTES");
			} catch (Exception e) {
				System.out.println("## No existe la tabla: CLIENTES");
			}

			
			
			System.out.println("\n");
			/*############################*/
			/*crear tablas*/
			String sqlCrear;
			/*Crear la tabla PRODUCTOS*/
			sqlCrear = "CREATE TABLE PRODUCTOS(" + 
						"ID INT PRIMARY KEY     NOT NULL," + 
						"DESCRIPCION CHAR(50) NOT NULL," + 
						"STOCKACTUAL INT," + 
						"STOCKMINIMO INT," + 
						"PVP REAL);";
			statement1.execute(sqlCrear);
			System.out.println("Creado la tabla: PRODUCTOS");
			
			/*Crear la tabla FASIG*/
			sqlCrear = "CREATE TABLE CLIENTES(" + 
						"ID INT PRIMARY KEY     NOT NULL," + 
						"NOMBRE CHAR(50) NOT NULL," + 
						"DIRECCION CHAR(50)," + 
						"POBLACION CHAR(50)," + 
						"TELEFONO CHAR(10)," + 
						"NIF CHAR(10));";
			statement1.execute(sqlCrear);
			System.out.println("Creado la tabla: CLIENTES");
			
			/*############*/
			statement1.close();
			statement2.close();
			statement3.close();
			conn.close();
			
			if(conn.isClosed())System.out.println("\nCerrado la conexion!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void borrarTabla(Statement st, String nombre) throws SQLException {
		String sqlBorrar = "drop table "+nombre+"";
		st.execute(sqlBorrar);
	}
/*
 * CREATE TABLE `FNOT` (
	`nt_nmat`	INTEGER,
	`nt_asig`	INTEGER,
	`nt_not`	INTEGER,
	PRIMARY KEY(nt_nmat,nt_asig)
);*/
}

