package guru.springfamework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private Long id;

    @ApiModelProperty(value = "This is the firstname", required = true)
    private String firstname;
    @ApiModelProperty(value = "This is the lasttname", required = false)
    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;
}
