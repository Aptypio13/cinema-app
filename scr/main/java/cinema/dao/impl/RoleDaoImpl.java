package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import cinema.model.Role.RoleName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(String roleName) {
        try (Session session = factory.openSession()) {
            return Optional.of(session.createQuery(
                            "SELECT Role FROM Role r WHERE r.roleName = :roleName", Role.class)
                    .setParameter("roleName", RoleName.valueOf(roleName))
                    .getSingleResult());
        } catch (Exception exception) {
            throw new DataProcessingException("Can`t find role: " + roleName, exception);
        }
    }
}
