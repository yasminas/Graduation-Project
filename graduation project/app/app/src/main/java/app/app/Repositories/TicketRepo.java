package app.app.Repositories;

import app.app.Entities.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends CrudRepository<Ticket,String> {
}
