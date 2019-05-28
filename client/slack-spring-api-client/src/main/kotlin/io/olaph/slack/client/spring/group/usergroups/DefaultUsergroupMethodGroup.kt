package io.olaph.slack.client.spring.group.usergroups

import io.olaph.slack.client.group.usergroups.UsergroupsMethodGroup
import io.olaph.slack.client.spring.group.usergroups.users.DefaultUsergroupsUsersUpdateMethod
import org.slf4j.LoggerFactory

class DefaultUsergroupMethodGroup : UsergroupsMethodGroup {

    companion object {
        val LOG = LoggerFactory.getLogger(DefaultUsergroupMethodGroup::class.java)
    }

    override fun usersUpdate(authToken: String) = DefaultUsergroupsUsersUpdateMethod(authToken)

    override fun create(authToken: String) = DefaultUsergroupsCreateMethod(authToken)

    override fun list(authToken: String) = DefaultUsergroupsListMethod(authToken)
}