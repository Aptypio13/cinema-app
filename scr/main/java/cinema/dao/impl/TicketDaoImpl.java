package cinema.dao.impl;

import cinema.dao.TicketDao;
import cinema.model.Ticket;
import cinema.dao.AbstractDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
