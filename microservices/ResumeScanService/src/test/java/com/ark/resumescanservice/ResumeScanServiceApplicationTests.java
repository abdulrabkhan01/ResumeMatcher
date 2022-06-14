package com.ark.resumescanservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
		properties = {"spring.cloud.config.enabled=false"}
)
class ResumeScanServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
