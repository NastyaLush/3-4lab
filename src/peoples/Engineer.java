package peoples;

import objects.Innovation;

public interface Engineer {
    String researching();
    String watch(String object, String thoughts);
    String createInnovation(Innovation innovation);
}
