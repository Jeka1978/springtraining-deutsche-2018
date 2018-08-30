package never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class MailDaoImpl implements MailDao {

    private static DataFactory dataFactory = new DataFactory();


    @Override
    public MailInfo getMailInfo() {
        return MailInfo.builder().
                clientName(dataFactory.getName()).
                clientMail(dataFactory.getEmailAddress()).
                mailCode(dataFactory.getNumberBetween(1,5))
                .build();
    }


}
