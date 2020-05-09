package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    private String name;

    private Integer age;

    private static final long serialVersionUID = 1L;
}