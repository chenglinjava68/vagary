package com.horrific.sqlbuilder.select;


import com.horrific.sqlbuilder.Context;

class InnerJoin extends Join {

	InnerJoin(Context context, String condition) {
		super(context, condition);
	}

	InnerJoin(Context context) {
		super(context);
	}

	@Override
	protected String expression() {
		return "INNER JOIN";
	}

}