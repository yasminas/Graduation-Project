package app.app.Repositories;

import app.app.Entities.SpecialHabits;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitsRepo  extends CrudRepository<SpecialHabits, String> {
}
