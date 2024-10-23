package github.fredsonchaves07.tenant;

import io.quarkus.runtime.Startup;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.flywaydb.core.Flyway;

import java.sql.SQLException;

@Startup
@ApplicationScoped
public class MigrationService {

    @Inject
    Flyway flyway;

    @PostConstruct
    public void migrate() throws SQLException {
        for (String schema : schemas()) {
            Flyway.configure()
                    .dataSource(flyway.getConfiguration().getDataSource())
                    .schemas(schema)
                    .load()
                    .migrate();
        }
    }

    private String[] schemas() {
        return flyway.getConfiguration().getSchemas();
    }
}
