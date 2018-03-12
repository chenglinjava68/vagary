package com.horrific.sql.statement;

public class Desc extends Sort {
	public Desc(Column column) {
		super(column, DESC);
	}

	public Desc(String column) {
		super(new Column(column), DESC);
	}
}