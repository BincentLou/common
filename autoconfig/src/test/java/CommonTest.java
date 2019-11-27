import com.david.common.autoconfig.CommonAutoConfiguration;
import com.david.common.autoconfig.DavidService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener;
import org.springframework.boot.context.annotation.UserConfigurations;
import org.springframework.boot.logging.LogLevel;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @version $Id: null.java, v 1.0 2019/9/23 7:06 PM david Exp $$
 * @Author:louwenbin(louwb@runyong.cn)
 * @Description:测试类
 * @since 1.0
 **/
@SpringBootTest(classes = CommonAutoConfiguration.class)
@RunWith(SpringRunner.class)
public class CommonTest {

    private final ApplicationContextRunner applicationContextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(CommonAutoConfiguration.class));

    @Test
    public void defaultServiceBackOff(){
        this.applicationContextRunner.withUserConfiguration(CommonAutoConfiguration.class).run((context) -> {
            assertThat(context).hasSingleBean(DavidService.class);
        });
    }

    @Test
    public void loggerleverTest(){
        //java.lang.IllegalArgumentException: LogLevel must be INFO or DEBUG
        ConditionEvaluationReportLoggingListener loggingListener = new ConditionEvaluationReportLoggingListener(LogLevel.INFO);
        applicationContextRunner.withInitializer(loggingListener).run(context -> {

        });
    }

}
