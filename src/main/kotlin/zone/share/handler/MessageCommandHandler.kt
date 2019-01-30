package zone.share.handler

import org.axonframework.commandhandling.CommandHandler
import org.axonframework.commandhandling.model.Repository
import org.springframework.mail.SimpleMailMessage
import org.springframework.stereotype.Component
import zone.share.aggregate.MessageAggregate
import zone.share.common.CommandResult
import zone.share.common.command.message.CreateMessageCommand

/**
 * MessageCommandHandler
 * @author Iamee
 * @create 2019-01-29 21:53
 */
@Component
class MessageCommandHandler(val repository: Repository<MessageAggregate>) {

    @CommandHandler
    fun handle(command: CreateMessageCommand): CommandResult {
        repository.newInstance { MessageAggregate() }
        SimpleMailMessage
        return CommandResult.successful()
    }

}