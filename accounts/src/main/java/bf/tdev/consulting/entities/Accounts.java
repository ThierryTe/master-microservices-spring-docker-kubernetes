package bf.tdev.consulting.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity{
    @Column(name="customer_id")
    private Long customerId;
    @Id
    @Column(name = "account_number")
    private Long accountNumber;
    private String accountType;
    @Column(name = "branhc_address")
    private String branchAddress;
}
