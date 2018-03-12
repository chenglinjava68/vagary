package com.horrific.sql.statement.function;

import com.horrific.sql.statement.Select;

public class Sum extends AggregateColumn {

	public Sum(String name) {
		super("SUM", name);
	}

	public Sum(String table, String name) {
		super("SUM", table, name);
	}

	public Sum(Select select, String tableAlias, String name) {
		super("SUM", select, tableAlias, name);
	}

}