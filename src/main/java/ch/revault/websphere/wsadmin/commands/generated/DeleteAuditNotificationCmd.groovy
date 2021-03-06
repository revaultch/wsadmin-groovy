/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes an audit notification.
*/
@Generated("with GenerateAdminCommands")
class DeleteAuditNotificationCmd extends AdminCmd<Void> {
    DeleteAuditNotificationCmd() {
        super("deleteAuditNotification")
    }

    /**
     * Supply a reference to an existing audit notification.
     */
    def 'notificationRef'(String value) {
        parameter("notificationRef", value)
    }

}
