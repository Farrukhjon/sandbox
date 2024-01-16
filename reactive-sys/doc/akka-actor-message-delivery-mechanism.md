**Akka Actor. Message Delivery Mechanism**

[<u>Message Delivery Reliability • Akka
Documentation</u>](https://doc.akka.io/docs/akka/current/general/message-delivery-reliability.html)

The General Rules

- ***at-most-once*** delivery, i.e. no guaranteed delivery

- ***message ordering per sender–receiver pair***

**Delivery Mechanism**

- **at-most-once** delivery means that for each message handed to the
  mechanism, that message is delivered once or not at all; in more
  casual terms it means that ***messages may be lost***.

  - ***fire-and-forget*** fashion without keeping state at the sending
    end

- **at-least-once** delivery means that for each message handed to the
  mechanism potentially multiple attempts are made at delivering it,
  such that at least one succeeds; again, in more casual terms this
  means that ***messages may be duplicated but not lost***.

  - requires ***retries*** to counter transport losses, which means
    keeping state at the **sending end** and having an
    ***acknowledgement*** mechanism at the **receiving end**

- **exactly-once** delivery means that for each message handed to the
  mechanism *exactly one delivery is made to the recipient*; the
  ***message can neither be lost nor duplicated***.

  - is most expensive

  - has worst performance

    - because in addition, it requires ***state to be kept at the
      receiving end*** in order to filter out **duplicate** deliveries
