package mate.jdbc.dao;

import java.util.List;
import java.util.Optional;
import mate.jdbc.model.Driver;

public interface DriverDao {
    Driver create(Driver manufacturer);

    Optional<Driver> get(Long id);

    List<Driver> getAll();

    Driver update(Driver manufacturer);

    boolean delete(Long id);
}
