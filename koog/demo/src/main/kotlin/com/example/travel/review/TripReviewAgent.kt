package com.example.travel.review

import ai.koog.prompt.executor.model.PromptExecutor
import org.springframework.stereotype.Component

/** The Koog agent reviewing a submitted trip - built live in the talk. */
@Component
class TripReviewAgent(
    private val executor: PromptExecutor,
    private val facts: TravelFacts,
    private val langfuse: LangfuseProperties
) {

    fun review(tripId: Long): ReviewOutcome = TODO("Build the Koog agent")
}
