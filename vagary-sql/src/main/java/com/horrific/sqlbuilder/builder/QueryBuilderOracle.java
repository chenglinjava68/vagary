package com.horrific.sqlbuilder.builder;


import com.horrific.sqlbuilder.Database;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class QueryBuilderOracle extends QueryBuilder {

	public QueryBuilderOracle(Connection connection) {
		super(Database.ORACLE, connection);
	}

	public QueryBuilderOracle(DataSource dataSource) throws SQLException {
		super(Database.ORACLE, dataSource);
	}

}
