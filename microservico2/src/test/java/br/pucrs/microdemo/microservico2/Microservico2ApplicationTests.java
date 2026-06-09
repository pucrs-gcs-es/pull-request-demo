package br.pucrs.microdemo.microservico2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import br.pucrs.microdemo.microservico2.business.CitationCollection;

@SpringBootTest(properties = {
		"spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration,org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration,org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration"
})
class Microservico2ApplicationTests {

	@Test
	void citationCollectionTest() {
		CitationCollection cc = new CitationCollection();
		
		assertNotNull(cc.getCitation());
	}

}
