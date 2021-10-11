package za.ac.nwu.ac.domain.persistence;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "DEMO_ACCOUNT_TYPE", schema = "VITRSA_SANDBOX")
public class AccountTransaction implements Serializable{
    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "TX_ID")
    private Long transactionId;

    @Column(name = "ACCOUNT_TYPE_ID")
    private Long accountTypeId;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(name = "TX_DATE")
    private Long transactionDate;
}
