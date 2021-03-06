/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Adds a configuration for an LDAP attribute used as an external ID.
*/
@Generated("with GenerateAdminCommands")
class AddIdMgrLDAPExternalIdAttrCmd extends AdminCmd<Void> {
    AddIdMgrLDAPExternalIdAttrCmd() {
        super("addIdMgrLDAPExternalIdAttr")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * The name of the LDAP attribute.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The syntax of the LDAP attribute.
     */
    def 'syntax'(String value) {
        parameter("syntax", value)
    }

    /**
     * Whether or not the value of the LDAP attribute should be generated by virtual member manager. If this property is set to true, virtual member manager will generate a globally unique id for the external id attribute.
     */
    def 'wimGenerate'(Boolean value) {
        parameter("wimGenerate", value)
    }

    /**
     * The name of the LDAP entity type or a semicolon separated list of LDAP entity types.
     */
    def 'entityTypes'(String value) {
        parameter("entityTypes", value)
    }

}
