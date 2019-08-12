package com.kreait.slack.api.contract.jackson.group.im

fun SuccessfulImMarkResponse.Companion.sample(): SuccessfulImMarkResponse {
    return SuccessfulImMarkResponse(true)
}

fun ErrorImMarkResponse.Companion.sample(): ErrorImMarkResponse {
    return ErrorImMarkResponse(false, "")
}

fun SlackImMarkRequest.Companion.sample(): SlackImMarkRequest {
    return SlackImMarkRequest("", "")
}
