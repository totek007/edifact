package org.edifree.edifact.version.d96a.field;

import lombok.Data;
import org.edifree.edifact.main.all.annotations.Length;

/**
 *
 * @id C078
 * @name ACCOUNT IDENTIFICATION
 * @description Identification of an account holder by account number and/or account holder name in one or two lines. Number preferred.
 */

@Data
public class AccountIdentification {

@Length("0-35")
private String accountHolderNumber;

@Length("0-35")
private String accountHolderName1;

@Length("0-35")
private String accountHolderName2;

@Length("0-3")
private String currencyCoded;

}
