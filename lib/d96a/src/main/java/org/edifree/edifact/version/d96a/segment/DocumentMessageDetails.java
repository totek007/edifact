package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id DOC
 * @name DOCUMENT/MESSAGE DETAILS
 * @description A segment giving the list of documents the person may produce.
 */

@TagName("DOC")
@Data
public class DocumentMessageDetails {

@Mandatory
private DocumentMessageName documentMessageName;

private DocumentMessageDetailsC503 documentMessageDetailsC503;

@Length("0-3")
private String communicationChannelIdentifierCoded;

@Length("0-2")
private Decimal numberOfCopiesOfDocumentRequired;

@Length("0-2")
private Decimal numberOfOriginalsOfDocumentRequired;

}
