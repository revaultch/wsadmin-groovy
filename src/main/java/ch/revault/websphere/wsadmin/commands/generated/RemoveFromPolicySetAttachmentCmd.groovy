/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The removeFromPolicySetAttachment command removes resources that apply to a policy set attachment.
*/
@Generated("with GenerateAdminCommands")
class RemoveFromPolicySetAttachmentCmd extends AdminCmd<Void> {
    RemoveFromPolicySetAttachmentCmd() {
        super("removeFromPolicySetAttachment")
    }

    /**
     * Specifies the name of the application. This parameter applies to application and client attachments.  It is not applicable to trust service attachments. (String) 
     */
    def 'applicationName'(String value) {
        parameter("applicationName", value)
    }

    /**
     * Specifies the ID of the attachment. (String) 
     */
    def 'attachmentId'(String value) {
        parameter("attachmentId", value)
    }

    /**
     * Specifies the names of the application or trust service resources. (String) 
     */
    def 'resources'(java.lang.String[] value) {
        parameter("resources", value)
    }

    /**
     * Specifies the type of policy set attachments. The value for this parameter must be application, client, or system/trust. The default value is application. (String) 
     */
    def 'attachmentType'(String value) {
        parameter("attachmentType", value)
    }

    /**
     * The attachment specific properties (Properties)
     */
    def 'attachmentProperties'(java.util.Properties value) {
        parameter("attachmentProperties", value)
    }

}
