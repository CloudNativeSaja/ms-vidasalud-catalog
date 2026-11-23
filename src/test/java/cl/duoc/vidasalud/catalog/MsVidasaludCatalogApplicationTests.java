package cl.duoc.vidasalud.catalog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Comprueba que el contexto de Spring arranca. Usa H2 en memoria: la prueba
 * no necesita MariaDB.
 */
@SpringBootTest(properties = {
        "spring.datasource.url=jdbc:h2:mem:catalog;MODE=MariaDB;DB_CLOSE_DELAY=-1",
        "spring.datasource.driver-class-name=org.h2.Driver",
        "spring.datasource.username=sa",
        "spring.datasource.password=",
        "spring.jpa.hibernate.ddl-auto=create-drop"
})
class MsVidasaludCatalogApplicationTests {

	@Test
	void contextLoads() {
	}

}
