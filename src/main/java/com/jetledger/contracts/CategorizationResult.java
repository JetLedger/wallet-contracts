package com.jetledger.contracts;

public record CategorizationResult(
    String eventId,
    Category category,
    double confidence,
    String reasoning,
    boolean humanReviewRequired
) {}
