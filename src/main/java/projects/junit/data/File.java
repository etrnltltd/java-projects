package projects.junit.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class File extends Resource {
    private String name;
    private int size;

}
