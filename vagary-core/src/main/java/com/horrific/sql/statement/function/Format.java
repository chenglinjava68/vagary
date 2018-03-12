package com.horrific.sql.statement.function;

import com.horrific.sql.statement.Column;
import com.horrific.sql.statement.Select;

public class Format extends Column {
	public String format;

	public Format(String name, String format) {
		super(name);
		this.format = format;
	}

	public Format(String table, String name, String format) {
		super(table, name);
		this.format = format;
	}

	public Format(Select select, String tableAlias, String name, String format) {
		super(select, tableAlias, name);
		this.format = format;
	}

	@Override
	public void nameInColumn(StringBuilder sb) {
		sb.append("FORMAT(");
		nameInFunction(sb);
		sb.append(", ").append(format).append(')');
		if (nameAlias != null) {
			sb.append(" AS `").append(nameAlias).append('`');
		}
	}

}