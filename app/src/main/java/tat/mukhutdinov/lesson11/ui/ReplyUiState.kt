package tat.mukhutdinov.lesson11.ui

import tat.mukhutdinov.lesson11.data.Email
import tat.mukhutdinov.lesson11.data.MailboxType
import tat.mukhutdinov.lesson11.data.local.LocalEmailsDataProvider

data class ReplyUiState(
    val mailboxes: Map<MailboxType, List<Email>> = emptyMap(),
    val currentMailbox: MailboxType = MailboxType.Inbox,
    val currentSelectedEmail: Email = LocalEmailsDataProvider.defaultEmail,
    val isShowingHomepage: Boolean = true
) {
    val currentMailboxEmails: List<Email> by lazy { mailboxes[currentMailbox]!! }
}
