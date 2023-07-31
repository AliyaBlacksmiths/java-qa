package org.ya;
public class BaseTest {
        // package mapping
        public String readResourceAsString(String resourceName) {
            try {
                return new String(getClass().getResourceAsStream(resourceName).readAllBytes());
            } catch (Exception e) {
                throw new RuntimeException("Resource not found");
            }
        }
}
