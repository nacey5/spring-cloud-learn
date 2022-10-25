package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @NAME: PatternProperties
 * @USER: DaHuangGO
 * @DATE: 2022/10/25
 * @TIME: 16:10
 * @YEAR: 2022
 * @MONTH: 10
 * @DAY: 25
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {
    private String dateformat;

    public String getDateformat() {
        return dateformat;
    }

    public void setDateformat(String dateformat) {
        this.dateformat = dateformat;
    }
}
