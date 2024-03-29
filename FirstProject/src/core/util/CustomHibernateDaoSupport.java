package core.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
 
/**
 * Workaround class necessaria per estendere HibernateDaoSupport quando si usano le annotazioni
 * @author Gianluca De Filippis
 *
 */
public abstract class CustomHibernateDaoSupport extends HibernateDaoSupport
{    
    @Autowired
    public void anyMethodName(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
}