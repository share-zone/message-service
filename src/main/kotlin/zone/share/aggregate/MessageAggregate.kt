package zone.share.aggregate

import org.axonframework.spring.stereotype.Aggregate

/**
 * MessageAggregate
 * @author Iamee
 * @create 2019-01-29 21:47
 */
@Aggregate
class MessageAggregate{

    lateinit var id:String

    lateinit var messageId:String

    constructor()

}