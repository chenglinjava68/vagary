package com.horrific.query;


import com.horrific.Param;
import com.horrific.chartconvert.ChartConvert;
import com.horrific.chartconvert.ChartConvertFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author wanghong12
 * @since 2017-3-13
 */
@Component
public class MySqlQuery extends AbstractQuery {

    @Autowired
    private ChartConvertFactory convertFactory;

    @Override
    public <T> T query(Param param) {

        List<Map<String, Object>> data = doQuery(param);

        ChartConvert<T> convert = convertFactory.getInstance(param);

        return convert.handle(data, param);
    }

    @Override
    void validate(String sql) {

    }
}
