# Travel policy demo - live coding a Koog agent

The same Kotlin + Spring Boot 4 travel service as in `the-rise-of-jvm-agents/demo`: business **trips**
(hotel, flight and train bookings) and plain-text **travel policies**. Submitting a trip queues an
asynchronous review - the reviewer itself is written live with Koog during the talk.

What is already there:

- `trip/`, `policy/` - domain, REST API and `TripService`
- `review/TravelFacts.kt` - trip snapshot, policies and cost breakdown, ready to expose as tools
- `review/Prompts.kt` - reviewer and judge prompts
- `review/ReviewJob.kt` - runs `TripReviewAgent` after submit and stores the outcome
- `review/KoogConfig.kt` - Koog `PromptExecutor` backed by Spring AI's `ChatModel`

What is missing: the body of `review/TripReviewAgent.kt`. Until it is written, a submitted trip ends up as
`REVIEW_FAILED`.

## Versions

Spring Boot 4.1.1, Spring AI 2.1.0-M1 (Responses API), Koog 1.3.0
(`koog-spring-ai-v2-starter-model-chat`), Kotlin 2.4.20, Java 25.

## Run

Credentials (`OPENAI_BASE_URL`, `OPENAI_API_KEY`) are read from `.env`.

```bash
./gradlew bootRun
```

Two trips are seeded: trip `1` complies with every policy, trip `2` breaks several. See `requests.http`.

## Tests

```bash
./gradlew test
```

`ScriptedChatModel` (`src/test/kotlin/.../fakes`) replaces the LLM for tests of the agent once it is written.
